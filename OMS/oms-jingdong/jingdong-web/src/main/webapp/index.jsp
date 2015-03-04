<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="static/js/jquery-1.4.4.min.js"></script>
</head>
<body>
<p>It works!</p>
<p id="message"></p>
<p>
	开始时间： <input id="beginDate" type="text"/>
	结束时间: <input id="endDate" type="text"/>
	<input type="button" value="导入" onclick="importOrder()">
</p>

<script type="text/javascript">
	function importOrder() {
		$.ajax({
			url: 'api/import',
			data: {
				'beginDate': $('#beginDate').val(), 
				'endDate': $('#endDate').val()
			},
			type: 'POST',
			cache: false,
			dataType: 'json',
			success: function(rs) {
				if(rs.success) {
					$('#message').html('导入成功');
				}else{
					$('#message').html('导入失败: ' + rs.message);
					console.log('导入失败: ' + rs.message);
				}
			}
		});
	}
</script>
</body>
</html>