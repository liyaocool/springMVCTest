<%--
  Created by IntelliJ IDEA.
  User: 冰糖雪梨
  Date: 2019/9/22
  Time: 12:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>uploadfile</title>
</head>
<body>
<h1>uploadfile.jsp</h1>
<h2>单文件上传</h2>
<form action="upload" method="post" enctype="multipart/form-data">
    <input type="file" name="file"/>
    <input type="submit" value="上传"/>
</form>
<hr/>
<h2>多文件上传</h2>
<form action="multiUpload" method="post" enctype="multipart/form-data">
    <input type="file" name="file"/><br/>
    <input type="file" name="file"/><br/>
    <input type="file" name="file"/><br/>
    <input type="submit" value="上传"/>
</form>
</body>
</html>
