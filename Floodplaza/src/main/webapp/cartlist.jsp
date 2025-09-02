<%@page import="com.dao.CartDaoImpl"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.pojo.Cart"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cart List</title>
</head>
<body>
<%
	List<Cart> clist = (List)session.getAttribute("clist");
%>
<%@ include file="header.jsp" %>
  <form action="placeorder">
   <table border="1">
     <tr>
      <th>CartId</th>
      <th>EmailID</th>
      <th>FoodId</th>
      <th>FoodName</th>
      <th>Price</th>
      <th>Quantity</th>
      <th>TotalPrice</th>  
      <th colspan="3">Action</th>  
     </tr>
     <% 
      Iterator<Cart> itr = clist.iterator();
      while(itr.hasNext()){
       Cart c = itr.next();
     %>
     <tr>
      <td><%=c.getCartId()%></td>
      <td><%=c.getEmailId()%></td>
      <td><%=c.getFoodId() %></td>
      <td><%=c.getFoodName() %></td>
      <td><%=c.getPrice() %></td>
      <td><%=c.getQuantity() %></td>
      <td><%=c.getTotalPrice() %></td>
      <td>
       <a href="updateCart.jsp?price=<%=c.getPrice()%>&quan=<%=c.getQuantity()%>&cartId=<%=c.getCartId()%>" style="color: blue">add</a>
      </td>
      <td>
       <a href="cart?action=delete&cartId=<%=c.getCartId()%>" style="color: blue">Delete</a>
      </td>
     </tr>
     <%}%>
   </table>
   <button type="submit" name="action" value="placeorder">PlacrOrder</button>
  </form>
<%@ include file="footer.jsp" %>
</body>
</html>