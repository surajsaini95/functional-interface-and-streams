package com.knoldus.controller;

import com.knoldus.model.User;

import java.util.List;
import java.util.stream.Collectors;

/**
 * This class can be used to perform operation on the User.
 */
public class UserOperations {

    /**
     * This method List out all the users with age above 18 and address Delhi.
     *
     * @param allUsers accepts list of all users.
     * @return list of users.
     */
    public static List<User> getAllAdultUsersFromDelhi(List<User> allUsers) {
        return allUsers.stream()
                .filter(user -> user.getAddress().equalsIgnoreCase("delhi") && Integer.parseInt(user.getAge()) > 18)
                .collect(Collectors.toList());
    }

    /**
     * This method List out all the users with id greater than 10 and age less than 20.
     *
     * @param allUsers accepts list of all users.
     * @return list of users.
     */
    public static List<User> getAllUsersAfterFilterOnIdAndAge(List<User> allUsers) {
        return allUsers.stream()
                .filter(user -> user.getId() > 10 && Integer.parseInt(user.getAge()) < 20)
                .collect(Collectors.toList());
    }

    /**
     * This method List out all the users with age as even number.
     *
     * @param allUsers accepts list of all users.
     * @return list of users.
     */
    public static List<User> getAllUsersWithEvenAgeNumber(List<User> allUsers) {
        return allUsers.stream()
                .filter(user -> Integer.parseInt(user.getAge()) % 2 == 0)
                .collect(Collectors.toList());
    }

    /**
     * This method List out all the users with age equals to 18 and address Delhi.
     *
     * @param allUsers accepts list of all users.
     * @return list of users.
     */
    public static List<User> getAllUsersAfterFilterOnAgeAndAddress(List<User> allUsers) {
        return allUsers.stream()
                .filter(user -> user.getAddress().equalsIgnoreCase("delhi") && user.getAge().equals("18"))
                .collect(Collectors.toList());
    }
}
