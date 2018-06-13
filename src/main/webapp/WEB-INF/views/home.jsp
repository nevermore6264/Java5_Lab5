<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/4/2018
  Time: 10:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <title>Dependance Injection</title>
    <style>
        .form-group {
            margin: 10px;
        }
    </style>
</head>
<body>
<form>
    <div class="form-group">
        <div>Username</div>
        <input name="id" value="${user.username}">
    </div>
    <div class="form-group">
        <div>Password</div>
        <input name="id" value="${user.password}">
    </div>
    <div class="form-group">
        <button>Login</button>
    </div>
</form>
</body>
</html>
