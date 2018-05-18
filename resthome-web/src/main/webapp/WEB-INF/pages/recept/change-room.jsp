<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理分区</title>
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
	<script type="text/javascript" src="js/common.js"></script>
<script
	src="${pageContext.request.contextPath }/js/easyui/locale/easyui-lang-zh_CN.js"
	type="text/javascript"></script>
<script type="text/javascript">
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

	//得到当前日期
	formatterDate = function(date) {
	var day = date.getDate() > 9 ? date.getDate() : "0" + date.getDate();
	var month = (date.getMonth() + 1) > 9 ? (date.getMonth() + 1) : "0"
	+ (date.getMonth() + 1);
	return date.getFullYear() + '-' + month + '-' + day;
	};
	
	window.onload = function () { 
	$('#changeDate').datebox('setValue', formatterDate(new Date()));
	}

	function doAdd(){
		$('#addSubareaWindow').window("open");
	}
	
	
	function doDelete(){
		alert("删除...");
		//获取数据表格中所有选中的行，返回数组对象
		var rows = $("#grid").datagrid("getSelections");
		if(rows.length == 0){
			//没有选中记录，弹出提示
			$.messager.alert("提示信息","请选择需要删除的老人！","warning");
		}else{
			//选中了取派员,弹出确认框
			$.messager.confirm("删除确认","你确定要删除选中的老人吗？",function(r){
				if(r){
					
					var array = new Array();
					//确定,发送请求
					//获取所有选中的取派员的id
					for(var i=0;i<rows.length;i++){
						var staff = rows[i];//json对象
						var id = staff.id;
						array.push(id);
					}
					var ids = array.join(",");//1,2,3,4,5
					location.href = "changeroom/delete?ids="+ids;
				}
			});
		}
	}
	
	function doSearch(){
		$('#searchWindow').window("open");
	}
	
	function doExport(){
		alert("导出");
	}
	
	function doImport(){
		alert("导入");
	}
	
	
	
	//工具栏
	var toolbar = [  {
		id : 'button-add',
		text : '增加',
		iconCls : 'icon-add',
		handler : doAdd
	}, {
		id : 'button-delete',
		text : '删除',
		iconCls : 'icon-cancel',
		handler : doDelete
	}];
	
	
	
	
	// 定义列
	var columns = [ [ {
		field : 'id',
		checkbox : true
	}, {
		field : 'oldmanName',
		title : '老人名称',
		width : 120,
		align : 'center'
	
	}, {
		field : 'changeBedId',
		title : '转换床号',
		width : 120,
		align : 'center'
	}, {
		field : 'changeDate',
		title : '转房日期',
		width : 160,
		align : 'center'
		
	}, {
		field : 'remark',
		title : '备注',
		width : 160,
		align : 'center'
		
	}] ];
	
	$(function(){
		// 先将body隐藏，再显示，不会出现页面刷新效果
		$("body").css({visibility:"visible"});
		
		// 老人信息数据表格
		$('#grid').datagrid( {
			iconCls : 'icon-forward',
			fit : true,
			border : true,
			rownumbers : true,
			striped : true,
			pageList: [10,20,30],
			pagination : true,
			toolbar : toolbar,
			url : "changeroom/query",
			idField : 'id',
			columns : columns,
			onDblClickRow : doDblClickRow
		});
		
		// 添加老人信息
		$('#addSubareaWindow').window({
	        title: '添加老人信息',
	        width: 600,
	        modal: true,
	        shadow: true,
	        closed: true,
	        height: 400,
	        resizable:false
	    });
		
		// 修改老人信息
		$('#editSubareaWindow').window({
	        title: '修改老人信息',
	        width: 600,
	        modal: true,
	        shadow: true,
	        closed: true,
	        height: 400,
	        resizable:false
	    });
		
		// 查询老人信息
		$('#searchWindow').window({
	        title: '查询老人信息',
	        width: 400,
	        modal: true,
	        shadow: true,
	        closed: true,
	        height: 200,
	        resizable:false
	    });
		
		
		
		
		
		
		$("#btn").click(function(){
			////将指定的form表单中所有的输入项转为json数据{key:value,key:value}
			var p = $("#searchForm").serializeJson();
			console.info(p);
			//调用数据表格的load方法，重新发送一次ajax请求，并且提交参数
			$("#grid").datagrid("load",p);
			//关闭查询窗口
			$("#searchWindow").window("close");
			
		});
		
		//为保存按钮绑定事件
		$("#save").click(function(){
			//表单校验，如果通过，提交表单
			var v = $("#oldManForm").form("validate");
			if(v){
				$("#oldManForm").submit();
			}
			
		});
		
		
		
		//为修改按钮绑定事件
		$("#edit").click(function(){
			//表单校验，如果通过，提交表单
			var v = $("#editoldManForm").form("validate");
			if(v){
				$("#editoldManForm").submit();
			}
			
		});
	});
	

	function doDblClickRow(rowIndex,rowData){
		//打开修改取派员窗口
		$('#editSubareaWindow').window("open");
		//使用form表单对象的load方法回显数据
		$("#editSubareaWindow").form("load",rowData);
	}
	
	
