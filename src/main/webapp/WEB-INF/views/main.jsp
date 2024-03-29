<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>main</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

</head>

<body>
<c:choose>
    <c:when test="${empty member.name}">
        <h1>main page 입니다</h1>
        <button><a href="/member/join">회원가입</a></button>
        <button><a href="/member/login">로그인 </a></button>
    </c:when>
    <c:otherwise>
        안녕하세요 ${member.name} 님
        <button><a href="/member/logout">로그아웃</a></button>
        <button><a href="/todo/add">ADD</a></button>
    </c:otherwise>
</c:choose>
</body>
</html>