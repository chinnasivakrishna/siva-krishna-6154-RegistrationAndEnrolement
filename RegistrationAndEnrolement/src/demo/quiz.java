package demo;

import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class quiz {
	
	Scanner sc = new Scanner(System.in);
	public String quizes(String email4) throws SQLException, IOException, URISyntaxException {
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
		// TODO Auto-generated method stub
		System.out.println("Enter 1 for attempt Python quiz");
		System.out.println("Enter 2 for attempt PHP quiz");
		System.out.println("Enter 3 for attempt Data Structures quiz");
		System.out.println("Enter 4 for attempt Data Science quiz");
		System.out.println("Enter 5 for attempt Java quiz");
		
		int option;
		option  = sc.nextInt();
		if(option == 1) {
			int e=0;
			String query="select * from python";
    		PreparedStatement view1;
        	try {
    			view1 = krishna.prepareStatement(query);
    			ResultSet rs1 = view1.executeQuery();
    			while (rs1.next()) {
    				if(email4.equals(rs1.getString("email"))) {
    					
    				
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
    				}
    			}
        	}
        	catch (SQLException e1) {
    			// TODO Auto-generated catch block
    			e1.printStackTrace();
    		}
			
			if (e==0) {
				int count = 0;
				// Question 1
		        System.out.println("1. What is the purpose of the 'map' function in Python?");
		        System.out.println("a. To apply a function to each item in an iterable\nb. To filter elements from an iterable\nc. To create a new iterable\n d. To sort an iterable");
		        char options1 = sc.next().charAt(0);
		        if (options1 == 'a') {
		            System.out.println("Congratulations, Correct Answer");
		            count++;
		        } else {
		            System.out.println("Oops, Wrong Answer");
		        }

		        // Question 2
		        System.out.println("2. In Python, what is a lambda function?");
		        System.out.println("a. A function with no parameters\nb. An anonymous function\n c. A built-in function\nd. A function with a variable number of arguments");
		        char options2 = sc.next().charAt(0);
		        if (options2 == 'b') {
		            System.out.println("Congratulations, Correct Answer");
		            count++;
		        } else {
		            System.out.println("Oops, Wrong Answer");
		        }

		        // Question 3
		        System.out.println("3. How can you create a virtual environment in Python?");
		        System.out.println("a. python create venv myenv\nb. py -m venv myenv\nc. virtualenv myenv\nd. env.create('myenv')");
		        char options3 = sc.next().charAt(0);
		        if (options3 == 'b') {
		            System.out.println("Congratulations, Correct Answer");
		            count++;
		        } else {
		            System.out.println("Oops, Wrong Answer");
		        }

		        // Question 4
		        System.out.println("4. What is the purpose of the 'self' parameter in Python class methods?");
		        System.out.println("a. It refers to the instance of the class\nb. It is a keyword for method overloading\nc. It represents the superclass\nd. It is used for exception handling");
		        char options4 = sc.next().charAt(0);
		        if (options4 == 'a') {
		            System.out.println("Congratulations, Correct Answer");
		            count++;
		        } else {
		            System.out.println("Oops, Wrong Answer");
		        }

		        // Question 5
		        System.out.println("5. How do you handle errors in Python?");
		        System.out.println("a. Using the 'exception' keyword\nb. By wrapping code in try-except blocks\nc. Using the 'error' keyword\nd. By using assert statements");
		        char options5 = sc.next().charAt(0);
		        if (options5 == 'b') {
		            System.out.println("Congratulations, Correct Answer");
		            count++;
		        } else {
		            System.out.println("Oops, Wrong Answer");
		        }

		        // Question 6
		        System.out.println("6. What is the purpose of the 'yield' keyword in Python?");
		        System.out.println("a. To terminate a function\nb. To create a generator\n c. To define a decorator\nd. To implement multiple inheritance");
		        char options6 = sc.next().charAt(0);
		        if (options6 == 'b') {
		            System.out.println("Congratulations, Correct Answer");
		            count++;
		        } else {
		            System.out.println("Oops, Wrong Answer");
		        }

		        // Question 7
		        System.out.println("7. How do you perform unit testing in Python?");
		        System.out.println("a. Using the 'test' module\nb. By writing test cases in a separate file\nc. Using the 'unittest' framework\nd. All of the above");
		        char options7 = sc.next().charAt(0);
		        if (options7 == 'd') {
		            System.out.println("Congratulations, Correct Answer");
		            count++;
		        } else {
		            System.out.println("Oops, Wrong Answer");
		        }

		        // Question 8
		        System.out.println("8. What is the purpose of the '__init__' method in a Python class?");
		        System.out.println("a. To initialize class variables\nb. To define the class constructor\nc. To create a new instance of the class\nd. To destroy the class");
		        char options8 = sc.next().charAt(0);
		        if (options8 == 'b') {
		            System.out.println("Congratulations, Correct Answer");
		            count++;
		        } else {
		            System.out.println("Oops, Wrong Answer");
		        }

		        // Question 9
		        System.out.println("9. How can you connect to a database using Python?");
		        System.out.println("a. Using the 'dbconnect' library\nb. By writing raw SQL queries\nc. Using the 'sqlite3' module\nd. Only with Django");
		        char options9 = sc.next().charAt(0);
		        if (options9 == 'c') {
		            System.out.println("Congratulations, Correct Answer");
		            count++;
		        } else {
		            System.out.println("Oops, Wrong Answer");
		        }

		        // Question 10
		        System.out.println("10. What is the purpose of the 'if __name__ == '__main__':' statement?");
		        System.out.println("a. It is a syntax error\nb. To check if the code is being run as the main program\nc. To define a conditional statement\nd. To include external modules");
		        char options10 = sc.next().charAt(0);
		        if (options10 == 'b') {
		            System.out.println("Congratulations, Correct Answer");
		            count++;
		        } else {
		            System.out.println("Oops, Wrong Answer");
		        }

		        // Display the final result
		        System.out.println("You scored " + count + "/10 in the Python quiz.");
		       if(count>7) {
		        	System.out.println("Well Done");
		        	String updateProductQuery = "UPDATE python SET quiz = ? WHERE email = ?";
                    try (PreparedStatement updateProductStatement = krishna.prepareStatement(updateProductQuery)) {
                        updateProductStatement.setBoolean(1, true);
                        updateProductStatement.setString(2, email4);
                        updateProductStatement.executeUpdate();
                    }
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
			    	            	
			    	            	
			    	        		String updateProductQuery1 = "UPDATE accuracy SET python = ? WHERE a_Email = ?";
		                            try (PreparedStatement updateProductStatement = krishna.prepareStatement(updateProductQuery1)) {
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
		        else {
		        	System.out.println("You tried well, But you want train much more");
		        	System.out.println("For getting certificate, You want to more than 7 marks");
		        	System.out.println("Better luck next time");
		        	display d=new display();
    				
    				d.displays();
		        }
		
			}
		}
		if(option ==2) {
			int e=0;
	        String query="select * from php";
    		PreparedStatement view1;
        	try {
    			view1 = krishna.prepareStatement(query);
    			ResultSet rs1 = view1.executeQuery();
    			while (rs1.next()) {
    				if(email4.equals(rs1.getString("email"))) {
    					
    				
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
    				}
    			}
        	}
        	catch (SQLException e1) {
    			// TODO Auto-generated catch block
    			e1.printStackTrace();
    		}
        	int count = 0;
	        if (e==0) {
	        	System.out.println("Welcome to php quiz");
	        	

	            // Question 1
	            System.out.println("1. What does PHP stand for?");
	            System.out.println("a. Personal Home Page\nb. Preprocessed Hypertext Processor\nc. Private Hypertext Processor\nd. Hypertext Preprocessor");
	            char options1 = sc.next().charAt(0);
	            if (options1 == 'd') {
	                System.out.println("Congratulations, Correct Answer");
	                count++;
	            } else {
	                System.out.println("Oops, Wrong Answer");
	            }

	            // Question 2
	            System.out.println("2. How do you declare a constant in PHP?");
	            System.out.println("a. const MY_CONSTANT = 10;\nb. define('MY_CONSTANT', 10);\nc. $MY_CONSTANT = 10;\nd. constant('MY_CONSTANT', 10);");
	            char options2 = sc.next().charAt(0);
	            if (options2 == 'b') {
	                System.out.println("Congratulations, Correct Answer");
	                count++;
	            } else {
	                System.out.println("Oops, Wrong Answer");
	            }

	            // Question 3
	            System.out.println("3. What is the purpose of the 'use' statement in PHP?");
	            System.out.println("a. To import classes from external namespaces\nb. To include external PHP files\nc. To declare a variable\n d. To define a function");
	            char options3 = sc.next().charAt(0);
	            if (options3 == 'a') {
	                System.out.println("Congratulations, Correct Answer");
	                count++;
	            } else {
	                System.out.println("Oops, Wrong Answer");
	            }

	            // Question 4
	            System.out.println("4. How can you prevent SQL injection in PHP?");
	            System.out.println("a. By using addslashes()\nb. By using mysqli_real_escape_string()\nc. By using prepared statements\n d. All of the above");
	            char options4 = sc.next().charAt(0);
	            if (options4 == 'c') {
	                System.out.println("Congratulations, Correct Answer");
	                count++;
	            } else {
	                System.out.println("Oops, Wrong Answer");
	            }

	            // Question 5
	            System.out.println("5. What is the difference between 'echo' and 'print' in PHP?");
	            System.out.println("a. They are interchangeable\nb. 'print' can be used in expressions\nc. 'echo' can take multiple parameters\nd. 'print' returns a value");
	            char options5 = sc.next().charAt(0);
	            if (options5 == 'b') {
	                System.out.println("Congratulations, Correct Answer");
	                count++;
	            } else {
	                System.out.println("Oops, Wrong Answer");
	            }

	            // Question 6
	            System.out.println("6. How do you declare an associative array in PHP?");
	            System.out.println("a. array(1, 2, 3)\nb. [1, 2, 3]\nc. array('one' => 1, 'two' => 2, 'three' => 3)\nd. {'one' => 1, 'two' => 2, 'three' => 3}");
	            char options6 = sc.next().charAt(0);
	            if (options6 == 'c') {
	                System.out.println("Congratulations, Correct Answer");
	                count++;
	            } else {
	                System.out.println("Oops, Wrong Answer");
	            }

	            // Question 7
	            System.out.println("7. What is the purpose of the 'session_start()' function in PHP?");
	            System.out.println("a. To start a new PHP session\nb. To include an external session file\nc. To resume an existing session\nd. To end the current session");
	            char options7 = sc.next().charAt(0);
	            if (options7 == 'a') {
	                System.out.println("Congratulations, Correct Answer");
	                count++;
	            } else {
	                System.out.println("Oops, Wrong Answer");
	            }

	            // Question 8
	            System.out.println("8. How do you handle file uploads in PHP?");
	            System.out.println("a. Using the '$_FILES' superglobal\nb. Using 'file_get_contents()'\nc. By including the file directly\nd. Using 'upload_file()' function");
	            char options8 = sc.next().charAt(0);
	            if (options8 == 'a') {
	                System.out.println("Congratulations, Correct Answer");
	                count++;
	            } else {
	                System.out.println("Oops, Wrong Answer");
	            }

	            // Question 9
	            System.out.println("9. What is the purpose of the 'parent::__construct()' statement in PHP?");
	            System.out.println("a. To call the constructor of the current class\nb. To invoke the parent class constructor\nc. To destroy the current object\nd. To define a static constructor");
	            char options9 = sc.next().charAt(0);
	            if (options9 == 'b') {
	                System.out.println("Congratulations, Correct Answer");
	                count++;
	            } else {
	                System.out.println("Oops, Wrong Answer");
	            }

	            // Question 10
	            System.out.println("10. What is the purpose of the 'namespace' keyword in PHP?");
	            System.out.println("a. To declare a new variable\nb. To define a namespace\n c. To include external files\n d. To create a conditional statement");
	            char options10 = sc.next().charAt(0);
	            if (options10 == 'b') {
	                System.out.println("Congratulations, Correct Answer");
	                count++;
	            } else {
	                System.out.println("Oops, Wrong Answer");
	            }

	            // Display the final result
	            System.out.println("You scored " + count + "/10 in the PHP quiz.");
	            
	        }
	        if(count>7) {
	        	System.out.println("Well Done");
	        	String updateProductQuery = "UPDATE php SET quiz = ? WHERE email = ?";
                try (PreparedStatement updateProductStatement = krishna.prepareStatement(updateProductQuery)) {
                    updateProductStatement.setBoolean(1, true);
                    updateProductStatement.setString(2, email4);
                    updateProductStatement.executeUpdate();
                }
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
	    	            	
	    	            	
	    	        		String updateProductQuery1 = "UPDATE accuracy SET php = ? WHERE a_Email = ?";
	                        try (PreparedStatement updateProductStatement = krishna.prepareStatement(updateProductQuery1)) {
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
	        	else {
		        	System.out.println("You tried well, But you want train much more");
		        	System.out.println("For getting certificate, You want to more than 7 marks");
		        	System.out.println("Better luck next time");
		        	display d=new display();
    				
    				d.displays();
		        
	        
	        }
		}
		if(option ==3) {
			int e=0;
	        String query="select * from dataStructures";
    		PreparedStatement view1;
        	try {
    			view1 = krishna.prepareStatement(query);
    			ResultSet rs1 = view1.executeQuery();
    			while (rs1.next()) {
    				if(email4.equals(rs1.getString("email"))) {
    					
    				
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
    				}
    			}
        	}
        	catch (SQLException e1) {
    			// TODO Auto-generated catch block
    			e1.printStackTrace();
    		}
	        if (e==0) {
	        	int count = 0;

	            // Question 1
	            System.out.println("1. What is the time complexity of searching for an element in a binary search tree?");
	            System.out.println("a. O(1)\nb. O(log n)\nc. O(n)\nd. O(n log n)");
	            char options1 = sc.next().charAt(0);
	            if (options1 == 'b') {
	                System.out.println("Congratulations, Correct Answer");
	                count++;
	            } else {
	                System.out.println("Oops, Wrong Answer");
	            }

	            // Question 2
	            System.out.println("2. Which data structure is best suited for implementing a LIFO behavior?");
	            System.out.println("a. Queue\nb. Heap\nc. Stack\nd. Linked List");
	            char options2 = sc.next().charAt(0);
	            if (options2 == 'c') {
	                System.out.println("Congratulations, Correct Answer");
	                count++;
	            } else {
	                System.out.println("Oops, Wrong Answer");
	            }

	            // Question 3
	            System.out.println("3. What is the primary purpose of a hash function in hash tables?");
	            System.out.println("a. To rearrange elements in sorted order\nb. To minimize collisions\nc. To maximize collisions\nd. To compute the average of elements");
	            char options3 = sc.next().charAt(0);
	            if (options3 == 'b') {
	                System.out.println("Congratulations, Correct Answer");
	                count++;
	            } else {
	                System.out.println("Oops, Wrong Answer");
	            }

	            // Question 4
	            System.out.println("4. Which sorting algorithm has the best time complexity in the average case?");
	            System.out.println("a. Bubble Sort\nb. Merge Sort\nc. Insertion Sort\nd. Quick Sort");
	            char options4 = sc.next().charAt(0);
	            if (options4 == 'd') {
	                System.out.println("Congratulations, Correct Answer");
	                count++;
	            } else {
	                System.out.println("Oops, Wrong Answer");
	            }

	            // Question 5
	            System.out.println("5. How is a circular linked list different from a singly linked list?");
	            System.out.println("a. Circular linked list has a fixed size\nb. Circular linked list has no tail\nc. Circular linked list has no head\nd. Circular linked list connects the last node to the first");
	            char options5 = sc.next().charAt(0);
	            if (options5 == 'd') {
	                System.out.println("Congratulations, Correct Answer");
	                count++;
	            } else {
	                System.out.println("Oops, Wrong Answer");
	            }

	            // Question 6
	            System.out.println("6. In a priority queue, which element is dequeued first?");
	            System.out.println("a. Element with the lowest priority\nb. Element with the highest priority\nc. Random element\nd. Element with the longest waiting time");
	            char options6 = sc.next().charAt(0);
	            if (options6 == 'b') {
	                System.out.println("Congratulations, Correct Answer");
	                count++;
	            } else {
	                System.out.println("Oops, Wrong Answer");
	            }

	            // Question 7
	            System.out.println("7. What is the purpose of the BFS (Breadth-First Search) algorithm?");
	            System.out.println("a. To find the shortest path in a weighted graph\nb. To search a tree or graph level by level\nc. To sort an array\nd. To find strongly connected components");
	            char options7 = sc.next().charAt(0);
	            if (options7 == 'b') {
	                System.out.println("Congratulations, Correct Answer");
	                count++;
	            } else {
	                System.out.println("Oops, Wrong Answer");
	            }

	            // Question 8
	            System.out.println("8. What is the primary advantage of a heap over other data structures?");
	            System.out.println("a. Constant time insertion\nb. Constant time deletion\nc. Efficient searching\nd. Efficient retrieval of the smallest element");
	            char options8 = sc.next().charAt(0);
	            if (options8 == 'd') {
	                System.out.println("Congratulations, Correct Answer");
	                count++;
	            } else {
	                System.out.println("Oops, Wrong Answer");
	            }

	            // Question 9
	            System.out.println("9. Which data structure is used to implement recursion?");
	            System.out.println("a. Queue\nb. Heap\nc. Stack\nd. Linked List");
	            char options9 = sc.next().charAt(0);
	            if (options9 == 'c') {
	                System.out.println("Congratulations, Correct Answer");
	                count++;
	            } else {
	                System.out.println("Oops, Wrong Answer");
	            }

	            // Question 10
	            System.out.println("10. What is the main advantage of using a self-balancing binary search tree?");
	            System.out.println("a. Constant time search\nb. Faster insertion and deletion\nc. Lower space complexity\nd. Better worst-case time complexity");
	            char options10 = sc.next().charAt(0);
	            if (options10 == 'd') {
	                System.out.println("Congratulations, Correct Answer");
	                count++;
	            } else {
	                System.out.println("Oops, Wrong Answer");
	            }

	            // Display the final result
	            System.out.println("You scored " + count + "/10 in the Data Structures quiz.");
	            if(count>7) {
		        	System.out.println("Well Done");
		        	String updateProductQuery = "UPDATE dataStructures SET quiz = ? WHERE email = ?";
	                try (PreparedStatement updateProductStatement = krishna.prepareStatement(updateProductQuery)) {
	                    updateProductStatement.setBoolean(1, true);
	                    updateProductStatement.setString(2, email4);
	                    updateProductStatement.executeUpdate();
	                }
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
		    	            	
		    	            	
		    	        		String updateProductQuery1 = "UPDATE accuracy SET dataStructures = ? WHERE a_Email = ?";
	                            try (PreparedStatement updateProductStatement = krishna.prepareStatement(updateProductQuery1)) {
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
	        else {
	        	System.out.println("You tried well, But you want train much more");
	        	System.out.println("For getting certificate, You want to more than 7 marks");
	        	System.out.println("Better luck next time");
	        	display d=new display();
				
				d.displays();
	        }

		}
		if(option ==4) {
			int e=0;
	        String query="select * from dataScience";
    		PreparedStatement view1;
        	try {
    			view1 = krishna.prepareStatement(query);
    			ResultSet rs1 = view1.executeQuery();
    			while (rs1.next()) {
    				if(email4.equals(rs1.getString("email"))) {
    					
    				
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
    				}
    			}
        	}
        	catch (SQLException e1) {
    			// TODO Auto-generated catch block
    			e1.printStackTrace();
    		}
	        if (e==0) {
	        	int count = 0;

	            // Question 1
	            System.out.println("1. What is the primary goal of exploratory data analysis (EDA)?");
	            System.out.println("a. Predict future outcomes\nb. Summarize main characteristics of the data\nc. Classify data into categories\nd. Implement machine learning algorithms");
	            char options1 = sc.next().charAt(0);
	            if (options1 == 'b') {
	                System.out.println("Congratulations, Correct Answer");
	                count++;
	            } else {
	                System.out.println("Oops, Wrong Answer");
	            }

	            // Question 2
	            System.out.println("2. In machine learning, what is the term for a model's ability to perform well on new, unseen data?");
	            System.out.println("a. Accuracy\nb. Precision\nc. Recall\nd. Generalization");
	            char options2 = sc.next().charAt(0);
	            if (options2 == 'd') {
	                System.out.println("Congratulations, Correct Answer");
	                count++;
	            } else {
	                System.out.println("Oops, Wrong Answer");
	            }

	            // Question 3
	            System.out.println("3. What does the term 'overfitting' refer to in machine learning?");
	            System.out.println("a. Model performs well on training data but poorly on new data\nb. Model generalizes well to new data\nc. Model performs well on all datasets\nd. Model is too simple");
	            char options3 = sc.next().charAt(0);
	            if (options3 == 'a') {
	                System.out.println("Congratulations, Correct Answer");
	                count++;
	            } else {
	                System.out.println("Oops, Wrong Answer");
	            }

	            // Question 4
	            System.out.println("4. Which statistical test is used to determine if there is a significant association between two categorical variables?");
	            System.out.println("a. T-test\nb. ANOVA\nc. Chi-square test\nd. Pearson correlation");
	            char options4 = sc.next().charAt(0);
	            if (options4 == 'c') {
	                System.out.println("Congratulations, Correct Answer");
	                count++;
	            } else {
	                System.out.println("Oops, Wrong Answer");
	            }

	            // Question 5
	            System.out.println("5. What is the purpose of feature scaling in machine learning?");
	            System.out.println("a. To add more features to the dataset\nb. To normalize the range of independent variables\nc. To remove irrelevant features\nd. To improve model accuracy");
	            char options5 = sc.next().charAt(0);
	            if (options5 == 'b') {
	                System.out.println("Congratulations, Correct Answer");
	                count++;
	            } else {
	                System.out.println("Oops, Wrong Answer");
	            }

	            // Question 6
	            System.out.println("6. Which algorithm is commonly used for clustering in unsupervised machine learning?");
	            System.out.println("a. Linear Regression\nb. K-Nearest Neighbors\nc. Decision Trees\nd. K-Means");
	            char options6 = sc.next().charAt(0);
	            if (options6 == 'd') {
	                System.out.println("Congratulations, Correct Answer");
	                count++;
	            } else {
	                System.out.println("Oops, Wrong Answer");
	            }

	            // Question 7
	            System.out.println("7. What is the purpose of the ROC curve in binary classification?");
	            System.out.println("a. To evaluate the performance of a classifier across different thresholds\nb. To visualize the distribution of data\nc. To measure the accuracy of predictions\nd. To compare multiple classifiers");
	            char options7 = sc.next().charAt(0);
	            if (options7 == 'a') {
	                System.out.println("Congratulations, Correct Answer");
	                count++;
	            } else {
	                System.out.println("Oops, Wrong Answer");
	            }

	            // Question 8
	            System.out.println("8. Which technique is used for handling missing data in a dataset?");
	            System.out.println("a. Data augmentation\nb. Data imputation\nc. Data normalization\nd. Data encoding");
	            char options8 = sc.next().charAt(0);
	            if (options8 == 'b') {
	                System.out.println("Congratulations, Correct Answer");
	                count++;
	            } else {
	                System.out.println("Oops, Wrong Answer");
	            }

	            // Question 9
	            System.out.println("9. What is the purpose of cross-validation in machine learning?");
	            System.out.println("a. To train a model on the entire dataset\nb. To evaluate a model's performance on new data\nc. To compare different machine learning algorithms\nd. To avoid overfitting");
	            char options9 = sc.next().charAt(0);
	            if (options9 == 'd') {
	                System.out.println("Congratulations, Correct Answer");
	                count++;
	            } else {
	                System.out.println("Oops, Wrong Answer");
	            }

	            // Question 10
	            System.out.println("10. What is the role of activation functions in neural networks?");
	            System.out.println("a. To determine the learning rate of the model\nb. To compute the gradient of the loss function\nc. To introduce non-linearity into the model\nd. To control the number of hidden layers");
	            char options10 = sc.next().charAt(0);
	            if (options10 == 'c') {
	                System.out.println("Congratulations, Correct Answer");
	                count++;
	            } else {
	                System.out.println("Oops, Wrong Answer");
	            }

	            // Display the final result
	            System.out.println("You scored " + count + "/10 in the Data Science quiz.");
	            if(count>7) {
		        	System.out.println("Well Done");
		        	String updateProductQuery = "UPDATE dataScience SET quiz = ? WHERE email = ?";
	                try (PreparedStatement updateProductStatement = krishna.prepareStatement(updateProductQuery)) {
	                    updateProductStatement.setBoolean(1, true);
	                    updateProductStatement.setString(2, email4);
	                    updateProductStatement.executeUpdate();
	                }
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
		    	            	
		    	            	
		    	        		String updateProductQuery1 = "UPDATE accuracy SET dataScience = ? WHERE a_Email = ?";
	                            try (PreparedStatement updateProductStatement = krishna.prepareStatement(updateProductQuery1)) {
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
		}
		if(option == 5) {
			int e=0;
	        String query="select * from java";
    		PreparedStatement view1;
        	try {
    			view1 = krishna.prepareStatement(query);
    			ResultSet rs1 = view1.executeQuery();
    			while (rs1.next()) {
    				if(email4.equals(rs1.getString("email"))) {
    					
    				
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
    				}
    			}
        	}
        	catch (SQLException e1) {
    			// TODO Auto-generated catch block
    			e1.printStackTrace();
    		}
	        if (e==0) {
	        	int count = 0;

	            // Display instructions
	            System.out.println("Java Programming Multiple Choice Quiz");
	            System.out.println("Select the correct option (a, b, c, or d).");

	            // Question 1
	            System.out.println("1. What is the output of the following code: System.out.println(10 + 20 + \"30\")?");
	            System.out.println("a. 1030\nb. 60\nc. 30\nd. Compilation error");
	            char options1 = sc.next().charAt(0);
	            if (options1 == 'b') {
	                System.out.println("Congratulations, Correct Answer");
	                count++;
	            } else {
	                System.out.println("Oops, Wrong Answer");
	            }

	            // Question 2
	            System.out.println("2. What is the purpose of the 'this' keyword in Java?");
	            System.out.println("a. To refer to the current instance of the class\nb. To create a new instance of a class\nc. To access static variables\nd. To define a constant");
	            char options2 = sc.next().charAt(0);
	            if (options2 == 'a') {
	                System.out.println("Congratulations, Correct Answer");
	                count++;
	            } else {
	                System.out.println("Oops, Wrong Answer");
	            }

	            // Question 3
	            System.out.println("3. How is an interface different from an abstract class in Java?");
	            System.out.println("a. Interfaces can have constructors, abstract classes cannot\nb. Abstract classes can have constructors, interfaces cannot\nc. Both can have constructors\nd. Neither can have constructors");
	            char options3 = sc.next().charAt(0);
	            if (options3 == 'b') {
	                System.out.println("Congratulations, Correct Answer");
	                count++;
	            } else {
	                System.out.println("Oops, Wrong Answer");
	            }

	            // Question 4
	            System.out.println("4. Which keyword is used to implement the concept of inheritance in Java?");
	            System.out.println("a. inherit\nb. extends\nc. inheritClass\nd. inherits");
	            char options4 = sc.next().charAt(0);
	            if (options4 == 'b') {
	                System.out.println("Congratulations, Correct Answer");
	                count++;
	            } else {
	                System.out.println("Oops, Wrong Answer");
	            }

	            // Question 5
	            System.out.println("5. What is the purpose of the 'super' keyword in Java?");
	            System.out.println("a. To refer to the superclass\nb. To create a new instance of a class\nc. To access static variables\nd. To define a constant");
	            char options5 = sc.next().charAt(0);
	            if (options5 == 'a') {
	                System.out.println("Congratulations, Correct Answer");
	                count++;
	            } else {
	                System.out.println("Oops, Wrong Answer");
	            }

	            // Question 6
	            System.out.println("6. What is the default value of the elements in an array of integers in Java?");
	            System.out.println("a. 0\nb. 1\nc. -1\nd. null");
	            char options6 = sc.next().charAt(0);
	            if (options6 == 'a') {
	                System.out.println("Congratulations, Correct Answer");
	                count++;
	            } else {
	                System.out.println("Oops, Wrong Answer");
	            }

	            // Question 7
	            System.out.println("7. Which of the following is a marker interface in Java?");
	            System.out.println("a. Runnable\nb. Serializable\nc. Comparable\nd. Cloneable");
	            char options7 = sc.next().charAt(0);
	            if (options7 == 'b') {
	                System.out.println("Congratulations, Correct Answer");
	                count++;
	            } else {
	                System.out.println("Oops, Wrong Answer");
	            }

	            // Question 8
	            System.out.println("8. What is the purpose of the 'break' statement in a switch statement?");
	            System.out.println("a. To skip the current iteration and continue with the next one\nb. To terminate the loop and exit\nc. To check a condition and break out of the loop\nd. To exit the switch statement");
	            char options8 = sc.next().charAt(0);
	            if (options8 == 'd') {
	                System.out.println("Congratulations, Correct Answer");
	                count++;
	            } else {
	                System.out.println("Oops, Wrong Answer");
	            }

	            // Question 9
	            System.out.println("9. Which method is called when an object is created in Java?");
	            System.out.println("a. start()\nb. init()\nc. main()\nd. constructor()");
	            char options9 = sc.next().charAt(0);
	            if (options9 == 'd') {
	                System.out.println("Congratulations, Correct Answer");
	                count++;
	            } else {
	                System.out.println("Oops, Wrong Answer");
	            }

	            // Question 10
	            System.out.println("10. What is the purpose of the 'finalize' method in Java?");
	            System.out.println("a. To clean up system resources before garbage collection\nb. To terminate the program\nc. To initialize an object\nd. To throw an exception");
	            char options10 = sc.next().charAt(0);
	            if (options10 == 'a') {
	                System.out.println("Congratulations, Correct Answer");
	                count++;
	            } else {
	                System.out.println("Oops, Wrong Answer");
	            }

	            // Display the final result
	            System.out.println("You scored " + count + "/10 in the Java Programming quiz.");
	            if(count>7) {
		        	System.out.println("Well Done");
		        	String updateProductQuery = "UPDATE java SET quiz = ? WHERE email = ?";
	                try (PreparedStatement updateProductStatement = krishna.prepareStatement(updateProductQuery)) {
	                    updateProductStatement.setBoolean(1, true);
	                    updateProductStatement.setString(2, email4);
	                    updateProductStatement.executeUpdate();
	                }
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
		    	            	
		    	            	
		    	        		String updateProductQuery1 = "UPDATE accuracy SET python = ? WHERE a_Email = ?";
	                            try (PreparedStatement updateProductStatement = krishna.prepareStatement(updateProductQuery1)) {
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
	        else {
	        	System.out.println("You tried well, But you want train much more");
	        	System.out.println("For getting certificate, You want to more than 7 marks");
	        	System.out.println("Better luck next time");
	        	display d=new display();
				
				d.displays();
	        }
	        
		}
		
		return null;
	
	
	}
}
