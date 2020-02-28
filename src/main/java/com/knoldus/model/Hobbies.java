package com.knoldus.model;

/**
 * This is a functional Interface with a single abstract method that takes 5 input parameters and returns the result.
 */
@FunctionalInterface
public interface Hobbies {
    String getAllHobbies(String hobby1, String hobby2, String hobby3, String hobby4, String hobby5);
}