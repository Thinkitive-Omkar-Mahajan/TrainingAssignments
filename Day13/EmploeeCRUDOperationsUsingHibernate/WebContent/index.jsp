<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="dbOperation" method="post">
		<h2>Employee Details</h2>
		ID: <input type="text" name="eid"/><br/>
		Name: <input type="text" name="ename"> &nbsp; Updated Name: <input type="text" name="ename1"><br/>
		Salary: <input type="text" name="esalary"><br/>
		<input type="submit" name="db" value="Insert"><br/>
		<input type="submit" name="db" value="Update">
		<input type="submit" name="db" value="Delete">
		<input type="submit" name="db" value="Read">
	</form>
</body>
</html>