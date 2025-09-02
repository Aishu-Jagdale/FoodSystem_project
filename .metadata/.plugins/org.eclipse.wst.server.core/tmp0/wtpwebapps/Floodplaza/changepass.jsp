<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file= "header.jsp" %>
 <form action="login" method="post">	
  <table border="1">	
	<caption><h1>Change Password</h1></caption>
	   <tr>
	  	<td><label>Select Type:</label></td>
	  	<td>
	  	  <select name="type" id="type">
	  	    <% if(uEmail==null && aEmail!=null){ %>
	  	    <option value="admin">Admin</option>
	  	    <%}%>
	  	    <% if(uEmail!=null && aEmail==null){ %>
	  	    <option value="user">User</option>
	  	    <%}%>
	  	  </select>
	  	</td>
	  	<td><span id="selecterror" style="color: red"></span></td>
	  </tr>
	  <% if(uEmail==null && aEmail!=null){ %>
	    <tr>
		  	<td><label>Enter EmailId:</label></td>
			<td><input type="email" name="email" id="email" value="<%=aEmail %>"></td>
			<td><span id="emailerror" style="color: red"></span></td>  
	    </tr>
	  <%} %>
	  
	  <% if(uEmail!=null && aEmail==null){ %>
	  	 <tr>
		  	<td><label>Enter EmailId:</label></td>
			<td><input type="text" name="email" id="email" value="<%=uEmail %>"></td>
			<td><span id="emailerror" style="color: red"></span></td>  
	    </tr>
	  <%} %>
	 
	  <tr>
	  	<td><label>Enter Old Password:</label></td>
		<td><input type="password" name="opass" id="opass" placeholder="Enter Old Password"></td>
		<td><span id="opasserror" style="color: red"></span></td>  
	  </tr>
	  
	  <tr>
	  	<td><label>Enter New Password</label></td>
		<td><input type="password" name="npass" id="npass" placeholder="Enter New Password"></td>
		<td><span id="npasserror" style="color: red"></span></td>  
	  </tr>
	  
	  <tr>
	  	<td><label>Enter Confirm Password:</label></td>
		<td><input type="password" name="cpass" id="cpass" placeholder="Enter Confirm Password"></td>
		<td><span id="cpasserror" style="color: red"></span></td>  
	  </tr>
	  </table>
	  <button type="submit" name="action" value="changepass">ChangePass</button>
	  <button type="reset">Clear</button>
	  
</form>   
<%@ include file="footer.jsp" %>

</body>
</html>