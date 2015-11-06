package lwt.lab;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lwt.lab.utils.ResponseUtils;

/**
 * Servlet implementation class Table
 */
@WebServlet("/table")
public class Table extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Table() {
	super();
	// TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	StringBuilder htmlBuilder = new StringBuilder();
	String[][] data = new String[10][5];
	for(int i=0;i<data.length;i++) {
	    for(int j=0;j<data[i].length;j++) {
		data[i][j] = i+"-"+j;
	    }
	}
	String[] headers = {"H1","H2","H3","H4","H5"};
	htmlBuilder.append(ResponseUtils.titleBodyStyleHTML("Table", ResponseUtils.appendTableWithHeader(data, headers), "./css/styles.css"));
	response.getWriter().append(htmlBuilder);
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
