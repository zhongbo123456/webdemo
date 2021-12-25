<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: 钟波
  Date: 2021/12/25
  Time: 11:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
    <h1>登录页面</h1>
    <form method="get" action="${pageContext.request.contextPath}/user/login">
        <input type="submit" value="click"/>
    </form>
</head>
<body>

</body>
</html>
