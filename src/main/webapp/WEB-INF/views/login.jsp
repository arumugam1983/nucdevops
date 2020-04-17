<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> <%@taglib
uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> Login </title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<form:form name="submitForm" method="POST">
<div class="container">
<div class="jumbotron text-center">
  <h1>Spring Web App Login </h1>
 
</div>
 <div class="container"> 
<div class="container">
  <div class="row">
    <div class="col-sm-4">
    </div>
    <div class="col-sm-4">
    <div class="form-group">
      <label for="usr">Name:</label>
      <input type="text" name="userName" class="form-control" />
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" name="password" class="form-control"/>
    </div>
    <div class="form-group">
      <label for="pwd"></label>
     
      <button type="submit" class="btn btn-primary">Submit</button>
    
    </div>
      <!-- div style="color: red">${error}</div -->
    </div> 
    </div>
    </div>
    



</form:form>
</body>
</html>