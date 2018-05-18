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
						var id = data.goodsId;
						array.push(id);
					}
					var ids = array.join(",");//1,2,3,4,5
					location.href = "goodsInfo/delete?ids="+ids;
				}
			});
		}
	}
	
// 	function doSearch(){
// 		$('#searchWindow').window("open");
// 	}
	
	//工具栏
	var toolbar = [  {
		id : 'button-edit',	
		text : '修改',
		iconCls : 'icon-edit',
		handler : doEdit
	},{
		id : 'button-delete',
		text : '删除',
		iconCls : 'icon-cancel',
		handler : doDelete
	}	];
	// 定义列
	var columns = [ [ {
		checkbox : true
	}, {
		field : 'goodsId',
		title : '货品编号',
		width : 150,
		align : 'center'
	},{
		field : 'goodsName',
		title : '货品名称',
		width : 150,
		align : 'center'
	}, {
		field : 'nowNum',
		title : '当前库存',
		width : 150,
		align : 'center'
	},{
		field : 'inNum',
		title : '入库数量',
		width : 150,
		align : 'center'
	},{
		field : 'outNum',
		title : '出库数量',
		width : 150,
		align : 'center'
	} ] ];
	
	$(function(){
		// 先将body隐藏，再显示，不会出现页面刷新效果
		$("body").css({visibility:"visible"});
		
		// 收派标准数据表格
		$('#grid').datagrid( {
			iconCls : 'icon-forward',
			fit : true,
			border : true,
			rownumbers : true,
			striped : true,
			pageList: [10],
			pagination : true,
			toolbar : toolbar,
			url : "goodsInfo/query",
			columns : columns,
			onDblClickRow : doDblClickRow
		});
		
		// 添加、分区
		$('#addStaffWindow').window({
	        title: '添加货品信息',
	        width: 500,
	        modal: true,
	        shadow: true,
	        closed: true,
	        height: 400,
	        resizable:false
	    });
		// 修改、分区
		$('#editStaffWindow').window({
	        title: '修改分区',
	        width: 500,
	        modal: true,
	        shadow: true,
	        closed: true,
	        height: 400,
	        resizable:false
	    });
		
// 		// 查询分区
// 		$('#searchWindow').window({
// 	        title: '查询分区',
// 	        width: 400,
// 	        modal: true,
// 	        shadow: true,
// 	        closed: true,
// 	        height: 400,
// 	        resizable:false
// 	    });
		
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
		
// 		$("#btn").click(function(){
// 			//将指定的form表单中所有的输入项转为json数据{key:value,key:value}
// 			var p = $("#searchForm").serializeJson();
// 			console.info(p);
// 			//调用数据表格的load方法，重新发送一次ajax请求，并且提交参数
// 			$("#grid").datagrid("load",p);
// 			//关闭查询窗口
// 			$("#searchWindow").window("close");
// 		});
	});

	function doDblClickRow(rowIndex, rowData){
		
		$('#editStaffWindow').window("open");
		//使用form表单对象的load方法回显数据
		$("#editStaffForm").form("load",rowData);

	
	}
	
	
