<%@ include file='../fragments/header.jsp' %>
	<h1> Bienvenue 
		${nom}
		<!--<jsp:useBean id="USER" class="model.User"/>
		<jsp:getProperty name="USER" property="username"/>-->
	
	</h1>
	
	<a href='<%= request.getContextPath() %>/userInfo'> - Mes Infos </a>
	<br/> <br/>
	<a href='<%= request.getContextPath() %>/lesArticles'> - Voir les articles </a>
	
	 
<%@ include file='../fragments/footer.jsp' %>