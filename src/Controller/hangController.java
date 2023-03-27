package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.loaibean;
import bean.hangbean;
import bo.loaibo;
import bo.hangbo;

/**
 * Servlet implementation class hangController
 */
@WebServlet("/hangController")
public class hangController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public hangController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		
		hangbo sbo = new hangbo();
		ArrayList<hangbean> ds = sbo.gethang();
		String maloai = request.getParameter("txttkk");
		String key = request.getParameter("txttk");
		if (maloai != null)
			ds = sbo.Timgia(maloai);
		else if (key != null)
			ds = sbo.Tim(key);
		request.setAttribute("ds", ds);
		RequestDispatcher rd = request.getRequestDispatcher("htsach11.jsp");
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
