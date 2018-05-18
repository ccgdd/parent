<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
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
	href="${pageContext.request.contextPath }/css/default.css?param=Math.random()">	
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/easyui/ext/jquery.portal.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/easyui/ext/jquery.cookie.js"></script>
<script
	src="${pageContext.request.contextPath }/js/easyui/locale/easyui-lang-zh_CN.js"
	type="text/javascript"></script>
<script type="text/javascript" src="js/common.js"></script>

<script type="text/javascript">
	// 工具栏
	var toolbar = [  {
		id : 'button-add',
		text : '新增',
		iconCls : 'icon-add',
		handler : doAdd
	}, {
		id : 'button-delete',
		text : '删除',
		iconCls : 'icon-cancel',
		handler : doDelete
	}];
	//定义冻结列
	var frozenColumns = [ [ {
		field : 'id',
		checkbox : true,
		rowspan : 2
	}, {
		field : 'username',
		title : '姓名',
		width : 80,
		rowspan : 2
	} ] ];


	// 定义标题栏
	var columns = [ [  {
		field : 'gender',
		title : '性别',
		width : 60,
		rowspan : 2,
		align : 'center'
	}, {
		field : 'birthday',
		title : '生日',
		width : 120,
		rowspan : 2,
		align : 'center'
	}, {
		field : 'age',
		title : '年龄',
		width : 50,
		rowspan : 2,
		align : 'center'
	},{
		field : 'idcard',
		title : '身份证号码',
		width : 120,
		rowspan : 2,
		align : 'center'
	},{
		field : 'education',
		title : '学历',
		width : 80,
		rowspan : 2,
		align : 'center'
	},{
		field : 'nation',
		title : '民族',
		width : 50,
		rowspan : 2,
		align : 'center'
	},{
		field : 'workdate',
		title : '入职日期',
		width : 120,
		rowspan : 2,
		align : 'center'
	}, {
		field : 'telephone',
		title : '电话',
		width : 80,
		rowspan : 2
	} , {

		field : 'address',
		title : '地址',
		width : 120,
		rowspan : 2,
		align : 'center'
	},{
		field : 'station',
		title : '职位',
		width : 80,
		align : 'center'
	} ,{
		field : 'status',
		title : '员工状态',
		width : 80,
		align : 'center',
	}, {
		field : 'roleNames',
		title : '角色',
		width : 130,
		align : 'center'
	}, {
		field : 'remark',
		title : '备注',
		width : 130,
		align : 'center'
	}] ];
	$(function(){
		// 初始化 datagrid
		// 创建grid
		$('#grid').datagrid( {
			iconCls : 'icon-forward',
			fit : true,
			border : false,
			rownumbers : true,
			striped : true,
			toolbar : toolbar,
			url : "user/query",
			idField : 'id', 
			frozenColumns : frozenColumns,
			columns : columns,
			onClickRow : onClickRow,
			onDblClickRow : doDblClickRow
		});
		
		
		$("body").css({visibility:"visible"});
		
	});
	//创建一个窗口
   function createWindow(params){
    	$("<div>").css({padding:"5px"}).window({
    		width : 1000,
    		height :500,
    		modal:true,
    		title : params.title?params.title:" ",
    		href : params.url,
		    onClose : function(){
		    	$(this).window("destroy");
		    },
		    onLoad : function(){
		    	if(params.onLoad){
		    		params.onLoad.call(this);
		    	}
		    }
    	}).window("open");
    }
	
	// 双击
	function doDblClickRow(rowIndex, rowData) {
		var items = $('#grid').datagrid('selectRow',rowIndex);
		doView();
	}
	// 单击
	function onClickRow(rowIndex){

	}
	
	function doAdd() {
		alert("添加用户");
		location.href="${pageContext.request.contextPath}/page_admin_userinfo.action";
	}

	function doView() {
		
// 		var item = $('#grid').datagrid('getSelected');
			
		createWindow({
			url : "/page_admin_user-edit.action",
			onLoad : function(){
				var data = $("#grid").datagrid("getSelections")[0];
				$("#userEditForm").form("load",data);
				
				
			}
		});    	
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
						var user = rows[i];//json对象
						var id = user.id;
						array.push(id);
					}
					var ids = array.join(",");//1,2,3,4,5
					location.href = "user/delete?ids="+ids;
				}
			});
		}
	}
	
	
	
</script>		
</head>
<body class="easyui-layout" style="visibility:hidden;">
    <div region="center" border="false">
    	<table id="grid"></table>
	</div>
</body>
</html>