<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script src="./static/js/jquery-3.2.1.min.js"></script>
</head>
<script type="text/javascript">

        
		 
function copyText() {
	var schoolList={
			  "name": "admin",
			  "password":"123456"			
			};
	$.ajax({
		type:"POST",
		url: "http://www.happymmall.com:8080/SenHeYun/User/get1.do", 
		contentType: "application/json", //必须这样写
		 dataType:"json",
		 data:JSON.stringify(schoolList),//schoolList是你要提交是json字符串
		success: function(data){			
			alert("222   "+data.status.errorMessage);
      	}});
}
</script>
<body>
<div>1111111111111</div>
<button onclick="copyText()">Copy Text</button>
</body>
</html>