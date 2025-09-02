<%@page import="java.util.Iterator"%>
<%@page import="com.pojo.Food"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Food Menu</title>
</head>
<body> 
<% 
	List<Food> flist= (List)session.getAttribute("flist");
%>
<%@ include file="header.jsp" %>
  <form style="margin: 2% 0% 2% 33%">
  <caption><h1 style="color: blue;">Food List</h1></caption>
   <table border="2" >
     <tr>
      <th>ID</th>
      <th>Name</th>
      <th>Type</th>
      <th>Category</th>
      <th>Price</th>
      <% if(uEmail==null && aEmail!=null){ %>
      <th colspan="2">Action</th>
      <%}%>  
      <% if(uEmail!=null && aEmail==null){ %>
      <th colspan="1">Action</th>
      <%}%> 
     </tr>
     <%
      Iterator<Food> itr = flist.iterator();
      while(itr.hasNext()){
       Food f = itr.next();
     %>
     <tr>
      <td><%=f.getFoodId() %></td>
      <td><%=f.getfName() %></td>
      <td><%= f.getfType() %></td>
      <td><%=f.getfCategory() %></td>
      <td><%=f.getfPrice()%></td>
     <% if(uEmail==null && aEmail!=null){ %>
      <td>
       <a href="updateFood.jsp?fid=<%=f.getFoodId()%>" style="color: blue;">update</a>
       <a href="food?action=delete&fid=<%=f.getFoodId()%>" style="color: blue;">delete</a>
      </td>
     <%}%>
     <% if(uEmail!=null && aEmail==null){ %>
      <td>
       <a href="addToCart.jsp?foodid=<%=f.getFoodId()%>" style="color: blue;">add</a>
      </td>
     <%}%>
     </tr>
     <%}%>
   </table>
  </form>
<%@ include file="footer.jsp" %>

</body>
</html>