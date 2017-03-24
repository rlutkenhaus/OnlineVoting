<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ page import="java.util.ArrayList, model.Election" %>
<%ArrayList<Election> allElections = (ArrayList<Election>)request.getAttribute("AllElections");
%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Election Options</title>
</head>
<body>
<form name="available-elections"  method="POST" action="MasterVMController">
<b>Select an existing election or start a new election.</b><br/>
   <table border=0 cellpadding=5>


   <%  for(int i = 0; i < allElections.size(); i++) {
           allElections.get(i).getElectionAlias();
   %>
  <tr>
  <td><input type = "radio"  name = "id" value = "<%= i %>"></td>
   	<td><%=allElections.get(i).getElectionAlias() %></td>
   <%
   }
   %>
 </tr>
 
</select>
</table>
<input type = "submit" name = "doThisToItem" value = "open selected election">
<input type = "submit" name = "doThisToItem" value = "add new election">

</form>
</body>
</html>