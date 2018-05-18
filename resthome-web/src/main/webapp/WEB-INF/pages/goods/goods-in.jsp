<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>员工调度</title>
<!-- 导入jquery核心类库 -->
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
<!-- 导入easyui类库 -->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/js/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/js/easyui/themes/icon.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/js/easyui/ext/portal.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/css/default.css">	
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/easyui/ext/jquery.portal.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/easyui/ext/jquery.cookie.js"></script>
<script
	src="${pageContext.request.contextPath }/js/easyui/locale/easyui-lang-zh_CN.js"
	type="text/javascript"></script>
<script src="${pageContext.request.contextPath }/js/highcharts/highcharts.js"></script>
<script src="${pageContext.request.contextPath }/js/highcharts/modules/exporting.js"></script>
<script type="text/javascript">
	//得到当前日期
	formatterDate = function(date) {
	var day = date.getDate() > 9 ? date.getDate() : "0" + date.getDate();
	var month = (date.getMonth() + 1) > 9 ? (date.getMonth() + 1) : "0"
	+ (date.getMonth() + 1);
	return date.getFullYear() + '-' + month + '-' + day;
	};
	
	window.onload = function () { 
	$('#inDate').datebox('setValue', formatterDate(new Date()));
	}



	function doAdd(){
		$('#addStaffWindow').window("open");
	}
	
	function doEdit(){
		var data=$("#grid").datagrid("getSelected");
		$('#editStaffWindow').window("open");
		$("#editStaffForm").form("load",data);
	}
	
	function doDelete(){
		alert("删除...");
		//获取数据表格中所有选中的行，返回数组对象
		var rows = $("#grid").datagrid("getSelections");
		if(rows.length == 0){
			//没有选中记录，弹出提示
			$.messager.alert("提示信息","请选择需要删除的用户！","warning");
		}else{
			//选中了取派员,弹出确认框
			$.messager.confirm("删除确认","你确定要删除选中的用户吗？",function(r){
				if(r){
					
					var array = new Array();
					//确定,发送请求
					//获取所有选中的取派员的id
					for(var i=0;i<rows.length;i++){
						var data = rows[i];//json对象
						var id = data.id;
						array.push(id);
					}
					var ids = array.join(",");//1,2,3,4,5
					location.href = "goodsIn/delete?ids="+ids;
				}
			});
		}
	}
	
	function doSearch(){
		$('#searchWindow').window("open");
	}
	
	//工具栏
	var toolbar = [ {
		id : 'button-search',	
		text : '查询',
		iconCls : 'icon-search',
		handler : doSearch
	}, {
		id : 'button-add',
		text : '入库登记',
		iconCls : 'icon-add',
		handler : doAdd
	}, {
		id : 'button-delete',
		text : '删除记录',
		iconCls : 'icon-cancel',
		handler : doDelete
	}	];
	// 定义列
	var columns = [ [ {
		field : 'id',
		checkbox : true
	}, {
		field : 'inCode',
		title : '入库单号',
		width : 150,
		align : 'center'
	},{
		field : 'source',
		title : '供应商',
		width : 150,
		align : 'center'
	}, {
		field : 'address',
		title : '仓库地址',
		width : 150,
		align : 'center'
	},{
		field : 'inDate',
		title : '入库日期',
		width : 150,
		align : 'center'
	},{
		field : 'handledName',
		title : '经办人',
		width : 150,
		align : 'center'
	},{
		field : 'personName',
		title : '操作人',
		width : 150,
		align : 'center'
	}  ] ];
	
	$(function(){
		
// 		$("#handledName1233").combobox('select','d67b2946c1d04867a62726a60126eb7f');



		
		// 先将body隐藏，再显示，不会出现页面刷新效果
		$("body").css({visibility:"visible"});
		
		// 收派标准数据表格
		$('#grid').datagrid( {
			iconCls : 'icon-forward',
			fit : true,
			pageList: [30],
			border : true,
			rownumbers : true,
			striped : true,
			pagination : true,
			toolbar : toolbar,
			url : "goodsIn/query",
			columns : columns,
			onDblClickRow : doDblClickRow
		});
		
		// 添加、分区
		$('#addStaffWindow').window({
	        title: '登记入库',
	        width: 900,
	        modal: true,
	        shadow: true,
	        closed: true,
	        height: 400,
	        resizable:true
	    });
		
		
		// 详细信息
		$('#editStaffWindow').window({
// 	        title: '入库详细信息',
	        width: 900,
	        modal: true,
	        shadow: true,
	        closed: true,
	        height: 400,
	        resizable:false
	    });
		
		$('#showSubareaWindow').window({
	        width: 800,
	        modal: true,
	        shadow: true,
	        closed: true,
	        height: 700,
	        resizable:false
	    });
		
		// 查询分区
		$('#searchWindow').window({
	        title: '查询分区',
	        width: 400,
	        modal: true,
	        shadow: true,
	        closed: true,
	        height: 400,
	        resizable:false
	    });
		
		//定义一个工具方法，用于将指定的form表单中所有的输入项转为json数据{key:value,key:value}
		$.fn.serializeJson=function(){  
            var serializeObj={};  
            var array=this.serializeArray();
            $(array).each(function(){  
                if(serializeObj[this.name]){  
                    if($.isArray(serializeObj[this.name])){  
                        serializeObj[this.name].push(this.value);  
                    }else{  
                        serializeObj[this.name]=[serializeObj[this.name],this.value];  
                    }  
                }else{  
                    serializeObj[this.name]=this.value;   
                }  
            });  
            return serializeObj;  
        }; 
		
		$("#btn").click(function(){
			//将指定的form表单中所有的输入项转为json数据{key:value,key:value}
			var p = $("#searchForm").serializeJson();
			console.info(p);
			//调用数据表格的load方法，重新发送一次ajax请求，并且提交参数
			$("#grid").datagrid("load",p);
			//关闭查询窗口
			$("#searchWindow").window("close");
		});
		
		var num=1;

		
		 $('#btnCreate').click(function () { 
			 var tr='<tbody name="tbodys" id="tbody'+num+'"><tr class="title"><td colspan="4">商品入库明细</td></tr>'
			 	tr+='<tr><td>货品名称</td><td><input  type="text"  class="easyui-validatebox"  style="width:120px; required="true"  name="goodsName"  id="goodsName'+num+'" /></td><td>货品单位</td><td><input class="easyui-validatebox" name="goodsUnit" style="width:120px;" /> </td></tr>'
				tr+='<tr><td>入库数量</td><td><input  type="text"  class="easyui-validatebox"  style="width:120px; required="true"  name="goodsNum"  id="goodsNum'+num+'" /></td><td>货品价格</td><td><input  type="text"  class="easyui-validatebox"  style="width:120px; required="true"  name="goodsPrice" id="goodsPrice'+num+'"   /></td></tr>'	
				tr+='<tr><td colspan="4"><a href="#"  icon="icon-remove" class="easyui-linkbutton"  id="delete'+num+'" onclick="del('+num+')" plain="true">删除入库货品</a></td></tr></tbody>'	
					
			 $("#Feetable").append(tr);		
						
					
			 	 $("#goodsName"+num).validatebox({ });
			    $("#goodsNum"+num).validatebox({ });
			    $("#goodsUnit"+num).validatebox({ });
			    $("#goodsPrice"+num).validatebox({ });      
			    $("#delete"+num).linkbutton({ });
			    num++;
		 });
		
		 
	});

	
	
	
	
	
	
	
	function doDblClickRow(rowIndex, rowData){
		var incode = rowData.inCode
		location.href = "goodsIn/detail?incode="+incode;
	}
	
	function del(tbodynum){ 
	    var tabObj=document.getElementById("tbody"+tbodynum);
	         for(var k=0;k<tabObj.rows.length;k++){
	             tabObj.deleteRow(k);
	             k=k-1;             
	         }  
	}

	  //将表单序列化成json格式的数据(但不适用于含有控件的表单，例如复选框、多选的select)
    (function($){
        $.fn.serializeJson2 = function(){
            var jsonData1 = {};
            var serializeArray = this.serializeArray();
            // 先转换成{"id": ["12","14"], "name": ["aaa","bbb"], "pwd":["pwd1","pwd2"]}这种形式
            $(serializeArray).each(function () {
                if (jsonData1[this.name]) {
                    if ($.isArray(jsonData1[this.name])) {
                        jsonData1[this.name].push(this.value);
                    } else {
                        jsonData1[this.name] = [jsonData1[this.name], this.value];
                    }
                } else {
                    jsonData1[this.name] = this.value;
                }
            });
            // 再转成[{"id": "12", "name": "aaa", "pwd":"pwd1"},{"id": "14", "name": "bb", "pwd":"pwd2"}]的形式
            var vCount = 0;
            // 计算json内部的数组最大长度
            for(var item in jsonData1){//json串中的每一个元素
                var tmp = $.isArray(jsonData1[item]) ? jsonData1[item].length : 1;
                vCount = (tmp > vCount) ? tmp : vCount;
            }

            if(vCount > 1) {
                var jsonData2 = new Array();
                for(var i = 0; i < vCount; i++){
                    var jsonObj = {};
                    for(var item in jsonData1) {
                    	if( $.isArray(jsonData1[item])){
                        	jsonObj[item] = jsonData1[item][i];
                    	}else{
                    		jsonObj[item]=jsonData1[item];
                    	}
                    }
                    jsonData2.push(jsonObj);
                }
                return JSON.stringify(jsonData2);
            }else{
                return "[" + JSON.stringify(jsonData1) + "]";
            }
        };
    })(jQuery);
    

	
	
	
	
