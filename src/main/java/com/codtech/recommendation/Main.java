package com.codtech.recommendation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println("Enter User ID: ");
        int userId = scanner.nextInt();
        RecommenderEngine engine = new RecommenderEngine();
        try {
            engine.generateRecommendations("src/main/resources/data.csv", userID, 3);  // userID = 1, top 3 recommendations
        } catch (Exception _) {

        }
    }
}
