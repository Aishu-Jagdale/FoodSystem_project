<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Food</title>
</head>
<body>
<%@ include file="header.jsp" %>
	<form action="food" method="post">
	  <table border="1">
        <caption><h1>Add Food</h1></caption>	
          <tr>
			<td><label>Enter Name:</label></td> 
			<td><input type="text" name="fname" id="fname" placeholder="Enter Name"></td>
			<td><span id="fnameerror" style="color: red"></span></td>         
          </tr>
          
          <tr>
			<td><label>Enter Type:</label></td> 
			<td><input type="text" name="ftype" id="ftype" placeholder="Enter Type"></td>
			<td><span id="ftypeerror" style="color: red"></span></td>         
          </tr>
          
          <tr>
			<td><label>Enter Category:</label></td> 
			<td><input type="text" name="fcat" id="fcat" placeholder="Enter category"></td>
			<td><span id="fcaterror" style="color: red"></span></td>         
          </tr>
          
          <tr>
			<td><label>Enter Price:</label></td> 
			<td><input type="text" name="fprice" id="fprice" placeholder="Enter Price"></td>
			<td><span id="fpriceerror" style="color: red"></span></td>         
          </tr>
          
	  </table>
	  <button type="submit" name="action" value="addFood">Add</button>
	  <button type="reset">Clear</button>
	
	</form>
<%@ include file="footer.jsp" %>

</body>
</html>