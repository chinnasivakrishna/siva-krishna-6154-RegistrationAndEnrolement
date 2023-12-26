package demo;

import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class register {
	String u_Email;
    String u_Name;
    String u_Password;
    int a_Id;
    
    Scanner sc = new Scanner(System.in);
	public void registers() throws IOException, URISyntaxException {
		
		// TODO Auto-generated method stub
		System.out.println("Enter Your Name : ");
		u_Name = sc.next();
		System.out.println("Enter Your Email : ");
		u_Email = sc.next();
		
		System.out.println("Enter Your Password : ");
		u_Password = sc.next();
		
		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection krish = null;
        try {
            krish = DriverManager.getConnection("jdbc:mysql://localhost:3305/RegistrationAndEnrolement", "root", "i love you amma");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        String query="select * from registration";
		PreparedStatement view;
		try {
			
			view = krish.prepareStatement(query);
			ResultSet rs = view.executeQuery();
			while (rs.next()) {
	            if(u_Email.equals(rs.getString("u_Email"))) {
	            	System.out.println("E-Mail not found");
	            	System.out.println("Please try with another e-mail");
	            	return;
	            }
			}
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        String query1 = "INSERT INTO registration(u_Name, u_Email, u_Password) VALUES (?, ?, ?)";

        try (PreparedStatement preparedStatement = krish.prepareStatement(query1)) {
            preparedStatement.setString(1, u_Name);
            preparedStatement.setString(2, u_Email);
            preparedStatement.setString(3, u_Password);

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        String query11="select * from registration";
		PreparedStatement view1;
		try {
			
			view1 = krish.prepareStatement(query11);
			ResultSet rs = view1.executeQuery();
			while (rs.next()) {
	            if(u_Email.equals(rs.getString("u_Email"))) {
	            	a_Id = rs.getInt("u_Id");
	            }
			}
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	            	
		
		int useropt = 1;
		
		while(useropt == 1) {
			System.out.println("*********************************");
			System.out.println("Your Registration is successful");
			System.out.println("*********************************");
			System.out.println("Enter 1 to Login");
			System.out.println("Enter 2 to Leave");
			int select = sc.nextInt();
			String insertProductQuery = "INSERT INTO accuracy (a_Id, a_Name, a_Email,python,php,dataStructures,dataScience,java) VALUES (?, ?, ?, '0', '0', '0', '0', '0')";
            try (PreparedStatement insertProductStatement = krish
                    .prepareStatement(insertProductQuery)) {
                insertProductStatement.setInt(1, a_Id);
                insertProductStatement.setString(2, u_Name);
                insertProductStatement.setString(3, u_Email);
                insertProductStatement.executeUpdate();
            }
            catch (SQLException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
            String python = "INSERT INTO python (uname,email,basic,intermediate,advance,expert,specialized,quiz) VALUES (?,?,?,?,?,?,?,?)";
            try (PreparedStatement python1 = krish
                    .prepareStatement(python)) {
            	python1.setString(1, u_Name);
            	python1.setString(2, u_Email);
            	python1.setBoolean(3, false);
            	python1.setBoolean(4, false);
            	python1.setBoolean(5, false);
            	python1.setBoolean(6, false);
            	python1.setBoolean(7, false);
            	python1.setBoolean(8, false);
            	python1.executeUpdate();
            }
            catch (SQLException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
            
            String php = "INSERT INTO php (uname,email,basic,intermediate,advance,expert,specialized,quiz) VALUES (?,?,?,?,?,?,?,?)";
            try (PreparedStatement php1 = krish
                    .prepareStatement(php)) {
            	php1.setString(1, u_Name);
            	php1.setString(2, u_Email);
            	php1.setBoolean(3, false);
            	php1.setBoolean(4, false);
            	php1.setBoolean(5, false);
            	php1.setBoolean(6, false);
            	php1.setBoolean(7, false);
            	php1.setBoolean(8, false);
            	php1.executeUpdate();
            }
            catch (SQLException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
			
            String dataStructures = "INSERT INTO dataStructures (uname,email,basic,intermediate,advance,expert,specialized,quiz) VALUES (?,?,?,?,?,?,?,?)";
            try (PreparedStatement dataStructures1 = krish
                    .prepareStatement(dataStructures)) {
            	dataStructures1.setString(1, u_Name);
            	dataStructures1.setString(2, u_Email);
            	dataStructures1.setBoolean(3, false);
            	dataStructures1.setBoolean(4, false);
            	dataStructures1.setBoolean(5, false);
            	dataStructures1.setBoolean(6, false);
            	dataStructures1.setBoolean(7, false);
            	dataStructures1.setBoolean(8, false);
            	dataStructures1.executeUpdate();
            }
            catch (SQLException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
            
            String dataScience = "INSERT INTO dataScience (uname,email,basic,intermediate,advance,expert,specialized,quiz) VALUES (?,?,?,?,?,?,?,?)";
            try (PreparedStatement dataScience1 = krish
                    .prepareStatement(dataScience)) {
            	dataScience1.setString(1, u_Name);
            	dataScience1.setString(2, u_Email);
            	dataScience1.setBoolean(3, false);
            	dataScience1.setBoolean(4, false);
            	dataScience1.setBoolean(5, false);
            	dataScience1.setBoolean(6, false);
            	dataScience1.setBoolean(7, false);
            	dataScience1.setBoolean(8, false);
            	dataScience1.executeUpdate();
            }
            catch (SQLException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
            
            String java = "INSERT INTO java (uname,email,basic,intermediate,advance,expert,specialized,quiz) VALUES (?,?,?,?,?,?,?,?)";
            try (PreparedStatement java1 = krish
                    .prepareStatement(java)) {
            	java1.setString(1, u_Name);
            	java1.setString(2, u_Email);
            	java1.setBoolean(3, false);
            	java1.setBoolean(4, false);
            	java1.setBoolean(5, false);
            	java1.setBoolean(6, false);
            	java1.setBoolean(7, false);
            	java1.setBoolean(8, false);
            	java1.executeUpdate();
            }
            catch (SQLException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
			
            
			if(select == 1) {
				login l = new login();
				l.logins();
				System.out.println("Thank You for visiting");
				useropt = 2;
			}
			else if(select == 2) {
				System.out.println("Thank You for visiting");
				useropt = 2;
			}
		}
		
	}

}
