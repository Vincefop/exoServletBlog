package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Article;

/**
 * Servlet implementation class UnArticle
 */
@WebServlet("/unArticle")
public class UnArticle extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public UnArticle() {
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Je récupère la session
		HttpSession session = (HttpSession) request.getSession();
		
		//je récupère la liste des articles de cette session
		List<Article> listArticles = (ArrayList<Article>) session.getAttribute("ARTICLES");
		System.out.println(listArticles.toString());
		//Je récupère le paramètre de l'uid
		String articleUid = request.getParameter("id");
		
		
		//Je récupère l'article avec l'id approprié
		Article art = null;
		for (Article article : listArticles) {
			if(article.getArticleUID().equals(articleUid)) {
				art = article;
				break;
			}
		}
		//S'il n'est pas null je l'envoie sur le request
		if(art!=null) {
			request.setAttribute("article", art);
		}
		request.getRequestDispatcher("/WEB-INF/unArticle.jsp").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
