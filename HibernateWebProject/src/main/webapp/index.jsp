<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student page</title>
</head>
<body>
	
	<form action="insertStud" method="post">
		<h1 style="background-color: yellow " title="text-center">WELCOME TO STUDENT PAGE!!</h1>
		<hr/>
		<table style="background-color: FloralWhite;font-family: arial;width: 300px;hight:200px">
			<tr>
				<td><label>Student-Id:-</label></td>
				<td><input type="text" name="sid"></td>
			</tr>
			<tr>
				<td><label>Student-Name:-</label></td>
				<td><input type="text" name="sname"></td>
			</tr>
			<tr>
				<td><label>Student-Fee:-</label></td>
				<td><input type="text" name="sfee"></td>
			</tr>
			<tr>
				<td><label>Age:-</label></td>
				<td><input type="text" name="age"></td>
			</tr>
			<tr>
				<td><label>Mobile:-</label></td>
				<td><input type="text" name="mob"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="sid"><input type="reset"></td>
			</tr>
		</table>
	</form>
	${message }
	<br>
	<a href="StudData">Show Record</a>

</body>
</html>