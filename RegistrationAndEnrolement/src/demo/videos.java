package demo;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

public class videos {
	Scanner sc = new Scanner(System.in);
	public void video() throws IOException, URISyntaxException {
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
			String playlistUrl = "https://www.youtube.com/watch?v=OZIRAavoGng&list=PLjVLYmrlmjGcQfNj_SLlLV4Ytf39f8BF7";

            Desktop.getDesktop().browse(new URI(playlistUrl));
            System.out.println("Happy Learning");
		}
		if(choice == 2) {
			String playlistUrl = "https://www.youtube.com/watch?v=m52ljs78S24&list=PL0eyrZgxdwhwwQQZA79OzYwl5ewA7HQih";

            Desktop.getDesktop().browse(new URI(playlistUrl));
            System.out.println("Happy Learning");
		}
		if(choice == 3) {
			String playlistUrl = "https://www.youtube.com/watch?v=27PdRL89A9U&list=PLEiEAq2VkUUJMxIegQ1ge1tcGskjdiwGP";

            Desktop.getDesktop().browse(new URI(playlistUrl));
            System.out.println("Happy Learning");
		}
		if(choice == 4) {
			String playlistUrl = "https://www.youtube.com/watch?v=X3paOmcrTjQ&list=PLEiEAq2VkUUJF3yCKuD_gksEJfOv_D4wI";

            Desktop.getDesktop().browse(new URI(playlistUrl));
            System.out.println("Happy Learning");
		}
		if(choice == 5) {
			String playlistUrl = "https://www.youtube.com/watch?v=i6AZdFxTK9I&list=PLEiEAq2VkUUI5_Z4vOtWE6AMcSrYbth1t";

            Desktop.getDesktop().browse(new URI(playlistUrl));
            System.out.println("Happy Learning");
		}
	}

}
