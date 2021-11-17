
<%@ include file='../fragments/header.jsp' %>
	<h1> un Article </h1>
	<h2>Titre : ${article.getTitre()} </h2>
	<h2>Auteur : ${article.getUtilisateur().getUsername()}</h2>
	<br>
	<h3>Contenu :  </h3>
	<p> ${article.getContenu()}</p>
	
	
	
	
	<br/><br/>
	
	<a href="<%= request.getContextPath() %>"/session">Retour</a>
	 
<%@ include file='../fragments/footer.jsp' %>