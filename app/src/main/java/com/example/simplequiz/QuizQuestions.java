package com.example.simplequiz;

/**
 * This file contains all the questions for the quiz. Each question has four choices and
 * one correct answer.
 */
public class QuizQuestions {
    /**
     * All of the questions
     */
    public String questions[] = {
            "Which of these plastic bottles are recyclable?",
            "Which of these materials can be recycled?",
            "Which of these are NOT recyclable?",
            "All these words indicate items designed to be composted (not recycled) except:",
            "Our recycling program currently accepts:",
            "Which of the following metal items can be recycled?",
            "All of these paper food containers can be recycled except what?",
            "Which of the following food waste items is NOT recommended to compost?",
            "Which of the following paper products is NOT compostable?",
            "Which of the following hygiene products can be composted?"
    };

    /**
     * All of the answers for each question
     */
    public String choices[][] = {
            {"Shampoo Bottle", "Dish Soap", "Window Cleaner", "All of the above"},
        {"Metal Oil Cans", "Batteries", "EggCartons", "None of the above"},
        {"Bottles", "Clamshells - clear boxes marked ‘1’ or ‘PETE’ on the bottom", "Tubs commonly used to hold margarine, yogurt, and sour cream", "Plastic lids"},
        {"PLA", "compostable", "biodegradable", "recycle"},
        {"plastic bottles", "plastic lids", "pumps", "items previously containing hazardous material"},
        {"Coat Hangers", "Aerosol Cans", "Aluminum Foil", "Oil Cans" },
        {"Egg Cartons", "Cereal Boxes", "Milk Cartons", "Juice Boxes"},
        {"Fish Bones", "Egg Shells", "Tea Bags", "Coffee Grounds"},
        {"Shredded Newspaper", "Cardboard", "Receipts", "Glossy Paper"},
        {"Baby Wipes", "Dental Foss", "Cotton Rags", "Elastic Hair Ties"}
    };

    /**
     * The correct answer for each question
     */
    public String correctAnswer[] = {
            "All of the above",
            "None of the above",
            "Plastic lids",
            "recycle",
            "Plastic bottles",
            "Aluminum Foil",
            "Egg Cartons",
            "Fish Bones",
            "Glossy Paper",
            "Cotton Rags"
    };

    public String getQuestion(int numQuestion){
        String question = questions[numQuestion];
        return question;
    }

    public String getChoice1(int numQuestion){
        String choice = choices[numQuestion][0];
        return choice;
    }

    public String getChoice2(int numQuestion){
        String choice = choices[numQuestion][1];
        return choice;
    }

    public String getChoice3(int numQuestion){
        String choice = choices[numQuestion][2];
        return choice;
    }

    public String getChoice4(int numQuestion){
        String choice = choices[numQuestion][3];
        return choice;
    }

    public String getCorrectAnswer(int numQuestion){
        String answer = correctAnswer[numQuestion];
        return answer;
    }
}
