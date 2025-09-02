<%@page import="java.util.Iterator"%>
<%@page import="com.pojo.FeedBack"%>
<%@page import="java.util.List"%>
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
	List <FeedBack> flist= (List)session.getAttribute("feedlist");
%>
<%@ include file="header.jsp" %>
  <form>
   <table border="1">
     <tr>
      <th>ID</th>
      <th>Review</th>
      <th>Rank</th>
      <th>Suggestion</th>
      <th>Action</th>
     </tr>
     <%
      Iterator<FeedBack> itr = flist.iterator();
      while(itr.hasNext()){
       FeedBack fd = itr.next();
     %>
     <tr>
      <td><%=fd.getEmailId() %></td>
      <td><%=fd.getReview() %></td>
      <td><%= fd.getRank() %></td>
      <td><%=fd.getSuggestion() %></td>
   	  <td>
       <a href="feedback?action=delete&emailid=<%=fd.getEmailId()%>" style="color: blue;">delete</a>
      </td>
     </tr>
     <%}%>
   </table>
  </form>
<%@ include file="footer.jsp" %>

</body>
</html>