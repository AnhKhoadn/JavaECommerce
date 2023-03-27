package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.dangnhapadminbean;
import bean.khachhangbean;
import bo.dangnhapadminbo;
import bo.khbo;

/**
 * Servlet implementation class dangnhapadminController
 */
@WebServlet("/dangnhapadminController")
public class dangnhapadminController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public dangnhapadminController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String un=request.getParameter("txtun");
	 	String pass=request.getParameter("txtpass");
	 	RequestDispatcher rd;
	 	
	 	
	 	if(un!=null&&pass!=null) {
	 		dangnhapadminbo dnbo= new dangnhapadminbo();
	 		dangnhapadminbean dn=dnbo.ktdn(un, pass);
	 	if(dn!=null) {
            HttpSession session = request.getSession();//Tao doi tuong session
            session.setAttribute("admin", dn);
            rd= request.getRequestDispatcher("adminController");
 	 	}
	 	else
	 		  rd= request.getRequestDispatcher("dangnhapadmin.jsp?kt=1");	
	 	}else
	 		 rd= request.getRequestDispatcher("dangnhapadmin.jsp");
	 		
	 rd.forward(request, response);	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}



/*
 * package Controller;
 * 
 * import java.io.IOException;
 * 
 * import javax.servlet.RequestDispatcher; import
 * javax.servlet.ServletException; import javax.servlet.annotation.WebServlet;
 * import javax.servlet.http.HttpServlet; import
 * javax.servlet.http.HttpServletRequest; import
 * javax.servlet.http.HttpServletResponse; import
 * javax.servlet.http.HttpSession;
 * 
 * import bo.dangnhapadminbo; import dao.taiadoan;
 * 
 *//**
	 * Servlet implementation class dangnhapadminController
	 */
/*
 * @WebServlet("/dangnhapadminController") public class dangnhapadminController extends
 * HttpServlet { private static final long serialVersionUID = 1L;
 * 
 *//**
	 * @see HttpServlet#HttpServlet()
	 */
/*
 * public dangnhapadminController() { super(); // TODO Auto-generated constructor stub }
 * 
 *//**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
/*
 * protected void doGet(HttpServletRequest request, HttpServletResponse
 * response) throws ServletException, IOException { taiadoan tk = new
 * taiadoan();
 * 
 * String un = request.getParameter("txtun"); String pass =
 * request.getParameter("txtpass"); RequestDispatcher rd;
 * 
 * if(un!=null&&pass!=null) { HttpSession session= request.getSession();
 * if(tk.getTaiadoan(un, pass)==1) { session.setAttribute("dn", un); rd=
 * request.getRequestDispatcher("htController");
 * 
 * 
 * // String un= request.getParameter("txtun"); // String pass=
 * request.getParameter("txtpass"); // RequestDispatcher rd; // //
 * if(un!=null&&pass!=null) { // if(un.equals("abc") && pass.equals("123")) { //
 * HttpSession session= request.getSession(); // session.setAttribute("dn", un);
 * // // rd= request.getRequestDispatcher("htController");
 * 
 * } else rd= request.getRequestDispatcher("dangnhap.jsp?kt=1");
 * 
 * } else rd= request.getRequestDispatcher("dangnhap.jsp");
 * 
 * rd.forward(request, response); }
 * 
 * 
 *//**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 *//*
		 * protected void doPost(HttpServletRequest request, HttpServletResponse
		 * response) throws ServletException, IOException { // TODO Auto-generated
		 * method stub doGet(request, response); }
		 * 
		 * }
		 */