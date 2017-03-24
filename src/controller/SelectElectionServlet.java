package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Election;
import model.ElectionDAO;

/**
 * Servlet implementation class SelectElectionServlet
 */
@WebServlet("/SelectElectionServlet")
public class SelectElectionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectElectionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ElectionDAO dao = new ElectionDAO();
		request.getParameter("id");
		int Id = Integer.parseInt("id");
		ArrayList<Election> allElections = dao.getAllCurrentElections();
		Election e = allElections.get(Id);
		request.setAttribute("CurrentElection", e);
		System.out.println(e.getC1());
		getServletContext().getRequestDispatcher("/ballot.jsp").forward(request, response);
	}

}
