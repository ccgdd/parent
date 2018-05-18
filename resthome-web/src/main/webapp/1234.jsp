<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>	
	<div style="overflow:auto;padding:5px;" border="false">
			<form id="editStaffForm" method="post" action="userLeave/edit">
				<table class="table-edit" width="80%" align="center">
					<tr class="title">
						<td colspan="2">员工请假信息</td>
					</tr>
					<tr>
						<td>员工姓名</td>
						<td>
							<input type="hidden"  name="id"   />
							<input  type="text"  class="easyui-validatebox"  style="width:120px; required="true"  name="name"   />
						</td>
					</tr>
					<tr>
						<td>请假原因</td>
						<td>
							<input  type="text"  class="easyui-validatebox"  style="width:120px; required="true"  name="reason"   />
						</td>
					</tr>
					
					<tr>
						<td>请假日期</td>
						<td><input type="text" name="beginDate" class="easyui-datebox"  style="width:120px;"/></td>
					</tr>
					<tr>
						<td>销假日期</td>
						<td><input type="text" name="endDate" class="easyui-datebox"  style="width:120px;"/></td>
					</tr>
					<tr>
						<td>批准人</td>
						<td>
							<input  type="text"  class="easyui-validatebox"  style="width:120px; required="true"  name="approve"   />
						</td>
					</tr>
				</table>
			</form>
		</div>
</body>
</html>