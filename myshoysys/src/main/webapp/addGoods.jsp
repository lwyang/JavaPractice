<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品添加</title>
<style type="text/css">
.addGoodsForm{
position:relative;
margin-left: 450px;
}
#btn{
position:relative;
margin-left: 110px;
}
</style>
</head>
<body>
<center><h2>请输入你要添加的商品信息</h2></center>

<br/><br/> <br/>
<form action="/com.ylw.shopsys/goods/addGoods" method="post"  class="addGoodsForm">  
<%--         <input type="hidden" name="id" value="${user.id }">   --%>
        编号：<input type="text" name="goods_id"  ><br/><br/> 
        商品名称：<input type="text" name="goods_name"   ><br/><br/> 
        商品类型：<select name="goods_type"   >
		<c:forEach items="${listType}" var="data">  
    <option >${data}</option>
    </c:forEach>

	</select><br><br/>
         商品价格：<input type="text" name="goods_price" ><br/><br/> 
         
<!--         商品类型： <input type="text" name="goods_type"  align="left" ><br/><br/>  -->
        库存数量： <input type="text" name="goods_number" ><br/><br/> 
        <input type="submit" value="提交" id="btn">  
    </form>  
</body>

</html>