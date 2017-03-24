<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create a new election</title>
</head>
<body>

<form action = "AddElectionServlet" method = "post">
<p><b>Create a new election: </b></p>
<p>Election name: <input type = "text" name = "electionTitle"></p>
<p>Name of first candidate: <input type = "text" name = "name1"></p>
<p>Name of second canidadate: <input type = "text" name = "name2"></p>
<p>Name of third candidate: <input type = "text" name = "name3"></p>
<input type = "submit" value = "Add election and candidates">


</form>
</body>
</html>