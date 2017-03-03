package model;
import java.sql.Connection;
import java.sql.DriverManager;

public class dbConnTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectionDAO dao = new ElectionDAO();
		
		dao.makeConnection();
		System.out.println(dao.getAllCurrentElections());
		
		

		String url = "jdbc:mysql://localhost:3306/elections";
		String user = "root";
		String password = "DIAD2016";
		
		try {
			
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("Connection made");
			
			String q = "SELECT * from currentElections";
			
		} catch (Exception ex) {
			System.out.println("Sql Exception");
		}
		
		
	}

}
