package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class checking {

	public String check(String email, String ch) {
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
		String query="select * from "+ch;
		PreparedStatement view;
		try {
			view = krishna.prepareStatement(query);
			ResultSet rs = view.executeQuery();
			while (rs.next()) {
				
				if(email.equals(rs.getString("email"))) {
					if(rs.getBoolean("basic")== false) {
						System.out.println("Basic" + " - "+"Not Completed");
					}
					else {
						System.out.println("Basic" + " - "+"Completed");
					}
					if(rs.getBoolean("intermediate")== false) {
						System.out.println("Intermediate" + " - "+"Not Completed");
					}
					else {
						System.out.println("Intermediate" + " - "+"Completed");
					}
					if(rs.getBoolean("advance")== false) {
						System.out.println("Advance" + " - "+"Not Completed");
					}
					else {
						System.out.println("Advance" + " - "+"Completed");
					}
					if(rs.getBoolean("expert")== false) {
						System.out.println("Expert" + " - "+"Not Completed");
					}
					else {
						System.out.println("Expert" + " - "+"Completed");
					}
					if(rs.getBoolean("specialized")== false) {
						System.out.println("Specialized" + " - "+"Not Completed");
					}
					else {
						System.out.println("Specialized" + " - "+"Completed");
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
