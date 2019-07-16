<%--
  Created by IntelliJ IDEA.
  User: EDZ
  Date: 2019/7/15
  Time: 9:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>下载文件显示页面</title>
</head>
<body>
<!-- 遍历Map集合 -->
<c:forEach var="me" items="${fileNameMap}">
    <c:url value="/download" var="downurl">
        <c:param name="filename" value="${me.key}"></c:param>
    </c:url>
    ${me.value}<a href="${downurl}">下载</a>
    <br />
</c:forEach>
</body>
</html>