</script>	
</head>
<body class="easyui-layout" style="visibility:hidden;">
	<div region="center" border="false">
    	<table id="grid"></table>
	</div>
	
	
	
	
	
	<!-- 添加  -->
	<div class="easyui-window" title="分区添加修改" id="addSubareaWindow" collapsible="false" minimizable="false" maximizable="false" style="top:20px;left:200px">
		<div style="height:31px;overflow:hidden;" split="false" border="false" >
			<div class="datagrid-toolbar">
				<a id="save" icon="icon-save" href="#" class="easyui-linkbutton" plain="true" >保存</a>
			</div>
		</div>
		
		<div style="overflow:auto;padding:5px;" border="false">
			<form id="oldManForm" action="changeroom/insert" method="post">
				<table class="table-edit" width="80%" align="center">
					<tr class="title">
						<td colspan="2">转房信息</td>
					</tr>
					<tr>
						<td>老人名称</td>
						<td><input type="text" name="oldmanName"class="easyui-combobox" required="true" editable="false"  data-options="valueField:'id',textField:'name',url:'oldman/listajax'" /></td>
					</tr>
					<tr>
						<td>转换床号:</td>
						<td><input type="text" name="changeBedId" class="easyui-combobox" required="true"  editable="false"  data-options="valueField:'id',textField:'name',url:'bed/listajax'"/></td>
					</tr>
					<tr>
						<td>转换日期:</td>
						<td><input type="text" name="changeDate" id="changeDate"  class="easyui-datebox"  /></td>
					</tr>
					<tr>
						<td>备注:</td>
						<td><textarea name="remark"  style="width:80%"></textarea></td>
					</tr>
				</table>
			</form>
		</div>
	</div>
	
	<!-- 修改加  -->
	<div class="easyui-window" title="修改" id="editSubareaWindow" collapsible="false" minimizable="false" maximizable="false" style="top:20px;left:200px">
		<div style="height:31px;overflow:hidden;" split="false" border="false" >
			<div class="datagrid-toolbar">
				<a id="edit" icon="icon-save" href="#" class="easyui-linkbutton" plain="true" >保存</a>
			</div>
		</div>
		
		<div style="overflow:auto;padding:5px;" border="false">
			<form id="editoldManForm" action="oldman/edit" method="post">
			<input type="hidden" name="id"/>
				<table class="table-edit" width="80%" align="center">
					<tr class="title">
						<td colspan="2">老人信息</td>
					</tr>
					
					<tr>
						<td>老人名称</td>
						<td><input type="text" name="name" class="easyui-validatebox" required="true"/></td>
					</tr>
					<tr>
						<td>身份证号码</td>
						<td><input type="text" name="number" class="easyui-validatebox" required="true"/></td>
					</tr>
					<tr>
						<td>性别</td>
						<td><input type="text" name="sex" class="easyui-validatebox" required="true"/></td>
					</tr>
					<tr>
						<td>出生日期</td>
						<td><input type="text" name="birthday" class="easyui-validatebox" required="true"
							/></td>
					</tr>
					<tr>
						<td>年龄</td>
						<td><input type="text" name="age" class="easyui-validatebox" required="true"/></td>
					</tr>
					<tr>
						<td>所属机构</td>
						<td><input type="text" name="orgn" class="easyui-validatebox" required="true"/></td>
					</tr>
					<tr>
						<td>家庭地址</td>
						<td><input type="text" name="address" class="easyui-validatebox" required="true"/></td>
					</tr>
					<tr>
						<td>入住状态</td>
						<td><input type="text" name="state" class="easyui-validatebox" required="true"/></td>
					</tr>
				</table>
			</form>
		</div>
	</div>
	
	
	<!-- 查询分区 -->
	<div class="easyui-window" title="查询老人窗口" id="searchWindow" collapsible="false" minimizable="false" maximizable="false" style="top:20px;left:200px">
		<div style="overflow:auto;padding:5px;" border="false">
			<form id="searchForm" >
				<table class="table-edit" width="80%"  height="60%" align="center">
					<tr class="title">
						<td colspan="2">查询条件</td>
					</tr>
					<tr>
						<td>老人名称</td>
						<td><input type="text" name="name"/></td>
					</tr>
					<tr>
						<td>身份证号码</td>
						<td><input type="text" name="number"/></td>
					</tr>
					<tr>
						<td>年龄</td>
						<td><input type="text" name="age"/></td>
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