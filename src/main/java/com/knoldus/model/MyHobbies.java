package com.knoldus.model;

/**
 * This class can have methods to perform operations on hobbies.
 */
public class MyHobbies {

    /**
     * This method take 5 hobbies as input and combine them to return result.
     *
     * @param hobby1 hobby1 passed as input.
     * @param hobby2 hobby2 passed as input.
     * @param hobby3 hobby3 passed as input.
     * @param hobby4 hobby4 passed as input.
     * @param hobby5 hobby5 passed as input.
     * @return result after combining hobbies.
     */
    public static String combineHobbies(String hobby1, String hobby2, String hobby3, String hobby4, String hobby5) {
        return String.format("My hobbies are %s,%s,%s,%s,%s", hobby1, hobby2, hobby3, hobby4, hobby5);
    }

}
