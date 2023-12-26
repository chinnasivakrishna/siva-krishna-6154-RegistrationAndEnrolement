package demo;

import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class python {
	Scanner sc = new Scanner(System.in);
	String email;
	public String pythonspro(String email1) {
		// TODO Auto-generated method stub
		email = email1;
		return email1;
	}
	public void pythons() throws SQLException, IOException, URISyntaxException {
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
		System.out.println("Enter 1 for Basic Python");
		System.out.println("Enter 2 for Intermediate Python");
		System.out.println("Enter 3 for Advanced Python");
		System.out.println("Enter 4 for Expert Python");
		System.out.println("Enter 5 for Specialized Python");
		System.out.println("Enter 6 for Check the completion level");
	
		System.out.println("Enter 7 for leave");
		int choice = sc.nextInt();
		if(choice ==1) {
			System.out.println("******************************Basic Python*******************************");

	        // Heading: Syntax
	        System.out.println("1. Syntax:");
	        System.out.println("   - Description: Python syntax emphasizes indentation using spaces or tabs for block structures.");
	        System.out.println("   - Example:");
	        System.out.println("     if True:");
	        System.out.println("         print(\"This is indented code.\")");
	        System.out.println();

	        // Heading: Data Types
	        System.out.println("2. Data Types:");
	        System.out.println("   - Description: Python has dynamic typing and supports various built-in data types, including int, float, str, bool, and more.");
	        System.out.println("   - Example:");
	        System.out.println("     age = 25");
	        System.out.println("     name = \"John\"");
	        System.out.println("     height = 5.9");
	        System.out.println();

	        // Heading: Variables and Assignment
	        System.out.println("3. Variables and Assignment:");
	        System.out.println("   - Description: Variables are used to store values, and assignment is done using the '=' operator.");
	        System.out.println("   - Example:");
	        System.out.println("     x = 10");
	        System.out.println("     y = \"Hello\"");
	        System.out.println();

	        // Heading: Input and Output
	        System.out.println("4. Input and Output:");
	        System.out.println("   - Description: User input can be taken using the input() function, and print() is used for output.");
	        System.out.println("   - Example:");
	        System.out.println("     name = input(\"Enter your name: \")");
	        System.out.println("     print(\"Hello, \" + name + \"!\")");
	        System.out.println();

	        // Heading: Control Structures
	        System.out.println("5. Control Structures:");
	        System.out.println("   - Description: Python supports common control structures such as if statements and loops (for and while).");
	        System.out.println("   - Example:");
	        System.out.println("     age = 20");
	        System.out.println("     if age >= 18:");
	        System.out.println("         print(\"You are an adult.\")");
	        System.out.println();

	        // Heading: Functions
	        System.out.println("6. Functions:");
	        System.out.println("   - Description: Functions are defined using the 'def' keyword and can return values using the 'return' statement.");
	        System.out.println("   - Example:");
	        System.out.println("     def greet(name):");
	        System.out.println("         print(\"Hello, \" + name + \"!\")");
	        System.out.println("     greet(\"Alice\")");
	        System.out.println();

	        // Heading: Lists
	        System.out.println("7. Lists:");
	        System.out.println("   - Description: Lists are ordered collections and can contain elements of different data types.");
	        System.out.println("   - Example:");
	        System.out.println("     numbers = [1, 2, 3, 4, 5]");
	        System.out.println();

	        // Heading: Loops
	        System.out.println("8. Loops:");
	        System.out.println("   - Description: Loops are used to iterate over sequences. The 'for' loop is commonly used.");
	        System.out.println("   - Example:");
	        System.out.println("     for number in numbers:");
	        System.out.println("         print(number)");
	        System.out.println();

	        // Heading: Strings
	        System.out.println("9. Strings:");
	        System.out.println("   - Description: Strings are sequences of characters. They can be manipulated using various string methods.");
	        System.out.println("   - Example:");
	        System.out.println("     message = \"Hello, World!\"");
	        System.out.println();

	        // Heading: Comments
	        System.out.println("10. Comments:");
	        System.out.println("    - Description: Comments in Python start with # for single-line comments.");
	        System.out.println("    - Example:");
	        System.out.println("      # This is a comment");
	        
	        String update2 = "UPDATE python SET basic = ? where email = ?";
            try (PreparedStatement update3 = krishna.prepareStatement(update2)) {
                update3.setBoolean(1, true);
                update3.setString(2, email);
                update3.executeUpdate();
            }
	        
	        System.out.println("********************************************************************************************************************************");
	        System.out.println("You completed 1st Stage of pyhton");
	        System.out.println("If You want to continue enter 2");
	        System.out.println("If you want to quit enter 7");
	        choice = sc.nextInt();
		}
		if (choice == 2) {
			System.out.println("***************************Intermediate Python****************************");

	        // Heading: Object-Oriented Programming (OOP)
	        System.out.println("1. Object-Oriented Programming (OOP):");
	        System.out.println("   - Description: Python supports OOP principles, including classes, objects, inheritance, and polymorphism.");
	        System.out.println("   - Example:");
	        System.out.println("     class Animal:");
	        System.out.println("         def __init__(self, name):");
	        System.out.println("             self.name = name");
	        System.out.println();
	        System.out.println("     class Dog(Animal):");
	        System.out.println("         def sound(self):");
	        System.out.println("             print(\"Woof!\")");
	        System.out.println("     my_dog = Dog(\"Buddy\")");
	        System.out.println("     my_dog.sound()");
	        System.out.println();

	        // Heading: Exception Handling
	        System.out.println("2. Exception Handling:");
	        System.out.println("   - Description: Python uses try-except blocks for handling exceptions.");
	        System.out.println("   - Example:");
	        System.out.println("     try:");
	        System.out.println("         result = 10 / 0");
	        System.out.println("     except ZeroDivisionError:");
	        System.out.println("         print(\"Division by zero is not allowed.\")");
	        System.out.println();

	        // Heading: File Handling
	        System.out.println("3. File Handling:");
	        System.out.println("   - Description: Python provides built-in functions for reading and writing files.");
	        System.out.println("   - Example:");
	        System.out.println("     with open('example.txt', 'w') as file:");
	        System.out.println("         file.write('Hello, Python!')");
	        System.out.println("     with open('example.txt', 'r') as file:");
	        System.out.println("         content = file.read()");
	        System.out.println();

	        // Heading: List Comprehensions
	        System.out.println("4. List Comprehensions:");
	        System.out.println("   - Description: List comprehensions provide a concise way to create lists in Python.");
	        System.out.println("   - Example:");
	        System.out.println("     numbers = [1, 2, 3, 4, 5]");
	        System.out.println("     squared_numbers = [x**2 for x in numbers]");
	        System.out.println();

	        // Heading: Decorators
	        System.out.println("5. Decorators:");
	        System.out.println("   - Description: Decorators allow the modification of functions or methods at the time of definition.");
	        System.out.println("   - Example:");
	        System.out.println("     def my_decorator(func):");
	        System.out.println("         def wrapper():");
	        System.out.println("             print(\"Something is happening before the function is called.\")");
	        System.out.println("             func()");
	        System.out.println("             print(\"Something is happening after the function is called.\")");
	        System.out.println("         return wrapper");
	        System.out.println();

	        // Heading: Virtual Environments
	        System.out.println("6. Virtual Environments:");
	        System.out.println("   - Description: Virtual environments are used to manage project-specific dependencies.");
	        System.out.println("   - Example:");
	        System.out.println("     python -m venv myenv");
	        System.out.println("     source myenv/bin/activate");
	        System.out.println();

	        // Heading: Regular Expressions
	        System.out.println("7. Regular Expressions:");
	        System.out.println("   - Description: Python supports regular expressions for pattern matching in strings.");
	        System.out.println("   - Example:");
	        System.out.println("     import re");
	        System.out.println("     pattern = re.compile(r\\\b(\\w+)\\\b)");
	        System.out.println();

	        // Heading: Lambda Functions
	        System.out.println("8. Lambda Functions:");
	        System.out.println("   - Description: Lambda functions are anonymous functions defined using the 'lambda' keyword.");
	        System.out.println("   - Example:");
	        System.out.println("     square = lambda x: x**2");
	        System.out.println();

	        // Heading: Threading and Multiprocessing
	        System.out.println("9. Threading and Multiprocessing:");
	        System.out.println("   - Description: Python supports threading and multiprocessing for concurrent execution.");
	        System.out.println("   - Example:");
	        System.out.println("     import threading");
	        System.out.println("     def print_numbers():");
	        System.out.println("         for i in range(5):");
	        System.out.println("             print(i)");
	        System.out.println("     thread = threading.Thread(target=print_numbers)");
	        System.out.println();

	        // Heading: Web Frameworks (e.g., Django, Flask)
	        System.out.println("10. Web Frameworks (e.g., Django, Flask):");
	        System.out.println("    - Description: Python has robust web frameworks for building web applications.");
	        System.out.println("    - Example:");
	        System.out.println("      # Flask Example");
	        System.out.println("      from flask import Flask");
	        System.out.println("      app = Flask(__name__)");
	        System.out.println("      @app.route('/')");
	        System.out.println("      def hello_world():");
	        System.out.println("          return 'Hello, World!'");
	    	
	        String update = "UPDATE python SET intermediate = ? where email = ?";
            try (PreparedStatement update1 = krishna.prepareStatement(update)) {
                update1.setBoolean(1,true);
                update1.setString(2,email);
                update1.executeUpdate();
            }
	        
	        System.out.println("********************************************************************************************************************************");
	        System.out.println("You completed 2st Stage of pyhton");
	        System.out.println("If You want to continue enter 3");
	        System.out.println("If you want to quit enter 7");
	        choice = sc.nextInt();
		}
		if(choice == 3) {
			System.out.println("***************************Advanced Python*******************************");

	        // Heading: Generators
	        System.out.println("1. Generators:");
	        System.out.println("   - Description: Generators allow lazy evaluation of values, providing an efficient way to handle large data sets.");
	        System.out.println("   - Example:");
	        System.out.println("     def fibonacci_generator():");
	        System.out.println("         a, b = 0, 1");
	        System.out.println("         while True:");
	        System.out.println("             yield a");
	        System.out.println("             a, b = b, a + b");
	        System.out.println();

	        // Heading: Metaclasses
	        System.out.println("2. Metaclasses:");
	        System.out.println("   - Description: Metaclasses allow the customization of class creation in Python.");
	        System.out.println("   - Example:");
	        System.out.println("     class MyMeta(type):");
	        System.out.println("         def __new__(cls, name, bases, dct):");
	        System.out.println("             # Custom class creation logic here");
	        System.out.println();

	        // Heading: Context Managers
	        System.out.println("3. Context Managers:");
	        System.out.println("   - Description: Context managers are used with the 'with' statement to manage resources.");
	        System.out.println("   - Example:");
	        System.out.println("     with open('file.txt', 'r') as file:");
	        System.out.println("         content = file.read()");
	        System.out.println();

	        // Heading: Decorator Classes
	        System.out.println("4. Decorator Classes:");
	        System.out.println("   - Description: Decorator classes are classes used to decorate functions or methods.");
	        System.out.println("   - Example:");
	        System.out.println("     class MyDecorator:");
	        System.out.println("         def __init__(self, func):");
	        System.out.println("             self.func = func");
	        System.out.println("         def __call__(self, *args, **kwargs):");
	        System.out.println("             # Decorator logic here");
	        System.out.println();

	        // Heading: Asynchronous Programming (async/await)
	        System.out.println("5. Asynchronous Programming (async/await):");
	        System.out.println("   - Description: Asynchronous programming allows non-blocking execution of code.");
	        System.out.println("   - Example:");
	        System.out.println("     import asyncio");
	        System.out.println("     async def example_coroutine():");
	        System.out.println("         # Asynchronous code here");
	        System.out.println("     asyncio.run(example_coroutine())");
	        System.out.println();

	        // Heading: Type Annotations
	        System.out.println("6. Type Annotations:");
	        System.out.println("   - Description: Type annotations provide a way to specify variable types in Python.");
	        System.out.println("   - Example:");
	        System.out.println("     def add_numbers(a: int, b: int) -> int:");
	        System.out.println("         return a + b");
	        System.out.println();

	        // Heading: Data Classes
	        System.out.println("7. Data Classes:");
	        System.out.println("   - Description: Data classes provide a concise way to create classes for storing data.");
	        System.out.println("   - Example:");
	        System.out.println("     from dataclasses import dataclass");
	        System.out.println("     @dataclass");
	        System.out.println("     class Point:");
	        System.out.println("         x: int");
	        System.out.println("         y: int");
	        System.out.println();

	        // Heading: Multiple Inheritance and Mixins
	        System.out.println("8. Multiple Inheritance and Mixins:");
	        System.out.println("   - Description: Python supports multiple inheritance and mixins to create reusable components.");
	        System.out.println("   - Example:");
	        System.out.println("     class A:");
	        System.out.println("         # Class A definition");
	        System.out.println("     class B:");
	        System.out.println("         # Class B definition");
	        System.out.println("     class C(A, B):");
	        System.out.println("         # Class C with multiple inheritance");
	        System.out.println();

	        // Heading: Design Patterns
	        System.out.println("9. Design Patterns:");
	        System.out.println("   - Description: Python supports various design patterns for solving common software design problems.");
	        System.out.println("   - Example:");
	        System.out.println("     # Singleton Design Pattern");
	        System.out.println("     class Singleton:");
	        System.out.println("         _instance = None");
	        System.out.println("         def __new__(cls):");
	        System.out.println("             if cls._instance is None:");
	        System.out.println("                 cls._instance = super().__new__(cls)");
	        System.out.println("             return cls._instance");
	        System.out.println();

	        // Heading: Unit Testing
	        System.out.println("10. Unit Testing:");
	        System.out.println("    - Description: Python has a built-in 'unittest' framework for writing and running unit tests.");
	        System.out.println("    - Example:");
	        System.out.println("      import unittest");
	        System.out.println("      class TestMathOperations(unittest.TestCase):");
	        System.out.println("          def test_addition(self):");
	        System.out.println("              self.assertEqual(add(3, 4), 7)");
	    	
	        String update4 = "UPDATE python SET advance = ? where email = ?";
            try (PreparedStatement update5 = krishna.prepareStatement(update4)) {
                update5.setBoolean(1, true);
                update5.setString(2, email);
                update5.executeUpdate();
            }
	        
	        System.out.println("********************************************************************************************************************************");
	        System.out.println("You completed 3st Stage of pyhton");
	        System.out.println("If You want to continue enter 4");
	        System.out.println("If you want to quit enter 7");
	        choice = sc.nextInt();
		}
		if(choice == 4) {
			System.out.println("******************************Expert Python*********************************");

	        // Heading: Advanced Python Language Features
	        System.out.println("1. Advanced Python Language Features:");
	        System.out.println("   - Description: Experts in Python leverage advanced language features such as decorators, generators, and context managers for elegant and efficient code.");
	        System.out.println("   - Example:");
	        System.out.println("     @my_decorator");
	        System.out.println("     def my_function():");
	        System.out.println("         yield from range(10)");
	        System.out.println("         with open('file.txt', 'r') as file:");
	        System.out.println("             data = file.read()");
	        System.out.println();

	        // Heading: Metaprogramming and Reflection
	        System.out.println("2. Metaprogramming and Reflection:");
	        System.out.println("   - Description: Experts in Python use metaprogramming techniques and reflection to inspect and modify code dynamically.");
	        System.out.println("   - Example:");
	        System.out.println("     class MyClass:");
	        System.out.println("         def my_method(self):");
	        System.out.println("             pass");
	        System.out.println("     obj = MyClass()");
	        System.out.println("     method_name = 'my_method'");
	        System.out.println("     getattr(obj, method_name)()");
	        System.out.println();

	        // Heading: Asynchronous Programming with asyncio
	        System.out.println("3. Asynchronous Programming with asyncio:");
	        System.out.println("   - Description: Experts utilize asyncio for writing asynchronous code, improving the efficiency of I/O-bound operations.");
	        System.out.println("   - Example:");
	        System.out.println("     import asyncio");
	        System.out.println("     async def my_coroutine():");
	        System.out.println("         await asyncio.sleep(1)");
	        System.out.println("     asyncio.run(my_coroutine())");
	        System.out.println();

	        // Heading: Functional Programming in Python
	        System.out.println("4. Functional Programming in Python:");
	        System.out.println("   - Description: Experts apply functional programming concepts, using features like lambda functions, map, filter, and reduce.");
	        System.out.println("   - Example:");
	        System.out.println("     numbers = [1, 2, 3, 4, 5]");
	        System.out.println("     squared = list(map(lambda x: x**2, numbers))");
	        System.out.println();

	        // Heading: Decorators and Metaclasses
	        System.out.println("5. Decorators and Metaclasses:");
	        System.out.println("   - Description: Experts create and use decorators for modifying the behavior of functions and metaclasses for customizing class creation.");
	        System.out.println("   - Example:");
	        System.out.println("     def my_decorator(func):");
	        System.out.println("         def wrapper(*args, **kwargs):");
	        System.out.println("             result = func(*args, **kwargs)");
	        System.out.println("             return result.upper()");
	        System.out.println("         return wrapper");
	        System.out.println("     @my_decorator");
	        System.out.println("     def greet(name):");
	        System.out.println("         return f'Hello, {name}!'");
	        System.out.println();

	        // Heading: Design Patterns in Python
	        System.out.println("6. Design Patterns in Python:");
	        System.out.println("   - Description: Experts apply design patterns such as Singleton, Observer, and Strategy to solve common software design problems.");
	        System.out.println("   - Example:");
	        System.out.println("     class Singleton:");
	        System.out.println("         _instance = None");
	        System.out.println("         def __new__(cls):");
	        System.out.println("             if not cls._instance:");
	        System.out.println("                 cls._instance = super().__new__(cls)");
	        System.out.println();

	        // Heading: Python C Extensions
	        System.out.println("7. Python C Extensions:");
	        System.out.println("   - Description: Experts develop C extensions for Python to optimize performance-critical parts of their code.");
	        System.out.println("   - Example:");
	        System.out.println("     # Using Python C API to create C extension modules");
	        System.out.println();

	        // Heading: Unit Testing with pytest
	        System.out.println("8. Unit Testing with pytest:");
	        System.out.println("   - Description: Experts write comprehensive unit tests using the pytest framework to ensure the reliability of their Python code.");
	        System.out.println("   - Example:");
	        System.out.println("     import pytest");
	        System.out.println("     def test_addition():");
	        System.out.println("         assert 2 + 2 == 4");
	        System.out.println();

	        // Heading: Web Development with Django and Flask
	        System.out.println("9. Web Development with Django and Flask:");
	        System.out.println("   - Description: Experts build robust web applications using frameworks like Django and Flask, handling routing, templates, and database interactions.");
	        System.out.println("   - Example:");
	        System.out.println("     # Django or Flask application with views, models, and templates");
	        System.out.println();

	        // Heading: Data Science and Machine Learning
	        System.out.println("10. Data Science and Machine Learning:");
	        System.out.println("    - Description: Experts use Python for data analysis, machine learning, and deep learning, leveraging libraries like NumPy, Pandas, TensorFlow, and PyTorch.");
	        System.out.println("    - Example:");
	        System.out.println("      # Building and training machine learning models with scikit-learn or TensorFlow");
	        
	        String update8 = "UPDATE python SET expert = ? where email= ?";
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
		if(choice == 5) {
			System.out.println("*************************Specialized Python*******************************");

	        // Heading: Machine Learning with scikit-learn
	        System.out.println("1. Machine Learning with scikit-learn:");
	        System.out.println("   - Description: scikit-learn is a powerful library for machine learning in Python.");
	        System.out.println("   - Example:");
	        System.out.println("     from sklearn import datasets");
	        System.out.println("     from sklearn.model_selection import train_test_split");
	        System.out.println("     from sklearn.svm import SVC");
	        System.out.println("     iris = datasets.load_iris()");
	        System.out.println("     X_train, X_test, y_train, y_test = train_test_split(iris.data, iris.target, test_size=0.2)");
	        System.out.println("     model = SVC()");
	        System.out.println("     model.fit(X_train, y_train)");
	        System.out.println("     accuracy = model.score(X_test, y_test)");
	        System.out.println();

	        // Heading: Web Scraping with BeautifulSoup
	        System.out.println("2. Web Scraping with BeautifulSoup:");
	        System.out.println("   - Description: BeautifulSoup is a library for pulling data out of HTML and XML files.");
	        System.out.println("   - Example:");
	        System.out.println("     from bs4 import BeautifulSoup");
	        System.out.println("     import requests");
	        System.out.println("     url = 'https://example.com'");
	        System.out.println("     response = requests.get(url)");
	        System.out.println("     soup = BeautifulSoup(response.text, 'html.parser')");
	        System.out.println("     print(soup.title)");
	        System.out.println();

	        // Heading: Natural Language Processing (NLP) with NLTK
	        System.out.println("3. Natural Language Processing (NLP) with NLTK:");
	        System.out.println("   - Description: NLTK is a leading platform for building Python programs to work with human language data.");
	        System.out.println("   - Example:");
	        System.out.println("     import nltk");
	        System.out.println("     nltk.download('punkt')");
	        System.out.println("     from nltk.tokenize import word_tokenize");
	        System.out.println("     text = 'Natural Language Processing is fascinating!'");
	        System.out.println("     words = word_tokenize(text)");
	        System.out.println("     print(words)");
	        System.out.println();

	        // Heading: Web Development with Django
	        System.out.println("4. Web Development with Django:");
	        System.out.println("   - Description: Django is a high-level Python web framework that encourages rapid development and clean, pragmatic design.");
	        System.out.println("   - Example:");
	        System.out.println("     # Django Project Structure");
	        System.out.println("     # models.py");
	        System.out.println("     class Book(models.Model):");
	        System.out.println("         title = models.CharField(max_length=100)");
	        System.out.println("         author = models.CharField(max_length=50)");
	        System.out.println();

	        // Heading: Data Visualization with Matplotlib
	        System.out.println("5. Data Visualization with Matplotlib:");
	        System.out.println("   - Description: Matplotlib is a comprehensive library for creating static, animated, and interactive visualizations in Python.");
	        System.out.println("   - Example:");
	        System.out.println("     import matplotlib.pyplot as plt");
	        System.out.println("     x = [1, 2, 3, 4, 5]");
	        System.out.println("     y = [2, 4, 6, 8, 10]");
	        System.out.println("     plt.plot(x, y)");
	        System.out.println("     plt.xlabel('X-axis')");
	        System.out.println("     plt.ylabel('Y-axis')");
	        System.out.println("     plt.title('Simple Line Plot')");
	        System.out.println("     plt.show()");
	        System.out.println();

	        // Heading: Game Development with Pygame
	        System.out.println("6. Game Development with Pygame:");
	        System.out.println("   - Description: Pygame is a set of Python modules designed for writing video games.");
	        System.out.println("   - Example:");
	        System.out.println("     import pygame");
	        System.out.println("     pygame.init()");
	        System.out.println("     # Pygame game loop, events, and rendering");
	        System.out.println();

	        // Heading: Microservices with Flask
	        System.out.println("7. Microservices with Flask:");
	        System.out.println("   - Description: Flask is a lightweight WSGI web application framework suitable for microservices architecture.");
	        System.out.println("   - Example:");
	        System.out.println("     from flask import Flask");
	        System.out.println("     app = Flask(__name__)");
	        System.out.println("     @app.route('/')");
	        System.out.println("     def hello_world():");
	        System.out.println("         return 'Hello, World!'");
	        System.out.println();

	        // Heading: Data Analysis with Pandas
	        System.out.println("8. Data Analysis with Pandas:");
	        System.out.println("   - Description: Pandas is a fast, powerful, and flexible open-source data analysis and manipulation library.");
	        System.out.println("   - Example:");
	        System.out.println("     import pandas as pd");
	        System.out.println("     data = {'Name': ['John', 'Alice', 'Bob'], 'Age': [25, 30, 22]}");
	        System.out.println("     df = pd.DataFrame(data)");
	        System.out.println("     print(df)");
	        System.out.println();

	        // Heading: Robotics with ROS (Robot Operating System)
	        System.out.println("9. Robotics with ROS (Robot Operating System):");
	        System.out.println("   - Description: ROS is a flexible framework for writing robot software.");
	        System.out.println("   - Example:");
	        System.out.println("     # ROS publisher and subscriber nodes");
	        System.out.println();

	        // Heading: DevOps with Ansible
	        System.out.println("10. DevOps with Ansible:");
	        System.out.println("    - Description: Ansible is an open-source automation tool for configuration management, application deployment, and task automation.");
	        System.out.println("    - Example:");
	        System.out.println("      # Ansible playbook for server configuration");
	        System.out.println();
	        
	        String update6 = "UPDATE python SET specialized = ? where email= ?";
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
			String ch = "python";
			email = c.check(email,ch);
		}
		if(choice == 7) {
			display d=new display();
			d.displays();
		}
		
	}
	
	
}
