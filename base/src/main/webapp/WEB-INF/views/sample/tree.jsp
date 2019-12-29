<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
    <script src="/resources/js/jquery.js" type="text/javascript"></script>
    <script src="/resources/js/jquery-ui.custom.js" type="text/javascript"></script>
    <script src="/resources/js/jquery.dynatree.js" type="text/javascript"></script>
    <link href="/resources/js/ui.dynatree.css" rel="stylesheet" type="text/javascript">
    


    <title>Title</title>
</head>
<script type = "text/javascript">



$(function() {
  $("#tree").dynatree({
    
    children : [
      {title:"Item 1"},
      {title:"Folder 2", isFolder: true,
      children: [
        {title:"Sub-item 2.1"},
        {title:"Sub-item 2.2"}
      ]  
      },
      {title: "Item 3"}
    ],
    onActivate:function(node) {
      $("#state").html(node.data.title);
    }
    
  });
});

</script>
<body>
  
  <div id = "tree">
  
  </div>
  <div>
    선택한 노드 : <span id="state"></span>
  </div>
</body>
</html>
