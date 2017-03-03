package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MasterVMController
 */
@WebServlet("/MasterVMController")
public class MasterVMController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MasterVMController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Inside MasterVMServlet.");
		String actionToPerform = request.getParameter("doThisToItem");
		if(actionToPerform.equals("add election")){
			System.out.println("Launch us to admin");
			getServletContext().getRequestDispatcher("/admin.jsp").forward(request, response);
		} else if(actionToPerform.equals("open selected election")){
			System.out.println("Launch us to ballot");
			getServletContext().getRequestDispatcher("/ballot.jsp").forward(request, response);
		}
		doGet(request, response);
	}

}
