package demo;

import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class login {
	String email;
    String password;
    String email1;
    
    Scanner sc = new Scanner(System.in);
	public void logins() throws IOException, URISyntaxException {
		// TODO Auto-generated method stub
		System.out.println("Enter Your Email : ");
		email = sc.next();
		System.out.println("Enter Your Password : ");
		password = sc.next();
		email1=email;
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
		String query="select * from registration";
		PreparedStatement view;
		try {
			int user=1;
			view = krishna.prepareStatement(query);
			ResultSet rs = view.executeQuery();
			while (rs.next()) {
	            if(email.equals(rs.getString("u_Email")) && password.equals(rs.getString("u_Password"))) {
	            	int useropt = 1;
	            	user=2;
	            	System.out.println("*********************************");
        			System.out.println("Your Logged into the website");
        			System.out.println("*********************************");
					while(useropt  == 1) {
						
						System.out.println("*********************************");
	        			System.out.println("Enter 1 to Display the courses");
	        			System.out.println("Enter 2 to Accurance");
	        			System.out.println("Enter 3 to Quizes");
	        			System.out.println("Enter 4 to Get Certificates");
	        			System.out.println("Enter 5 to see the courses videos in Detail");
	        			System.out.println("Enter 6 to solve more Quizes");
	        			System.out.println("Enter 7 to Log out");
	        			System.out.println("");
	        			int select = sc.nextInt();
	        			
	        			
	        			if(select == 1) {
	        				display d=new display();
	        				String email3 = email;
	        				email3 = d.displayes(email3);
	        				d.displays();
	        				
	        			}
	        			if(select == 2) {
	        				accuracy a=new accuracy();
	        				String email2 = email;
	        				email2 = a.accuraicieses(email2);
	        			}
	        			if(select == 3) {
	        				quiz q=new quiz();
	        				String email4 = email;
	        				email4 = q.quizes(email4);
	        				
	        			}
	        			if(select == 4) {
	        				certificate c = new certificate();
	        				String email5 = email;
	        				email5 = c.certificates(email5);
	        				
	        			}
	        			if(select ==5) {
	        				videos v = new videos();
	        				v.video();
	        			}
	        			if(select == 6) {
	        				moreQuizes mq = new moreQuizes();
	        				mq.quizes();
	        			}
	        			if(select == 7) {
	        				System.out.println("You are Logged Out");
	        				System.out.println("Thank You for visiting");
	        				useropt =2;
	        				break;
	        				
	        			}
	        			
	        		}
					break;
	            }
	            
	            
			}
			if(user == 1) {
	           	System.out.println("Entered User Name or Password are wrong");
	           	System.out.println("Please check once again");
	            
			}
			
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
