<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Customer</title>
<script type="text/javascript">
function CustomerValidation(){
	
	cname =  document.getElementById('cname').value;
	if(cname==""){
		document.getElementById('cnameerror').innerHTML="Please Enter Name";
		return false;
	}
	cemail = document.getElementById('cemail').value;
	if(cemail==""){
		document.getElementById('cemailerror').innerHTML="please Enter EmailID";
		return false;
	}
	cpass = document.getElementById('cpass').value;
	if(cpass==""){
		document.getElementById("cpasserror").innerHTML="Please Enter Password";
		return false;
	}
	cadd = document.getElementById('cadd').value;
	if(cadd==""){
		document.getElementById("cadderror").innerHTML="Please Enter Address";
		return false;
	}
	ccon = document.getElementById('ccon').value;
	if(ccon==""){
		document.getElementById("cconerror").innerHTML="Please Enter Contact No.";
		return false;
	}
	return true;
}
</script>
</head>
<body>
<%@ include file="header.jsp" %>

	<form action="customer" method="post" style="margin: 2% 0% 2% 33%" onsubmit="return CustomerValidation()">
	  <table border="2" >
        <caption><h1 style="color: green;">Registartion</h1></caption>	
          <tr>
			<td><label>Enter Name:</label></td> 
			<td><input type="text" name="cname" id="cname" placeholder="Enter Name"></td>
			<td><span id="cnameerror" style="color: red"></span></td>         
          </tr>
          
          <tr>
			<td><label>Enter EmailId:</label></td> 
			<td><input type="email" name="cemail" id="cemail" placeholder="Enter Email ID"></td>
			<td><span id="cemailerror" style="color: red"></span></td>         
          </tr>
          
          <tr>
			<td><label>Enter Password:</label></td> 
			<td><input type="password" name="cpass" id="cpass" placeholder="Enter Password"></td>
			<td><span id="cpasserror" style="color: red"></span></td>         
          </tr>
          
          <tr>
			<td><label>Enter Address:</label></td> 
			<td><input type="text" name="cadd" id="cadd" placeholder="Enter Address"></td>
			<td><span id="cadderror" style="color: red"></span></td>         
          </tr>
          <tr>
			<td><label>Enter Contact No:</label></td> 
			<td><input type="text" name="ccon" id="ccon" placeholder="Enter Contact No."></td>
			<td><span id="cconerror" style="color: red"></span></td>         
          </tr>
	  </table>
	  <button type="submit" name="action" value="addCustomer">Register</button>
	  <button type="reset">Clear</button>
	
	</form>
	
<%@ include file="footer.jsp" %>


</body>
</html>