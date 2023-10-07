<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>new</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
  </head>
  <body>
	<div class="container">`
		<center><h1>login app</h1></center><br/><br/>
	  <div class="row">
	    <div class="col-2">a</div>
	    <div class="col-4">
			<img class="img-thumbnail" src="image/login@4x.png">
	    </div>
	    <div class="col-4">
	    <form action="LoginS" method = "post">
			  
			    <label class="form-label">Email address</label>
			    <input type="text" class="form-control" name = "email">
			  	<label class="form-label">password</label>
			    <input type="password" class="form-control" name = "pwd">
			  
			  <div class="mb-3 form-check">
			    <input type="checkbox" class="form-check-input" id="exampleCheck1">
			    <label class="form-check-label" for="exampleCheck1">Check me out</label>
			  </div>
			  <button type="submit" name="submit" class="btn btn-outline-primary">Submit</button>
		</form>
	    	
	    </div>
	    <div class="col-2">a</div>
	  </div>
	</div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
  </body>
</html>