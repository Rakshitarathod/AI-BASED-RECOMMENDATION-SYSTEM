package com.codtech.recommendation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        RecommenderEngine engine = new RecommenderEngine();
        try {
            engine.generateRecommendations("src/main/resources/data.csv", 1, 3);  // userID = 1, top 3 recommendations
        } catch (Exception _) {

        }
    }
}
