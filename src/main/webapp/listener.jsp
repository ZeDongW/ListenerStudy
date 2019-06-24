<%--
  Created by IntelliJ IDEA.
  User: ZeDongW
  Date: 2019/6/22 0022
  Time: 15:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="cn.zedongw.listener.binding.Students" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
//        request.setAttribute("cn", "China");
//        session.setAttribute("userName", "Rose");
//        session.removeAttribute("userName");
        session.setAttribute("stu", new Students());
        session.removeAttribute("stu");
    %>
<%--    <c:set var="userName" value="Jack" scope="session"/>--%>
  <%--  <c:set value="stu" var="<%= new Students()%>>" scope="session"/>--%>
</body>
</html>
