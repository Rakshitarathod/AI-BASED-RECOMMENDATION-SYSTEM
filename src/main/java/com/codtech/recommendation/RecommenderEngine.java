package com.codtech.recommendation;


import org.apache.mahout.cf.taste.impl.model.file.*;
import org.apache.mahout.cf.taste.impl.neighborhood.*;
import org.apache.mahout.cf.taste.impl.recommender.*;
import org.apache.mahout.cf.taste.impl.similarity.*;
import org.apache.mahout.cf.taste.model.*;
import org.apache.mahout.cf.taste.neighborhood.*;
import org.apache.mahout.cf.taste.recommender.*;
import org.apache.mahout.cf.taste.similarity.*;

import java.io.*;
import java.util.List;

public class RecommenderEngine {

    public void generateRecommendations(String filePath, int userId, int numRecommendations) throws Exception {
        DataModel model = new FileDataModel(new File(filePath));

        UserSimilarity similarity = new PearsonCorrelationSimilarity(model);
        UserNeighborhood neighborhood = new NearestNUserNeighborhood(20, similarity, model);

        Recommender recommender = new GenericUserBasedRecommender(model, neighborhood, similarity);

        List<RecommendedItem> recommendations = recommender.recommend(userId, numRecommendations);

        System.out.println("Recommendations for user " + userId + ":");
        for (RecommendedItem item : recommendations) {
            System.out.println("Item ID: " + item.getItemID() + " , Score: " + item.getValue());
        }
    }
}
