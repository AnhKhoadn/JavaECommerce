package Controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import bean.dangnhapadminbean;
import bean.loaibean;
import bean.cdbean;
import bo.loaibo;
import bo.cdbo;

/**
 * Servlet implementation class QLADMINController
 */
@WebServlet("/QuanLyAdminController")
@MultipartConfig(fileSizeThreshold=1024*1024*2, // 2MB
maxFileSize=1024*1024*10,      // 10MB
maxRequestSize=1024*1024*50)
public class QuanLyAdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public QuanLyAdminController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();
		dangnhapadminbean admin = (dangnhapadminbean) session.getAttribute("admin");

		if (admin == null) {
			response.sendRedirect("dangnhapadminController");
			return;
		}
		cdbo sbo = new cdbo();
		
		String macddexoa = request.getParameter("xoa");
		if(macddexoa != null) {
			String anh_ = request.getParameter("anh");
			sbo.xoa(macddexoa);
			//xóa ảnh
			String dirUrl = request.getServletContext().getRealPath("");
			String storePath = "C:\\\\Users\\\\21AK22\\\\eclipse-workspace\\\\test2\\\\WebContent\\\\image_cd";
			File part = new File(dirUrl + "/" + anh_);
			File part2 = new File(storePath + "/" + anh_);
			part.delete();
			part2.delete();
		}
		
		loaibo lbo = new loaibo();
		ArrayList<loaibean> dsloai = lbo.getloai();
		request.setAttribute("dsloai", dsloai);

		ArrayList<cdbean> dscd = new ArrayList<cdbean>();

		
;
		String maloai = request.getParameter("ml");
		String key = request.getParameter("txttk");
		if (maloai != null)
			dscd = sbo.timcd(maloai);
		else if (key != null)
			dscd = sbo.Tim(key);
		request.setAttribute("dscd", dscd);
		
		RequestDispatcher rd = request.getRequestDispatcher("QuanlyAdmin.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();

		if (session.getAttribute("admin") == null) {
			response.sendRedirect("AdminLogin");
			return;
		}

		String macd = request.getParameter("txtmacd");
		String tencd = request.getParameter("txttencd");
		String maloai = request.getParameter("txtmaloai");
		String tacgia = request.getParameter("txttacgia");
		String soluong = request.getParameter("txtsl");
		String gia = request.getParameter("txtgia");

		Part part = request.getPart("txtfile");

		String dirUrl = request.getServletContext().getRealPath("");
		String storePath = "C:\\Users\\21AK22\\eclipse-workspace\\test2\\WebContent\\image_cd";

		String filename = part.getSubmittedFileName();
		String randomGuid = UUID.randomUUID().toString().replace("-", "");
		String newfilename = randomGuid + filename;

		part.write(dirUrl + "/" + newfilename);
		part.write(storePath + "/" + newfilename);

		String image_Locations = "image_cd/" + newfilename;
		// Lưu sách
		
		cdbo sb = new cdbo();
		sb.luucd(new cdbean(macd, tencd, tacgia, Long.parseLong(gia),  Long.parseLong(soluong), image_Locations, maloai));
		doGet(request, response);
	}

}
