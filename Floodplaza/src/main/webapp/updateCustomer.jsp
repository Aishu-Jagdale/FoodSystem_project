<%@page import="com.pojo.Customer"%>
<%@page import="com.dao.CustomerDaoImpl"%>
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
	CustomerDaoImpl cd = new CustomerDaoImpl();	
	String cemail = (String)session.getAttribute("cemail");
	Customer c = cd.searchCustomerById(cemail);
%>
<%@ include file="header.jsp" %>
	<form action="customer">
	  <table border="1">
        <caption><h1>Update Customer</h1></caption>	
          <tr>
			<td><label>Enter  EmailId:</label></td> 
			<td><input type="email" name="cemail" id="cemail" placeholder="Enter Email ID" value="<%=c.getcEmailId()%>" disabled="disabled"></td>
			<td><span id="cemailerror" style="color: red"></span></td>         
          </tr>
          <tr>
			<td><label>Enter Name:</label></td> 
			<td><input type="text" name="cname" id=cname" placeholder="Enter Name" value="<%=c.getcName()%>"></td>
			<td><span id="cnameerror" style="color: red"></span></td>         
          </tr>
          
          <tr>
			<td><label>Enter Password:</label></td> 
			<td><input type="password" name="pass" id="pass" placeholder="Enter Password" value="<%=c.getcPassword()%>" disabled="disabled"></td>
			<td><span id="cpasserror" style="color: red"></span></td>         
          </tr>
          
          <tr>
			<td><label>Enter Address:</label></td> 
			<td><input type="text" name="cadd" id="cadd" placeholder="Enter address" value="<%=c.getcAddress()%>"></td>
			<td><span id="fcaterror" style="color: red"></span></td>         
          </tr>
          
          <tr>
			<td><label>Enter Contact No:</label></td> 
			<td><input type="text" name="con" id="con" placeholder="Enter Contact No." value="<%=c.getcContactNo()%>"></td>
			<td><span id="cConerror" style="color: red"></span></td>         
          </tr>
	  </table>
	  <button type="submit" name="action" value="updateCustomer">Update</button>
	  <button type="reset">Clear</button>
	
	</form>
<%@ include file="footer.jsp" %>

</body>
</html>