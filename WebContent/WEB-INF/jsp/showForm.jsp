<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>${title }</title>
</head>
<body>

<h1>${welcome }</h1>
<h4>${enter }</h4>
<form method="post" action="/SpringMVC-App/displayForm.html" >
<!--  Enter Id  : <input type="text" name="id"/> <br> -->
<table>
<tr>
<td>Enter name:</td>
<td><input type="text" name="name"/></td>
</tr>
<tr>
<td>Enter hobby:</td> <td><input type="text" name="hobby"/></td>
</tr>
<tr>
<td></td>
<td><input type="submit"/></td>
</tr>
</table>
</form>
</body>
</html>