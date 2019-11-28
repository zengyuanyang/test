package page;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class jifangshenqing
 */
public class jifangshenqing extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        String start_week = request.getParameter("start_week");
        String end_week = request.getParameter("end_week");
        String day = request.getParameter("day");
        String jieshu = request.getParameter("jieshu");
        Cookie cookie1 = new Cookie("start_week", start_week);
        Cookie cookie2 = new Cookie("end_week", end_week);
        Cookie cookie3 = new Cookie("day", day);
        Cookie cookie4 = new Cookie("jieshu", jieshu);
        response.addCookie(cookie1);
        response.addCookie(cookie2);
        response.addCookie(cookie3);
        response.addCookie(cookie4);
        System.out.println(cookie1.getValue());
        System.out.println(cookie2.getValue());
        System.out.println(cookie3.getValue());
        System.out.println(cookie4.getValue());
        
        
	}
    public jifangshenqing() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request,response);
	}

}
