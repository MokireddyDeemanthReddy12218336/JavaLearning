<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>Contacts Manager</h3>
<jsp:include page="menubar.jsp"></jsp:include>
<h3>Add contact</h3>
<div>
<form action="savecontact" method ="post">
<div>
<label>ID</label>
<input type ="text" name="id">
</div>
<div>
<label>Name</label>
<input type ="text" name="name">
</div>
<div>
<label>Email</label>
<input type ="text" name="email">
</div>
<div>
<button>Add</button>
</div>
</form>
</div>
</body>
</html>