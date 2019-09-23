<%--
  Created by IntelliJ IDEA.
  User: 冰糖雪梨
  Date: 2019/9/23
  Time: 20:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>cardForm</title>
</head>
<body>
<h3>增加卡牌</h3>
<form action="addCard" method="post">
    <input type="hidden" value="post" name="_method">
    <label>
        cardNo:
        <input type="text" name="cardNo"/>
    </label>
    <input type="submit" value="增加">
</form>
<hr/>
<h3>修改卡牌</h3>
<form action="updateCard" method="post">
    <input type="hidden" value="PUT" name="_method">
    <label>
        cardNo:
        <input type="text" name="cardNo"/>
    </label>
    <input type="submit" value="修改">
</form>
</body>
</html>
