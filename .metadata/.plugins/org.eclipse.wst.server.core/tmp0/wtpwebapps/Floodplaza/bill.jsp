<%@page import="com.pojo.Order"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="header.jsp" %>
	<center>
	  <%Order o = (Order)request.getAttribute("order"); %>
	    <h4 style="color: green;">Congratulations....</h4>
	    <h6>your order placed Successfullyy!!!!!</h6>
	    <h2>Reciept</h2>
	    <h5>
	      OrderId:<%=o.getOrderId()%><br>
	      EmailId:<%=o.getEmailId()%><br>
	      Total:<%=o.getTotalPrice()%><br>
	      Date:<%=o.getDate() %>
	    </h5>
	    <h4 style="color: crimson">Thank You</h4>
	</center>

<%@ include file="footer.jsp" %>

</body>
</html>