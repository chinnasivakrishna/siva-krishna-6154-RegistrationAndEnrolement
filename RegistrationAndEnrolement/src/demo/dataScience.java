package demo;

import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class dataScience {
	Scanner sc = new Scanner(System.in);
	String email;
	public String sciencepro(String email5) {
		// TODO Auto-generated method stub
		email = email5;
		return email5;
	}
	public void science() throws SQLException, IOException, URISyntaxException {
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
		System.out.println("Enter 1 for Basic Data Science");
		System.out.println("Enter 2 for Intermediate Data Science");
		System.out.println("Enter 3 for Advanced Data Science");
		System.out.println("Enter 4 for Expert Data Science");
		System.out.println("Enter 5 for Specialized Data Science");
		System.out.println("Enter 6 for Check the completion level");
		System.out.println("Enter 7 for leave");
		int choice = sc.nextInt();
		if(choice ==1) {
			System.out.println("*******************Basic Data Science**************************************");

	        // Heading: Introduction to Data Science
	        System.out.println("1. Introduction to Data Science:");
	        System.out.println("   - Description: Data Science is an interdisciplinary field that uses scientific methods, processes, algorithms, and systems to extract insights and knowledge from structured and unstructured data.");
	        System.out.println("   - Key Concepts:");
	        System.out.println("     - Data Collection, Cleaning, and Exploration");
	        System.out.println("     - Statistical Analysis and Descriptive Statistics");
	        System.out.println("     - Basics of Machine Learning");
	        System.out.println("     - Data Visualization");
	        System.out.println();

	        // Heading: Data Types and Data Structures
	        System.out.println("2. Data Types and Data Structures:");
	        System.out.println("   - Description: Understanding different data types and structures is crucial for effective data manipulation and analysis.");
	        System.out.println("   - Key Concepts:");
	        System.out.println("     - Numeric, Categorical, and Text Data");
	        System.out.println("     - Arrays, Lists, and DataFrames");
	        System.out.println("     - Handling Missing Data");
	        System.out.println();

	        // Heading: Exploratory Data Analysis (EDA)
	        System.out.println("3. Exploratory Data Analysis (EDA):");
	        System.out.println("   - Description: EDA involves analyzing and visualizing data to summarize its main characteristics and uncover patterns, relationships, and anomalies.");
	        System.out.println("   - Key Concepts:");
	        System.out.println("     - Summary Statistics");
	        System.out.println("     - Data Distribution and Histograms");
	        System.out.println("     - Scatter Plots and Correlation");
	        System.out.println();

	        // Heading: Statistics for Data Science
	        System.out.println("4. Statistics for Data Science:");
	        System.out.println("   - Description: Statistics plays a crucial role in data science for making inferences and predictions from data.");
	        System.out.println("   - Key Concepts:");
	        System.out.println("     - Mean, Median, and Mode");
	        System.out.println("     - Probability Distributions");
	        System.out.println("     - Hypothesis Testing");
	        System.out.println();

	        // Heading: Machine Learning Basics
	        System.out.println("5. Machine Learning Basics:");
	        System.out.println("   - Description: Machine Learning involves the development of algorithms that enable computers to learn patterns from data and make predictions or decisions without explicit programming.");
	        System.out.println("   - Key Concepts:");
	        System.out.println("     - Supervised Learning vs. Unsupervised Learning");
	        System.out.println("     - Classification and Regression");
	        System.out.println("     - Model Evaluation and Validation");
	        System.out.println();

	        // Heading: Data Visualization
	        System.out.println("6. Data Visualization:");
	        System.out.println("   - Description: Data visualization is the presentation of data in graphical or visual format to facilitate understanding and interpretation.");
	        System.out.println("   - Key Concepts:");
	        System.out.println("     - Charts, Graphs, and Heatmaps");
	        System.out.println("     - Matplotlib and Seaborn in Python");
	        System.out.println("     - Interactive Visualization with tools like Tableau");
	        System.out.println();

	        // Heading: Introduction to Big Data
	        System.out.println("7. Introduction to Big Data:");
	        System.out.println("   - Description: Big Data involves working with large and complex datasets that cannot be easily handled by traditional data processing tools.");
	        System.out.println("   - Key Concepts:");
	        System.out.println("     - Hadoop and MapReduce");
	        System.out.println("     - Apache Spark");
	        System.out.println("     - Distributed Data Processing");
	        System.out.println();

	        // Heading: Basics of Data Cleaning and Preprocessing
	        System.out.println("8. Basics of Data Cleaning and Preprocessing:");
	        System.out.println("   - Description: Data cleaning and preprocessing are essential steps to ensure data quality and prepare it for analysis.");
	        System.out.println("   - Key Concepts:");
	        System.out.println("     - Handling Missing Values");
	        System.out.println("     - Feature Scaling and Normalization");
	        System.out.println("     - Encoding Categorical Variables");
	        System.out.println();

	        // Heading: Ethics and Privacy in Data Science
	        System.out.println("9. Ethics and Privacy in Data Science:");
	        System.out.println("   - Description: Data scientists must consider ethical implications and privacy concerns when working with sensitive data.");
	        System.out.println("   - Key Concepts:");
	        System.out.println("     - Responsible Data Use");
	        System.out.println("     - Data Anonymization");
	        System.out.println("     - Bias and Fairness in Machine Learning");
	        System.out.println();

	        // Heading: Basics of SQL for Data Science
	        System.out.println("10. Basics of SQL for Data Science:");
	        System.out.println("    - Description: SQL (Structured Query Language) is fundamental for managing and querying relational databases, a common data storage format.");
	        System.out.println("    - Key Concepts:");
	        System.out.println("      - SELECT, WHERE, JOIN operations");
	        System.out.println("      - Aggregation Functions (COUNT, SUM, AVG)");
	        System.out.println("      - Creating and Modifying Tables");
	        System.out.println();
	        
	        String update2 = "UPDATE dataScience SET basic = ? where email = ?";
            try (PreparedStatement update3 = krishna.prepareStatement(update2)) {
                update3.setBoolean(1, true);
                update3.setString(2, email);
                update3.executeUpdate();
            }
			
			System.out.println("********************************************************************************************************************************");
	        System.out.println("You completed 1st Stage of Data Science");
	        System.out.println("If You want to continue enter 2");
	        System.out.println("If you want to quit enter 7");
	        choice = sc.nextInt();
		}
		if(choice ==2) {
			System.out.println("*******************Intermediate Data Science*******************************");

	        // Heading: Feature Engineering
	        System.out.println("1. Feature Engineering:");
	        System.out.println("   - Description: Feature engineering involves transforming raw data into meaningful features to improve the performance of machine learning models.");
	        System.out.println("   - Key Concepts:");
	        System.out.println("     - Handling Date and Time Features");
	        System.out.println("     - Binning and Bucketing");
	        System.out.println("     - One-Hot Encoding and Feature Scaling");
	        System.out.println();

	        // Heading: Dimensionality Reduction
	        System.out.println("2. Dimensionality Reduction:");
	        System.out.println("   - Description: Dimensionality reduction techniques aim to reduce the number of features in a dataset while preserving its essential information.");
	        System.out.println("   - Key Concepts:");
	        System.out.println("     - Principal Component Analysis (PCA)");
	        System.out.println("     - t-Distributed Stochastic Neighbor Embedding (t-SNE)");
	        System.out.println("     - Feature Importance and Selection");
	        System.out.println();

	        // Heading: Model Evaluation Metrics
	        System.out.println("3. Model Evaluation Metrics:");
	        System.out.println("   - Description: Understanding various evaluation metrics is crucial for assessing the performance of machine learning models.");
	        System.out.println("   - Key Concepts:");
	        System.out.println("     - Precision, Recall, and F1 Score");
	        System.out.println("     - Receiver Operating Characteristic (ROC) Curve");
	        System.out.println("     - Cross-Validation Techniques");
	        System.out.println();

	        // Heading: Time Series Analysis
	        System.out.println("4. Time Series Analysis:");
	        System.out.println("   - Description: Time series analysis focuses on analyzing and modeling data that evolves over time.");
	        System.out.println("   - Key Concepts:");
	        System.out.println("     - Trends, Seasonality, and Residuals");
	        System.out.println("     - Autoregressive Integrated Moving Average (ARIMA)");
	        System.out.println("     - Prophet for Time Series Forecasting");
	        System.out.println();

	        // Heading: Natural Language Processing (NLP)
	        System.out.println("5. Natural Language Processing (NLP):");
	        System.out.println("   - Description: NLP involves the interaction between computers and humans using natural language.");
	        System.out.println("   - Key Concepts:");
	        System.out.println("     - Tokenization and Lemmatization");
	        System.out.println("     - Bag-of-Words and Word Embeddings");
	        System.out.println("     - Named Entity Recognition (NER)");
	        System.out.println();

	        // Heading: Ensemble Learning
	        System.out.println("6. Ensemble Learning:");
	        System.out.println("   - Description: Ensemble learning combines the predictions of multiple machine learning models to improve overall performance.");
	        System.out.println("   - Key Concepts:");
	        System.out.println("     - Random Forests and Gradient Boosting");
	        System.out.println("     - Stacking and Bagging");
	        System.out.println("     - Hyperparameter Tuning");
	        System.out.println();

	        // Heading: Clustering Techniques
	        System.out.println("7. Clustering Techniques:");
	        System.out.println("   - Description: Clustering involves grouping similar data points together in an unsupervised manner.");
	        System.out.println("   - Key Concepts:");
	        System.out.println("     - K-Means and Hierarchical Clustering");
	        System.out.println("     - Density-Based Spatial Clustering of Applications with Noise (DBSCAN)");
	        System.out.println("     - Evaluating Cluster Validity");
	        System.out.println();

	        // Heading: Recommender Systems
	        System.out.println("8. Recommender Systems:");
	        System.out.println("   - Description: Recommender systems suggest items to users based on their preferences and behavior.");
	        System.out.println("   - Key Concepts:");
	        System.out.println("     - Collaborative Filtering and Content-Based Filtering");
	        System.out.println("     - Matrix Factorization");
	        System.out.println("     - Hybrid Recommender Systems");
	        System.out.println();

	        // Heading: Introduction to Deep Learning
	        System.out.println("9. Introduction to Deep Learning:");
	        System.out.println("   - Description: Deep learning involves neural networks with multiple layers, capable of learning complex representations from data.");
	        System.out.println("   - Key Concepts:");
	        System.out.println("     - Neural Network Architectures");
	        System.out.println("     - Convolutional Neural Networks (CNNs)");
	        System.out.println("     - Recurrent Neural Networks (RNNs)");
	        System.out.println();

	        // Heading: Deployment of Machine Learning Models
	        System.out.println("10. Deployment of Machine Learning Models:");
	        System.out.println("    - Description: Deploying models involves making them available for use in real-world applications.");
	        System.out.println("    - Key Concepts:");
	        System.out.println("      - Model Serialization and APIs");
	        System.out.println("      - Docker Containers for Model Deployment");
	        System.out.println("      - Continuous Integration and Continuous Deployment (CI/CD)");
	        System.out.println();
	   
	        String update = "UPDATE dataScience SET intermediate = ? where email = ?";
            try (PreparedStatement update1 = krishna.prepareStatement(update)) {
                update1.setBoolean(1,true);
                update1.setString(2,email);
                update1.executeUpdate();
            }
	        
			System.out.println("********************************************************************************************************************************");
			System.out.println("You completed 2nd Stage of Data Science");
	        System.out.println("If You want to continue enter 3");
	        System.out.println("If you want to quit enter 7");
	        choice = sc.nextInt();
		}
		if(choice ==3) {
			System.out.println("*******************Advanced Data Science**********************************");

	        // Heading: Advanced Natural Language Processing (NLP)
	        System.out.println("1. Advanced Natural Language Processing (NLP):");
	        System.out.println("   - Description: Advanced NLP explores cutting-edge techniques for understanding and generating human language.");
	        System.out.println("   - Key Concepts:");
	        System.out.println("     - Transformer Models (e.g., BERT, GPT-3)");
	        System.out.println("     - Transfer Learning in NLP");
	        System.out.println("     - NLP for Sentiment Analysis and Named Entity Recognition");
	        System.out.println();

	        // Heading: Reinforcement Learning
	        System.out.println("2. Reinforcement Learning:");
	        System.out.println("   - Description: Reinforcement learning involves training agents to make decisions through trial and error, receiving rewards or penalties.");
	        System.out.println("   - Key Concepts:");
	        System.out.println("     - Markov Decision Processes (MDPs)");
	        System.out.println("     - Q-Learning and Deep Q Networks (DQN)");
	        System.out.println("     - Policy Gradient Methods");
	        System.out.println();

	        // Heading: Bayesian Methods
	        System.out.println("3. Bayesian Methods:");
	        System.out.println("   - Description: Bayesian methods involve updating beliefs based on prior knowledge and new evidence, often used for probabilistic modeling.");
	        System.out.println("   - Key Concepts:");
	        System.out.println("     - Bayesian Inference");
	        System.out.println("     - Markov Chain Monte Carlo (MCMC)");
	        System.out.println("     - Bayesian Neural Networks");
	        System.out.println();

	        // Heading: AutoML (Automated Machine Learning)
	        System.out.println("4. AutoML (Automated Machine Learning):");
	        System.out.println("   - Description: AutoML automates the process of selecting, training, and optimizing machine learning models, making data science more accessible.");
	        System.out.println("   - Key Concepts:");
	        System.out.println("     - Hyperparameter Tuning");
	        System.out.println("     - Automated Feature Engineering");
	        System.out.println("     - Model Selection and Stacking");
	        System.out.println();

	        // Heading: Explainable AI (XAI)
	        System.out.println("5. Explainable AI (XAI):");
	        System.out.println("   - Description: XAI focuses on making machine learning models more interpretable and understandable, essential for applications in sensitive domains.");
	        System.out.println("   - Key Concepts:");
	        System.out.println("     - LIME (Local Interpretable Model-agnostic Explanations)");
	        System.out.println("     - SHAP (SHapley Additive exPlanations)");
	        System.out.println("     - Model-Agnostic Approaches to Interpretability");
	        System.out.println();

	        // Heading: Time Series Forecasting with Deep Learning
	        System.out.println("6. Time Series Forecasting with Deep Learning:");
	        System.out.println("   - Description: Advanced techniques leverage deep learning models for more accurate and complex time series forecasting.");
	        System.out.println("   - Key Concepts:");
	        System.out.println("     - Long Short-Term Memory (LSTM) Networks");
	        System.out.println("     - Gated Recurrent Units (GRUs)");
	        System.out.println("     - Attention Mechanisms");
	        System.out.println();

	        // Heading: Graph Analytics
	        System.out.println("7. Graph Analytics:");
	        System.out.println("   - Description: Graph analytics focuses on analyzing and extracting insights from complex networks and graph-structured data.");
	        System.out.println("   - Key Concepts:");
	        System.out.println("     - PageRank and Centrality Measures");
	        System.out.println("     - Community Detection");
	        System.out.println("     - Graph Neural Networks (GNNs)");
	        System.out.println();

	        // Heading: Anomaly Detection
	        System.out.println("8. Anomaly Detection:");
	        System.out.println("   - Description: Anomaly detection involves identifying patterns that deviate from expected behavior, critical for identifying outliers or potential issues.");
	        System.out.println("   - Key Concepts:");
	        System.out.println("     - Statistical Methods for Anomaly Detection");
	        System.out.println("     - Machine Learning-Based Approaches");
	        System.out.println("     - One-Class SVM and Isolation Forests");
	        System.out.println();

	        // Heading: Adversarial Machine Learning
	        System.out.println("9. Adversarial Machine Learning:");
	        System.out.println("   - Description: Adversarial ML explores the vulnerabilities of machine learning models to adversarial attacks and methods to improve robustness.");
	        System.out.println("   - Key Concepts:");
	        System.out.println("     - Adversarial Examples");
	        System.out.println("     - Generative Adversarial Networks (GANs)");
	        System.out.println("     - Adversarial Training");
	        System.out.println();

	        // Heading: Advanced Model Deployment
	        System.out.println("10. Advanced Model Deployment:");
	        System.out.println("    - Description: Advanced model deployment involves deploying machine learning models at scale with considerations for scalability, monitoring, and maintenance.");
	        System.out.println("    - Key Concepts:");
	        System.out.println("      - Kubernetes for Model Orchestration");
	        System.out.println("      - Model Versioning and A/B Testing");
	        System.out.println("      - Continuous Monitoring and Model Drift Detection");
	        System.out.println();
	   
	        String update4 = "UPDATE dataScience SET advance = ? where email = ?";
            try (PreparedStatement update5 = krishna.prepareStatement(update4)) {
                update5.setBoolean(1, true);
                update5.setString(2, email);
                update5.executeUpdate();
            }
	        
			System.out.println("********************************************************************************************************************************");
	        System.out.println("You completed 3rd Stage of Data Science");
	        System.out.println("If You want to continue enter 4");
	        System.out.println("If you want to quit enter 7");
	        choice = sc.nextInt();
		}
		if(choice ==4) {
			System.out.println("*******************Expert Data Science************************************");

	        // Heading: Deep Reinforcement Learning
	        System.out.println("1. Deep Reinforcement Learning:");
	        System.out.println("   - Description: Expert-level data scientists delve into advanced reinforcement learning techniques using deep neural networks.");
	        System.out.println("   - Key Concepts:");
	        System.out.println("     - Deep Q Networks (DQN) and Policy Gradients");
	        System.out.println("     - Proximal Policy Optimization (PPO)");
	        System.out.println("     - Actor-Critic Architectures");
	        System.out.println();

	        // Heading: Bayesian Optimization
	        System.out.println("2. Bayesian Optimization:");
	        System.out.println("   - Description: Bayesian optimization is an advanced optimization technique used for optimizing complex and computationally expensive objective functions.");
	        System.out.println("   - Key Concepts:");
	        System.out.println("     - Gaussian Processes for Surrogate Modeling");
	        System.out.println("     - Acquisition Functions (UCB, EI)");
	        System.out.println("     - Bayesian Hyperparameter Optimization");
	        System.out.println();

	        // Heading: Causal Inference
	        System.out.println("3. Causal Inference:");
	        System.out.println("   - Description: Expert data scientists explore causal inference to understand cause-and-effect relationships from observational data.");
	        System.out.println("   - Key Concepts:");
	        System.out.println("     - Potential Outcomes and Counterfactuals");
	        System.out.println("     - Instrumental Variables");
	        System.out.println("     - Propensity Score Matching");
	        System.out.println();

	        // Heading: Time Series Forecasting with Bayesian Methods
	        System.out.println("4. Time Series Forecasting with Bayesian Methods:");
	        System.out.println("   - Description: Expert practitioners leverage Bayesian approaches for more robust and uncertainty-aware time series forecasting.");
	        System.out.println("   - Key Concepts:");
	        System.out.println("     - Bayesian Structural Time Series (BSTS)");
	        System.out.println("     - Dynamic Linear Models (DLM)");
	        System.out.println("     - Hierarchical Bayesian Models for Time Series");
	        System.out.println();

	        // Heading: Advanced Natural Language Processing (NLP) Techniques
	        System.out.println("5. Advanced Natural Language Processing (NLP) Techniques:");
	        System.out.println("   - Description: Experts in NLP explore advanced techniques for tasks such as sentiment analysis, text summarization, and language generation.");
	        System.out.println("   - Key Concepts:");
	        System.out.println("     - Transformers for NLP (e.g., GPT-3, T5)");
	        System.out.println("     - Pre-trained Language Models");
	        System.out.println("     - NLP for Multimodal Data");
	        System.out.println();

	        // Heading: Meta-Learning
	        System.out.println("6. Meta-Learning:");
	        System.out.println("   - Description: Meta-learning involves training models that can learn from a variety of tasks and adapt quickly to new tasks with limited data.");
	        System.out.println("   - Key Concepts:");
	        System.out.println("     - Model-Agnostic Meta-Learning (MAML)");
	        System.out.println("     - Reptile Algorithm");
	        System.out.println("     - Few-Shot Learning");
	        System.out.println();

	        // Heading: Responsible AI and Fairness
	        System.out.println("7. Responsible AI and Fairness:");
	        System.out.println("   - Description: Experts in data science prioritize ethical considerations, fairness, and responsible use of AI in their projects.");
	        System.out.println("   - Key Concepts:");
	        System.out.println("     - Fairness Metrics and Bias Detection");
	        System.out.println("     - Ethical AI Guidelines");
	        System.out.println("     - Interpretability and Explainability");
	        System.out.println();

	        // Heading: Quantum Machine Learning
	        System.out.println("8. Quantum Machine Learning:");
	        System.out.println("   - Description: Quantum machine learning explores the intersection of quantum computing and data science to solve complex problems.");
	        System.out.println("   - Key Concepts:");
	        System.out.println("     - Quantum Circuits for Machine Learning");
	        System.out.println("     - Quantum Machine Learning Algorithms");
	        System.out.println("     - Quantum Feature Maps");
	        System.out.println();

	        // Heading: Advanced Deployment Strategies
	        System.out.println("9. Advanced Deployment Strategies:");
	        System.out.println("   - Description: Expert data scientists employ advanced strategies for deploying and maintaining machine learning models in production environments.");
	        System.out.println("   - Key Concepts:");
	        System.out.println("     - Model Versioning and Rollbacks");
	        System.out.println("     - Canary Deployments and Blue-Green Deployments");
	        System.out.println("     - Serverless Architectures for ML");
	        System.out.println();

	        // Heading: AI in Healthcare and Precision Medicine
	        System.out.println("10. AI in Healthcare and Precision Medicine:");
	        System.out.println("    - Description: Experts in data science apply advanced AI techniques to healthcare for personalized treatment, diagnostics, and medical research.");
	        System.out.println("    - Key Concepts:");
	        System.out.println("      - Medical Imaging with Deep Learning");
	        System.out.println("      - Predictive Modeling for Disease Outcomes");
	        System.out.println("      - Ethical Considerations in AI for Healthcare");
	        System.out.println();
	   
	        String update8 = "UPDATE dataScience SET expert = ? where email= ?";
            try (PreparedStatement update9 = krishna.prepareStatement(update8)) {
                update9.setBoolean(1, true);
                update9.setString(2, email);
                update9.executeUpdate();
            }
	        
			System.out.println("********************************************************************************************************************************");
			System.out.println("You completed 4th Stage of Data Science");
	        System.out.println("If You want to continue enter 5");
	        System.out.println("If you want to quit enter 7");
	        choice = sc.nextInt();
		}
		if(choice ==5) {
			System.out.println("*******************Specialized Data Science (Computational Biology)*********");

	        // Heading: Genomic Data Analysis
	        System.out.println("1. Genomic Data Analysis:");
	        System.out.println("   - Description: In computational biology, experts analyze genomic data to understand genetic variations, gene expressions, and regulatory elements.");
	        System.out.println("   - Key Concepts:");
	        System.out.println("     - DNA Sequencing Technologies");
	        System.out.println("     - Variant Calling and Genome Assembly");
	        System.out.println("     - Comparative Genomics");
	        System.out.println();

	        // Heading: Bioinformatics Algorithms
	        System.out.println("2. Bioinformatics Algorithms:");
	        System.out.println("   - Description: Specialized data scientists develop and apply algorithms for processing biological data, including sequence alignment and structural prediction.");
	        System.out.println("   - Key Concepts:");
	        System.out.println("     - Smith-Waterman Algorithm for Local Alignment");
	        System.out.println("     - Hidden Markov Models (HMMs)");
	        System.out.println("     - Protein Structure Prediction");
	        System.out.println();

	        // Heading: Systems Biology
	        System.out.println("3. Systems Biology:");
	        System.out.println("   - Description: Experts in systems biology model and analyze complex biological systems, considering interactions between genes, proteins, and metabolites.");
	        System.out.println("   - Key Concepts:");
	        System.out.println("     - Network Biology");
	        System.out.println("     - Boolean Networks and Petri Nets");
	        System.out.println("     - Flux Balance Analysis (FBA)");
	        System.out.println();

	        // Heading: Pharmacogenomics
	        System.out.println("4. Pharmacogenomics:");
	        System.out.println("   - Description: Specialized data scientists in pharmacogenomics study the relationship between an individual's genetic makeup and their response to drugs.");
	        System.out.println("   - Key Concepts:");
	        System.out.println("     - Drug Metabolism and Pharmacokinetics");
	        System.out.println("     - Personalized Medicine");
	        System.out.println("     - GWAS (Genome-Wide Association Studies)");
	        System.out.println();

	        // Heading: Computational Immunology
	        System.out.println("5. Computational Immunology:");
	        System.out.println("   - Description: In this specialized field, experts use computational methods to analyze the immune system's response to pathogens and diseases.");
	        System.out.println("   - Key Concepts:");
	        System.out.println("     - Antigen-Antibody Interaction Modeling");
	        System.out.println("     - Immune Repertoire Sequencing");
	        System.out.println("     - T Cell Receptor (TCR) Analysis");
	        System.out.println();

	        // Heading: Structural Bioinformatics
	        System.out.println("6. Structural Bioinformatics:");
	        System.out.println("   - Description: Data scientists specializing in structural bioinformatics study the 3D structures of biological macromolecules to understand their functions.");
	        System.out.println("   - Key Concepts:");
	        System.out.println("     - Protein Folding Prediction");
	        System.out.println("     - Molecular Docking");
	        System.out.println("     - Structural Alignment");
	        System.out.println();

	        // Heading: Computational Neuroscience
	        System.out.println("7. Computational Neuroscience:");
	        System.out.println("   - Description: Experts in computational neuroscience use data science techniques to model and simulate neural systems, understanding brain function and diseases.");
	        System.out.println("   - Key Concepts:");
	        System.out.println("     - Neural Network Modeling");
	        System.out.println("     - Spike Train Analysis");
	        System.out.println("     - Brain Connectomics");
	        System.out.println();

	        // Heading: Single-Cell RNA Sequencing Analysis
	        System.out.println("8. Single-Cell RNA Sequencing Analysis:");
	        System.out.println("   - Description: Specialized data scientists analyze gene expression data at the single-cell level, providing insights into cellular heterogeneity.");
	        System.out.println("   - Key Concepts:");
	        System.out.println("     - scRNA-Seq Data Preprocessing");
	        System.out.println("     - Cell Clustering and Trajectory Inference");
	        System.out.println("     - Identification of Cell Types and States");
	        System.out.println();

	        // Heading: Computational Genomics in Cancer Research
	        System.out.println("9. Computational Genomics in Cancer Research:");
	        System.out.println("   - Description: Data scientists contribute to cancer research by analyzing genomic data to identify driver mutations, biomarkers, and potential therapeutic targets.");
	        System.out.println("   - Key Concepts:");
	        System.out.println("     - Cancer Genomics Data Analysis");
	        System.out.println("     - Oncogene and Tumor Suppressor Gene Identification");
	        System.out.println("     - Pharmacogenomic Approaches in Cancer Treatment");
	        System.out.println();

	        // Heading: Personal Genomics and Ethical Considerations
	        System.out.println("10. Personal Genomics and Ethical Considerations:");
	        System.out.println("    - Description: Specialized data scientists address ethical considerations in personal genomics, ensuring responsible use of genetic information.");
	        System.out.println("    - Key Concepts:");
	        System.out.println("      - Informed Consent in Genomic Studies");
	        System.out.println("      - Privacy and Security in Genomic Data");
	        System.out.println("      - Ethical Challenges in Genetic Counseling");
	        System.out.println();
	    
	        String update6 = "UPDATE dataScience SET specialized = ? where email= ?";
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
			String ch = "dataScience";
			email = c.check(email,ch);
		}
		if(choice == 7) {
			display d=new display();
			d.displays();
		}
	
	}
	

}
