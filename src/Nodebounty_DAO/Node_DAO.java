package Nodebounty_DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class Node_DAO {

	public static void main(String[] args) {
		Connection con = null;
		try {
			
			con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/nodebounty","root","");
			
			if (con!=null) {
				System.out.println("Conexão bem sucedida.");
			}
		} catch (Exception e) {
			System.out.println("Conexão mal-sucedida.");
		}
	}
	
}
