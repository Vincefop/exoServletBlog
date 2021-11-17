package servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.User;

/**
 * Servlet implementation class UserInfo
 */
@WebServlet(urlPatterns = "/userInfo")
public class UserInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public UserInfo() {
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Je crée la session
		HttpSession session = (HttpSession) request.getSession();
		//je récupère le user sur la session
		User user = (User) session.getAttribute("USER");
		//si il est null je renvoie à la page d'accueil
		if(user==null) { 
			response.sendRedirect(this.getServletContext().getContextPath() + "/session");
			return;
		}
		//Je fais le choix de ranger chaque information (à afficher sur la page web) dans des variables
		//J'aurais pu envoyer directement le User et appeler les méthodes java dans le jsp
		//... a voir ce qui est le plus performant
		request.setAttribute("utilisateur", user.getUsername());
		request.setAttribute("nbreArticle", user.getNombreArticle());
		request.setAttribute("email", user.getEmail());
		request.setAttribute("role", user.getRole());
		//J'envoie ces variables sur la page web
		request.getRequestDispatcher("/WEB-INF/userInfo.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
