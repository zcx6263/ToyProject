<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>


<%@include file ="../includes/header.jsp" %>

<script type = "text/javascript">
$(document).ready(function() {
  var formObj = $("form");
  
  $('button').on("click", function(e){
    e.preventDefault();
    
    var operation = $(this).data("oper");
    console.log(operation);
    if(operation == 'remove') {
      formObj.attr("action","/board/remove");
    }
    else if(operation =='list') {
      formObj.attr("action", "/board/list").attr("method","get");
      formObj.empty();
    }
    formObj.submit();
  });
});
</script>

<div class="row">
    <div class="col-lg-12">
        <h1 class = "page-header">Board Modify</h1>
    </div>
</div>

<div class="row">
    <div class = "col-lg-12">
        <div class = "panel panel-default">
            <div class ="panel-heading">Board Read Page</div>
            
            <div class = "panel-body">
                <form role="form" action = "/board/modify" method="post">
                    <div class="form-group">
                        <label>Bno</label> <input class="form-control" name ="bno"
                        value='<c:out value="${board.bno}"/>' readonly="readonly">
                    </div>
                    
                    <div class="form-group">
                        <label>Title</label> <input class="form-control" name ="title"
                        value='<c:out value="${board.title}"/>'>
                    </div>
                    
                    <div class="form-group">
                        <label>Text area</label> <textarea class="form-control" rows="3" name ="content"
                        ><c:out value ="${board.content}"/></textarea>
                    </div>
                    
                    <div class="form-group">
                        <label>Writer</label> <input class="form-control" name ="writer"
                        value='<c:out value="${board.writer}"/>' readonly="readonly">
                    </div>
                    <button type="submit" data-oper="modify" class="btn btn-default"/>modify</button>
                    <button type="submit" data-oper="remove" class="btn btn-default"/>remove</button>
                    <button type="submit" data-oper="list" class="btn btn-info"/>list</button>
                </form>
            </div>
        </div>
    </div>
</div>


<%@include file="../includes/footer.jsp" %>