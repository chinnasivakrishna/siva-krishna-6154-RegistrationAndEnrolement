package demo;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

public class moreQuizes {
	Scanner sc = new Scanner(System.in);
	public void quizes() throws IOException, URISyntaxException {
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
			String playlistUrl = "https://www.w3schools.com/quiztest/quiztest.asp?qtest=PYTHON";

            Desktop.getDesktop().browse(new URI(playlistUrl));
            System.out.println("Happy Learning");
		}
		if(choice == 2) {
			String playlistUrl = "https://www.w3schools.com/quiztest/quiztest.asp?qtest=PHP";

            Desktop.getDesktop().browse(new URI(playlistUrl));
            System.out.println("Happy Learning");
		}
		if(choice == 3) {
			String playlistUrl = "https://www.tutorialspoint.com/data_structures_algorithms/data_structures_algorithms_online_quiz.htm";

            Desktop.getDesktop().browse(new URI(playlistUrl));
            System.out.println("Happy Learning");
		}
		if(choice == 4) {
			String playlistUrl = "https://www.techtarget.com/searchbusinessanalytics/quiz/Quiz-Whats-your-IQ-on-data-science-techniques-and-processes";

            Desktop.getDesktop().browse(new URI(playlistUrl));
            System.out.println("Happy Learning");
		}
		if(choice == 5) {
			String playlistUrl = "https://www.w3schools.com/quiztest/quiztest.asp?qtest=JAVA";

            Desktop.getDesktop().browse(new URI(playlistUrl));
            System.out.println("Happy Learning");
		}
	}

}
