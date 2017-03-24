
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
<%Election election = (Election)request.getAttribute("CurrentElection"); %>

<table>
<b>Vote for one candidate:</b> <BR>
   <table border=0 cellpadding=5>
<tr>
<td><%=election.getElectionAlias()%>: </td>
<td><input type = "radio"  name = "VoteFor" value = "<%=election.getC1()%>" CHECKED></td>
<td><%=election.getC1()%></td>
<td><input type = "radio"  name = "VoteFor" value = "<%=election.getC2()%>"></td>
<td><%=election.getC2()%></td>
<td><input type = "radio"  name = "VoteFor" value = "<%=election.getC3()%>"></td>
<td><%=election.getC3()%></td>
</tr>

</select>
</table>
<input type = "submit" name = "doThisToItem" value = "cast ballot">
<input type = "submit" name = "doThisToItem" value = "end election">
<input type = "hidden" name = "eName" value = "<%=election.getElectionAlias() %>">


</form>


</body>
</html>