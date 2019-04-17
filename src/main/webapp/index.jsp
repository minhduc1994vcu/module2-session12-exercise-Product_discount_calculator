<%--
  Created by IntelliJ IDEA.
  User: minhduc
  Date: 17/04/2019
  Time: 21:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form method="post" action="/display">
    <div id="content">
        <h1>Product Discount Caculator</h1>
        <div id="data">
            <label>Product Description</label>
            <input type="text" name="description"><br>
            <label> List Price</label>
            <input type="text" name="price"><br>
            <label> Discount Percent</label>
            <input type="text" name="discountPercent">(%)<br>
        </div>
        <div id="button">
            <label>&nbsp;</label>
            <input type="submit" value="Calculator Discount">
        </div>
    </div>
</form>
</body>
</html>
