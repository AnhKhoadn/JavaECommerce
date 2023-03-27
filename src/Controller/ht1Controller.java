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
import bean.cdbean;
import bo.loaibo;
import bo.cdbo;

/**
 * Servlet implementation class ht1Controller
 */
@WebServlet("/ht1Controller")
public class ht1Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ht1Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		loaibo lbo = new loaibo();
		ArrayList<loaibean> dsloai = lbo.getloai();
		request.setAttribute("dsloai", dsloai);
		cdbo sbo = new cdbo();
		ArrayList<cdbean> dscd = sbo.getcd();
		String maloai = request.getParameter("ml");
		String key = request.getParameter("txttk");
		if (maloai != null)
			dscd = sbo.timcd(maloai);
		else if (key != null)
			dscd = sbo.Tim(key);
		request.setAttribute("dscd", dscd);
		RequestDispatcher rd = request.getRequestDispatcher("hienthi1.jsp");
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
