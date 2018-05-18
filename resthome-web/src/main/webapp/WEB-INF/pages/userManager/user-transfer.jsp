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
						var id = data.staffId;
						array.push(id);
					}
					var ids = array.join(",");//1,2,3,4,5
					location.href = "userManager/delete?ids="+ids;
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
		text : '增加',
		iconCls : 'icon-add',
		handler : doAdd
	}, {
		id : 'button-edit',	
		text : '修改',
		iconCls : 'icon-edit',
		handler : doEdit
	},{
		id : 'button-delete',
		text : '删除',
		iconCls : 'icon-cancel',
		handler : doDelete
	}
	];
	// 定义列
	var columns = [ [ {
		field : 'staffId',
		checkbox : true
	}, {
		field : 'staffName',
		title : '员工姓名',
		width : 120,
		align : 'center'
	},{
		field : 'olddepartment',
		title : '原部门',
		width : 120,
		align : 'center'
	}, {
		field : 'oldposition',
		title : '原职位',
		width : 120,
		align : 'center'
	},{
		field : 'transferdepartment',
		title : '调往部门',
		width : 120,
		align : 'center'
	},{
		field : 'newposition',
		title : '现任职位',
		width : 120,
		align : 'center'
	} ,{
		field : 'tranferdate',
		title : '调度日期',
		width : 120,
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
			url : "userManager/select",
			columns : columns,
			onDblClickRow : doDblClickRow
		});
		
		// 添加、分区
		$('#addStaffWindow').window({
	        title: '添加修改分区',
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
	<div class="easyui-window" title="调度添加" id="addStaffWindow" collapsible="false" minimizable="false" maximizable="false" style="top:20px;left:200px">
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
			<form id="addSubareaForm" method="post" action="userManager/add">
				<table class="table-edit" width="80%" align="center">
					<tr class="title">
						<td colspan="2">员工调度信息</td>
					</tr>
					<tr>
						<td>员工姓名</td>
						<td>
							<input type="hidden"  name="staffId"   />
							<input  type="text"  class="easyui-validatebox"  style="width:120px; required="true"  name="staffName"   />
						</td>
					</tr>
					<tr>
						<td>原部门</td>
						<td><input type="text" name="olddepartment" style="width:120px; class="easyui-validatebox" required="true"/></td>
					</tr>
					<tr>
						<td>原职位</td>
						<td><input type="text" name="oldposition" style="width:120px; class="easyui-validatebox" required="true"/></td>
					</tr>
					<tr>
						<td>调往部门</td>
						<td>
							<select  name="transferdepartment" class="easyui-combobox" style="width:120px;">
							    <option value="">- -请选择- -</option> 
							    <option value="主管">主管</option>  
							    <option value="后勤">后勤</option>  
							    <option value="护理">护理</option>  
							    <option value="厨房">厨房</option>  
							    <option value="门卫">门卫</option>  
							    <option value="其他">其他</option>  
							</select> 
						
						</td>
					</tr>
					<tr>
						<td>现任职位</td>
						<td>
							<select class="easyui-combobox" name="newposition" style="width:120px;">  
							    <option value="">- -请选择- -</option>  
							    <option value="院长">院长</option>  
							    <option value="主管">主管</option>  
							    <option value="护士">护士</option>  
							    <option value="医生">医生</option>  
							    <option value="护工">护工</option>  
							    <option value="炊事员">炊事员</option>  
							    <option value="其他">其他</option>  
							</select> 
						</td>
					</tr>
					<tr>
						<td>调度日期</td>
						<td><input type="text" name="tranferdate" class="easyui-datebox"  style="width:120px;"/></td>
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
			<form id="editStaffForm" method="post" action="userManager/edit">
				<table class="table-edit" width="80%" align="center">
					<tr class="title">
						<td colspan="2">员工调度信息</td>
					</tr>
					<tr>
						<td>员工姓名</td>
						<td>
							<input type="hidden"  name="staffId"   />
							<input  type="text"  class="easyui-validatebox"  style="width:120px; required="true"  name="staffName"   />
						</td>
					</tr>
					<tr>
						<td>原部门</td>
						<td><input type="text" name="olddepartment" style="width:120px; class="easyui-validatebox" required="true"/></td>
					</tr>
					<tr>
						<td>原职位</td>
						<td><input type="text" name="oldposition" style="width:120px; class="easyui-validatebox" required="true"/></td>
					</tr>
					<tr>
						<td>调往部门</td>
						<td>
							<select  name="transferdepartment" class="easyui-combobox" style="width:120px;">
							    <option value="">- -请选择- -</option> 
							    <option value="主管">主管</option>  
							    <option value="后勤">后勤</option>  
							    <option value="护理">护理</option>  
							    <option value="厨房">厨房</option>  
							    <option value="门卫">门卫</option>  
							    <option value="其他">其他</option>  
							</select> 
						
						</td>
					</tr>
					<tr>
						<td>现任职位</td>
						<td>
							<select class="easyui-combobox" name="newposition" style="width:120px;">  
							    <option value="">- -请选择- -</option>  
							    <option value="院长">院长</option>  
							    <option value="主管">主管</option>  
							    <option value="护士">护士</option>  
							    <option value="医生">医生</option>  
							    <option value="护工">护工</option>  
							    <option value="炊事员">炊事员</option>  
							    <option value="其他">其他</option>  
							</select> 
						</td>
					</tr>
					<tr>
						<td>调度日期</td>
						<td><input type="text" name="tranferdate" class="easyui-datebox"  style="width:120px;"/></td>
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
						<td>员工姓名</td>
						<td><input type="text" name="staffName" style="width:120px;"/></td>
					</tr>
					<tr>
						<td>调往部门</td>
						<td>
							<select  name="transferdepartment" class="easyui-combobox" style="width:120px;">
							    <option value="">- -请选择- -</option> 
							    <option value="主管">主管</option>  
							    <option value="后勤">后勤</option>  
							    <option value="护理">护理</option>  
							    <option value="厨房">厨房</option>  
							    <option value="门卫">门卫</option>  
							    <option value="其他">其他</option>  
							</select> 
						
						</td>
					</tr>
					<tr>
						<td>现任职位</td>
						<td>
							<select class="easyui-combobox" name="newposition" style="width:120px;">  
							    <option value="">- -请选择- -</option>  
							    <option value="院长">院长</option>  
							    <option value="主管">主管</option>  
							    <option value="护士">护士</option>  
							    <option value="医生">医生</option>  
							    <option value="护工">护工</option>  
							    <option value="炊事员">炊事员</option>  
							    <option value="其他">其他</option>  
							</select> 
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