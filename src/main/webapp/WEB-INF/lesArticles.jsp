<%@page import="model.Article"%>
<%@page import="java.util.List"%>
<%@ include file='../fragments/header.jsp' %>
	<h1> Les Articles </h1>
	
	<%List<Article> lesArticles = (List) request.getAttribute("listArticles"); %>
	<%for(int i=0; i<lesArticles.size(); i++){ %>
	<a href='/unArticle?id=
	<%=lesArticles.get(i).getArticleUID() %>
	'>
	<%=lesArticles.get(i).getTitre() %>
	</a>
	<br/>
	<%} %>
	
	
	
	<br/><br/>
	
	<a href="<%= request.getContextPath() %>"/session">Retour</a>
	 
<%@ include file='../fragments/footer.jsp' %>