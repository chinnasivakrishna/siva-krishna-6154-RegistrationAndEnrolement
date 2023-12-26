package demo;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.*;

public class main1 {
	public static void main(String[] args) throws IOException, URISyntaxException {
		Scanner sc = new Scanner(System.in);
		int useropt = 1;
		
		while(useropt == 1) {
			System.out.println("*********************************");
			System.out.println("Enter 1 to Register");
			System.out.println("Enter 2 to LogIn");
			System.out.println("Enter 3 to Leave");
			int select = sc.nextInt();
			
			if (select == 1) {
				register r = new register();
				r.registers();
			}
			else if(select == 2) {
				login l = new login();
				l.logins();
			}
			else if(select ==3) {
				System.out.println("Thank You");
				break;
			}
		}
		sc.close();

	}

}
