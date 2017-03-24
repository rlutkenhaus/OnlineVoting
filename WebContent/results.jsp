<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head><%@ page import="model.Election" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Election Results</title>
</head>
<body>
<form name="results"  method="GET" action="AddVotesServlet">
<%Election election = (Election)request.getAttribute("CurrentElection"); %>

<table>
<b>Election results:</b> <BR>
   <table border=0 cellpadding=5>
<tr>
<td><%=election.getElectionAlias()%> </td>
<td><%=election.getC1()%> : <%=election.getC1Votes()%> </td>
<td><%=election.getC2()%> : <%=election.getC2Votes()%> </td>
<td><%=election.getC3()%> : <%=election.getC3Votes()%> </td>


</body>
</html>