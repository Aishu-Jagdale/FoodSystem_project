<%@page import="com.pojo.Food"%>
<%@page import="com.dao.FoodDaoImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript">
 function total() {
	let price=document.getElementById("fprice").value;
	let quan=document.getElementById("fquan").value;
	document.getElementById("tprice").value=price*quan;
}
</script>
</head>
<body>
<%
	
	FoodDaoImpl fd = new FoodDaoImpl();
	int fid = Integer.parseInt(request.getParameter("foodid"));
	Food f =  fd.searchFoodById(fid);
%>
<%@ include file="header.jsp" %>
	<form action="cart" method="post">
	  <table border="1">
        <caption><h1>Add To Cart</h1></caption>	
          <tr>
			<td><label>Enter EmailID</label></td> 
			<td><input type="email" name="email" id="email" value="<%=uEmail%>"></td>
			<td><span id="emailerror" style="color: red"></span></td>         
          </tr>
          
          <tr>
			<td><label>Enter FoodId:</label></td> 
			<td><input type="text" name="fid" id="fid" value="<%=f.getFoodId()%>"></td>
			<td><span id="fiderror" style="color: red"></span></td>         
          </tr>
          
          <tr>
			<td><label>Enter Name:</label></td> 
			<td><input type="text" name="fname" id="fname" value="<%=f.getfName()%>"></td>
			<td><span id="fnameerror" style="color: red"></span></td>         
          </tr>
          
          <tr>
			<td><label>Price:</label></td> 
			<td><input type="text" name="fprice" id="fprice" value="<%=f.getfPrice() %>"></td>
			<td><span id="fpriceerror" style="color: red"></span></td>         
          </tr>
          
           <tr>
			<td><label>Enter Quantity:</label></td> 
			<td><input type="number" name="fquan" id="fquan" placeholder="Enter Quantity"></td>
			<td><span id="fquanerror" style="color: red"></span></td>         
           </tr>
          
          <tr>
			<td><label>Total Price:</label></td> 
			<td><input type="text" name="tprice" id="tprice" placeholder="Enter Price" onclick="total()"></td>
			<td><span id="tpriceerror" style="color: red"></span></td>         
          </tr>
	  </table>
	  <button type="submit" name="action" value="addToCart">Add</button>
	  <button type="reset">Clear</button>
	
	</form>
<%@ include file="footer.jsp" %>

</body>
</html>