</script>	
</head>
<body class="easyui-layout" style="visibility:hidden;">
	<div region="center" border="false">
    	<table id="grid"></table>
	</div>
	<!-- 添加 入库信息 -->
	<div class="easyui-window" title="入库登记" id="addStaffWindow"   style="top:20px;left:200px">
		<div style="height:31px;overflow:hidden;" split="false" border="false" >
			<div class="datagrid-toolbar">
				<a id="save" icon="icon-save" href="#" class="easyui-linkbutton" plain="true" >保存</a>
				<a href="#"  icon="icon-add" class="easyui-linkbutton" id="btnCreate"  plain="true" >添加入库货品</a>
				
				<script type="text/javascript" language="JavaScript">
					$(function(){
						
						$("#save").click(function(){
							alert("ok");  
				            var jsonStr = $("#addSubareaForm").serializeJson2();  
				            //console.log("jsonStr:\r\n" + jsonStr);  
				            alert(jsonStr);  
				            $.ajax({  
				                url: "/user/submitUserList_4",  
				                type: "POST",  
				                contentType : 'application/json;charset=utf-8', //设置请求头信息  
				                dataType:"json",  
				                data: jsonStr,  
				                success: function(data){  
				                	if(data.status == 200){
										$.messager.alert('提示','新增内容成功!');
				                   		 window.location.href  = "/page_goods_goods-in.action";
									}
				                },  
				                error: function(res){  
				                    alert(res.responseText);  
				                }  
				            });  
				            });  
				});
				</script>
			</div>
		</div>
		
		<div style="overflow:auto;padding:5px;" border="false">
			<form id="addSubareaForm" method="post" action="goodsIn/add">
				<table  id="Feetable" class="table-edit" width="90%" align="center">
					<tr class="title">
						<td colspan="4">货品入库信息</td>
					</tr>
					<tr>
						<td>入库单号:</td>
						<td>
							<input type="text"  name="inCode" class="easyui-validatebox"  style="width:120px; required="true"  />
						</td>
						<td>供应商:</td>
						<td>
							<input  type="text"  class="easyui-validatebox"  style="width:120px; required="true"  name="source"   />
						</td>
					</tr>
					
					<tr>
						<td>仓库地址</td>
						<td><input type="text" name="address" class="easyui-validatebox"  style="width:120px;"/></td>
						<td>入库日期</td>
						<td><input type="inDate" name="inDate" id="inDate" class="easyui-datebox"  style="width:120px;"/></td>
					</tr>
					<tr>
						<td>经办人</td>
						<td>
							 <input  id="handledName1233" name="userId"  class="easyui-combobox"   data-options="valueField:'id',textField:'username',url:'user/listajax'" style="width: 120px;" />
						</td>
						<td>操作人</td>
						<td>
							<input  type="text"  class="easyui-validatebox"  style="width:120px; required="true"  name="personName"  value=${loginUser.username } />
						</td>
					</tr>
					<tr class="title"><td colspan="4">商品入库明细</td></tr>
					<tr>
						<td>货品名称</td>
						<td>
							<input  type="text"  class="easyui-validatebox"  style="width:120px; required="true"  name="goodsName"   />
							
						</td>
						
						<td>货品单位</td>
						<td><input class="easyui-validatebox" name="goodsUnit" style="width:120px;" />  
							  
						</td>
					</tr>
					<tr>
						<td>入库数量</td>
						<td>
							<input  type="text"  class="easyui-validatebox"  style="width:120px; required="true"  name="goodsNum"   />
							
						</td>
						
						<td>货品价格</td>
						<td>
							<input  type="text"  class="easyui-validatebox"  style="width:120px; required="true"  name="goodsPrice"   />
						</td>
					</tr>
					
				</table>
			</form>
		</div>
	</div>
	
	
	
	
	<!--  入库详细信息 -->
	<div class="easyui-window" title="入库详细信息" id="editStaffWindow" style="top:20px;left:200px">
		
		<div style="overflow:auto;padding:5px;" border="false">
			<form id="editStaffForm" method="post" action="goodsInfo/edit">
				<table class="table-edit" width="95%" align="center">
					<tr class="title">
						<td colspan="4">货品入库信息</td>
					</tr>
					<tr>
						<td>入库单号:</td>
						<td>
							<input type="text"  name="inCode" class="easyui-validatebox"  style="width:120px; required="true"  />
						</td>
						<td>供应商:</td>
						<td>
							<input  type="text"  class="easyui-validatebox"  style="width:120px; required="true"  name="source"   />
						</td>
					</tr>
					
					<tr>
						<td>仓库地址</td>
						<td><input type="text" name="address" class="easyui-validatebox"  style="width:120px;"/></td>
						<td>入库日期</td>
						<td><input type="text" name="inDate" class="easyui-datebox"  style="width:120px;"/></td>
					</tr>
					<tr>
						<td>经办人</td>
						<td>
						 <input  id="handledName"  name="handledName" class="easyui-combobox"   data-options="valueField:'id',textField:'username',url:'user/listajax'" style="width: 120px;" />

						</td>
						
						<td>操作人</td>
						<td>
							<input  type="text"  class="easyui-validatebox"  style="width:120px; required="true"  name="personName"  value=${loginUser.username } />
						</td>
					</tr>
					<tr class="title"><td colspan="4">商品入库明细</td></tr>
					<tr>
						<td>货品名称</td>
						<td>
							<input  type="text"  class="easyui-validatebox"  style="width:120px; required="true"  name="goodsName"   />
							
						</td>
						
						<td>货品单位</td>
						<td><select class="easyui-combobox" name="goodsUnit" style="width:120px;">  
							    <option value="个">个</option>  
							    <option value="张">张</option>  
							    <option value="条">条</option>  
							  </select>  
							  
						</td>
					</tr>
					<tr>
						<td>入库数量</td>
						<td>
							<input  type="text"  class="easyui-validatebox"  style="width:120px; required="true"  name="goodsNum"   />
							
						</td>
						
						<td>货品价格</td>
						<td>
							<input  type="text"  class="easyui-validatebox"  style="width:120px; required="true"  name="goodsPrice"   />
						</td>
					</tr>
					
				</table>
			</form>
		</div>
	</div>
	
	
	<!-- 查询分区 -->
	<div class="easyui-window" title="查询分区窗口" id="searchWindow" collapsible="false" minimizable="false" maximizable="false" style="top:20px;left:200px">
		<div style="overflow:auto;padding:5px;" border="false">
			<form id="searchForm">
				<table class="table-edit" width="80%" align="center">
					<tr class="title">
						<td colspan="2">查询条件</td>
					</tr>
					<tr>
						<td>仓库地址</td>
						<td><input type="text" name="address" style="width:150px;"/></td>
					</tr>
					<tr>
						<td>入库日期</td>
						<td><input type="text" name="inDate" class="easyui-datebox"  style="width:150px;"/></td>
					</tr>
					<tr>
						<td>经办人</td>
						<td>
							<input  type="text"  class="easyui-validatebox"  style="width:150px; required="true"  name="handledName"   />
						</td>
					</tr>
					<tr>
						<td colspan="2"><a id="btn" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-search'">查询</a> </td>
					</tr>
				</table>
			</form>
		</div>
	</div>
	
</body>
</html>