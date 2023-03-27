package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.giohangbean;
import bean.khachhangbean;
import bo.chitietbo;
import bo.giohangbo;
import bo.hoadonbo;
import dao.hoadondao;

/**
 * Servlet implementation class dathangController
 */
@WebServlet("/datmuaController")
public class datmuaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public datmuaController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    HttpSession session =request.getSession();
	    khachhangbean kh=(khachhangbean)session.getAttribute("kh");
	    if(kh==null)
	    	response.sendRedirect("ktdnController");
	    else {
	    	hoadonbo hdbo= new hoadonbo();
	    	chitietbo ctbo= new chitietbo();
	    	hdbo.Them(kh.getMakh());
	    	long maxhd=hdbo.maxhd();
	    	giohangbo gh=(giohangbo)session.getAttribute("gio");
	    	for(giohangbean g:gh.ds) {
	    		ctbo.Them(g.getMacd(), g.getSoluong(), maxhd);
	    	}
	    	session.removeAttribute("gio");
			 response.sendRedirect("lichsuController"); 
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