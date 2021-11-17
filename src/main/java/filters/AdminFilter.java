package filters;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.User;

/**
 * Servlet Filter implementation class AdminFilter
 */
@WebFilter(filterName = "fAdmin", urlPatterns = "/session")
public class AdminFilter implements Filter {

    /**
     * Default constructor. 
     */
    public AdminFilter() {
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		//Je cast request et récupère la session
		HttpServletRequest req = (HttpServletRequest) request;
		HttpSession session = (HttpSession) req.getSession();
		
		//Je récupère le user actuel
		User user = (User) session.getAttribute("USER");
		
		//Je vérifie son role
		if(user.getRole().equals("admin")) {
			//dans ce cas je redirige vers la page Admin
			String contextPath = req.getContextPath();
			HttpServletResponse resp = (HttpServletResponse) response;
			resp.sendRedirect(contextPath + "/adminPage");
		}
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("AdminFilter init");
	}

}
