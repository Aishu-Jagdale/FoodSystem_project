<%@page import="java.util.Iterator"%>
<%@page import="com.pojo.Customer"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer List</title>
</head>
<body>
<%
	List<Customer> clist= (List)session.getAttribute("clist");
%>
<%@ include file="header.jsp" %>
  <form style="margin: 2% 0% 2% 33%">
  <h1 style="color: green;">Customer List</h1>
   <table border="1">
     <tr>
      <th>Name</th>
      <th>EmailId</th>
      <th>Password</th>
      <th>Address</th>
      <th>ContactNo</th> 
      <th>Action</th>
     </tr>
     <%
       Iterator<Customer> itr = clist.iterator();
       while(itr.hasNext()){
       Customer c = itr.next();
     %>
     <tr>
      <td><%=c.getcName() %></td>
      <td><%=c.getcEmailId() %></td>
      <td><%=c.getcPassword() %></td>
      <td><%=c.getcAddress() %></td>
      <td><%=c.getcContactNo()%></td>
      <td>
       <a href="customer?action=delete&cemail=<%=c.getcEmailId()%>">delete</a>
      </td>
  	</tr>
  	<%}%>
   </table>
  </form>
<%@ include file="footer.jsp" %>
</body>
</html>