</script>	
</head>
<body class="easyui-layout" style="visibility:hidden;">
	<div region="center" border="false">
    	<table id="grid"></table>
	</div>
	<!-- 添加 调度信息 -->
	<div class="easyui-window" title="员工请假" id="addStaffWindow" collapsible="false" minimizable="false" maximizable="false" style="top:20px;left:200px">
		<div style="height:31px;overflow:hidden;" split="false" border="false" >
			<div class="datagrid-toolbar">
				<a id="save" icon="icon-save" href="#" class="easyui-linkbutton" plain="true" >保存</a>
				<script type="text/javascript">
					$(function(){
						$("#save").click(function(){
							//表单校验
							var r = $("#addSubareaForm").form('validate');
							if(r){
								$("#addSubareaForm").submit();
							}
						});
					});
				</script>
			</div>
		</div>
		
		<div style="overflow:auto;padding:5px;" border="false">
			<form id="addSubareaForm" method="post" action="goodsInfo/add">
				<table class="table-edit" width="80%" align="center">
					<tr class="title">
						<td colspan="2">货品信息</td>
					</tr>
					<tr>
						<td>货品名称</td>
						<td>
							<input type="hidden"  name="goodsId"   />
							<input  type="text"  class="easyui-validatebox"  style="width:150px; required="true"  name="goodsName"   />
						</td>
					</tr>
					<tr>
						<td>货品型号</td>
						<td>
							<input  type="text"  class="easyui-validatebox"  style="width:150px; required="true"  name="goodsModel"   />
						</td>
					</tr>
					
					<tr>
						<td>单位</td>
						<td><select class="easyui-combobox" name="goodsNumber" style="width:150px;">  
							    <option value="个">个</option>  
							    <option value="张">张</option>  
							    <option value="条">条</option>  
							  </select>  
							  
						</td>
					</tr>
					<tr>
						<td>价格</td>
						<td><input type="text" name="price" class="easyui-numberbox"  style="width:150px;"/></td>
					</tr>
					<tr>
						<td>生产日期</td>
						<td><input type="text" name="sdate" class="easyui-datebox"  style="width:150px;"/></td>
					</tr>
					<tr>
						<td>备注</td>
						<td>
							<input  type="text"  class="easyui-validatebox"  style="width:150px; required="true"  name="remark"   />
							
						</td>
						
					</tr>
				</table>
			</form>
		</div>
	</div>
	
	
	
	<!--  修改调度信息 -->
	<div class="easyui-window" title="调度修改" id="editStaffWindow" collapsible="false" minimizable="false" maximizable="false" style="top:20px;left:200px">
		<div style="height:31px;overflow:hidden;" split="false" border="false" >
			<div class="datagrid-toolbar">
				<a id="edit" icon="icon-edit" href="#" class="easyui-linkbutton" plain="true" >修改</a>
				<script type="text/javascript">
					$(function(){
						$("#edit").click(function(){
							//表单校验
							var r = $("#editStaffForm").form('validate');
							if(r){
								$("#editStaffForm").submit();
							}
						});
					});
				</script>
			</div>
		</div>
		
		<div style="overflow:auto;padding:5px;" border="false">
			<form id="editStaffForm" method="post" action="goodsInfo/edit">
				<table class="table-edit" width="80%" align="center">
					<tr class="title">
						<td colspan="2">货品信息</td>
					</tr>
					<tr>
						<td>货品名称</td>
						<td>
							<input type="hidden"  name="goodsId"   />
							<input  type="text"  class="easyui-validatebox"  style="width:150px; required="true"  name="goodsName"   />
						</td>
					</tr>
					<tr>
						<td>货品型号</td>
						<td>
							<input  type="text"  class="easyui-validatebox"  style="width:150px; required="true"  name="goodsModel"   />
						</td>
					</tr>
					<tr>
						<td>单位</td>
						<td><select class="easyui-combobox" name="goodsNumber" style="width:150px;">  
							    <option value="个">个</option>  
							    <option value="张">张</option>  
							    <option value="条">条</option>  
							  </select>  
							  
						</td>
					</tr>
					<tr>
						<td>价格</td>
						<td><input type="text" name="price" class="easyui-numberbox"  style="width:150px;"/></td>
					</tr>
					<tr>
						<td>生产日期</td>
						<td><input type="text" name="sdate" class="easyui-datebox"  style="width:150px;"/></td>
					</tr>
					<tr>
						<td>备注</td>
						<td>
							<input  type="text"  class="easyui-validatebox"  style="width:150px; required="true"  name="remark"   />
						</td>
					</tr>
				</table>
			</form>
		</div>
	</div>
<!-- 	<!-- 查询分区 --> -->
<!-- 	<div class="easyui-window" title="查询分区窗口" id="searchWindow" collapsible="false" minimizable="false" maximizable="false" style="top:20px;left:200px"> -->
<!-- 		<div style="overflow:auto;padding:5px;" border="false"> -->
<!-- 			<form id="searchForm"> -->
<!-- 				<table class="table-edit" width="80%" align="center"> -->
<!-- 					<tr class="title"> -->
<!-- 						<td colspan="2">查询条件</td> -->
<!-- 					</tr> -->
<!-- 					<tr> -->
<!-- 						<td>员工姓名</td> -->
<!-- 						<td><input type="text" name="name" style="width:150px;"/></td> -->
<!-- 					</tr> -->
<!-- 					<tr> -->
<!-- 						<td>请假日期</td> -->
<!-- 						<td><input type="text" name="beginDate" class="easyui-datebox"  style="width:150px;"/></td> -->
<!-- 					</tr> -->
<!-- 					<tr> -->
<!-- 						<td>批准人</td> -->
<!-- 						<td> -->
<!-- 							<input  type="text"  class="easyui-validatebox"  style="width:150px; required="true"  name="approve"   /> -->
<!-- 						</td> -->
<!-- 					</tr> -->
<!-- 					<tr> -->
<!-- 						<td colspan="2"><a id="btn" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-search'">查询</a> </td> -->
<!-- 					</tr> -->
<!-- 				</table> -->
<!-- 			</form> -->
<!-- 		</div> -->
<!-- 	</div> -->
	
</body>
</html>