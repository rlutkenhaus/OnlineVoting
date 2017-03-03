
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <%@ page import="model.Election" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cast your ballot</title>
</head>
<body>
<form name="eligible-candidates"  method="POST" action="AddVotesServlet">
<%Election election = (Election)request.getAttribute("CurrentElection");  %>
<table>
<b>Vote for one candidate:</b> <BR>
   <table border=1 cellpadding=5>

<select NAME="Cast a ballot" SIZE="4" MULTIPLE>
<tr>
<td><input type = "radio"  name = "Cast a ballot" value = ""></td>
<td><%=election.getC1()%></td>
<td><%=election.getC2()%></td>
<td><%=election.getC3()%></td>
</tr>

</select>
</table>
<input type = "submit" name = "doThisToItem" value = "cast ballot">
<input type = "submit" name = "doThisToItem" value = "end election">
</form>
</body>
</html>