package help.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import help.dao.SelectQuery;
import help.models.User;
import help.statics.AllLinks;
import help.statics.UserTypes;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String userName= request.getParameter("mobileNumber");
		String pass= request.getParameter("password");
		User user = null;
		try{
			user = SelectQuery.getLoggedUser(userName, pass);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		if (user!=null) {
			request.getSession().setAttribute("user", user);
			System.out.println(((User)(request.getSession().getAttribute("user"))).getMobile_number());
			switch (user.getUser_type()) {
			case UserTypes.admin:
				/*response.sendRedirect(AllLinks.siteLink+"view/admin/"+UserTypes.admin+".jsp");		
				*/response.sendRedirect("profile.jsp");			
			break;
			
			case UserTypes.doctor:
				/*response.sendRedirect(AllLinks.siteLink+"view/doctor/"+UserTypes.doctor+".jsp");*/
				response.sendRedirect("profile.jsp");
			break;
			
			case UserTypes.donor:
				/*response.sendRedirect(AllLinks.siteLink+"view/donor/"+UserTypes.donor+".jsp");*/
				response.sendRedirect("profile.jsp");
			break;
			
			case UserTypes.patient:
				/*response.sendRedirect(AllLinks.siteLink+"view/patient/"+UserTypes.patient+".jsp");*/
				response.sendRedirect("profile.jsp");
			break;

			default:
				response.sendRedirect(AllLinks.siteLink+"login.jsp?status=false");
			break;
			}
			
		}else{
			response.sendRedirect(AllLinks.siteLink+"login.jsp?status=false");
		}
	}

}
