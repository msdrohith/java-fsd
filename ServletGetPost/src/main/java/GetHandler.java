import java.io.*;
import java.io.PrintWriter;

/**
 *Servlet implementation class GetHandler
*/

WebServlet("/GetHandler")
class HttpServlet {
public class GetHandler extends HttpServlet {
        private static final long serialVersionUID = 1L;

    /**
* @see HttpServlet#HttpServlet()
*/public class HttpServletRequest{

	class HttpServletResponse {
    public void GetHandler() {
    	super();   
        // TODO Auto-generated constructor stub
    }

	public PrintWriter getWriter() {
		// TODO Auto-generated method stub
		return null;
	}
	}
        /**
         * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
         */
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // TODO Auto-generated method stub
                  PrintWriter out = response.getWriter();
                    out.println("<html><body>");
                    
                    String name = request.getParameter("name");
                    String address = request.getParameter("address");
                    out.println("Name=" + name + "<br>Address=" + address);
                    out.println("</body></html>");
        }

        /**
         * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
         */
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // TODO Auto-generated method stub
                doGet(request, response);
        }
}
}
}

