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
 * Servlet implementation class AddVotesServlet
 */
@WebServlet("/AddVotesServlet")
public class AddVotesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddVotesServlet() {
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
		String eName = request.getParameter("eName");
		ElectionDAO dao = new ElectionDAO();
		Election e = dao.getSelectedElection(eName);
		
		String actionToPerform = request.getParameter("doThisToItem");
		if(actionToPerform.equals("end election")){
			System.out.println("Launch us to results");
			
			request.setAttribute("CurrentElection", e);
			getServletContext().getRequestDispatcher("/results.jsp").forward(request, response);
			

	}
		if(actionToPerform.equals("cast ballot")){
			System.out.println("Cast ballot and return to ballot page");
			String voteFor = request.getParameter("VoteFor");
			
			
			if (voteFor != null) {
				if(voteFor.equals(e.getC1())){
					e.voteForC1();
				} else if(voteFor.equals(e.getC2())){
					e.voteForC2();
				} else if(voteFor.equals(e.getC3())){
					e.voteForC3();
				}
				dao.addVotes(e.getC1Votes(), e.getC2Votes(), e.getC3Votes(), eName);
			
			} 
			
			request.setAttribute("CurrentElection", e);
			getServletContext().getRequestDispatcher("/ballot.jsp").forward(request, response);
			
	
}
	}
}

	
