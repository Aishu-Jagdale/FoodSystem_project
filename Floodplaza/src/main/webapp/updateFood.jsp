<%@page import="com.pojo.Food"%>
<%@page import="com.dao.FoodDaoImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	FoodDaoImpl fd = new FoodDaoImpl();
	int fid = Integer.parseInt(request.getParameter("fid"));
	Food f = fd.searchFoodById(fid);
%>
	
	<%@ include file="header.jsp" %>
	<form action="food" method="post">
	  <table border="1">
        <caption><h1>Update Food</h1></caption>	
          <tr>
			<td><label>Enter Existing ID:</label></td> 
			<td><input type="text" name="fid" id="fid" placeholder="Enter ID" value="<%=f.getFoodId()%>"></td>
			<td><span id="fiderror" style="color: red"></span></td>         
          </tr>
          <tr>
			<td><label>Enter Name:</label></td> 
			<td><input type="text" name="fname" id="fname" placeholder="Enter Name" value="<%=f.getfName()%>"></td>
			<td><span id="fnameerror" style="color: red"></span></td>         
          </tr>
          
          <tr>
			<td><label>Enter Type:</label></td> 
			<td><input type="text" name="ftype" id="ftype" placeholder="Enter Type" value="<%=f.getfType()%>"></td>
			<td><span id="ftypeerror" style="color: red"></span></td>         
          </tr>
          
          <tr>
			<td><label>Enter Category:</label></td> 
			<td><input type="text" name="fcat" id="fcat" placeholder="Enter category" value="<%=f.getfCategory()%>"></td>
			<td><span id="fcaterror" style="color: red"></span></td>         
          </tr>
          
          <tr>
			<td><label>Enter Price:</label></td> 
			<td><input type="text" name="fprice" id="fprice" placeholder="Enter Price" value="<%=f.getfPrice()%>"></td>
			<td><span id="fpriceerror" style="color: red"></span></td>         
          </tr>
	  </table>
	  <button type="submit" name="action" value="updateFood">Update</button>
	  <button type="reset">Clear</button>
	
	</form>
<%@ include file="footer.jsp" %>

</body>
</html>