package demo;

import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.SQLException;
import java.util.Scanner;

public class display {
	Scanner sc = new Scanner(System.in);
	String email1;
	public String displayes(String email) {
		// TODO Auto-generated method stub
		email1 = email;
		return null;
	}
	public void displays() throws SQLException, IOException, URISyntaxException {
		// TODO Auto-generated method stub
		System.out.println("**************************");
		System.out.println("Courses Available");
		System.out.println("Enter 1 for Python");
		System.out.println("Enter 2 for PHP");
		System.out.println("Enter 3 for Data Structures");
		System.out.println("Enter 4 for Data Science");
		System.out.println("Enter 5 for JAVA");
		System.out.println("Enter 6 for see more information languages");
		System.out.println("Enter 7 for return to main page");
		int choice = sc.nextInt();
		
		if(choice == 1) {
			python p = new python();
			
			try {
				String email2 = email1;
				email2 = p.pythonspro(email2);
				p.pythons();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(choice == 2) {

			php h = new php();
			String email3 = email1;
			email3 = h.phppro(email3);
			h.phps();
		}
		else if(choice == 3) {
			dataStructure st = new dataStructure();
			String email4 = email1;
			email4 = st.structurepro(email4);
			st.structure();
		}
		else if(choice == 4) {
			dataScience ds = new dataScience();
			String email5 = email1;
			email5 = ds.sciencepro(email5);
			ds.science();
		}
		else if(choice == 5) {
			java j = new java();
			String email6 = email1;
			email6 = j.pythonspro(email6);
			j.javaprogram();
		}
		if(choice == 6) {
			information i = new information();
			i.informations();
		}
		if(choice == 7) {
			return;
		}
	}
	

}
