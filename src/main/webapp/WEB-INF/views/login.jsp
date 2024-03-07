<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<html>
<head>
    <title>Title</title>
    <script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>
</head>
<body>
<h1>login 페이지 입니다.</h1>

<form action="/member/login"  method="POST">
    <input type="email" name="email" placeholder="input email">
    <button type="submit">login</button>

</form>
</body>
</html>
