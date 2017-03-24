package model;

public class Election {

	//variables
	private int id;
	private String c1;
	private String c2;
	private String c3;
	private int totalVotes;
	private int c1Votes = 0;
	private int c2Votes = 0;
	private int c3Votes = 0;
	private String electionAlias;
	private String candidate;


	//constructor: default
	public Election(){
		
	}
	
	//constructor: with parameters
	public Election(int id, String election, String c1, String c2, String c3, int c1Votes, int c2Votes, 
			int c3Votes) { 
		// TODO Auto-generated constructor stub
		this.id = id;
		this.electionAlias = election;
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
		this.c1Votes = c1Votes;
		this.c2Votes = c2Votes;
		this.c3Votes = c3Votes;
	}
	//second constructor
	public Election(String election, String c1, String c2, String c3) { 
		// TODO Auto-generated constructor stub
		this.electionAlias = election;
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
	}

	//getters and setters
	public String getC1() {
		return c1;
	}


	public void setC1(String c1) {
		this.c1 = c1;
	}


	public String getC2() {
		return c2;
	}


	public void setC2(String c2) {
		this.c2 = c2;
	}


	public String getC3() {
		return c3;
	}


	public void setC3(String c3) {
		this.c3 = c3;
	}
	
	public String getElectionAlias() {
		return electionAlias;
	}


	public void setElectionAlias(String electionAlias) {
		this.electionAlias = electionAlias;
	}


	//methods to count ballots cast
	public void voteForC1() {
		// TODO Auto-generated method stub
		this.c1Votes++;
		this.totalVotes++;
	
	}

	public void voteForC2() {
		// TODO Auto-generated method stub
		this.c2Votes++;
		this.totalVotes++;

	}

	public void voteForC3() {
		// TODO Auto-generated method stub
		this.c3Votes++;
		this.totalVotes++;

	}
	
	//getters to return the results of the election
	public int getTotalVotes(){
		return totalVotes;
	}


	public int getC1Votes() {
		return c1Votes;
	}


	public int getC2Votes() {
		return c2Votes;
	}


	public int getC3Votes() {
		return c3Votes;
	}


}
