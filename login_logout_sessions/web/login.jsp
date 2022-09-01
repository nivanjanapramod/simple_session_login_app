<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
  
    <form action="login" method="post">
  
        <h3>Enter Your details</h3>
  
        <table>
            <tr>
                <td>User Name:</td>
                <td><input type="text" name="username" /></td>
            </tr>
            <tr>
                <td>User Password:</td>
                <td><input type="password" name="password" /></td>
            </tr>
  
        </table>
          
        <input type="submit" value="Login" />
  
    </form>
</body>
</html>