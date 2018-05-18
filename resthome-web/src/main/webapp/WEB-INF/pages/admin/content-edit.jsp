<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link href="/js/kindeditor-4.1.10/themes/default/default.css" type="text/css" rel="stylesheet">
<script type="text/javascript" charset="utf-8" src="/js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="/js/kindeditor-4.1.10/lang/zh_CN.js"></script>
<div style="padding:10px 10px 10px 10px">
	<form id="contentEditForm" class="itemForm" method="post">
	    <table cellpadding="5">
	        <tr>
	            <td>床位号:</td>
	            <td><input class="easyui-textbox" type="text" name="id" data-options="required:true" style="width: 280px;"></input></td>
	        </tr>
	        <tr>
	            <td>床位名称:</td>
	            <td><input class="easyui-textbox" type="text" name="name" style="width: 280px;"></input></td>
	        </tr>
	        <tr>
	            <td>床位类型:</td>
	            <td><input class="easyui-textbox" type="text" name="style" style="width: 280px;"></input></td>
	        </tr>
	        <tr>
	            <td>所属楼栋:</td>
	            <td><input class="easyui-textbox" type="text" name="buildnum" style="width: 280px;"></input></td>
	        </tr>
	        <tr>
	            <td>所属层:</td>
	            <td><input class="easyui-textbox" type="text" name="floor" style="width: 280px;"></input></td>
	        </tr>
	        <tr>
	            <td>所属房间:</td>
	            <td><input class="easyui-textbox" type="text" name="roomnum" style="width: 280px;"></input></td>
	        </tr>
	        <tr>
	            <td>状态:</td>
	            <td><selete class="easyui-combobox" type="text" name="state" style="width: 280px;">
	            		<option value="1">预定</option>
						<option value="2">空闲</option>
	            	</selete>
	            </td>		
	        </tr>
	        <tr>
	            <td>所住老人:</td>
	            <td>
	            <selete  id="ccxx"   class="easyui-combobox"   name="oid" data-options="valueField:'id',textField:'name',url:'oldman/listajax'" style="width: 280px;">
	            </selete></td>
	        </tr>
	    </table>
	</form>
	<div style="padding:5px">
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="contentEditPage.submitForm()">提交</a>
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="contentEditPage.clearForm()">重置</a>
	</div>
</div>
<script type="text/javascript">

		var contentEditPage = {
				submitForm : function(){
					if(!$('#contentEditForm').form('validate')){
						$.messager.alert('提示','表单还未填写完成!');
						return ;
					}
					
					$.post("/rest/content/edit",$("#contentEditForm").serialize(), function(data){
						if(data.status == 200){
							$.messager.alert('提示','新增内容成功!');
							$("#contentList").datagrid("reload");
							E3.closeCurrentWindow();
						}
					});
				},
				clearForm : function(){
					
				}
		};
</script>