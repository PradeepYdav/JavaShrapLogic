<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add New Notes</title>
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
 <h1>Add New Notes</h1>
 ${resp }
 <form action="/addnotes" method="post">
 <fieldset class="form-group">
 <label>Title:</label>
  <textarea  class="form-control" rows="5" cols="100"  name="title"   required></textarea>
 </fieldset>
 <br>
 <hr>
 <fieldset  class="form-group">
 <label>Description:</label>
 <textarea class="form-control"  rows="5" cols="100" name="contnet" required></textarea>
  </fieldset>
 <input type="submit" class="btn btn-success"  value="Save Notes ">
 </form>
 
 </div>

</body>
</html>