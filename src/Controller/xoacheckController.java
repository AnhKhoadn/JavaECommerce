package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bo.giohangbo;

/**
 * Servlet implementation class xoacheckController
 */
@WebServlet("/xoacheckController")
public class xoacheckController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public xoacheckController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String butcheck = request.getParameter("butcheck");
		HttpSession session = request.getSession();

		giohangbo gh = (giohangbo) session.getAttribute("gio");

		if (butcheck != null) {
			// lấy danh sách mã hóa đơn từ checkbox
			String[] maList = request.getParameterValues("check");
			if (maList != null)
				// duyệt xóa theo mã sách
				for (String ms : maList)
					gh.Xoa1(ms);

			// nạp lại vào session
			session.setAttribute("gio", gh);
		}
		if (gh == null || gh.ds.size() == 0)
			response.sendRedirect("htController");
		else
			response.sendRedirect("htgioController");
	}



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
