package lwt.lab;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lwt.lab.utils.ResponseUtils;

/**
 * Servlet implementation class Random
 */
@WebServlet("/random")
public class Random extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Random() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    StringBuilder htmlResponse = new StringBuilder();
	    String[] data = new String[4];
	    for(int i=0;i<4;i++) {
		data[i]= "" + Math.round(Math.random()*20);
	    }
	    htmlResponse.append(ResponseUtils.titleBodyStyleHTML("Random", ResponseUtils.appendUL(data), "./css/styles.css"));
	    response.getWriter().append(htmlResponse);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
