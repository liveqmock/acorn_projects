<%@ include file="/common/taglibs.jsp"%>
<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>
<html>
<head>
<title>主管审查页面</title>
</head>
<body>
	<link href="/static/style/inboundCall.css" rel="stylesheet"
		type="text/css" />
	<script type="text/javascript" src="/static/js/bpmView.js?${rnd}"></script>

	<div id="compare">
			<input id="input_busiType" type="hidden" value="${auditTaskType}"/> 
			<input id="input_id" type="hidden" value="${id}" />
			<input id="input_batchId" type="hidden" value="${batchId}" />
			<input id="input_crUser" type="hidden" value="${crUser}" /> 
			<input id="input_isManager" type="hidden" value="${isManager}" />
			<input id="input_isConfirmAudit" type="hidden" value="${isConfirmAudit }"/>
			<input id="input_source" type="hidden" value="${source }" />

		<div class="c_content">
			<h2 class="h2_tabtitle">
				修改申请编号：<span id="batchId">${batchId}</span>
			</h2>
            <div style="">
                <table class="changeAuTa" border="0" cellspacing="0" cellpadding="0" width="100%">
                    <tr style="background: #e2f2ff;">
                        <th scope="col">&nbsp;</th>
                        <th scope="col" class="big">修改前</th>
                        <th scope="col" class="big red">修改后</th>
                    </tr>
                    <tr><td class="no_r no_b"></td><td class="no_r no_b"></td><td class="no_r no_b"></td></tr>
                    <tr>
                        <td valign="top" width="90px" >
                            <div class="t_head int_info">常用基本信息</div>
                        </td>
                        <td valign="top" >
                            <table class="layout">
                                <tr>
                                    <td>客户姓名</td>
                                    <td><input id="oldName" type="text" class="readonly"
                                               readonly /></td>
                                </tr>
                                <tr>
                                    <td>客户性别</td>
                                    <td><label><input id="oldSexMen" type="radio"
                                                      disabled="disabled" />男</label>&nbsp;<label><input
                                            id="oldSexWomen" type="radio" disabled="disabled" />女</label></td>
                                </tr>
                            </table>
                        </td>
                        <td class="no_r" valign="top">
                            <table class="layout">
                                <tr id="newNameTR">
                                    <td>客户姓名</td>
                                    <td><input id="newName" type="text" class="readonly"
                                               readonly /></td>
                                </tr>
                                <tr id="newSexTR">
                                    <td>客户性别</td>
                                    <td><label><input id="newSexMen" type="radio"
                                                      disabled="disabled" />男</label>&nbsp;<label><input
                                            id="newSexWomen" type="radio" disabled="disabled" />女</label></td>
                                </tr>
                            </table>
                            <div id='div_contact_baseinfo_command' style="display: none;">
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td valign="top" width="90px" class="">
                            <div class="t_head addr_info" >常用通话<br>信息</div>
                        </td>
                        <td valign="top" class="" >
                            <table id="oldPhoneTable"></table>
                        </td>
                        <td class="no_r  " valign="top">
                            <table id="newPhoneTable"></table> <%--<p class="mb10 mt10" align="right"><a class="window_btn" href="#">批准</a><a class="window_btn ml10" href="#">驳回</a></p>--%>
                            <div id='div_contact_phone_command' style="display: none;">
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td valign="top" width="90px" class="">
                            <div class="t_head deliver_info" >常用收货<br>信息</div>
                        </td>
                        <td valign="top" class="" >
                            <table id="oldAddressTable"></table>
                        </td>
                        <td class="no_r" valign="top">
                            <table id="newAddressTable"></table> <%--<p class="mb10 mt10" align="right"><a class="window_btn" href="#">批准</a><a class="window_btn ml10" href="#">驳回</a></p>--%>
                            <div id='div_contact_new_address_command' style="display: none;">
                            </div>
                        </td>
                    </tr>
                </table>
            </div>
            <p class="mb10 mt10" align="center">
                <a id="a_submitInstance" class="window_btn" style="width:80px" href="javascript:void(0)">确定</a>
                <a id="a_cancelInstance" class="window_btn ml10"  style="width:80px" href="javascript:void(0)">关闭</a>
                <a id="a_agreeRejection" class="window_btn"  style="width:80px" href="javascript:void(0)">完成</a>
                <a id="a_disAgreeRejection" class="window_btn ml10"  style="width:100px" href="javascript:void(0)">修改客户</a>
            </p>
			<%--<table class="c_table" width="100%" border="0" cellspacing="5"--%>
				<%--cellpadding="0">--%>
				<%--<tr name="tr_base_1">--%>
					<%--<td colspan="2" class="c_context"></td>--%>
				<%--</tr>--%>
				<%--<tr name="tr_base_2">--%>
					<%--<td class="c_title" colspan="2">客户基本信息</td>--%>
				<%--</tr>--%>
				<%--<tr name="tr_base_3">--%>
					<%--<td colspan="2" class="c_context"></td>--%>
				<%--</tr>--%>
				<%--<tr name="tr_base_4">--%>
					<%--<td class="c_context rBorder" width="50%" valign="top">--%>
						<%--&lt;%&ndash;<table class="layout">&ndash;%&gt;--%>
							<%--&lt;%&ndash;<tr>&ndash;%&gt;--%>
								<%--&lt;%&ndash;<td>客户姓名</td>&ndash;%&gt;--%>
								<%--&lt;%&ndash;<td><input id="oldName" type="text" class="readonly"&ndash;%&gt;--%>
									<%--&lt;%&ndash;readonly /></td>&ndash;%&gt;--%>
							<%--&lt;%&ndash;</tr>&ndash;%&gt;--%>
							<%--&lt;%&ndash;<tr>&ndash;%&gt;--%>
								<%--&lt;%&ndash;<td>客户性别</td>&ndash;%&gt;--%>
								<%--&lt;%&ndash;<td><label><input id="oldSexMen" type="radio"&ndash;%&gt;--%>
										<%--&lt;%&ndash;disabled="disabled" />男</label>&nbsp;<label><input&ndash;%&gt;--%>
										<%--&lt;%&ndash;id="oldSexWomen" type="radio" disabled="disabled" />女</label></td>&ndash;%&gt;--%>
							<%--&lt;%&ndash;</tr>&ndash;%&gt;--%>
						<%--&lt;%&ndash;</table>&ndash;%&gt;--%>
					<%--</td>--%>
					<%--<td class="c_context" width="50%" valign="top" name="td_contact_base_info">--%>
						<%--&lt;%&ndash;<table class="layout">&ndash;%&gt;--%>
							<%--&lt;%&ndash;<tr id="newNameTR">&ndash;%&gt;--%>
								<%--&lt;%&ndash;<td>客户姓名</td>&ndash;%&gt;--%>
								<%--&lt;%&ndash;<td><input id="newName" type="text" class="readonly"&ndash;%&gt;--%>
									<%--&lt;%&ndash;readonly /></td>&ndash;%&gt;--%>
							<%--&lt;%&ndash;</tr>&ndash;%&gt;--%>
							<%--&lt;%&ndash;<tr id="newSexTR">&ndash;%&gt;--%>
								<%--&lt;%&ndash;<td>客户性别</td>&ndash;%&gt;--%>
								<%--&lt;%&ndash;<td><label><input id="newSexMen" type="radio"&ndash;%&gt;--%>
										<%--&lt;%&ndash;disabled="disabled" />男</label>&nbsp;<label><input&ndash;%&gt;--%>
										<%--&lt;%&ndash;id="newSexWomen" type="radio" disabled="disabled" />女</label></td>&ndash;%&gt;--%>
							<%--&lt;%&ndash;</tr>&ndash;%&gt;--%>
						<%--&lt;%&ndash;</table>&ndash;%&gt;--%>
						<%--&lt;%&ndash;<div id='div_contact_baseinfo_command' style="display: none;">&ndash;%&gt;--%>
						<%--&lt;%&ndash;</div>&ndash;%&gt;--%>
					<%--</td>--%>
				<%--</tr>--%>
				<%--<tr name="tr_phone_1">--%>
					<%--<td colspan="2" class="c_context"></td>--%>
				<%--</tr>--%>
				<%--<tr name="tr_phone_2">--%>
					<%--<td class="c_title" colspan="2">常用通话信息</td>--%>
				<%--</tr>--%>
				<%--<tr name="tr_phone_3">--%>
					<%--<td colspan="2" class="c_context"></td>--%>
				<%--</tr>--%>
				<%--<tr name="tr_phone_4">--%>
					<%--<td class="c_context rBorder" width="50%" valign="top">--%>
						<%--&lt;%&ndash;<table id="oldPhoneTable"></table>&ndash;%&gt;--%>
					<%--</td>--%>
					<%--<td class="c_context" width="50%" valign="top" name="td_new_phone_info">--%>
						<%--&lt;%&ndash;<table id="newPhoneTable"></table> &lt;%&ndash;<p class="mb10 mt10" align="right"><a class="window_btn" href="#">批准</a><a class="window_btn ml10" href="#">驳回</a></p>&ndash;%&gt;&ndash;%&gt;--%>
						<%--&lt;%&ndash;<div id='div_contact_phone_command' style="display: none;">&ndash;%&gt;--%>
						<%--&lt;%&ndash;</div>&ndash;%&gt;--%>
					<%--</td>--%>
				<%--</tr>--%>
				<%--<tr name="tr_address_1">--%>
					<%--<td colspan="2" class="c_context"></td>--%>
				<%--</tr>--%>
				<%--<tr name="tr_address_2">--%>
					<%--<td class="c_title" colspan="2">常用收货信息</td>--%>
				<%--</tr>--%>
				<%--<tr name="tr_address_3">--%>
					<%--<td colspan="2" class="c_context"></td>--%>
				<%--</tr>--%>
				<%--<tr name="tr_address_4">--%>
					<%--<td class="c_context rBorder" width="50%" valign="top">--%>
						<%--&lt;%&ndash;<table id="oldAddressTable"></table>&ndash;%&gt;--%>
					<%--</td>--%>
					<%--<td class="c_context" width="50%" valign="top" name="td_new_address_info">--%>
						<%--&lt;%&ndash;<table id="newAddressTable"></table> &lt;%&ndash;<p class="mb10 mt10" align="right"><a class="window_btn" href="#">批准</a><a class="window_btn ml10" href="#">驳回</a></p>&ndash;%&gt;&ndash;%&gt;--%>
						<%--&lt;%&ndash;<div id='div_contact_new_address_command' style="display: none;">&ndash;%&gt;--%>
						<%--&lt;%&ndash;</div>&ndash;%&gt;--%>
					<%--</td>--%>
				<%--</tr>--%>
				<%--<tr>--%>
					<%--<td colspan="2" class="c_context"></td>--%>
				<%--</tr>--%>
			<%--</table>--%>

			<%--<p class="mb10 mt10" align="center">--%>
				<%--<a id="a_submitInstance" class="window_btn" href="javascript:void(0)">确定</a> --%>
				<%--<a id="a_cancelInstance" class="window_btn ml10" href="javascript:void(0)">关闭</a>--%>
				<%--<a id="a_agreeRejection" class="window_btn" href="javascript:void(0)">完成</a>--%>
	       		<%--<a id="a_disAgreeRejection" class="window_btn ml10" href="javascript:void(0)">修改客户</a>--%>
			<%--</p>--%>
		</div>

	</div>

</body>
</html>