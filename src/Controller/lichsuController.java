package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.khachhangbean;
import bo.lichsubo;
import bo.loaibo;

/**
 * Servlet implementation class lichsuController
 */
@WebServlet("/lichsuController")
public class lichsuController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public lichsuController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		khachhangbean khh=(khachhangbean)session.getAttribute("kh");
		if(khh==null)//chua dang dang nhap
			response.sendRedirect("ktdnController");
		else {
			lichsubo lsbo=new lichsubo();
			request.setAttribute("dslichsu", lsbo.getlichsu(khh.getMakh()));
			loaibo lbo= new loaibo();
			request.setAttribute("dsloai", lbo.getloai());
			RequestDispatcher rd= request.getRequestDispatcher("lichsu.jsp");
			rd.forward(request, response);
		}
			
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}


