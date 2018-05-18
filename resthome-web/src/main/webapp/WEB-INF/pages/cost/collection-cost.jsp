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

	//得到当前日期
	formatterDate = function(date) {
	var day = date.getDate() > 9 ? date.getDate() : "0" + date.getDate();
	var month = (date.getMonth() + 1) > 9 ? (date.getMonth() + 1) : "0"
	+ (date.getMonth() + 1);
	return date.getFullYear() + '-' + month + '-' + day;
	};
	
	window.onload = function () { 
	$('#handleDate').datebox('setValue', formatterDate(new Date()));
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
			$.messager.alert("提示信息","请选择需要删除的信息！","warning");
		}else{
			//选中了取派员,弹出确认框
			$.messager.confirm("删除确认","你确定要删除选中的信息吗？",function(r){
				if(r){
					
					var array = new Array();
					//确定,发送请求
					//获取所有选中的取派员的id
					for(var i=0;i<rows.length;i++){
						var staff = rows[i];//json对象
						var id = staff.costId;
						array.push(id);
					}
					var ids = array.join(",");//1,2,3,4,5
					location.href = "collection/delete?ids="+ids;
				}
			});
		}
	}
	
	
	
	
	//工具栏
	var toolbar = [ {
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
		field : 'costId',
		checkbox : true
	}, {
		field : 'name',
		title : '老人姓名',
		width : 120,
		align : 'center'
	
	},{
		field : 'collectionCost',
		title : '代收费用',
		width : 180,
		align : 'center'
		
		
	},{
		field : 'collectionDate',
		title : '代收日期',
		width : 120,
		align : 'center'
	}, {
		field : 'collectionName',
		title : '代收人姓名',
		width : 120,
		align : 'center'
	},{
		field : 'handleName',
		title : '操作人姓名',
		width : 180,
		align : 'center'
	}, {
		field : 'handleDate',
		title : '操作日期',
		width : 180,
		align : 'center'
	} ] ];
	
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
			url : "collection/select",
			idField : 'id',
			columns : columns,
		});
		
		// 添加老人信息
		$('#addSubareaWindow').window({
	        title: '添加接待信息',
	        width: 600,
	        modal: true,
	        shadow: true,
	        closed: true,
	        height: 400,
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
		
		
		
	});
	

	
	
</script>	
</head>
<body class="easyui-layout" style="visibility:hidden;">
	<div region="center" border="false">
    	<table id="grid"></table>
	</div>
	
	
	
	
	
	<!-- 添加  -->
	<div class="easyui-window" title="添加代收费用信息" id="addSubareaWindow" collapsible="false" minimizable="false" maximizable="false" style="top:20px;left:200px">
		<div style="height:31px;overflow:hidden;" split="false" border="false" >
			<div class="datagrid-toolbar">
				<a id="save" icon="icon-save" href="#" class="easyui-linkbutton" plain="true" >保存</a>
			</div>
		</div>
		
		<div style="overflow:auto;padding:5px;" border="false">
			<form id="oldManForm" action="collection/insert" method="post">
				<table class="table-edit" width="80%" align="center">
					<tr class="title">
						<td colspan="2">添加代收费用信息</td>
					</tr>
					
					<tr>
						<td>老人姓名</td>
							<td><input type="text" name="oldmanId" class="easyui-combobox" required="true" editable="false"  data-options="valueField:'id',textField:'name',url:'oldman/listajax'" /></td>
					</tr>
					<tr>
						<td>代收费用</td>
						<td><input type="text" name="collectionCost" class="easyui-numberbox" required="true"/>&nbsp元</td>
						
					</tr>
					<tr>
						<td>代收日期</td>
						<td><input type="text" name="collectionDate" editable="false"  class="easyui-datebox" required="true"/></td>
					</tr>
					<tr>
						<td>代收人姓名</td>
						<td><input type="text" name="collectionName" class="easyui-validatebox" required="true" /></td>
					</tr>
					
					<tr>
						<td>操作人</td>
						<td><input  type="text"  class="easyui-validatebox"   required="true"  name="handleName"  value=${loginUser.username } /></td>
					</tr>
					<tr>
						<td>操作日期</td>
						<td><input type="text" name="handleDate" id="handleDate" class="easyui-datebox"/></td>
					</tr>
					
				</table>
			</form>
		</div>
	</div>
	
</body>
</html>