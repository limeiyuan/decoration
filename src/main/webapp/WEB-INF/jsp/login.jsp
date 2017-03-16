<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="common/resource.jsp" %>
</head>
<body>
<%@include file="common/header.jsp" %>

123
<form action="user/getUser.htm">
    <input type="hidden" name="id" value="2113"/>
    <input type="submit" value="提交"/>
    <a href="front/test/test">测试</a>
</form>
<img src="<%=staticPath%>/img/test.png">
<%@include file="common/footer.jsp" %>
</body>
</html>