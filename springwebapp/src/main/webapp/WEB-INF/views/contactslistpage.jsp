<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contacts</title>
</head>
<body>
<h3>Contacts</h3>
<table border='1' style="border-collapse: collapse; width: 40%;">
<tr><th>ID</th><th>Name</th><th>Email</th></tr>
<c:forEach var="c" items="${contacts}">
<tr><td>${c.id}<form action="deleteid" method="post">
<input type="hidden"  value="${c.id}" name="id">
<button>X</button>
</form>
</td>
<td>${c.name}</td>
<td>${c.email}</td>
</tr>
</c:forEach>
</table>
</body>
</html>