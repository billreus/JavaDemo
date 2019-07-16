<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>文件上传</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/upload" enctype="multipart/form-data" method="post">
    上传用户：<input type="text" name="username"><br/>
    上传文件:<input type="file" name="file1"><br/>
    <input type="submit" value="提交">
</form>
</body>
</html>
