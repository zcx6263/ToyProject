<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script src="http://code.jquery.com/jquery-1.9.1.js"></script>
    <title>Title</title>
</head>
<script type = "text/javascript">

<%
 
String test = request.getParameter("num");
out.println(test);
%>

$(function() {
  
  var tt = '<%=test%>';
  alert(tt);
  
  
});
</script>
<body>
  
  <h2>test!</h2>
</body>
</html>
