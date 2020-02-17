<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <script src="http://code.jquery.com/jquery-1.9.1.js"></script>
    <title>Title</title>
</head>
<%! 
String sCode = "C100013030"; // 시스템 코드 
String IP = "10.10.10.110"; // IP 
String rNum = "abc";        // 랜던 값

%>
<jsp:forward page="/WEB-INF/views/sample/drmAuthResultPage.jsp"/>
<%

//request.getRequestDispatcher("/views/sample/drmAuthResultPage").forward(request, response);

String bb = (String)request.getAttribute("bb");
out.println(bb);
//RequestDispatcher dispatcher = request.getRequestDispatcher("/sample/drmAuthResultPage");

request.setAttribute("code",sCode);
String ttt = (String)request.getAttribute("code");
out.println(ttt);
//dispatcher.forward(request, response);
%>


<script type = "text/javascript">

$(function() {
  
  var t1 = '<%=sCode%>';
  var t2 = '<%=ttt%>';
  alert(t2);
});


</script>
<body>
  
  <h2>test!</h2>
</body>
</html>
