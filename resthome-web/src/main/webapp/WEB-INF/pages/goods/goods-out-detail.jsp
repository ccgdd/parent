<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/css/def.css">	
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


<style type="text/css">
			<!-- body {
				background-position: right bottom;
				background-repeat: no-repeat;
				background-color: #fffff8;
				margin: 0px;
				padding: 0px;
				font-size: 12px;
			}
			
			-->
		</style>
</head>
<script type="text/javascript">
	$(function(){
		 $('#btnClose').click(function () { 
			 location.href = "${pageContext.request.contextPath }/page_goods_goods-out.action";
		 });
	});
</script>	

<body>
		<div id="box" style="background: #FFFFFF; height: 100%; width: 100%; margin: 0 auto; overflow: auto;">

			<div id="main_panel" style="text-align: center;">

				<div style="text-align: center; padding: 5px">
					<a href="#" class="easyui-linkbutton" id="btnClose" iconcls="icon-back" plain="true">返回</a>
				</div>

				<div id="show_panel" style="text-align:center;width:100%;height:100%;">

					<table class="tbd2" data-sort="sortDisabled" border="1" cellpadding="0" cellspacing="0" style="width:70%;">

						<tbody align="right">

							<tr class="firstRow">
								<th width="100px">
									入库单号：
								</th>
								<td align="left" width="277px">
										
									${goodsOut.outCode}
								</td>
								<th width="70px">
									供应商:
								</th>
								<td align="left">
									${goodsIn.source}
								</td>
							</tr>
							<tr>
								<th width="70px">
									仓库地址
								</th>
								<td align="left">
									${goodsOut.address}
								</td>
								<th width="100px">
									入库日期：
								</th>
								<td align="left">
									${format2}
								</td>
							</tr>

							<tr>
								<th width="70px">
									经办人：
								</th>
								<td align="left">
									${goodsOut.inName}				
								</td>

								<th width="70px">
									登记人：
								</th>
								<td align="left">
									${goodsOut.personName}
								</td>
							</tr>

							<c:forEach items="${goodsOutDetail}" var="goodsInDetail" >				
							<tr style="height:35px">
								<th colspan="4" style="text-align: center;background-color:#F8F8FF;">
									<font>出库物资</font>
								</th>
							</tr>
							<tr>
								<td colspan="6" style="text-align:center">
									<table id="Feetable" class="tbd2" data-sort="sortDisabled" border="1" cellpadding="0" cellspacing="0" style="width:100%;line-height:30px;border-color:#FFF;">
										<tbody name="tbodys" id="tbody0">
											<tr class="firstRow">
												<th width="90px">
													物资名称:
												</th>
												<td align="left" width="280px">
													${goodsInDetail.goodsName}
												</td>
												<th width="100px">
													出库数量:
												</th>
												<td align="left">
													${goodsInDetail.goodsNum}
												</td>
											</tr>

											<tr>
												<th width="100px">
													出库单位:
												</th>
												<td align="left">
													${goodsInDetail.goodsUnit}
												</td>
												<th width="70px">
													出库价格:
												</th>
												<td align="left">
													${goodsInDetail.goodsPrice}元
												</td>
											</tr>
														
											
										</tbody>
									</table>
								</td>
							</tr>
							</c:forEach>
							<tr id="hideTR">
								<td colspan="4" style="text-align:center">
									<table id="showtable" class="tbd2" data-sort="sortDisabled" border="1" cellpadding="0" cellspacing="0" style="width:100%;line-height:30px;border-color:#FFF;">
										<tbody>

										</tbody>
									</table>
								</td>
							</tr>

						</tbody>
					</table>

				</div>
			</div>

		</div>
	</body>
</html>