package demo;

import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class certificate {
	Scanner sc = new Scanner(System.in);
	public String certificates(String email5) throws IOException, URISyntaxException {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Connection krishna = null;
		try {
			krishna = DriverManager.getConnection("jdbc:mysql://localhost:3305/RegistrationAndEnrolement","root","i love you amma");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Enter 1 for Python Cerificate");
		System.out.println("Enter 2 for PHP Cerificate");
		System.out.println("Enter 3 for Data Structures Cerificate");
		System.out.println("Enter 4 for Data Science Cerificate");
		System.out.println("Enter 5 for Java Cerificate");
		int choice;
		choice = sc.nextInt();
		if(choice == 1) {
			int e=0;
			String query="select * from python";
    		PreparedStatement view1;
        	try {
    			view1 = krishna.prepareStatement(query);
    			ResultSet rs1 = view1.executeQuery();
    			while (rs1.next()) {
    				if(email5.equals(rs1.getString("email"))) {
    					
    				
	    				if((rs1.getBoolean("basic"))==(false)) {
	    					System.out.println("To Get certificate comlete Basic Python");
	    		        	e=1;
	    				}
	    				if((rs1.getBoolean("intermediate"))==(false)) {
	    					System.out.println("To Get certificate comlete Intermediate Python");
	    		        	e=1;
	    				}
	    				if((rs1.getBoolean("advance"))==(false)) {
	    					System.out.println("To Get certificate comlete Advance Python");
	    		        	e=1;
	    				}
	    				if((rs1.getBoolean("expert"))==(false)) {
	    					System.out.println("To Get certificate comlete Expert Python");
	    		        	e=1;
	    				}
	    				if((rs1.getBoolean("specialized"))==(false)) {
	    					System.out.println("To Get certificate comlete Specialized Python");
	    		        	e=1;
	    				}
	    				if((rs1.getBoolean("quiz"))==(false)) {
	    					System.out.println("To Get certificate comlete Quiz in Python");
	    		        	e=1;
	    				}
    				}
    			}
        	}
        	catch (SQLException e1) {
    			// TODO Auto-generated catch block
    			e1.printStackTrace();
    		}
			
			if (e==0) {
				System.out.println("Please confirm your email to send certificate to your mail");
	        	String email = sc.next();
	        	
	    		String query1="select * from registration";
	    		PreparedStatement view;
	        	try {
	    			int user=1;
	    			view = krishna.prepareStatement(query1);
	    			ResultSet rs = view.executeQuery();
	    			while (rs.next()) {
	    	            if(email.equals(rs.getString("U_Email"))) {
	    	            	user=2;
	    	            	
	    	            	
	    	        		String updateProductQuery = "UPDATE accuracy SET python = ? WHERE a_Email = ?";
                            try (PreparedStatement updateProductStatement = krishna.prepareStatement(updateProductQuery)) {
                                updateProductStatement.setBoolean(1, true);
                                updateProductStatement.setString(2, email);
                                updateProductStatement.executeUpdate();
                            }
	    	            }
	    			}
	    			if(user == 1) {
	    				System.out.println("Please enter your email with registerd email");
	    				display d=new display();
	    				
	    				d.displays();
	    				
	    			}
	    			else {
	    				System.out.println("Your certificate is send to your mail....");
	    				display d=new display();
        				
        				d.displays();
	    			}
	        	
	        	}
	        	catch (SQLException e1) {
	    			// TODO Auto-generated catch block
	    			e1.printStackTrace();
	    	
	        	}
			}
       
		}
		if(choice == 2) {
			int e=0;
	        String query="select * from php";
    		PreparedStatement view1;
        	try {
			view1 = krishna.prepareStatement(query);
			ResultSet rs1 = view1.executeQuery();
			while (rs1.next()) {
				if(email5.equals(rs1.getString("email"))) {
					
				
    				if((rs1.getBoolean("basic"))==(false)) {
    					System.out.println("To Get certificate comlete Basic PHP");
    		        	e=1;
    				}
    				if((rs1.getBoolean("intermediate"))==(false)) {
    					System.out.println("To Get certificate comlete Intermediate PHP");
    		        	e=1;
    				}
    				if((rs1.getBoolean("advance"))==(false)) {
    					System.out.println("To Get certificate comlete Advance PHP");
    		        	e=1;
    				}
    				if((rs1.getBoolean("expert"))==(false)) {
    					System.out.println("To Get certificate comlete Expert PHP");
    		        	e=1;
    				}
    				if((rs1.getBoolean("specialized"))==(false)) {
    					System.out.println("To Get certificate comlete Specialized PHP");
    		        	e=1;
    				}
    				if((rs1.getBoolean("quiz"))==(false)) {
    					System.out.println("To Get certificate comlete Quiz in PHP");
    		        	e=1;
    				}
				}
			}
    	}
    	catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	        if (e==0) {
	        	System.out.println("Please confirm your email to send certificate to your mail");
	        	String email = sc.next();
	        	String query1="select * from registration";
	    		PreparedStatement view;
	        	try {
	    			int user=1;
	    			view = krishna.prepareStatement(query1);
	    			ResultSet rs = view.executeQuery();
	    			while (rs.next()) {
	    	            if(email.equals(rs.getString("U_Email"))) {
	    	            	user=2;
	    	            	
	    	            	
	    	        		String updateProductQuery = "UPDATE accuracy SET php = ? WHERE a_Email = ?";
	                        try (PreparedStatement updateProductStatement = krishna.prepareStatement(updateProductQuery)) {
	                            updateProductStatement.setInt(1, 1);
	                            updateProductStatement.setString(2, email);
	                            updateProductStatement.executeUpdate();
	                        }
	    	            }
	    			}
	    			if(user == 1) {
	    				System.out.println("Please enter your email with registerd email");
	    				display d=new display();
	    				
	    				d.displays();
	    				
	    			}
	    			else {
	    				System.out.println("Your certificate is send to your mail....");
	    				display d=new display();
	    				
	    				d.displays();
	    			}
	        	
	        	}
	        	catch (SQLException e1) {
	    			// TODO Auto-generated catch block
	    			e1.printStackTrace();
	    		}
	        }
		}
		if(choice == 3) {
			int e=0;
	        String query="select * from dataStructures";
    		PreparedStatement view1;
        	try {
    			view1 = krishna.prepareStatement(query);
    			ResultSet rs1 = view1.executeQuery();
    			while (rs1.next()) {
    				if(email5.equals(rs1.getString("email"))) {
    					
    				
	    				if((rs1.getBoolean("basic"))==(false)) {
	    					System.out.println("To Get certificate comlete Basic Data Structures");
	    		        	e=1;
	    				}
	    				if((rs1.getBoolean("intermediate"))==(false)) {
	    					System.out.println("To Get certificate comlete Intermediate Data Structures");
	    		        	e=1;
	    				}
	    				if((rs1.getBoolean("advance"))==(false)) {
	    					System.out.println("To Get certificate comlete Advance Data Structures");
	    		        	e=1;
	    				}
	    				if((rs1.getBoolean("expert"))==(false)) {
	    					System.out.println("To Get certificate comlete Expert Data Structures");
	    		        	e=1;
	    				}
	    				if((rs1.getBoolean("specialized"))==(false)) {
	    					System.out.println("To Get certificate comlete Specialized Data Structures");
	    		        	e=1;
	    				}
	    				if((rs1.getBoolean("quiz"))==(false)) {
	    					System.out.println("To Get certificate comlete Quiz in Data Structures");
	    		        	e=1;
	    				}
    				}
    			}
        	}
        	catch (SQLException e1) {
    			// TODO Auto-generated catch block
    			e1.printStackTrace();
    		}
	        if (e==0) {
	        	System.out.println("Please confirm your email to send certificate to your mail");
	        	String email = sc.next();
	        	String query1="select * from registration";
	    		PreparedStatement view;
	        	try {
	    			int user=1;
	    			view = krishna.prepareStatement(query1);
	    			ResultSet rs = view.executeQuery();
	    			while (rs.next()) {
	    	            if(email.equals(rs.getString("U_Email"))) {
	    	            	user=2;
	    	            	
	    	            	
	    	        		String updateProductQuery = "UPDATE accuracy SET dataStructures = ? WHERE a_Email = ?";
                            try (PreparedStatement updateProductStatement = krishna.prepareStatement(updateProductQuery)) {
                                updateProductStatement.setInt(1, 1);
                                updateProductStatement.setString(2, email);
                                updateProductStatement.executeUpdate();
                            }
	    	            }
	    			}
	    			if(user == 1) {
	    				System.out.println("Please enter your email with registerd email");
	    				display d=new display();
	    				
	    				d.displays();
	    				
	    			}
	    			else {
	    				System.out.println("Your certificate is send to your mail....");
	    				display d=new display();
	    				
	    				d.displays();
	    			}
	        	
	        	}
	        	catch (SQLException e1) {
	    			// TODO Auto-generated catch block
	    			e1.printStackTrace();
	    		}
	        }

		}
		if(choice ==4) {
			int e=0;
	        String query="select * from dataScience";
    		PreparedStatement view1;
        	try {
    			view1 = krishna.prepareStatement(query);
    			ResultSet rs1 = view1.executeQuery();
    			while (rs1.next()) {
    				if(email5.equals(rs1.getString("email"))) {
    					
    				
	    				if((rs1.getBoolean("basic"))==(false)) {
	    					System.out.println("To Get certificate comlete Basic Data Science");
	    		        	e=1;
	    				}
	    				if((rs1.getBoolean("intermediate"))==(false)) {
	    					System.out.println("To Get certificate comlete Intermediate Data Science");
	    		        	e=1;
	    				}
	    				if((rs1.getBoolean("advance"))==(false)) {
	    					System.out.println("To Get certificate comlete Advance Data Science");
	    		        	e=1;
	    				}
	    				if((rs1.getBoolean("expert"))==(false)) {
	    					System.out.println("To Get certificate comlete Expert Data Science");
	    		        	e=1;
	    				}
	    				if((rs1.getBoolean("specialized"))==(false)) {
	    					System.out.println("To Get certificate comlete Specialized Data Science");
	    		        	e=1;
	    				}
	    				if((rs1.getBoolean("quiz"))==(false)) {
	    					System.out.println("To Get certificate comlete Quiz in Data Science");
	    		        	e=1;
	    				}
    				}
    			}
        	}
        	catch (SQLException e1) {
    			// TODO Auto-generated catch block
    			e1.printStackTrace();
    		}
	        if (e==0) {
	        	System.out.println("Please confirm your email to send certificate to your mail");
	        	String email = sc.next();
	        	String query1="select * from registration";
	    		PreparedStatement view;
	        	try {
	    			int user=1;
	    			view = krishna.prepareStatement(query1);
	    			ResultSet rs = view.executeQuery();
	    			while (rs.next()) {
	    	            if(email.equals(rs.getString("U_Email"))) {
	    	            	user=2;
	    	            	
	    	            	
	    	        		String updateProductQuery = "UPDATE accuracy SET dataScience = ? WHERE a_Email = ?";
                            try (PreparedStatement updateProductStatement = krishna.prepareStatement(updateProductQuery)) {
                                updateProductStatement.setInt(1, 1);
                                updateProductStatement.setString(2, email);
                                updateProductStatement.executeUpdate();
                            }
	    	            }
	    			}
	    			if(user == 1) {
	    				System.out.println("Please enter your email with registerd email");
	    				
	    			}
	    			else {
	    				System.out.println("Your certificate is send to your mail....");
	    			}
	        	
	        	}
	        	catch (SQLException e1) {
	    			// TODO Auto-generated catch block
	    			e1.printStackTrace();
	    		}
	        }
		
		}
		if(choice == 5) {
			int e=0;
	        String query="select * from java";
    		PreparedStatement view1;
        	try {
    			view1 = krishna.prepareStatement(query);
    			ResultSet rs1 = view1.executeQuery();
    			while (rs1.next()) {
    				if(email5.equals(rs1.getString("email"))) {
    					
    				
	    				if((rs1.getBoolean("basic"))==(false)) {
	    					System.out.println("To Get certificate comlete Basic Java");
	    		        	e=1;
	    				}
	    				if((rs1.getBoolean("intermediate"))==(false)) {
	    					System.out.println("To Get certificate comlete Intermediate Java");
	    		        	e=1;
	    				}
	    				if((rs1.getBoolean("advance"))==(false)) {
	    					System.out.println("To Get certificate comlete Advance Java");
	    		        	e=1;
	    				}
	    				if((rs1.getBoolean("expert"))==(false)) {
	    					System.out.println("To Get certificate comlete Expert Java");
	    		        	e=1;
	    				}
	    				if((rs1.getBoolean("specialized"))==(false)) {
	    					System.out.println("To Get certificate comlete Specialized Java");
	    		        	e=1;
	    				}
	    				if((rs1.getBoolean("quiz"))==(false)) {
	    					System.out.println("To Get certificate comlete Java Quiz ");
	    		        	e=1;
	    				}
    				}
    			}
        	}
        	catch (SQLException e1) {
    			// TODO Auto-generated catch block
    			e1.printStackTrace();
    		}
	        if (e==0) {
	        	System.out.println("Please confirm your email to send certificate to your mail");
	        	String email = sc.next();
	        	String query1="select * from registration";
	    		PreparedStatement view;
	        	try {
	    			int user=1;
	    			view = krishna.prepareStatement(query1);
	    			ResultSet rs = view.executeQuery();
	    			while (rs.next()) {
	    	            if(email.equals(rs.getString("u_Email"))) {
	    	            	user=2;
	    	            	
	    	            	
	    	        		String updateProductQuery = "UPDATE accuracy SET java = ? WHERE a_Email = ?";
                            try (PreparedStatement updateProductStatement = krishna.prepareStatement(updateProductQuery)) {
                                updateProductStatement.setInt(1, 1);
                                updateProductStatement.setString(2, email);
                                updateProductStatement.executeUpdate();
                            }
	    	            }
	    			}
	    			if(user == 1) {
	    				System.out.println("Please enter your email with registerd email");
	    				
	    			}
	    			else {
	    				System.out.println("Your certificate is send to your mail....");
	    			}
	        	
	        	}
	        	catch (SQLException e1) {
	    			// TODO Auto-generated catch block
	    			e1.printStackTrace();
	    		}
	        }
			
		
		}
		return null;
	}

	

}
