<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<html>
<head>
    <title>Title</title>
    <script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>
</head>
<body>
<h1>회원가입 페이지 입니다.</h1>

<form action="/member/join" method="post">
    <input type="text" name="name" placeholder="input name!"/>
    <input type="email" name="email" placeholder="input email!"/>
    <button type="submit">회원가입</button>
</form>
</body>
</html>
