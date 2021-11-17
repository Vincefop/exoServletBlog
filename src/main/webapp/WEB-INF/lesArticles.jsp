<%@page import="model.Article"%>
<%@page import="java.util.List"%>
<%@ include file='../fragments/header.jsp' %>
	<h1> Les Articles </h1>
	<p>
	<%List<Article> lesArticles = (List<Article>) request.getAttribute("listArticles"); %>
	<%for(int i=0; i<lesArticles.size(); i++){ %>
	 - <a href='<%= request.getContextPath() %>/unArticle?id=
	<%=lesArticles.get(i).getArticleUID() %>
	'>
	<%=lesArticles.get(i).getTitre() %>
	</a>
	<br/>
	<%} %>
	</p>
	
	
	<br/><br/>
	
	<a href="<%= request.getContextPath() %>"/session">Retour</a>
	 
<%@ include file='../fragments/footer.jsp' %>