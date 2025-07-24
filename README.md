# AI-BASED-RECOMMENDATION-SYSTEM

*COMPANY* : CODETECH IT SOLUTIONS

*NAME* : RAKSHITA RATHOD

*INTERN ID* : CT04DH1485

*DOMAIN* : JAVA PROGRAMMING

*DURATION* : 4 WEEKS

*MENTOR* :NEELA SANTOSH

*DESCRIPTION*

# 🤖 AI-Based Recommendation System using Apache Mahout

## 🧾 Project Overview

This is a **Java-based Recommendation System** built using **Apache Mahout**, a powerful machine learning library for collaborative filtering. The system reads user-item preference data from a CSV file and generates personalized recommendations using **user-based collaborative filtering**.

It is designed for learning purposes and ideal for students and beginners who want to implement real recommendation logic using real algorithms like **Pearson Correlation Similarity**, **Nearest Neighbors**, and **GenericUserBasedRecommender**.

---

## 🎯 Features

- 📥 Reads data from a CSV file (`data.csv`)
- 👤 Accepts a `userId` to generate recommendations
- 🧠 Uses **User-based Collaborative Filtering**
- 🧮 Calculates **similarity** using **PearsonCorrelationSimilarity**
- 🧍 Recommends top N items based on nearest neighbors
- 📊 Prints recommendation list with item ID and predicted rating score

---

## 🛠️ Technologies Used

- Java SE 17+  
- [Apache Mahout](https://mahout.apache.org/) (for recommendation engine)  
- SLF4J (for logging)  
- CSV file (as dataset)  
- IntelliJ / Eclipse / VS Code with Maven or manual JARs

---


---

## 🧾 Sample CSV Format (`data.csv`)

1,101,4.0
1,102,3.5
2,101,5.0
2,103,2.0
3,104,4.5


Each row format: `userID,itemID,rating`

---

## 🚀 How to Run

### 1. Requirements

- Java JDK 17 or later  
- Apache Mahout JARs (or use Maven dependency)  
- IDE (like IntelliJ) or terminal

### 2. Add Dependencies

If you're not using Maven, download these libraries and add them to your classpath:

- `mahout-core-x.x.jar`  
- `slf4j-api.jar`  
- `slf4j-simple.jar`

Maven users can use:

```xml
<dependency>
  <groupId>org.apache.mahout</groupId>
  <artifactId>mahout-core</artifactId>
  <version>0.13.0</version>
</dependency>

Run Program
Compile and run Main.java. It will read from data.csv, and generate top N recommendations for a given user.

💡 Example Output
<img width="1203" height="323" alt="Image" src="https://github.com/user-attachments/assets/77870166-ffdd-48d2-8685-677afd9e9b95" />

## 🧠 Learning Outcomes

- Understanding collaborative filtering  
- Using Apache Mahout's recommender classes  
- Applying Pearson correlation to find user similarity  
- Reading and parsing data from a file  
- Clean and modular Java coding practices  

---

## 📌 Future Enhancements

- Use Item-based filtering instead of user-based  
- Add a frontend UI using JavaFX or React  
- Visualize recommendations using charts  
- Integrate with a database instead of a CSV file  
- Support login/auth for different users  

---

## 📋 Tips

- Always ensure your `data.csv` has valid numeric IDs and ratings (float/double)  
- You can increase `NearestNUserNeighborhood` value for better accuracy  
- Log output using SLF4J instead of `System.out.println()` for production systems  
