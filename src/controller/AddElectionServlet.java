package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Election;
import model.ElectionDAO;


/**
 * Servlet implementation class AddElectionServlet
 */
@WebServlet("/AddElectionServlet")
public class AddElectionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddElectionServlet() {
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
		String electionTitle = request.getParameter("electionTitle");
		String name1 = request.getParameter("name1");
		String name2 = request.getParameter("name2");
		String name3 = request.getParameter("name3");

		Election newElect = new Election(electionTitle, name1, name2, name3);
		ElectionDAO dao = new ElectionDAO();
		dao.addElection(electionTitle, name1, name2, name3);
		
		request.setAttribute("CurrentElection", newElect);
		getServletContext().getRequestDispatcher("/ballot.jsp").forward(request, response);
		doGet(request, response);
	}

}
