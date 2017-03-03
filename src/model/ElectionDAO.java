package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ElectionDAO {

	Connection con = null;

	public ElectionDAO(){
		makeConnection();
	}
	
	
	public void makeConnection(){
		String url = "jdbc:mysql://localhost:3306/elections";
		String user = "root";
		String password = "DIAD2016";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
			
		} catch (Exception ex) {
			System.out.println("Sql Exception - makeConnection()");
			ex.printStackTrace();
		}
	}


	public ArrayList<Election> getAllCurrentElections() {
		// TODO Auto-generated method stub
		ArrayList<Election> allElections = new ArrayList<Election>();
		makeConnection();
		String q = "SELECT * from CurrentElections";
		
		try{
		Statement st = (Statement) con.createStatement();
		ResultSet rs = st.executeQuery(q);
		
			while(rs.next()){

				int id = rs.getInt(1);
				String election = rs.getString(2);
				String c1 = rs.getString(3);
				String c2 = rs.getString(4);
				String c3 = rs.getString(5);
				int c1Votes = rs.getInt(6);
				int c2Votes = rs.getInt(7);
				int c3Votes = rs.getInt(8);
				System.out.println(election + " " + c1 + " " + c2 + " " + c3 + " " +  
						c1Votes + " " + c2Votes + " " + 	c3Votes);
					
				
				Election temp = new Election(id, election, c1, c2, c3, c1Votes, c2Votes, 
						c3Votes);
				allElections.add(temp);
			}
		}catch (SQLException ex){
			System.out.println("SQL error in getAllCurrentElections() method");
		}
		return allElections;
	}
	
	public Election getSelectedElection(String electionAlias) {
		// TODO Auto-generated method stub
		Election temp = null;
		makeConnection();
		String q = "SELECT * from CurrentElections WHERE Election = '" + electionAlias + "' LIMIT 1" ;
		System.out.println(q);
		try{
		Statement st = (Statement) con.createStatement();
		ResultSet rs = st.executeQuery(q);
		
		while(rs.next()){
				int id = rs.getInt(1);
				String election = rs.getString(2);
				String c1 = rs.getString(3);
				String c2 = rs.getString(4);
				String c3 = rs.getString(5);
				int c1Votes = rs.getInt(6);
				int c2Votes = rs.getInt(7);
				int c3Votes = rs.getInt(8);
				System.out.println(election + " " + c1 + " " + c2 + " " + c3 + " " +  
						c1Votes + " " + c2Votes + " " + 	c3Votes);
					
				
				temp = new Election(id, election, c1, c2, c3, c1Votes, c2Votes, 
						c3Votes);

		}
		}catch (SQLException ex){
			System.out.println("SQL error in getSelectedElection() method");
		}
		return temp;
	}
	

	public void addElection(String electionTitle, String name1, String name2, String name3) {
		// TODO Auto-generated method stub
		makeConnection();
		String q = "INSERT into CurrentElections(Election, C1, C2, C3) VALUES ('"+electionTitle+"', '"+name1+"', '"+name2+"', '"+name3+"')";
		System.out.println(q);
		try{
			Statement st = (Statement) con.createStatement();
			st.executeUpdate(q);
		}catch (SQLException ex){
			System.out.println("SQL error in addElection() method");
		}
	}
		
	public void addVotes(int c1CurrentVotes, int c2CurrentVotes, int c3CurrentVotes, String currentElection) {
		// TODO Auto-generated method stub
		makeConnection();
		String q = "UPDATE CurrentElections SET C1Votes="+c1CurrentVotes+", C2Votes="+c2CurrentVotes+", C3Votes="+c3CurrentVotes+" WHERE Election='"+currentElection+"'";
		System.out.println(q);
		try{
			Statement st = (Statement) con.createStatement();
			st.executeUpdate(q);
		}catch (SQLException ex){
			System.out.println("SQL error in addVotes() method");
		}
	}
	
	
	public void addC1Vote(int c1TempTotal) {
		// TODO Auto-generated method stub
		makeConnection();
		String q = "INSERT into CurrentElections(C1Votes)"
				+ " values ('"+c1TempTotal+"')";
		System.out.println(q);
		try{
			Statement st = (Statement) con.createStatement();
			ResultSet rs = st.executeQuery(q);
		}catch (SQLException ex){
			System.out.println("SQL error in addC1Vote() method");
		}
		
	}
	public void addC2Vote(int c2TempTotal) {
		// TODO Auto-generated method stub
		makeConnection();
		String q = "INSERT into CurrentElections(C1Votes)"
				+ " values ('"+c2TempTotal+"')";
		System.out.println(q);
		try{
			Statement st = (Statement) con.createStatement();
			ResultSet rs = st.executeQuery(q);
		}catch (SQLException ex){
			System.out.println("SQL error in addC2Vote() method");
		}
	}
	public void addC3Vote(int c3TempTotal) {
		// TODO Auto-generated method stub
		makeConnection();
		String q = "INSERT into CurrentElections(C3Votes)"
				+ " values ('"+c3TempTotal+"')";
		System.out.println(q);
		try{
			Statement st = (Statement) con.createStatement();
			ResultSet rs = st.executeQuery(q);
		}catch (SQLException ex){
			System.out.println("SQL error in addC3Vote() method");
		}
	}
	
}
