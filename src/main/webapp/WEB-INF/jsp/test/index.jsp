<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
    <%@include file="../common/resource.jsp" %>
    <link type="text/css" href="<%=staticPath%>/css/index.css" rel="stylesheet"/>
</head>
<body>
<%@include file="../common/header.jsp" %>
<div class="banner"><img src="<%=staticPath%>/img/index/banner.png" alt=""></div>
<div class="content">
    <div class="vr">
        <div class="inner-vr w">
            <h3>720°VR全景</h3>
            <img class="line" src="<%=staticPath%>/img/index/line.png" alt="">
            <div class="worksCon"><img src="<%=staticPath%>/img/index/111.png" alt=""></div>
        </div>
    </div>
    <%--用户案例--%>
    <div class="user-profiles">
        <div class="inner-user-profiles w">
            <h3>720°VR全景</h3>
            <img class="line" src="<%=staticPath%>/img/index/line.png" alt="">
            <div class="user-wrapper">
                <div class="user-item"></div>
                <div class="user-item"></div>
                <div class="user-item"></div>
            </div>
        </div>
    </div>
</div>

<%--<img src="<%=staticPath%>/img/test.png">--%>
<%--<%@include file="common/footer.jsp" %>--%>
</body>
</html>