package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.khachhangbean;
import dao.khachhangdao;

/**
 * Servlet implementation class khachhangController
 */
@WebServlet("/khachhangController")
public class khachhangController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private khachhangdao khdao= new khachhangdao();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public khachhangController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher dispatcher = request.getRequestDispatcher("dangky.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String hoten = request.getParameter("hoten");
		String diachi = request.getParameter("diachi");
		String sodt = request.getParameter("sodt");
		String email = request.getParameter("email");
		String tendn = request.getParameter("tendn");
		String pass = request.getParameter("pass");
		khachhangbean khbean= new khachhangbean();
		khbean.setHoten(hoten);
		khbean.setDiachi(diachi);
		khbean.setSodt(sodt);
		khbean.setEmail(email);
		khbean.setTendn(tendn);
		khbean.setPass(pass);
	    try {
			khachhangdao.dangkykhachhang(khbean);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    response.sendRedirect("dangkykhachhang.jsp");
		
	}

}
