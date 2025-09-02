<%@page import="com.pojo.Cart"%>
<%@page import="java.util.List"%>
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
<%@ include file="header.jsp" %>
  <form action="cart" method="post">
    <table>
           <tr>
			<td><label>CartId:</label></td> 
			<td><input type="text" name="cid" id="cid" value="<%=request.getParameter("cartId") %>"></td>
			<td><span id="cideerror" style="color: red"></span></td>         
           </tr>
           <tr>
			<td><label>Price:</label></td> 
			<td><input type="text" name="fprice" id="fprice" value="<%=request.getParameter("price") %>"></td>
			<td><span id="fpriceerror" style="color: red"></span></td>         
           </tr>
           <tr>
			<td><label>Enter Quantity:</label></td> 
			<td><input type="number" name="fquan" id="fquan" value="<%=request.getParameter("quan") %>"></td>
			<td><span id="fquanerror" style="color: red"></span></td>         
           </tr>  
            <tr>
			<td><label>Total Price:</label></td> 
			<td><input type="text" name="tprice" id="tprice" placeholder="click-me" onclick="total()"></td>
			<td><span id="tpriceerror" style="color: red"></span></td>         
          </tr> 
    </table>
     <button type="submit" name="action" value="update">submit</button>
  </form>
<%@ include file="footer.jsp" %>
</body>
</html>