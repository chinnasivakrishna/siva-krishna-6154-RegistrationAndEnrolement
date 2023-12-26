package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class accuracy {
	public String accuraicieses(String email) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection krishna = null;
		try {
			krishna = DriverManager.getConnection("jdbc:mysql://localhost:3305/RegistrationAndEnrolement","root","i love you amma");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String query="select * from accuracy";
		PreparedStatement view;
		try {
			view = krishna.prepareStatement(query);
			ResultSet rs = view.executeQuery();
			while (rs.next()) {
				
				if(email.equals(rs.getString("a_Email"))) {
					if(rs.getBoolean("python")== false) {
						System.out.println("Python" + " - "+"Not Completed");
					}
					else {
						System.out.println("Python" + " - "+"Completed");
					}
					if(rs.getBoolean("php")== false) {
						System.out.println("PHP" + " - "+"Not Completed");
					}
					else {
						System.out.println("PHP" + " - "+"Completed");
					}
					if(rs.getBoolean("dataStructures")== false) {
						System.out.println("Data Structures" + " - "+"Not Completed");
					}
					else {
						System.out.println("Data Structures" + " - "+"Completed");
					}
					if(rs.getBoolean("dataScience")== false) {
						System.out.println("Data Science" + " - "+"Not Completed");
					}
					else {
						System.out.println("Data Science" + " - "+"Completed");
					}
					if(rs.getBoolean("java")== false) {
						System.out.println("Java" + " - "+"Not Completed");
					}
					else {
						System.out.println("Java" + " - "+"Completed");
					}
				}
					
            	
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return email;
	}

	
	

}
