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
import bo.khbo;

/**
 * Servlet implementation class ktdnController
 */
@WebServlet("/ktdnController")
public class ktdnController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ktdnController() {
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
	 		khbo khbo= new khbo();
	 		khachhangbean kh=khbo.ktdn(un, pass);
	 	if(kh!=null) {
            HttpSession session = request.getSession();//Tao doi tuong session
            session.setAttribute("kh", kh);
            rd= request.getRequestDispatcher("htController");
 	 	}
	 	else
	 		  rd= request.getRequestDispatcher("dangnhap.jsp?kt=1");	
	 	}else
	 		 rd= request.getRequestDispatcher("dangnhap.jsp");
	 		
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
 * import bo.khbo; import dao.taikhoan;
 * 
 *//**
	 * Servlet implementation class ktdnController
	 */
/*
 * @WebServlet("/ktdnController") public class ktdnController extends
 * HttpServlet { private static final long serialVersionUID = 1L;
 * 
 *//**
	 * @see HttpServlet#HttpServlet()
	 */
/*
 * public ktdnController() { super(); // TODO Auto-generated constructor stub }
 * 
 *//**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
/*
 * protected void doGet(HttpServletRequest request, HttpServletResponse
 * response) throws ServletException, IOException { taikhoan tk = new
 * taikhoan();
 * 
 * String un = request.getParameter("txtun"); String pass =
 * request.getParameter("txtpass"); RequestDispatcher rd;
 * 
 * if(un!=null&&pass!=null) { HttpSession session= request.getSession();
 * if(tk.getTaiKhoan(un, pass)==1) { session.setAttribute("dn", un); rd=
 * request.getRequestDispatcher("htsachController");
 * 
 * 
 * // String un= request.getParameter("txtun"); // String pass=
 * request.getParameter("txtpass"); // RequestDispatcher rd; // //
 * if(un!=null&&pass!=null) { // if(un.equals("abc") && pass.equals("123")) { //
 * HttpSession session= request.getSession(); // session.setAttribute("dn", un);
 * // // rd= request.getRequestDispatcher("htsachController");
 * 
 * } else rd= request.getRequestDispatcher("dangnhap.jsp?kt=1");
 * 
 * } else rd= request.getRequestDispatcher("dangnhap.jsp");
 * 
 * rd.forward(request, response); }
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