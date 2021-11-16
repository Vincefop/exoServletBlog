<%@ include file='../fragments/header.jsp' %>
	<h1> USER</h1>
	
	<h3> nom : ${utilisateur} </h3>
	<h3> nombreArticle : ${nbreArticle}</h3>
	<h3> email :  ${email}</h3>
	<h3> role :  ${role}</h3>
	
	<br/><br/>
	
	<a href="<%= request.getContextPath() %>"/session">Retour</a>
	 
<%@ include file='../fragments/footer.jsp' %>