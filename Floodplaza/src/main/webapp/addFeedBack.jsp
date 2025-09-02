<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% String emailId = (String)session.getAttribute("uEmail"); %> 

<%@ include file="header.jsp" %>
	<form action="feedback" method="post">
	  <table border="1">
        <caption><h1>Add FeedBack</h1></caption>	

          <tr>
			<td><label>Enter EmailId:</label></td> 
			<td><input type="email" name="femail" id="femail"  value="<%=emailId%>" ></td>
			<td><span id="femailerror" style="color: red"></span></td>         
          </tr>
          
          <tr>
			<td><label>Enter Review</label></td> 
			<td><input type="text" name="freview" id="freview" placeholder="Enter Review"></td>
			<td><span id="freviewerror" style="color: red"></span></td>         
          </tr>
          
          <tr>
			<td><label>Enter Rank:</label></td> 
			<td><input type="number" name="frank" id="frank" min="1" max="5"></td>
			<td><span id="frankerror" style="color: red"></span></td>         
          </tr>
          <tr>
			<td><label>Enter Suggestion:</label></td> 
			<td><input type="text" name="fsugg" id="fsugg" placeholder="Enter Suggestion"></td>
			<td><span id="fsuggerror" style="color: red"></span></td>         
          </tr>
	  </table>
	  <button type="submit" name="action" value="addFeedBack">Add</button>
	  <button type="reset">Clear</button>
	
	</form>
<%@ include file="footer.jsp" %>

</body>
</html>