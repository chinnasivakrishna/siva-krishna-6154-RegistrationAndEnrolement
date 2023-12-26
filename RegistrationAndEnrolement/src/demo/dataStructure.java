package demo;

import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class dataStructure {
	Scanner sc = new Scanner(System.in);
	String email;
	public String structurepro(String email4) {
		// TODO Auto-generated method stub
		email = email4;
		return email4;
	}
	public void structure() throws SQLException, IOException, URISyntaxException {
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
		
		// TODO Auto-generated method stub
		System.out.println("When You Complete all topics you get an certificate");
		System.out.println("Enter 1 for Basic Data Structure");
		System.out.println("Enter 2 for Intermediate Data Structure");
		System.out.println("Enter 3 for Advanced Data Structure");
		System.out.println("Enter 4 for Expert Data Structure");
		System.out.println("Enter 5 for Specialized Data Structure");
		System.out.println("Enter 6 for Check the completion level");
		System.out.println("Enter 7 for leave");
		int choice = sc.nextInt();
		if(choice ==1) {
			System.out.println("**********************Basic Data Structures*******************************");

	        // Heading: Arrays
	        System.out.println("1. Arrays:");
	        System.out.println("   - Description: Arrays are ordered collections of items. They store elements of the same data type.");
	        System.out.println("   - Example:");
	        System.out.println("     int[] numbers = {1, 2, 3, 4, 5};");
	        System.out.println();

	        // Heading: Linked Lists
	        System.out.println("2. Linked Lists:");
	        System.out.println("   - Description: Linked Lists are linear data structures where elements are stored in nodes, and each node points to the next one.");
	        System.out.println("   - Example:");
	        System.out.println("     class Node {");
	        System.out.println("         int data;");
	        System.out.println("         Node next;");
	        System.out.println("         Node(int data) { this.data = data; }");
	        System.out.println("     }");
	        System.out.println("     Node head = new Node(1);");
	        System.out.println("     head.next = new Node(2);");
	        System.out.println("     head.next.next = new Node(3);");
	        System.out.println();

	        // Heading: Stacks
	        System.out.println("3. Stacks:");
	        System.out.println("   - Description: Stacks follow the Last In, First Out (LIFO) principle, where elements are added and removed from the same end.");
	        System.out.println("   - Example:");
	        System.out.println("     Stack<Integer> stack = new Stack<>();");
	        System.out.println("     stack.push(1);");
	        System.out.println("     stack.push(2);");
	        System.out.println("     stack.push(3);");
	        System.out.println();

	        // Heading: Queues
	        System.out.println("4. Queues:");
	        System.out.println("   - Description: Queues follow the First In, First Out (FIFO) principle, where elements are added at the rear and removed from the front.");
	        System.out.println("   - Example:");
	        System.out.println("     Queue<Integer> queue = new LinkedList<>();");
	        System.out.println("     queue.offer(1);");
	        System.out.println("     queue.offer(2);");
	        System.out.println("     queue.offer(3);");
	        System.out.println();

	        // Heading: Hash Tables (HashMaps)
	        System.out.println("5. Hash Tables (HashMaps):");
	        System.out.println("   - Description: Hash Tables use a hash function to map keys to indices, allowing for efficient data retrieval.");
	        System.out.println("   - Example:");
	        System.out.println("     Map<String, Integer> hashMap = new HashMap<>();");
	        System.out.println("     hashMap.put(\"one\", 1);");
	        System.out.println("     hashMap.put(\"two\", 2);");
	        System.out.println("     hashMap.put(\"three\", 3);");
	        System.out.println();

	        // Heading: Trees (Binary Trees)
	        System.out.println("6. Trees (Binary Trees):");
	        System.out.println("   - Description: Binary Trees are hierarchical data structures with each node having at most two children.");
	        System.out.println("   - Example:");
	        System.out.println("     class TreeNode {");
	        System.out.println("         int data;");
	        System.out.println("         TreeNode left, right;");
	        System.out.println("         TreeNode(int data) { this.data = data; }");
	        System.out.println("     }");
	        System.out.println("     TreeNode root = new TreeNode(1);");
	        System.out.println("     root.left = new TreeNode(2);");
	        System.out.println("     root.right = new TreeNode(3);");
	        System.out.println();

	        // Heading: Graphs (Adjacency List)
	        System.out.println("7. Graphs (Adjacency List):");
	        System.out.println("   - Description: Graphs represent connections between nodes. Adjacency List is a common way to represent graphs.");
	        System.out.println("   - Example:");
	        System.out.println("     class Graph {");
	        System.out.println("         Map<Integer, List<Integer>> adjacencyList = new HashMap<>();");
	        System.out.println("         void addEdge(int source, int destination) {");
	        System.out.println("             adjacencyList.computeIfAbsent(source, k -> new ArrayList<>()).add(destination);");
	        System.out.println("         }");
	        System.out.println("     }");
	        System.out.println("     Graph graph = new Graph();");
	        System.out.println("     graph.addEdge(1, 2);");
	        System.out.println("     graph.addEdge(1, 3);");
	        System.out.println("     graph.addEdge(2, 4);");
	        System.out.println();

	        // Heading: Heaps (Min Heap)
	        System.out.println("8. Heaps (Min Heap):");
	        System.out.println("   - Description: Heaps are specialized trees used in heap-sort algorithms. A Min Heap ensures the smallest element is at the root.");
	        System.out.println("   - Example:");
	        System.out.println("     PriorityQueue<Integer> minHeap = new PriorityQueue<>();");
	        System.out.println("     minHeap.offer(3);");
	        System.out.println("     minHeap.offer(1);");
	        System.out.println("     minHeap.offer(4);");
	        System.out.println();

	        // Heading: Tries
	        System.out.println("9. Tries:");
	        System.out.println("   - Description: Tries are tree-like structures used for storing a dynamic set of strings.");
	        System.out.println("   - Example:");
	        System.out.println("     class TrieNode {");
	        System.out.println("         Map<Character, TrieNode> children = new HashMap<>();");
	        System.out.println("         boolean isEndOfWord;");
	        System.out.println("     }");
	        System.out.println("     TrieNode root = new TrieNode();");
	        System.out.println("     insertWord(root, \"apple\");");
	        System.out.println("     insertWord(root, \"app\");");
	        System.out.println();

	        // Heading: Bloom Filters
	        System.out.println("10. Bloom Filters:");
	        System.out.println("    - Description: Bloom Filters are space-efficient data structures used to test whether an element is a member of a set.");
	        System.out.println("    - Example:");
	        System.out.println("      class BloomFilter {");
	        System.out.println("          BitSet bitSet = new BitSet(1000);");
	        System.out.println("          void add(String element) { /* Implementation */ }");
	        System.out.println("          boolean contains(String element) { /* Implementation */ }");
	        System.out.println("      }");
	        System.out.println("      BloomFilter filter = new BloomFilter();");
	        System.out.println("      filter.add(\"apple\");");
	        System.out.println("      filter.contains(\"orange\");");
	    
	        String update2 = "UPDATE dataStructures SET basic = ? where email = ?";
            try (PreparedStatement update3 = krishna.prepareStatement(update2)) {
                update3.setBoolean(1, true);
                update3.setString(2, email);
                update3.executeUpdate();
            }
	        
			System.out.println("********************************************************************************************************************************");
	        System.out.println("You completed 1st Stage of Data Structure");
	        System.out.println("If You want to continue enter 2");
	        System.out.println("If you want to quit enter 7");
	        choice = sc.nextInt();
		}
		if(choice ==2) {
			System.out.println("*******************Intermediate Data Structures****************************");

	        // Heading: Doubly Linked Lists
	        System.out.println("1. Doubly Linked Lists:");
	        System.out.println("   - Description: Doubly Linked Lists are similar to linked lists but each node points to both the next and previous nodes.");
	        System.out.println("   - Example:");
	        System.out.println("     class DoublyNode {");
	        System.out.println("         int data;");
	        System.out.println("         DoublyNode prev, next;");
	        System.out.println("         DoublyNode(int data) { this.data = data; }");
	        System.out.println("     }");
	        System.out.println("     DoublyNode head = new DoublyNode(1);");
	        System.out.println("     head.next = new DoublyNode(2);");
	        System.out.println("     head.next.prev = head;");
	        System.out.println("     head.next.next = new DoublyNode(3);");
	        System.out.println("     head.next.next.prev = head.next;");
	        System.out.println();

	        // Heading: Circular Linked Lists
	        System.out.println("2. Circular Linked Lists:");
	        System.out.println("   - Description: Circular Linked Lists form a closed loop by having the last node point back to the first node.");
	        System.out.println("   - Example:");
	        System.out.println("     class CircularNode {");
	        System.out.println("         int data;");
	        System.out.println("         CircularNode next;");
	        System.out.println("         CircularNode(int data) { this.data = data; }");
	        System.out.println("     }");
	        System.out.println("     CircularNode head = new CircularNode(1);");
	        System.out.println("     head.next = new CircularNode(2);");
	        System.out.println("     head.next.next = new CircularNode(3);");
	        System.out.println("     head.next.next.next = head;");
	        System.out.println();

	        // Heading: Stacks and Queues using Linked Lists
	        System.out.println("3. Stacks and Queues using Linked Lists:");
	        System.out.println("   - Description: Implementing stacks and queues using linked lists allows for dynamic sizing and efficient operations.");
	        System.out.println("   - Example:");
	        System.out.println("     // Stack using linked list");
	        System.out.println("     class LinkedStack { /* Implementation */ }");
	        System.out.println("     // Queue using linked list");
	        System.out.println("     class LinkedQueue { /* Implementation */ }");
	        System.out.println();

	        // Heading: Priority Queues (Binary Heap)
	        System.out.println("4. Priority Queues (Binary Heap):");
	        System.out.println("   - Description: Priority Queues store elements with associated priorities, ensuring efficient retrieval of the highest-priority element.");
	        System.out.println("   - Example:");
	        System.out.println("     PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());");
	        System.out.println("     maxHeap.offer(3);");
	        System.out.println("     maxHeap.offer(1);");
	        System.out.println("     maxHeap.offer(4);");
	        System.out.println();

	        // Heading: Hash Tables (Open Addressing)
	        System.out.println("5. Hash Tables (Open Addressing):");
	        System.out.println("   - Description: Open Addressing is a technique to handle collisions in hash tables by finding the next available slot.");
	        System.out.println("   - Example:");
	        System.out.println("     class OpenAddressingHashMap { /* Implementation */ }");
	        System.out.println("     // Handling collisions using linear probing");
	        System.out.println("     int probeIndex(int index, int attempt, int size) { return (index + attempt) % size; }");
	        System.out.println();

	        // Heading: Trees (Binary Search Trees)
	        System.out.println("6. Trees (Binary Search Trees):");
	        System.out.println("   - Description: Binary Search Trees maintain an ordered structure, enabling efficient search, insertion, and deletion operations.");
	        System.out.println("   - Example:");
	        System.out.println("     class BinarySearchTree { /* Implementation */ }");
	        System.out.println("     // Inserting a node into a binary search tree");
	        System.out.println("     void insert(TreeNode root, int key) { /* Implementation */ }");
	        System.out.println();

	        // Heading: AVL Trees (Balanced Binary Search Trees)
	        System.out.println("7. AVL Trees (Balanced Binary Search Trees):");
	        System.out.println("   - Description: AVL Trees maintain balance, ensuring logarithmic height and efficient search, insertion, and deletion operations.");
	        System.out.println("   - Example:");
	        System.out.println("     class AVLTree { /* Implementation */ }");
	        System.out.println("     // Rotating left to balance the AVL tree");
	        System.out.println("     Node rotateLeft(Node y) { /* Implementation */ }");
	        System.out.println();

	        // Heading: Graphs (Adjacency Matrix)
	        System.out.println("8. Graphs (Adjacency Matrix):");
	        System.out.println("   - Description: Adjacency Matrix is an alternative representation of graphs using a two-dimensional array.");
	        System.out.println("   - Example:");
	        System.out.println("     class AdjacencyMatrixGraph { /* Implementation */ }");
	        System.out.println("     // Adding an edge in an adjacency matrix");
	        System.out.println("     void addEdge(int[][] matrix, int source, int destination) { /* Implementation */ }");
	        System.out.println();

	        // Heading: Graphs (Depth-First Search and Breadth-First Search)
	        System.out.println("9. Graphs (Depth-First Search and Breadth-First Search):");
	        System.out.println("   - Description: DFS and BFS are algorithms for traversing graphs, exploring vertices and edges.");
	        System.out.println("   - Example:");
	        System.out.println("     class GraphTraversal { /* Implementation */ }");
	        System.out.println("     // DFS and BFS methods");
	        System.out.println("     void dfs(int vertex, boolean[] visited) { /* Implementation */ }");
	        System.out.println("     void bfs(int start, boolean[] visited) { /* Implementation */ }");
	        System.out.println();

	        // Heading: Trie with Compressed Tries
	        System.out.println("10. Trie with Compressed Tries:");
	        System.out.println("    - Description: Compressed Tries optimize storage space by compressing common prefixes in trie nodes.");
	        System.out.println("    - Example:");
	        System.out.println("      class Trie { /* Implementation */ }");
	        System.out.println("      // Compressing trie nodes");
	        System.out.println("      void compress(TrieNode node) { /* Implementation */ }");
	        
	        String update = "UPDATE dataStructures SET intermediate = ? where email = ?";
            try (PreparedStatement update1 = krishna.prepareStatement(update)) {
                update1.setBoolean(1,true);
                update1.setString(2,email);
                update1.executeUpdate();
            }
	        
			System.out.println("********************************************************************************************************************************");
			System.out.println("You completed 2st Stage of Data Structure");
	        System.out.println("If You want to continue enter 3");
	        System.out.println("If you want to quit enter 7");
	        choice = sc.nextInt();
		}
		if(choice ==3) {
			
			System.out.println("********************Advanced Data Structures******************************");

	        // Heading: B-Trees
	        System.out.println("1. B-Trees:");
	        System.out.println("   - Description: B-Trees are self-balancing search trees designed to maintain efficient search, insertion, and deletion operations.");
	        System.out.println("   - Example:");
	        System.out.println("     class BTree { /* Implementation */ }");
	        System.out.println("     // B-Tree node structure");
	        System.out.println("     class BTreeNode { /* Implementation */ }");
	        System.out.println();

	        // Heading: Red-Black Trees
	        System.out.println("2. Red-Black Trees:");
	        System.out.println("   - Description: Red-Black Trees are binary search trees with additional properties ensuring balance and efficient operations.");
	        System.out.println("   - Example:");
	        System.out.println("     class RedBlackTree { /* Implementation */ }");
	        System.out.println("     // Red-Black Tree node structure");
	        System.out.println("     class RedBlackNode { /* Implementation */ }");
	        System.out.println();

	        // Heading: Splay Trees
	        System.out.println("3. Splay Trees:");
	        System.out.println("   - Description: Splay Trees are self-adjusting binary search trees that perform rotations to bring frequently accessed nodes closer to the root.");
	        System.out.println("   - Example:");
	        System.out.println("     class SplayTree { /* Implementation */ }");
	        System.out.println("     // Splay Tree node structure");
	        System.out.println("     class SplayTreeNode { /* Implementation */ }");
	        System.out.println();

	        // Heading: Treaps
	        System.out.println("4. Treaps:");
	        System.out.println("   - Description: Treaps combine the properties of binary search trees and heap-ordered trees, using random priorities.");
	        System.out.println("   - Example:");
	        System.out.println("     class Treap { /* Implementation */ }");
	        System.out.println("     // Treap node structure");
	        System.out.println("     class TreapNode { /* Implementation */ }");
	        System.out.println();

	        // Heading: Skip Lists
	        System.out.println("5. Skip Lists:");
	        System.out.println("   - Description: Skip Lists are data structures that maintain a hierarchy of linked lists for efficient search and update operations.");
	        System.out.println("   - Example:");
	        System.out.println("     class SkipList { /* Implementation */ }");
	        System.out.println("     // Skip List node structure");
	        System.out.println("     class SkipListNode { /* Implementation */ }");
	        System.out.println();

	        // Heading: Fenwick Trees (Binary Indexed Trees)
	        System.out.println("6. Fenwick Trees (Binary Indexed Trees):");
	        System.out.println("   - Description: Fenwick Trees are data structures for efficiently computing and updating prefix sums of an array.");
	        System.out.println("   - Example:");
	        System.out.println("     class FenwickTree { /* Implementation */ }");
	        System.out.println("     // Fenwick Tree update and query methods");
	        System.out.println("     void update(int index, int delta) { /* Implementation */ }");
	        System.out.println("     int query(int index) { /* Implementation */ }");
	        System.out.println();

	        // Heading: Bloomier Filters
	        System.out.println("7. Bloomier Filters:");
	        System.out.println("   - Description: Bloomier Filters are probabilistic data structures that support efficient key-value lookups.");
	        System.out.println("   - Example:");
	        System.out.println("     class BloomierFilter { /* Implementation */ }");
	        System.out.println("     // Bloomier Filter key insertion and retrieval");
	        System.out.println("     void insert(String key, Object value) { /* Implementation */ }");
	        System.out.println("     Object retrieve(String key) { /* Implementation */ }");
	        System.out.println();

	        // Heading: Rope Data Structure
	        System.out.println("8. Rope Data Structure:");
	        System.out.println("   - Description: Ropes are data structures for efficiently manipulating and storing large strings by breaking them into smaller chunks.");
	        System.out.println("   - Example:");
	        System.out.println("     class Rope { /* Implementation */ }");
	        System.out.println("     // Rope concatenation and splitting methods");
	        System.out.println("     void concatenate(RopeNode root1, RopeNode root2) { /* Implementation */ }");
	        System.out.println("     void split(RopeNode root, int index) { /* Implementation */ }");
	        System.out.println();

	        // Heading: Self-Balancing Hash Tables
	        System.out.println("9. Self-Balancing Hash Tables:");
	        System.out.println("   - Description: Self-Balancing Hash Tables dynamically adjust their size and hash functions for efficient key-value storage.");
	        System.out.println("   - Example:");
	        System.out.println("     class SelfBalancingHashTable { /* Implementation */ }");
	        System.out.println("     // Self-Balancing Hash Table operations");
	        System.out.println("     void put(Object key, Object value) { /* Implementation */ }");
	        System.out.println("     Object get(Object key) { /* Implementation */ }");
	        System.out.println();

	        // Heading: Rope Data Structure
	        System.out.println("10. Persistent Data Structures:");
	        System.out.println("    - Description: Persistent Data Structures allow the preservation of previous versions after updates.");
	        System.out.println("    - Example:");
	        System.out.println("      class PersistentStack { /* Implementation */ }");
	        System.out.println("      // Persistent Stack operations");
	        System.out.println("      PersistentStack push(PersistentStack oldStack, Object element) { /* Implementation */ }");
	        System.out.println("      PersistentStack pop(PersistentStack oldStack) { /* Implementation */ }");
	        System.out.println();
	    
	        String update4 = "UPDATE dataStructures SET advance = ? where email = ?";
            try (PreparedStatement update5 = krishna.prepareStatement(update4)) {
                update5.setBoolean(1, true);
                update5.setString(2, email);
                update5.executeUpdate();
            }
			
	        System.out.println("********************************************************************************************************************************");
	        System.out.println("You completed 3st Stage of Data Structure");
	        System.out.println("If You want to continue enter 4");
	        System.out.println("If you want to quit enter 7");
	        choice = sc.nextInt();
		}
		if(choice ==4) {
			System.out.println("********************Expert Data Structures*********************************");

	        // Heading: Cache-Oblivious Data Structures
	        System.out.println("1. Cache-Oblivious Data Structures:");
	        System.out.println("   - Description: Cache-Oblivious Data Structures optimize memory access patterns without explicit knowledge of cache sizes.");
	        System.out.println("   - Example:");
	        System.out.println("     class CacheObliviousArray { /* Implementation */ }");
	        System.out.println("     // Efficient cache-oblivious array operations");
	        System.out.println("     int access(int[] array, int index) { /* Implementation */ }");
	        System.out.println();

	        // Heading: Fusion Trees
	        System.out.println("2. Fusion Trees:");
	        System.out.println("   - Description: Fusion Trees are advanced data structures used for solving various problems in computer science.");
	        System.out.println("   - Example:");
	        System.out.println("     class FusionTree { /* Implementation */ }");
	        System.out.println("     // Fusion Tree operations");
	        System.out.println("     void insert(int key) { /* Implementation */ }");
	        System.out.println("     boolean search(int key) { /* Implementation */ }");
	        System.out.println();

	        // Heading: Cuckoo Hashing
	        System.out.println("3. Cuckoo Hashing:");
	        System.out.println("   - Description: Cuckoo Hashing is a technique for resolving hash collisions by using multiple hash functions and rehashing.");
	        System.out.println("   - Example:");
	        System.out.println("     class CuckooHashTable { /* Implementation */ }");
	        System.out.println("     // Cuckoo Hashing operations");
	        System.out.println("     void insert(Object key, Object value) { /* Implementation */ }");
	        System.out.println("     Object get(Object key) { /* Implementation */ }");
	        System.out.println();

	        // Heading: X-fast Tries and Y-fast Tries
	        System.out.println("4. X-fast Tries and Y-fast Tries:");
	        System.out.println("   - Description: X-fast Tries and Y-fast Tries are advanced trie structures supporting efficient search and updates.");
	        System.out.println("   - Example:");
	        System.out.println("     class XFastTrie { /* Implementation */ }");
	        System.out.println("     // X-fast Trie operations");
	        System.out.println("     void insert(int key) { /* Implementation */ }");
	        System.out.println("     boolean search(int key) { /* Implementation */ }");
	        System.out.println();

	        // Heading: Van Emde Boas Trees
	        System.out.println("5. Van Emde Boas Trees:");
	        System.out.println("   - Description: Van Emde Boas Trees are data structures that maintain a dynamic set with optimal time complexity.");
	        System.out.println("   - Example:");
	        System.out.println("     class VanEmdeBoasTree { /* Implementation */ }");
	        System.out.println("     // Van Emde Boas Tree operations");
	        System.out.println("     void insert(int key) { /* Implementation */ }");
	        System.out.println("     boolean search(int key) { /* Implementation */ }");
	        System.out.println();

	        // Heading: Fusion Trees
	        System.out.println("6. Fusion Trees:");
	        System.out.println("   - Description: Fusion Trees are advanced data structures used for solving various problems in computer science.");
	        System.out.println("   - Example:");
	        System.out.println("     class FusionTree { /* Implementation */ }");
	        System.out.println("     // Fusion Tree operations");
	        System.out.println("     void insert(int key) { /* Implementation */ }");
	        System.out.println("     boolean search(int key) { /* Implementation */ }");
	        System.out.println();

	        // Heading: Ctrie
	        System.out.println("7. Ctrie:");
	        System.out.println("   - Description: Ctrie is a concurrent data structure designed for lock-free access in concurrent programming.");
	        System.out.println("   - Example:");
	        System.out.println("     class Ctrie { /* Implementation */ }");
	        System.out.println("     // Ctrie operations");
	        System.out.println("     void insert(Object key, Object value) { /* Implementation */ }");
	        System.out.println("     Object get(Object key) { /* Implementation */ }");
	        System.out.println();

	        // Heading: XOR Linked Lists
	        System.out.println("8. XOR Linked Lists:");
	        System.out.println("   - Description: XOR Linked Lists use bitwise XOR to represent the addresses of consecutive nodes for memory efficiency.");
	        System.out.println("   - Example:");
	        System.out.println("     class XORNode { /* Implementation */ }");
	        System.out.println("     // XOR Linked List operations");
	        System.out.println("     void insert(XORNode node) { /* Implementation */ }");
	        System.out.println("     XORNode getNext(XORNode current, XORNode previous) { /* Implementation */ }");
	        System.out.println();

	        // Heading: Cache-Efficient Data Structures
	        System.out.println("9. Cache-Efficient Data Structures:");
	        System.out.println("   - Description: Cache-Efficient Data Structures minimize cache misses to enhance overall performance.");
	        System.out.println("   - Example:");
	        System.out.println("     class CacheEfficientArray { /* Implementation */ }");
	        System.out.println("     // Efficient cache-efficient array operations");
	        System.out.println("     int access(int[] array, int index) { /* Implementation */ }");
	        System.out.println();

	        // Heading: External Memory Data Structures
	        System.out.println("10. External Memory Data Structures:");
	        System.out.println("    - Description: External Memory Data Structures are designed to efficiently manage data stored in external memory (e.g., disk drives).");
	        System.out.println("    - Example:");
	        System.out.println("      class BPlusTree { /* Implementation */ }");
	        System.out.println("      // B+ Tree operations for external memory");
	        System.out.println("      void insert(int key, Object value) { /* Implementation */ }");
	        System.out.println("      Object search(int key) { /* Implementation */ }");
	  
	        String update8 = "UPDATE dataStructures SET expert = ? where email= ?";
            try (PreparedStatement update9 = krishna.prepareStatement(update8)) {
                update9.setBoolean(1, true);
                update9.setString(2, email);
                update9.executeUpdate();
            }
	        
			System.out.println("********************************************************************************************************************************");
			System.out.println("You completed 4st Stage of Data Structure");
	        System.out.println("If You want to continue enter 5");
	        System.out.println("If you want to quit enter 7");
	        choice = sc.nextInt();
		}
		if(choice ==5) {
			System.out.println("*****************Specialized Data Structures********************************");

	        // Heading: Rope Data Structure
	        System.out.println("1. Rope Data Structure:");
	        System.out.println("   - Description: Ropes are data structures for efficiently manipulating and storing large strings by breaking them into smaller chunks.");
	        System.out.println("   - Example:");
	        System.out.println("     class Rope { /* Implementation */ }");
	        System.out.println("     // Rope concatenation and splitting methods");
	        System.out.println("     void concatenate(RopeNode root1, RopeNode root2) { /* Implementation */ }");
	        System.out.println("     void split(RopeNode root, int index) { /* Implementation */ }");
	        System.out.println();

	        // Heading: Finger Trees
	        System.out.println("2. Finger Trees:");
	        System.out.println("   - Description: Finger Trees are functional data structures that provide O(1) amortized time complexity for many sequence operations.");
	        System.out.println("   - Example:");
	        System.out.println("     class FingerTree { /* Implementation */ }");
	        System.out.println("     // Finger Tree operations");
	        System.out.println("     void insert(int element) { /* Implementation */ }");
	        System.out.println("     void delete(int element) { /* Implementation */ }");
	        System.out.println();

	        // Heading: Binary Space Partitioning Trees
	        System.out.println("3. Binary Space Partitioning Trees:");
	        System.out.println("   - Description: BSP Trees are used in computer graphics to partition space into convex sets for efficient rendering.");
	        System.out.println("   - Example:");
	        System.out.println("     class BSPTree { /* Implementation */ }");
	        System.out.println("     // BSPTree operations for rendering");
	        System.out.println("     void renderScene(BSPTreeNode node, Camera camera) { /* Implementation */ }");
	        System.out.println();

	        // Heading: Wavelet Trees
	        System.out.println("4. Wavelet Trees:");
	        System.out.println("   - Description: Wavelet Trees are used for efficient computation of various string-related queries.");
	        System.out.println("   - Example:");
	        System.out.println("     class WaveletTree { /* Implementation */ }");
	        System.out.println("     // Wavelet Tree operations for string queries");
	        System.out.println("     int rank(char symbol, int position) { /* Implementation */ }");
	        System.out.println("     char access(int position) { /* Implementation */ }");
	        System.out.println();

	        // Heading: R*-Trees
	        System.out.println("5. R*-Trees:");
	        System.out.println("   - Description: R*-Trees are an extension of R-Trees and are used for efficient spatial indexing in databases.");
	        System.out.println("   - Example:");
	        System.out.println("     class RStarTree { /* Implementation */ }");
	        System.out.println("     // R*-Tree operations for spatial indexing");
	        System.out.println("     void insert(Rectangle spatialObject) { /* Implementation */ }");
	        System.out.println("     List<Rectangle> searchRange(Rectangle queryRange) { /* Implementation */ }");
	        System.out.println();

	        // Heading: Quad-Trees
	        System.out.println("6. Quad-Trees:");
	        System.out.println("   - Description: Quad-Trees are hierarchical data structures used for efficient partitioning and indexing of two-dimensional space.");
	        System.out.println("   - Example:");
	        System.out.println("     class QuadTree { /* Implementation */ }");
	        System.out.println("     // Quad-Tree operations for spatial indexing");
	        System.out.println("     void insert(Point point) { /* Implementation */ }");
	        System.out.println("     List<Point> queryRange(Rectangle queryRange) { /* Implementation */ }");
	        System.out.println();

	        // Heading: Bloomier Filters
	        System.out.println("7. Bloomier Filters:");
	        System.out.println("   - Description: Bloomier Filters are probabilistic data structures that support efficient key-value lookups.");
	        System.out.println("   - Example:");
	        System.out.println("     class BloomierFilter { /* Implementation */ }");
	        System.out.println("     // Bloomier Filter key insertion and retrieval");
	        System.out.println("     void insert(String key, Object value) { /* Implementation */ }");
	        System.out.println("     Object retrieve(String key) { /* Implementation */ }");
	        System.out.println();

	        // Heading: Ctrie
	        System.out.println("8. Ctrie:");
	        System.out.println("   - Description: Ctrie is a concurrent data structure designed for lock-free access in concurrent programming.");
	        System.out.println("   - Example:");
	        System.out.println("     class Ctrie { /* Implementation */ }");
	        System.out.println("     // Ctrie operations");
	        System.out.println("     void insert(Object key, Object value) { /* Implementation */ }");
	        System.out.println("     Object get(Object key) { /* Implementation */ }");
	        System.out.println();

	        // Heading: Skip Lists
	        System.out.println("9. Skip Lists:");
	        System.out.println("   - Description: Skip Lists are data structures that maintain a hierarchy of linked lists for efficient search and update operations.");
	        System.out.println("   - Example:");
	        System.out.println("     class SkipList { /* Implementation */ }");
	        System.out.println("     // Skip List node structure");
	        System.out.println("     class SkipListNode { /* Implementation */ }");
	        System.out.println();

	        // Heading: Rope Data Structure
	        System.out.println("10. Rete Algorithm for Rule-Based Systems:");
	        System.out.println("    - Description: Rete Algorithm efficiently evaluates rule-based systems by avoiding redundant computations.");
	        System.out.println("    - Example:");
	        System.out.println("      class ReteAlgorithm { /* Implementation */ }");
	        System.out.println("      // Rete Algorithm for rule-based systems");
	        System.out.println("      void evaluateRules(ReteNetwork network, FactSet facts) { /* Implementation */ }");
	        System.out.println();
	   
	        String update6 = "UPDATE dataStructures SET specialized = ? where email= ?";
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
			String ch = "dataStructures";
			email = c.check(email,ch);
		}
		if(choice == 7) {
			display d=new display();
			d.displays();
		}
	}
	

}
