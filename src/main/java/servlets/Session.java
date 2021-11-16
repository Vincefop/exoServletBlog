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
 * Servlet implementation class Session
 */
@WebServlet("/session")
public class Session extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Session() {
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Je crée une session 
		HttpSession session = (HttpSession) request.getSession();
		
		//je récupère les informations de ce user sur la bdd
		User user = new User("YIIA234", "Vince", 3, "vince@contact.fr", "admin");
		
		//Je mets le user dans la session
		session.setAttribute("USER", user);
		
		
		//Je récupère l'attribut username
		request.setAttribute("nom", user.getUsername());
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
