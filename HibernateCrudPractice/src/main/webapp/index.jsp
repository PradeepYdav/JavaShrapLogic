<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Notes Page</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">

</head>
<body>

<nav role="navigation" class="navbar navbar-default">
	<div class="">
		<a href="/" class="navbar-brand">Pradeep</a>
	</div>
	<div class="navbar-collapse">
		<ul class="nav navbar-nav">
			<li class="active" ><a href="/">Home/Get all notes</a></li>
			<li ><a href="/addnotes">Add New Notes</a></li>
			

		</ul>
	</div>
 </nav>


 
 <div class="container">
 <h1> Welcome To Notes Page</h1>
 
 <table class="table table-striped">
  <caption>Your Todos are : </caption>
  
  <thead>
  	<tr>
  		<th>Title  </th>
  		<th>Contnet </th>
  		<th>Created Date  </th>
  		<th>Updated Date </th>
  		<th>Operstions </th>
  		
  	</tr>
  </thead>
  
  <tbody>
  <c:forEach items="${notes}" var="note">
  		<tr>
  			<td> ${note.title } </td>
  			<td> ${note.contnet } </td>
  			<td> <fmt:formatDate pattern="dd/MM/yyyy" value="${note.createAt}" />  </td>
  			<td> <fmt:formatDate pattern="dd/MM/yyyy" value="${note.updateAt}" />  </td>
  			<td>
  			<a href="updateNotes?id=${note.id}" class="btn btn-success">Update</a>
  			<a href="deleteNotes?id=${note.id}" class="btn btn-danger">Delete</a></td>
  		</tr>
  	</c:forEach>
  </tbody>
</table>

</div>


</body>
</html>