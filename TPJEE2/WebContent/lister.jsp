<%@ page import="java.util.List,metier.Client"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/modeleDePage.css" />
<title>Insert title here</title>
</head>
<body>
<!--
<% List<Client> lesClients = ((List<Client>) request.getAttribute("lesClients")); %> -->
  <div id="content">
	<div class="block">
		<table>
		<tr>
		<th> ID</th>
		<th> NOM</th>
		<th> PRENOM</th>
		<th> COULEUR YEUX</th>
		<th> AGE </th>

<% for(Client c : lesClients) {%>
<tr> 
<td><%=c.getId() %> </td>
<td><%=c.getNom() %> </td>
<td><%=c.getPrenom() %> </td>
<td><%=c.getCouleurYeux() %> </td>
<td><%=c.getAge() %> </td>

</tr>

<%} %>
</table>
</div>
</div>


</p>
</body>
</html>