package demo;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

public class information {
	Scanner sc = new Scanner(System.in);
	public void informations() throws IOException, URISyntaxException {
		// TODO Auto-generated method stub
		System.out.println("**************************");
		System.out.println("Courses Available");
		System.out.println("Enter 1 for Python");
		System.out.println("Enter 2 for PHP");
		System.out.println("Enter 3 for Data Structures");
		System.out.println("Enter 4 for Data Science");
		System.out.println("Enter 5 for JAVA");
		int choice;
		choice = sc.nextInt();
		if(choice == 1) {
			String playlistUrl = "https://www.w3schools.com/python/";

            Desktop.getDesktop().browse(new URI(playlistUrl));
            System.out.println("Happy Learning");
		}
		if(choice == 2) {
			String playlistUrl = "https://www.w3schools.com/php/default.asp";

            Desktop.getDesktop().browse(new URI(playlistUrl));
            System.out.println("Happy Learning");
		}
		if(choice == 3) {
			String playlistUrl = "https://www.javatpoint.com/data-structure-tutorial";

            Desktop.getDesktop().browse(new URI(playlistUrl));
            System.out.println("Happy Learning");
		}
		if(choice == 4) {
			String playlistUrl = "https://www.w3schools.com/datascience/";

            Desktop.getDesktop().browse(new URI(playlistUrl));
            System.out.println("Happy Learning");
		}
		if(choice == 5) {
			String playlistUrl = "https://www.w3schools.com/java/default.asp";

            Desktop.getDesktop().browse(new URI(playlistUrl));
            System.out.println("Happy Learning");
		}
	}

}
