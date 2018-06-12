<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>

 <form action="/com.ylw.shopsys/shop/toUpdate" method="post">  
<%--         <input type="hidden" name="id" value="${user.id }">   --%>
        编号：<input type="text" name="type_id" value="${type['type_id']}"><br/><br/>  
        商品类型： <input type="text" name="type_name" value="${type['type_name']}"><br/><br/>
        <input type="submit" value="修改">  
    </form>  
    </center>
</body>
</html>