package demo;

import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class php {
	Scanner sc = new Scanner(System.in);
	String email;
	public String phppro(String email3) {
		// TODO Auto-generated method stub
		email = email3;
		return email3;
	}
	public void phps() throws SQLException, IOException, URISyntaxException {
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
		
		System.out.println("When You Complete all topics you get an certificate");
		System.out.println("Enter 1 for Basic PHP");
		System.out.println("Enter 2 for Intermediate PHP");
		System.out.println("Enter 3 for Advanced PHP");
		System.out.println("Enter 4 for Expert PHP");
		System.out.println("Enter 5 for Specialized	 PHP");
		System.out.println("Enter 6 for Check the completion level");
		System.out.println("Enter 7 for leave");
		int choice = sc.nextInt();
		
		if(choice == 1) {
			System.out.println("******************************Basic PHP************************************");

	        // Heading: Syntax
	        System.out.println("1. Syntax:");
	        System.out.println("   - Description: PHP syntax is similar to C-style languages, and PHP code is embedded in HTML.");
	        System.out.println("   - Example:");
	        System.out.println("     <?php");
	        System.out.println("         echo 'Hello, PHP!';");
	        System.out.println("     ?>");
	        System.out.println();

	        // Heading: Variables
	        System.out.println("2. Variables:");
	        System.out.println("   - Description: PHP variables start with the $ sign and are loosely typed.");
	        System.out.println("   - Example:");
	        System.out.println("     $name = 'John';");
	        System.out.println("     $age = 25;");
	        System.out.println();

	        // Heading: Data Types
	        System.out.println("3. Data Types:");
	        System.out.println("   - Description: PHP supports various data types, including strings, integers, floats, booleans, and arrays.");
	        System.out.println("   - Example:");
	        System.out.println("     $message = 'Hello, World!';");
	        System.out.println("     $quantity = 10;");
	        System.out.println("     $price = 5.99;");
	        System.out.println("     $is_active = true;");
	        System.out.println();

	        // Heading: Operators
	        System.out.println("4. Operators:");
	        System.out.println("   - Description: PHP supports a range of operators, including arithmetic, comparison, and logical operators.");
	        System.out.println("   - Example:");
	        System.out.println("     $result = $quantity * $price;");
	        System.out.println("     $is_greater = ($quantity > 5) && ($price < 10);");
	        System.out.println();

	        // Heading: Conditional Statements
	        System.out.println("5. Conditional Statements:");
	        System.out.println("   - Description: PHP supports if, else if, and else statements for conditional execution.");
	        System.out.println("   - Example:");
	        System.out.println("     $score = 85;");
	        System.out.println("     if ($score >= 90) {");
	        System.out.println("         echo 'Excellent!';");
	        System.out.println("     } elseif ($score >= 70) {");
	        System.out.println("         echo 'Good!';");
	        System.out.println("     } else {");
	        System.out.println("         echo 'Needs improvement.';");
	        System.out.println("     }");
	        System.out.println();

	        // Heading: Loops
	        System.out.println("6. Loops:");
	        System.out.println("   - Description: PHP supports for, while, and do-while loops for iteration.");
	        System.out.println("   - Example:");
	        System.out.println("     for ($i = 1; $i <= 5; $i++) {");
	        System.out.println("         echo $i . ' ';");
	        System.out.println("     }");
	        System.out.println();

	        // Heading: Functions
	        System.out.println("7. Functions:");
	        System.out.println("   - Description: Functions in PHP are defined using the function keyword.");
	        System.out.println("   - Example:");
	        System.out.println("     function greet($name) {");
	        System.out.println("         echo 'Hello, ' . $name . '!';");
	        System.out.println("     }");
	        System.out.println("     greet('Alice');");
	        System.out.println();

	        // Heading: Arrays
	        System.out.println("8. Arrays:");
	        System.out.println("   - Description: PHP supports both indexed and associative arrays.");
	        System.out.println("   - Example:");
	        System.out.println("     $numbers = [1, 2, 3, 4, 5];");
	        System.out.println("     $person = ['name' => 'Bob', 'age' => 30];");
	        System.out.println();

	        // Heading: Strings
	        System.out.println("9. Strings:");
	        System.out.println("   - Description: PHP provides various functions for string manipulation.");
	        System.out.println("   - Example:");
	        System.out.println("     $message = 'Welcome to PHP!';");
	        System.out.println("     echo strlen($message);");
	        System.out.println();

	        // Heading: Comments
	        System.out.println("10. Comments:");
	        System.out.println("    - Description: PHP supports both single-line (//) and multi-line (/* ... */) comments.");
	        System.out.println("    - Example:");
	        System.out.println("      // This is a comment");
	        
	        String update2 = "UPDATE php SET basic = ? where email = ?";
            try (PreparedStatement update3 = krishna.prepareStatement(update2)) {
                update3.setBoolean(1, true);
                update3.setString(2, email);
                update3.executeUpdate();
            }
	        
	        System.out.println("********************************************************************************************************************************");
	        System.out.println("You completed 1st Stage of PHP");
	        System.out.println("If You want to continue enter 2");
	        System.out.println("If you want to quit enter 7");
	        choice = sc.nextInt();
		}
		if(choice ==2) {
			System.out.println("**************************Intermediate PHP********************************");

	        // Heading: Object-Oriented Programming (OOP)
	        System.out.println("1. Object-Oriented Programming (OOP):");
	        System.out.println("   - Description: PHP supports OOP principles, including classes, objects, inheritance, and polymorphism.");
	        System.out.println("   - Example:");
	        System.out.println("     class Animal {");
	        System.out.println("         protected $name;");
	        System.out.println("         public function __construct($name) {");
	        System.out.println("             $this->name = $name;");
	        System.out.println("         }");
	        System.out.println("     }");
	        System.out.println("     class Dog extends Animal {");
	        System.out.println("         public function bark() {");
	        System.out.println("             echo 'Woof!';");
	        System.out.println("         }");
	        System.out.println("     }");
	        System.out.println("     $myDog = new Dog('Buddy');");
	        System.out.println("     $myDog->bark();");
	        System.out.println();

	        // Heading: Exception Handling
	        System.out.println("2. Exception Handling:");
	        System.out.println("   - Description: PHP provides try-catch blocks for handling exceptions.");
	        System.out.println("   - Example:");
	        System.out.println("     try {");
	        System.out.println("         $result = 10 / 0;");
	        System.out.println("     } catch (Exception $e) {");
	        System.out.println("         echo 'Error: ' . $e->getMessage();");
	        System.out.println("     }");
	        System.out.println();

	        // Heading: File Handling
	        System.out.println("3. File Handling:");
	        System.out.println("   - Description: PHP has functions for reading, writing, and manipulating files.");
	        System.out.println("   - Example:");
	        System.out.println("     $fileContent = file_get_contents('example.txt');");
	        System.out.println("     file_put_contents('output.txt', 'New content');");
	        System.out.println();

	        // Heading: MySQL Database Interaction
	        System.out.println("4. MySQL Database Interaction:");
	        System.out.println("   - Description: PHP can interact with MySQL databases using MySQLi or PDO.");
	        System.out.println("   - Example:");
	        System.out.println("     $conn = new mysqli('localhost', 'username', 'password', 'database');");
	        System.out.println("     $result = $conn->query('SELECT * FROM users');");
	        System.out.println("     while ($row = $result->fetch_assoc()) {");
	        System.out.println("         echo 'Name: ' . $row['name'];");
	        System.out.println("     }");
	        System.out.println();

	        // Heading: Cookies and Sessions
	        System.out.println("5. Cookies and Sessions:");
	        System.out.println("   - Description: PHP provides mechanisms for handling cookies and sessions for state management.");
	        System.out.println("   - Example:");
	        System.out.println("     // Setting a cookie");
	        System.out.println("     setcookie('user', 'John', time() + (86400 * 30), '/');");
	        System.out.println("     // Starting a session");
	        System.out.println("     session_start();");
	        System.out.println("     $_SESSION['user_id'] = 123;");
	        System.out.println();

	        // Heading: Regular Expressions
	        System.out.println("6. Regular Expressions:");
	        System.out.println("   - Description: PHP supports regular expressions for pattern matching in strings.");
	        System.out.println("   - Example:");
	        System.out.println("     $pattern = '/\\b(\\w+)\\b/';");
	        System.out.println("     preg_match($pattern, 'Hello, PHP!', $matches);");
	        System.out.println("     print_r($matches);");
	        System.out.println();

	        // Heading: Sending Email with PHPMailer
	        System.out.println("7. Sending Email with PHPMailer:");
	        System.out.println("   - Description: PHPMailer is a popular library for sending emails in PHP.");
	        System.out.println("   - Example:");
	        System.out.println("     require 'vendor/autoload.php';");
	        System.out.println("     $mail = new PHPMailer\\PHPMailer\\PHPMailer();");
	        System.out.println("     // Email configuration and content");
	        System.out.println("     $mail->send();");
	        System.out.println();

	        // Heading: RESTful API Development
	        System.out.println("8. RESTful API Development:");
	        System.out.println("   - Description: PHP can be used to create RESTful APIs for communication between applications.");
	        System.out.println("   - Example:");
	        System.out.println("     // API endpoint handling");
	        System.out.println();

	        // Heading: Composer for Dependency Management
	        System.out.println("9. Composer for Dependency Management:");
	        System.out.println("   - Description: Composer is a dependency manager for PHP, used for managing libraries and packages.");
	        System.out.println("   - Example:");
	        System.out.println("     // Installing and autoloading dependencies");
	        System.out.println();

	        // Heading: Templating Engines (e.g., Twig)
	        System.out.println("10. Templating Engines (e.g., Twig):");
	        System.out.println("    - Description: Templating engines like Twig provide a clean separation of PHP and HTML.");
	        System.out.println("    - Example:");
	        System.out.println("      // Twig template rendering");
	        System.out.println();
	   
	        String update = "UPDATE php SET intermediate = ? where email = ?";
            try (PreparedStatement update1 = krishna.prepareStatement(update)) {
                update1.setBoolean(1,true);
                update1.setString(2,email);
                update1.executeUpdate();
            }
	        
			System.out.println("********************************************************************************************************************************");
			System.out.println("You completed 2nd Stage of PHP");
	        System.out.println("If You want to continue enter 3");
	        System.out.println("If you want to quit enter 7");
	        choice = sc.nextInt();
		}
		if(choice ==3) {
			System.out.println("***************************Advanced PHP*************************************");

	        // Heading: Laravel Framework
	        System.out.println("1. Laravel Framework:");
	        System.out.println("   - Description: Laravel is a popular PHP framework that follows the MVC architectural pattern.");
	        System.out.println("   - Example:");
	        System.out.println("     // Laravel route definition");
	        System.out.println("     Route::get('/welcome', 'WelcomeController@index');");
	        System.out.println();

	        // Heading: Composer Packages (e.g., Symfony)
	        System.out.println("2. Composer Packages (e.g., Symfony):");
	        System.out.println("   - Description: Symfony components and other Composer packages provide reusable libraries for PHP development.");
	        System.out.println("   - Example:");
	        System.out.println("     // Symfony HTTP client usage");
	        System.out.println("     use Symfony\\Component\\HttpClient\\HttpClient;");
	        System.out.println("     $client = HttpClient::create();");
	        System.out.println();

	        // Heading: Dependency Injection
	        System.out.println("3. Dependency Injection:");
	        System.out.println("   - Description: Dependency injection is a design pattern used in PHP for achieving Inversion of Control (IoC).");
	        System.out.println("   - Example:");
	        System.out.println("     // Using a dependency injection container");
	        System.out.println("     $container->get('some_service');");
	        System.out.println();

	        // Heading: Middleware in PHP
	        System.out.println("4. Middleware in PHP:");
	        System.out.println("   - Description: Middleware provides a way to filter HTTP requests entering the application.");
	        System.out.println("   - Example:");
	        System.out.println("     // Creating a middleware class");
	        System.out.println("     class MyMiddleware {");
	        System.out.println("         public function handle($request, $next) {");
	        System.out.println("             // Middleware logic");
	        System.out.println("             return $next($request);");
	        System.out.println("         }");
	        System.out.println("     }");
	        System.out.println();

	        // Heading: GraphQL in PHP (e.g., GraphQLite)
	        System.out.println("5. GraphQL in PHP (e.g., GraphQLite):");
	        System.out.println("   - Description: GraphQLite is a library for adding GraphQL functionality to PHP applications.");
	        System.out.println("   - Example:");
	        System.out.println("     // Defining a GraphQL schema");
	        System.out.println("     class Query {");
	        System.out.println("         #[Query]");
	        System.out.println("         public function hello(): string {");
	        System.out.println("             return 'Hello, GraphQL!';");
	        System.out.println("         }");
	        System.out.println("     }");
	        System.out.println();

	        // Heading: Unit Testing with PHPUnit
	        System.out.println("6. Unit Testing with PHPUnit:");
	        System.out.println("   - Description: PHPUnit is a unit testing framework for PHP.");
	        System.out.println("   - Example:");
	        System.out.println("     // PHPUnit test case");
	        System.out.println("     class MyTest extends PHPUnit\\Framework\\TestCase {");
	        System.out.println("         public function testAddition() {");
	        System.out.println("             $this->assertEquals(4, 2 + 2);");
	        System.out.println("         }");
	        System.out.println("     }");
	        System.out.println();

	        // Heading: Laravel Eloquent ORM
	        System.out.println("7. Laravel Eloquent ORM:");
	        System.out.println("   - Description: Eloquent is an ORM included with Laravel for working with databases using ActiveRecord implementation.");
	        System.out.println("   - Example:");
	        System.out.println("     // Eloquent model");
	        System.out.println("     class User extends Model {");
	        System.out.println("         // Model definition");
	        System.out.println("     }");
	        System.out.println();

	        // Heading: WebSockets in PHP (e.g., Ratchet)
	        System.out.println("8. WebSockets in PHP (e.g., Ratchet):");
	        System.out.println("   - Description: Ratchet is a PHP library for adding WebSocket support to your applications.");
	        System.out.println("   - Example:");
	        System.out.println("     // Ratchet WebSocket server");
	        System.out.println("     use Ratchet\\WebSocket\\WsServer;");
	        System.out.println("     $server = IoServer::factory(new WsServer(new MyWebSocket()), 8080);");
	        System.out.println("     $server->run();");
	        System.out.println();

	        // Heading: Security Best Practices
	        System.out.println("9. Security Best Practices:");
	        System.out.println("   - Description: Advanced PHP development includes adherence to security best practices, such as input validation and secure coding.");
	        System.out.println("   - Example:");
	        System.out.println("     // Sanitizing user input");
	        System.out.println("     $input = filter_input(INPUT_POST, 'user_input', FILTER_SANITIZE_STRING);");
	        System.out.println();

	        // Heading: Asynchronous PHP (e.g., Amp)
	        System.out.println("10. Asynchronous PHP (e.g., Amp):");
	        System.out.println("    - Description: Amp is a library for asynchronous programming in PHP.");
	        System.out.println("    - Example:");
	        System.out.println("      // Asynchronous code using Amp");
	        System.out.println();
	    
	        String update4 = "UPDATE php SET advance = ? where email = ?";
            try (PreparedStatement update5 = krishna.prepareStatement(update4)) {
                update5.setBoolean(1, true);
                update5.setString(2, email);
                update5.executeUpdate();
            }
	        
			System.out.println("********************************************************************************************************************************");
	        System.out.println("You completed 3rd Stage of PHP");
	        System.out.println("If You want to continue enter 4");
	        System.out.println("If you want to quit enter 7");
	        choice = sc.nextInt();
		}
		if(choice ==4) {
			System.out.println("***************************Expert PHP***************************************");

	        // Heading: Microservices Architecture with Lumen
	        System.out.println("1. Microservices Architecture with Lumen:");
	        System.out.println("   - Description: Lumen is a micro-framework by Laravel designed for building fast and efficient microservices.");
	        System.out.println("   - Example:");
	        System.out.println("     // Lumen route definition");
	        System.out.println("     $router->get('/api/resource', 'ExampleController@index');");
	        System.out.println();

	        // Heading: Swoole for High-Performance PHP
	        System.out.println("2. Swoole for High-Performance PHP:");
	        System.out.println("   - Description: Swoole is an extension for asychronous, parallel, and high-performance PHP applications.");
	        System.out.println("   - Example:");
	        System.out.println("     // Swoole server setup");
	        System.out.println("     $server = new Swoole\\HTTP\\Server('127.0.0.1', 9501);");
	        System.out.println("     $server->on('Request', function ($request, $response) {");
	        System.out.println("         $response->end('Hello, Swoole!');");
	        System.out.println("     });");
	        System.out.println();

	        // Heading: PHP Design Patterns
	        System.out.println("3. PHP Design Patterns:");
	        System.out.println("   - Description: Implementing design patterns like Singleton, Factory, and Observer for robust and maintainable code.");
	        System.out.println("   - Example:");
	        System.out.println("     // Singleton design pattern");
	        System.out.println("     class Singleton {");
	        System.out.println("         private static $instance;");
	        System.out.println("         private function __construct() {}");
	        System.out.println("         public static function getInstance() {");
	        System.out.println("             if (!self::$instance) {");
	        System.out.println("                 self::$instance = new self();");
	        System.out.println("             }");
	        System.out.println("             return self::$instance;");
	        System.out.println("         }");
	        System.out.println("     }");
	        System.out.println();

	        // Heading: Domain-Driven Design (DDD)
	        System.out.println("4. Domain-Driven Design (DDD):");
	        System.out.println("   - Description: Applying DDD principles for modeling complex business domains in PHP applications.");
	        System.out.println("   - Example:");
	        System.out.println("     // DDD Aggregate root and entities");
	        System.out.println("     class Order {");
	        System.out.println("         private $items = [];");
	        System.out.println("         public function addItem(Item $item) {");
	        System.out.println("             $this->items[] = $item;");
	        System.out.println("         }");
	        System.out.println("     }");
	        System.out.println();

	        // Heading: High-Performance Database Optimization
	        System.out.println("5. High-Performance Database Optimization:");
	        System.out.println("   - Description: Advanced techniques for optimizing database queries and interactions.");
	        System.out.println("   - Example:");
	        System.out.println("     // Database indexing and query optimization");
	        System.out.println("     CREATE INDEX idx_username ON users(username);");
	        System.out.println("     SELECT * FROM users WHERE username = 'john_doe';");
	        System.out.println();

	        // Heading: Continuous Integration and Deployment (CI/CD)
	        System.out.println("6. Continuous Integration and Deployment (CI/CD):");
	        System.out.println("   - Description: Implementing CI/CD pipelines for automated testing, building, and deployment.");
	        System.out.println("   - Example:");
	        System.out.println("     // CI/CD configuration file (e.g., .gitlab-ci.yml)");
	        System.out.println("     stages:");
	        System.out.println("       - test");
	        System.out.println("       - deploy");
	        System.out.println("     // CI/CD jobs");
	        System.out.println("     test:");
	        System.out.println("       script: 'phpunit'");
	        System.out.println("     deploy:");
	        System.out.println("       script: 'deploy.sh'");
	        System.out.println();

	        // Heading: GraphQL Subscriptions with WebSockets
	        System.out.println("7. GraphQL Subscriptions with WebSockets:");
	        System.out.println("   - Description: Implementing real-time updates in GraphQL using subscriptions and WebSockets.");
	        System.out.println("   - Example:");
	        System.out.println("     // GraphQL subscription resolver");
	        System.out.println("     class Subscription {");
	        System.out.println("         #[Subscription(type: 'MessageType')]");
	        System.out.println("         public function onMessage() {");
	        System.out.println("             // Subscription logic");
	        System.out.println("         }");
	        System.out.println("     }");
	        System.out.println();

	        // Heading: Event-Driven Architecture
	        System.out.println("8. Event-Driven Architecture:");
	        System.out.println("   - Description: Implementing event-driven systems for handling asynchronous communication between services.");
	        System.out.println("   - Example:");
	        System.out.println("     // Event dispatcher and listener");
	        System.out.println("     $dispatcher->addListener('some.event', function (Event $event) {");
	        System.out.println("         // Event handling logic");
	        System.out.println("     });");
	        System.out.println();

	        // Heading: Advanced Security Practices
	        System.out.println("9. Advanced Security Practices:");
	        System.out.println("   - Description: Implementing advanced security practices, including secure session management and encryption.");
	        System.out.println("   - Example:");
	        System.out.println("     // Encrypting sensitive data");
	        System.out.println("     $encryptedData = encrypt($data, $encryptionKey);");
	        System.out.println();

	        // Heading: Performance Monitoring with New Relic
	        System.out.println("10. Performance Monitoring with New Relic:");
	        System.out.println("    - Description: Using New Relic for monitoring and optimizing PHP application performance.");
	        System.out.println("    - Example:");
	        System.out.println("      // New Relic PHP agent configuration");
	        System.out.println("      newrelic_set_appname('My PHP App');");
	        System.out.println();
	   
	        String update8 = "UPDATE php SET expert = ? where email= ?";
            try (PreparedStatement update9 = krishna.prepareStatement(update8)) {
                update9.setBoolean(1, true);
                update9.setString(2, email);
                update9.executeUpdate();
            }
	        
			System.out.println("********************************************************************************************************************************");
			System.out.println("You completed 4th Stage of PHP");
	        System.out.println("If You want to continue enter 5");
	        System.out.println("If you want to quit enter 7");
	        choice = sc.nextInt();
		}
		if(choice == 5) {
			System.out.println("*************************Specialized PHP************************************");

	        // Heading: Laravel Horizon for Job Queue Management
	        System.out.println("1. Laravel Horizon for Job Queue Management:");
	        System.out.println("   - Description: Laravel Horizon provides a beautiful dashboard and code-driven configuration for managing Laravel job queues.");
	        System.out.println("   - Example:");
	        System.out.println("     // Laravel job definition");
	        System.out.println("     php artisan make:job ProcessPodcast");
	        System.out.println();

	        // Heading: Symfony Messenger Component
	        System.out.println("2. Symfony Messenger Component:");
	        System.out.println("   - Description: The Symfony Messenger component simplifies the handling of messages and the delivery of events.");
	        System.out.println("   - Example:");
	        System.out.println("     // Symfony Messenger command bus");
	        System.out.println("     $bus = $this->container->get('command.bus');");
	        System.out.println();

	        // Heading: Laravel Passport for API Authentication
	        System.out.println("3. Laravel Passport for API Authentication:");
	        System.out.println("   - Description: Laravel Passport provides a full OAuth2 server implementation for API authentication in Laravel applications.");
	        System.out.println("   - Example:");
	        System.out.println("     // Laravel Passport API routes");
	        System.out.println("     Route::middleware('auth:api')->get('/user', function (Request $request) {");
	        System.out.println("         return $request->user();");
	        System.out.println("     });");
	        System.out.println();

	        // Heading: PHPLucene for Full-Text Search
	        System.out.println("4. PHPLucene for Full-Text Search:");
	        System.out.println("   - Description: PHPLucene is a PHP port of the Apache Lucene search engine library for powerful full-text searching.");
	        System.out.println("   - Example:");
	        System.out.println("     // PHPLucene index creation and search");
	        System.out.println("     $index = new ZendSearch\\Lucene\\Index('./index');");
	        System.out.println();

	        // Heading: Laravel Telescope for Application Debugging
	        System.out.println("5. Laravel Telescope for Application Debugging:");
	        System.out.println("   - Description: Laravel Telescope is an elegant debug assistant for Laravel applications, providing insights into requests, exceptions, and more.");
	        System.out.println("   - Example:");
	        System.out.println("     // Laravel Telescope installation");
	        System.out.println("     composer require laravel/telescope");
	        System.out.println("     php artisan telescope:install");
	        System.out.println();

	        // Heading: CodeIgniter RestServer for RESTful APIs
	        System.out.println("6. CodeIgniter RestServer for RESTful APIs:");
	        System.out.println("   - Description: CodeIgniter RestServer is a fully RESTful server implementation for CodeIgniter applications.");
	        System.out.println("   - Example:");
	        System.out.println("     // CodeIgniter controller for RESTful API");
	        System.out.println("     class Api extends CI_Controller {");
	        System.out.println("         // Controller methods");
	        System.out.println("     }");
	        System.out.println();

	        // Heading: Laravel Echo for Real-Time Events
	        System.out.println("7. Laravel Echo for Real-Time Events:");
	        System.out.println("   - Description: Laravel Echo simplifies the implementation of WebSocket and broadcasting features for real-time event handling.");
	        System.out.println("   - Example:");
	        System.out.println("     // Laravel Echo event broadcasting");
	        System.out.println("     broadcast(new OrderShipped($order));");
	        System.out.println();

	        // Heading: Twig Templating Engine for Symfony
	        System.out.println("8. Twig Templating Engine for Symfony:");
	        System.out.println("   - Description: Twig is a flexible, fast, and secure templating engine for PHP, commonly used in Symfony applications.");
	        System.out.println("   - Example:");
	        System.out.println("     // Symfony Twig template rendering");
	        System.out.println("     return $this->render('index.html.twig', ['variable' => $value]);");
	        System.out.println();

	        // Heading: Laravel Mix for Asset Compilation
	        System.out.println("9. Laravel Mix for Asset Compilation:");
	        System.out.println("   - Description: Laravel Mix simplifies the compilation and management of assets like JavaScript and CSS in Laravel projects.");
	        System.out.println("   - Example:");
	        System.out.println("     // Laravel Mix asset compilation");
	        System.out.println("     mix.js('resources/js/app.js', 'public/js');");
	        System.out.println();

	        // Heading: Laravel Nova for Administration Panels
	        System.out.println("10. Laravel Nova for Administration Panels:");
	        System.out.println("    - Description: Laravel Nova is a beautifully designed administration panel for managing resources in Laravel applications.");
	        System.out.println("    - Example:");
	        System.out.println("      // Laravel Nova resource definition");
	        System.out.println("      class User extends Resource {");
	        System.out.println("          // Resource fields and cards");
	        System.out.println("      }");
	        System.out.println();
			
	        String update6 = "UPDATE php SET specialized = ? where email= ?";
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
			String ch = "php";
			email = c.check(email,ch);
		}
		if(choice == 7) {
			display d=new display();
			d.displays();
		}
	}
	
	

}
