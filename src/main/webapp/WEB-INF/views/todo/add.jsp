<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
<h1>TODOLIST 등록 화면입니다.</h1>

<form action="/todo/add" method="post">

    <input type="text" name="title">
    <input type="text" name="detail">
    <input type="hidden" name="memberId" value="${memberId}" />

    <button type="submit">submit</button>
</form>
</body>
</html>
