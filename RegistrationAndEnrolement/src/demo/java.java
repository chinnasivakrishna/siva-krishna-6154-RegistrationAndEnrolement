package demo;

import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class java {
	Scanner sc = new Scanner(System.in);
	String email;
	public String pythonspro(String email6) {
		// TODO Auto-generated method stub
		email = email6;
		return email6;
	}
	public void javaprogram() throws SQLException, IOException, URISyntaxException {
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
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println(email);
		System.out.println("When You Complete all topics you get an certificate");
		System.out.println("Enter 1 for Basic Java");
		System.out.println("Enter 2 for Intermediate Java");
		System.out.println("Enter 3 for Advanced Java");
		System.out.println("Enter 4 for Expert Java");
		System.out.println("Enter 5 for Specialized Java");
		System.out.println("Enter 6 for Check the completion level");
		System.out.println("Enter 7 for leave");
		int choice = sc.nextInt();
		if(choice ==1) {
			
			System.out.println("******************************Basic Java***********************************");

	        // Heading: Introduction to Java
	        System.out.println("1. Introduction to Java:");
	        System.out.println("   - Description: Java is a high-level, object-oriented programming language known for its portability and platform independence.");
	        System.out.println("   - Example:");
	        System.out.println("     public class HelloWorld {");
	        System.out.println("         public static void main(String[] args) {");
	        System.out.println("             System.out.println(\"Hello, World!\");");
	        System.out.println("         }");
	        System.out.println("     }");
	        System.out.println();

	        // Heading: Variables and Data Types
	        System.out.println("2. Variables and Data Types:");
	        System.out.println("   - Description: Java supports various data types, including int, double, char, boolean, and more.");
	        System.out.println("   - Example:");
	        System.out.println("     int age = 25;");
	        System.out.println("     double height = 5.9;");
	        System.out.println("     char grade = 'A';");
	        System.out.println();

	        // Heading: Control Flow Statements
	        System.out.println("3. Control Flow Statements:");
	        System.out.println("   - Description: Java includes control flow statements such as if-else, switch, while, do-while, and for.");
	        System.out.println("   - Example:");
	        System.out.println("     if (grade == 'A') {");
	        System.out.println("         System.out.println(\"Excellent!\");");
	        System.out.println("     } else {");
	        System.out.println("         System.out.println(\"Keep it up!\");");
	        System.out.println("     }");
	        System.out.println();

	        // Heading: Functions and Methods
	        System.out.println("4. Functions and Methods:");
	        System.out.println("   - Description: Functions in Java are defined using the 'void' keyword for simple examples. Methods are reusable blocks of code.");
	        System.out.println("   - Example:");
	        System.out.println("     void greet(String name) {");
	        System.out.println("         System.out.println(\"Hello, \" + name + \"!\");");
	        System.out.println("     }");
	        System.out.println("     greet(\"Alice\");");
	        System.out.println();

	        // Heading: Object-Oriented Programming (OOP)
	        System.out.println("5. Object-Oriented Programming (OOP):");
	        System.out.println("   - Description: Java is an OOP language, supporting concepts like classes, objects, inheritance, encapsulation, and polymorphism.");
	        System.out.println("   - Example:");
	        System.out.println("     class Rectangle {");
	        System.out.println("         int length;");
	        System.out.println("         int width;");
	        System.out.println("     }");
	        System.out.println("     Rectangle myRectangle = new Rectangle();");
	        System.out.println();

	        // Heading: Arrays
	        System.out.println("6. Arrays:");
	        System.out.println("   - Description: Arrays in Java are used to store multiple values of the same type.");
	        System.out.println("   - Example:");
	        System.out.println("     int[] numbers = {1, 2, 3, 4, 5};");
	        System.out.println();

	        // Heading: Input and Output
	        System.out.println("7. Input and Output:");
	        System.out.println("   - Description: Java uses System.out.println() for output and Scanner for user input.");
	        System.out.println("   - Example:");
	        System.out.println("     Scanner scanner = new Scanner(System.in);");
	        System.out.println("     System.out.print(\"Enter your name: \");");
	        System.out.println("     String name = scanner.nextLine();");
	        System.out.println("     System.out.println(\"Hello, \" + name + \"!\");");
	        System.out.println();

	        // Heading: Exception Handling
	        System.out.println("8. Exception Handling:");
	        System.out.println("   - Description: Java supports exception handling using try, catch, throw, and finally blocks.");
	        System.out.println("   - Example:");
	        System.out.println("     try {");
	        System.out.println("         int result = 10 / 0;");
	        System.out.println("     } catch (ArithmeticException e) {");
	        System.out.println("         System.out.println(\"Error: Division by zero.\");");
	        System.out.println("     }");
	        System.out.println();

	        // Heading: Strings
	        System.out.println("9. Strings:");
	        System.out.println("   - Description: Strings are sequences of characters in Java and can be manipulated using various String methods.");
	        System.out.println("   - Example:");
	        System.out.println("     String message = \"Hello, World!\";");
	        System.out.println();

	        // Heading: Comments
	        System.out.println("10. Comments:");
	        System.out.println("    - Description: Comments in Java start with // for single-line comments and /* ... */ for multi-line comments.");
	        System.out.println("    - Example:");
	        System.out.println("      // This is a comment");
	    
	        String update2 = "UPDATE java SET basic = ? where email = ?";
            try (PreparedStatement update3 = krishna.prepareStatement(update2)) {
                update3.setBoolean(1, true);
                update3.setString(2, email);
                update3.executeUpdate();
            }
			
	        System.out.println("********************************************************************************************************************************");
	        System.out.println("You completed 1st Stage of Java");
	        System.out.println("If You want to continue enter 2");
	        System.out.println("If you want to quit enter 7");
	        choice = sc.nextInt();
		}
		if(choice ==2) {
			System.out.println("****************************Intermediate Java******************************");

	        // Heading: Advanced Object-Oriented Programming (OOP) Concepts
	        System.out.println("1. Advanced Object-Oriented Programming (OOP) Concepts:");
	        System.out.println("   - Description: Intermediate Java explores more advanced OOP concepts, including interfaces, abstract classes, and inner classes.");
	        System.out.println("   - Example:");
	        System.out.println("     interface Shape {");
	        System.out.println("         void draw();");
	        System.out.println("     }");
	        System.out.println("     class Circle implements Shape {");
	        System.out.println("         public void draw() {");
	        System.out.println("             System.out.println(\"Drawing a circle.\");");
	        System.out.println("         }");
	        System.out.println("     }");
	        System.out.println();

	        // Heading: Collections Framework
	        System.out.println("2. Collections Framework:");
	        System.out.println("   - Description: Intermediate Java introduces the Collections Framework, including ArrayList, HashMap, and HashSet.");
	        System.out.println("   - Example:");
	        System.out.println("     List<String> names = new ArrayList<>();");
	        System.out.println("     names.add(\"Alice\");");
	        System.out.println("     names.add(\"Bob\");");
	        System.out.println("     Map<String, Integer> ages = new HashMap<>();");
	        System.out.println("     ages.put(\"Alice\", 25);");
	        System.out.println();

	        System.out.println("3. File I/O:");
	        System.out.println("   - Description: Intermediate Java covers file input/output operations using FileReader, FileWriter, BufferedReader, and BufferedWriter.");
	        System.out.println("   - Example:");
	        System.out.println("     try (BufferedReader reader = new BufferedReader(new FileReader(\"input.txt\"))) {");
	        System.out.println("         String line;");
	        System.out.println("         while ((line = reader.readLine()) != null) {");
	        System.out.println("             System.out.println(line);");
	        System.out.println("         }");
	        System.out.println("     } catch (IOException e) {");
	        System.out.println("         e.printStackTrace();");
	        System.out.println("     }");
	        System.out.println();

	        System.out.println("4. Multithreading:");
	        System.out.println("   - Description: Intermediate Java introduces multithreading concepts using threads, synchronization, and the java.util.concurrent package.");
	        System.out.println("   - Example:");
	        System.out.println("     class MyThread extends Thread {");
	        System.out.println("         public void run() {");
	        System.out.println("             System.out.println(\"Thread is running.\");");
	        System.out.println("         }");
	        System.out.println("     }");
	        System.out.println("     MyThread thread = new MyThread();");
	        System.out.println("     thread.start();");
	        System.out.println();

	        System.out.println("5. Exception Handling (Advanced):");
	        System.out.println("   - Description: Intermediate Java covers advanced exception handling, including custom exceptions and the 'throws' keyword.");
	        System.out.println("   - Example:");
	        System.out.println("     class CustomException extends Exception {");
	        System.out.println("         public CustomException(String message) {");
	        System.out.println("             super(message);");
	        System.out.println("         }");
	        System.out.println("     }");
	        System.out.println("     void myMethod() throws CustomException {");
	        System.out.println("         // Method implementation");
	        System.out.println("     }");
	        System.out.println();

	        System.out.println("6. JDBC (Java Database Connectivity):");
	        System.out.println("   - Description: Intermediate Java covers database access using JDBC to connect and interact with relational databases.");
	        System.out.println("   - Example:");
	        System.out.println("     Connection connection = DriverManager.getConnection(\"jdbc:mysql://localhost:3306/mydatabase\", \"username\", \"password\");");
	        System.out.println("     Statement statement = connection.createStatement();");
	        System.out.println("     ResultSet resultSet = statement.executeQuery(\"SELECT * FROM users\");");
	        System.out.println();

	        System.out.println("7. Lambda Expressions:");
	        System.out.println("   - Description: Intermediate Java introduces lambda expressions for concise representation of anonymous functions.");
	        System.out.println("   - Example:");
	        System.out.println("     List<String> names = Arrays.asList(\"Alice\", \"Bob\", \"Charlie\");");
	        System.out.println("     names.forEach(name -> System.out.println(\"Hello, \" + name + \"!\"));");
	        System.out.println();

	        System.out.println("8. JavaFX (Basic):");
	        System.out.println("   - Description: Intermediate Java covers basic JavaFX concepts for building graphical user interfaces.");
	        System.out.println("   - Example:");
	        System.out.println("     import javafx.application.Application;");
	        System.out.println("     import javafx.scene.Scene;");
	        System.out.println("     import javafx.scene.control.Button;");
	        System.out.println("     import javafx.stage.Stage;");
	        System.out.println("     public class MyJavaFXApp extends Application {");
	        System.out.println("         public void start(Stage stage) {");
	        System.out.println("             Button button = new Button(\"Click me\");");
	        System.out.println("             Scene scene = new Scene(button, 200, 100);");
	        System.out.println("             stage.setScene(scene);");
	        System.out.println("             stage.setTitle(\"JavaFX App\");");
	        System.out.println("             stage.show();");
	        System.out.println("         }");
	        System.out.println("     }");
	        System.out.println();

	        System.out.println("9. Unit Testing with JUnit:");
	        System.out.println("   - Description: Intermediate Java introduces unit testing using the JUnit framework for testing Java code.");
	        System.out.println("   - Example:");
	        System.out.println("     import static org.junit.Assert.assertEquals;");
	        System.out.println("     import org.junit.Test;");
	        System.out.println("     public class MyTest {");
	        System.out.println("         @Test");
	        System.out.println("         public void testAddition() {");
	        System.out.println("             assertEquals(4, 2 + 2);");
	        System.out.println("         }");
	        System.out.println("     }");
	        System.out.println();

	        System.out.println("10. Enums and Annotations:");
	        System.out.println("    - Description: Intermediate Java covers the use of enums and annotations for defining constant values and metadata.");
	        System.out.println("    - Example:");
	        System.out.println("      public enum Days {");
	        System.out.println("          MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;");
	        System.out.println("      }");
	        System.out.println("      public @interface MyAnnotation {");
	        System.out.println("          String value();");
	        System.out.println("      }");
	   
	        String update = "UPDATE java SET intermediate = ? where email = ?";
            try (PreparedStatement update1 = krishna.prepareStatement(update)) {
                update1.setBoolean(1,true);
                update1.setString(2,email);
                update1.executeUpdate();
            }
	        
			System.out.println("********************************************************************************************************************************");
			System.out.println("You completed 2st Stage of Java");
	        System.out.println("If You want to continue enter 3");
	        System.out.println("If you want to quit enter 7");
	        choice = sc.nextInt();
		}
		if(choice ==3) {
			
			System.out.println("*****************************Advanced Java**********************************");

	        System.out.println("1. Design Patterns:");
	        System.out.println("   - Description: Advanced Java involves understanding and applying design patterns for efficient and scalable software design.");
	        System.out.println("   - Example:");
	        System.out.println("     - Singleton Pattern");
	        System.out.println("     - Factory Pattern");
	        System.out.println("     - Observer Pattern");
	        System.out.println();

	        System.out.println("2. Java Generics:");
	        System.out.println("   - Description: Advanced Java utilizes generics for creating reusable and type-safe classes and methods.");
	        System.out.println("   - Example:");
	        System.out.println("     class MyGenericClass<T> {");
	        System.out.println("         private T data;");
	        System.out.println("         // Constructor, methods, etc.");
	        System.out.println("     }");
	        System.out.println();

	        System.out.println("3. Reflection API:");
	        System.out.println("   - Description: Advanced Java involves using the Reflection API to inspect and manipulate class metadata at runtime.");
	        System.out.println("   - Example:");
	        System.out.println("     Class<?> myClass = MyClass.class;");
	        System.out.println("     Field[] fields = myClass.getDeclaredFields();");
	        System.out.println();

	        System.out.println("4. Java NIO (New I/O):");
	        System.out.println("   - Description: Advanced Java leverages NIO for non-blocking I/O operations and efficient handling of large data sets.");
	        System.out.println("   - Example:");
	        System.out.println("     // Using java.nio.file, java.nio.channels, etc.");
	        System.out.println();

	        System.out.println("5. Java Concurrency and Executors:");
	        System.out.println("   - Description: Advanced Java utilizes the java.util.concurrent package for advanced concurrency control and thread management.");
	        System.out.println("   - Example:");
	        System.out.println("     ExecutorService executor = Executors.newFixedThreadPool(10);");
	        System.out.println("     executor.submit(() -> System.out.println(\"Task executed.\"));");
	        System.out.println();

	        System.out.println("6. Java Memory Model and Garbage Collection:");
	        System.out.println("   - Description: Advanced Java requires a deep understanding of the Java Memory Model and efficient memory management using Garbage Collection.");
	        System.out.println("   - Example:");
	        System.out.println("     // Monitoring and tuning JVM memory settings");
	        System.out.println();

	        System.out.println("7. Java 8 Features (Lambdas, Streams, Functional Interfaces):");
	        System.out.println("   - Description: Advanced Java includes the use of lambdas, streams, and functional interfaces for concise and functional programming.");
	        System.out.println("   - Example:");
	        System.out.println("     List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);");
	        System.out.println("     int sum = numbers.stream().mapToInt(Integer::intValue).sum();");
	        System.out.println();

	        System.out.println("8. Java 9+ Modules System:");
	        System.out.println("   - Description: Advanced Java includes modular programming using the Java 9+ modules system for better project organization and encapsulation.");
	        System.out.println("   - Example:");
	        System.out.println("     // module-info.java defining module dependencies");
	        System.out.println();

	        System.out.println("9. JavaFX (Advanced):");
	        System.out.println("   - Description: Advanced JavaFX involves complex UI design, custom controls, animations, and integrating with multimedia.");
	        System.out.println("   - Example:");
	        System.out.println("     // Custom controls, CSS styling, 3D graphics, etc.");
	        System.out.println();

	        System.out.println("10. Java Native Interface (JNI):");
	        System.out.println("    - Description: Advanced Java includes using JNI to integrate Java code with applications and libraries written in other languages like C or C++.");
	        System.out.println("    - Example:");
	        System.out.println("      // Defining native methods and using them in Java code");
	        System.out.println();
	   
	        String update4 = "UPDATE java SET advance = ? where email = ?";
            try (PreparedStatement update5 = krishna.prepareStatement(update4)) {
                update5.setBoolean(1, true);
                update5.setString(2, email);
                update5.executeUpdate();
            }
	        
			System.out.println("********************************************************************************************************************************");
	        System.out.println("You completed 3st Stage of Java");
	        System.out.println("If You want to continue enter 4");
	        System.out.println("If you want to quit enter 7");
	        choice = sc.nextInt();
		}
		if(choice ==4) {
			
			System.out.println("******************************Expert Java**********************************");

	        System.out.println("1. Java Performance Tuning:");
	        System.out.println("   - Description: Expert-level Java involves optimizing code for performance, considering aspects like memory usage, CPU utilization, and latency.");
	        System.out.println("   - Example:");
	        System.out.println("     // Using tools like VisualVM, Java Flight Recorder, and optimizing algorithms");
	        System.out.println();

	        System.out.println("2. Java Memory Model (Advanced):");
	        System.out.println("   - Description: Experts understand in-depth details of the Java Memory Model, including memory visibility, volatile, and memory barriers.");
	        System.out.println("   - Example:");
	        System.out.println("     // Advanced memory management strategies, working with Off-Heap memory");
	        System.out.println();

	        System.out.println("3. Java Virtual Machine (JVM) Internals:");
	        System.out.println("   - Description: Experts delve into the inner workings of the JVM, understanding the bytecode execution, Just-In-Time (JIT) compilation, and garbage collection algorithms.");
	        System.out.println("   - Example:");
	        System.out.println("     // Analyzing JVM logs, tuning garbage collection parameters");
	        System.out.println();

	        System.out.println("4. Java Security:");
	        System.out.println("   - Description: Expert Java developers focus on securing applications, understanding cryptographic APIs, securing network communication, and managing access controls.");
	        System.out.println("   - Example:");
	        System.out.println("     // Using Java Security API, SSL/TLS, secure coding practices");
	        System.out.println();

	        System.out.println("5. Java Enterprise Edition (Java EE) Technologies:");
	        System.out.println("   - Description: Experts develop enterprise-level applications using Java EE technologies like EJB, JPA, JMS, and implement design patterns specific to enterprise applications.");
	        System.out.println("   - Example:");
	        System.out.println("     // Building scalable and distributed systems using Java EE");
	        System.out.println();

	        System.out.println("6. Microservices Architecture with Spring Boot:");
	        System.out.println("   - Description: Experts design and implement microservices-based architectures using Spring Boot, focusing on containerization, service discovery, and fault tolerance.");
	        System.out.println("   - Example:");
	        System.out.println("     // Creating microservices, implementing API gateways, using Spring Cloud");
	        System.out.println();

	        System.out.println("7. Reactive Programming with Project Reactor:");
	        System.out.println("   - Description: Experts adopt reactive programming paradigms using Project Reactor, handling asynchronous and event-driven scenarios efficiently.");
	        System.out.println("   - Example:");
	        System.out.println("     // Building reactive systems, working with Flux and Mono");
	        System.out.println();

	        System.out.println("8. Container Orchestration with Kubernetes:");
	        System.out.println("   - Description: Experts deploy and manage Java applications in containerized environments using Kubernetes, ensuring scalability and resilience.");
	        System.out.println("   - Example:");
	        System.out.println("     // Containerizing applications, deploying to Kubernetes clusters");
	        System.out.println();

	        System.out.println("9. DevOps Practices for Java Development:");
	        System.out.println("   - Description: Experts integrate DevOps practices, implementing continuous integration, continuous delivery, and automating testing and deployment pipelines.");
	        System.out.println("   - Example:");
	        System.out.println("     // Using Jenkins, Git, Docker, and implementing CI/CD pipelines");
	        System.out.println();

	        System.out.println("10. Advanced Spring Framework Features:");
	        System.out.println("    - Description: Experts leverage advanced features of the Spring Framework, such as AOP, Spring Data, and Spring Security, for building robust and scalable applications.");
	        System.out.println("    - Example:");
	        System.out.println("      // Implementing custom aspects, integrating with various data sources");
	        System.out.println();
	    
	        String update8 = "UPDATE java SET expert = ? where email= ?";
            try (PreparedStatement update9 = krishna.prepareStatement(update8)) {
                update9.setBoolean(1, true);
                update9.setString(2, email);
                update9.executeUpdate();
            }
	        
			System.out.println("********************************************************************************************************************************");
			System.out.println("You completed 4st Stage of pyhton");
	        System.out.println("If You want to continue enter 5");
	        System.out.println("If you want to quit enter 7");
	        choice = sc.nextInt();
		}
		if(choice ==5) {
			System.out.println("***************************Specialized Java*******************************");

	        System.out.println("1. Big Data Processing with Apache Spark:");
	        System.out.println("   - Description: Specialized Java developers focus on processing large-scale data using Apache Spark, leveraging distributed computing and advanced analytics.");
	        System.out.println("   - Example:");
	        System.out.println("     // Implementing Spark applications, working with RDDs and DataFrames");
	        System.out.println();

	        System.out.println("2. Natural Language Processing with Java NLP Libraries:");
	        System.out.println("   - Description: Specialized Java developers work on language processing tasks using NLP libraries like Apache OpenNLP or Stanford NLP.");
	        System.out.println("   - Example:");
	        System.out.println("     // Tokenization, named entity recognition, sentiment analysis, etc.");
	        System.out.println();

	        System.out.println("3. High-Performance Computing with Java and CUDA:");
	        System.out.println("   - Description: Specialized Java developers optimize performance by utilizing CUDA for GPU parallel computing in combination with Java.");
	        System.out.println("   - Example:");
	        System.out.println("     // Implementing GPU-accelerated computations with JCuda");
	        System.out.println();

	        System.out.println("4. Blockchain Development with Java:");
	        System.out.println("   - Description: Specialized Java developers work on blockchain applications, creating decentralized and secure systems using technologies like Hyperledger Fabric or Corda.");
	        System.out.println("   - Example:");
	        System.out.println("     // Smart contract development, building decentralized applications");
	        System.out.println();

	        System.out.println("5. Cloud-Native Development with Spring Cloud:");
	        System.out.println("   - Description: Specialized Java developers build cloud-native applications using Spring Cloud for distributed and scalable architectures.");
	        System.out.println("   - Example:");
	        System.out.println("     // Implementing microservices, service discovery, and cloud configurations");
	        System.out.println();

	        System.out.println("6. Android Application Development with Java:");
	        System.out.println("   - Description: Specialized Java developers create mobile applications for Android using Java, Android SDK, and other related technologies.");
	        System.out.println("   - Example:");
	        System.out.println("     // Developing Android apps, working with Activities, Fragments, etc.");
	        System.out.println();

	        System.out.println("7. IoT (Internet of Things) Development with Java:");
	        System.out.println("   - Description: Specialized Java developers work on IoT projects, connecting and managing devices using Java technologies.");
	        System.out.println("   - Example:");
	        System.out.println("     // Implementing IoT solutions, handling sensor data, and connectivity");
	        System.out.println();

	        System.out.println("8. Quantum Computing with Qiskit for Java:");
	        System.out.println("   - Description: Specialized Java developers explore quantum computing using Qiskit, integrating Java with quantum algorithms.");
	        System.out.println("   - Example:");
	        System.out.println("     // Developing quantum applications, working with qubits and quantum gates");
	        System.out.println();

	        System.out.println("9. Game Development with Java and LibGDX:");
	        System.out.println("   - Description: Specialized Java developers create games using the LibGDX framework, focusing on cross-platform development.");
	        System.out.println("   - Example:");
	        System.out.println("     // Building 2D and 3D games, handling graphics, input, and physics");
	        System.out.println();

	        System.out.println("10. Real-Time Data Streaming with Apache Kafka:");
	        System.out.println("    - Description: Specialized Java developers work on real-time data streaming solutions using Apache Kafka for scalable and fault-tolerant event-driven architectures.");
	        System.out.println("    - Example:");
	        System.out.println("      // Building Kafka producers and consumers, processing streaming data");
	   
	        String update6 = "UPDATE java SET specialized = ? where email= ?";
            try (PreparedStatement update7 = krishna.prepareStatement(update6)) {
                update7.setBoolean(1, true);
                update7.setString(2, email);
                update7.executeUpdate();
            }
	        
	        System.out.println("********************************************************************************************************************************");
			System.out.println("Write Quiz for get Certificate");
	   
		}
		if(choice ==6) {
			checking c = new checking();
			String ch = "java";
			email = c.check(email,ch);
		}
		if(choice == 7) {
			display d=new display();
			d.displays();
		}
	
	}
	

}
