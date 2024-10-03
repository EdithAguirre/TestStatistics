/*
Program that gets the average test score, highest score, lowest score, and median
given an array of test scores.
 */
package com.pluralsight;
import java.util.Arrays;

public class TestStatistics {
    public static void main(String[] args) {

        // Create an array of 10 test scores
        int[] testScores = {100,95,100,80,75,87,95,85,93,100};

        // Declare and initialize variables needed for calculations
        float sum = 0f;
        int highestScore = testScores[0];
        int lowestScore = testScores[0];

        // Loop to go through each array item and calculate average, high score, and low score
        for (int i = 0; i < testScores.length; i++) {

            // calculate the sum to find the average
            sum += testScores[i];

            // Determine the highest score
            if(testScores[i] > highestScore){
                highestScore = testScores[i];
            }

            // Determine the lowest score
            if(testScores[i] < lowestScore){
                lowestScore = testScores[i];
            }
        }

        // Finish calculating the average test score by dividing the scores sum by number of scores
        double testScoresAverage = sum / testScores.length;

        // BONUS: Calculate the median score by sorting array and getting the middle value
        Arrays.sort(testScores);
        int median = testScores[(testScores.length-1)/2];

        // Display the test score average, highest score, lowest score, and median
        System.out.println("Average: " + testScoresAverage);
        System.out.println("High score: " + highestScore);
        System.out.println("Low score: " + lowestScore);
        System.out.println("Median score: " + median);
    }
}