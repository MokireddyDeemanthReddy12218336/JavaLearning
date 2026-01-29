<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LoginPage</title>
</head>
<body>
<h3>Contacts Manager</h3>
<jsp:include page="menubar.jsp"></jsp:include>
<h3>Login Page</h3>
<div>
<h3 style="color: red;"> ${error}</h3>
<form action="dologin" method ="post">
<div>
<label>Login</label>
<input type ="text" name="lg">
</div>
<div>
<label>Password</label>
<input type ="password" name="pw">
</div>
<div>
<button>Next</button>
</div>
</form>
</div>
</body>
</html>