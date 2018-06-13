<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/4/2018
  Time: 10:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head>
    <base href="${pageContext.servletContext.contextPath}/">
    <meta charset="utf-8"/>
    <title>Tiêu đề</title>
</head>
<body>
<p>
<h3>Thông tin cá nhân</h3>
<img src="files/${photo_name}">
<br>
<h3>${param.fullname}</h3>
</p>
<p>
<h3>Hồ sơ xin việc</h3>
<ul>
    <li>File Name: ${cv_name}</li>
    <li>File Type: ${cv_type}</li>
    <li>File Size: ${cv_size}</li>
</ul>
</p>
</body>
</html>