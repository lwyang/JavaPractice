<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="" method=post>
  <input type="checkbox" name="choice" value="牛肉12元"/>牛肉12元<input type="text" name="number"/><br>
    <input type="checkbox" name="choice" value="猪肉25元"/>猪肉25元<input type="text" name="number"/><br>
      <input type="checkbox" name="choice" value="鱼肉30元"/>鱼肉30元<input type="text" name="number"/><br>
      <input type="submit" value="提交" />
     
  </form>
  </body>
  <%
     try{
     String[] str=new String[]{"牛肉12元","猪肉25元","鱼肉30元"};
     request.setCharacterEncoding("UTF-8");
      String[] choice=request.getParameterValues("choice");

      String[] number=request.getParameterValues("number");
     
      //out.println(choice.length+" "+number.length);
      for(int j=0;j<choice.length;j++)
      {
      for (int i=0;i<str.length;i++)
      {
         //out.println(str[i]+" "+choice[j]);
          if (str[i].equals(choice[j]))
          {   out.println(choice[j]+" "+number[i]+"<br>");
             // out.println(i+" "+j);
          }
      }
      }
     
      }
      catch(Exception ex){
     
     
      }  

   %>
</body>
</html>