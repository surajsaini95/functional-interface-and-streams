package com.knoldus.view;

import com.knoldus.model.Hobbies;
import com.knoldus.model.MyHobbies;
import com.knoldus.model.User;
import com.knoldus.controller.UserOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * This is the driver class used to call all the functionalities.
 */
public class AppDriver {

    public static void main(String[] args) {

        solution1();
        solution2();
        solution3();
        solution4();

    }

    /**
     * Solution 1 can be viewed by this method.
     */
    public static void solution1() {
        Hobbies hobbies = MyHobbies::combineHobbies;
        System.out.println(hobbies.getAllHobbies("cooking", "singing", "dancing", "learning", "chatting"));
    }

    /**
     * Solution 2 can be viewed by this method.
     */
    public static void solution2() {
        List<String> listOfCities = Arrays.asList("Gurgaon", "Chennai", "Pune", "delhi", "chandigarh");
        List<String> cityStartingWithC = listOfCities.stream()
                .filter(city -> city.toUpperCase().startsWith("C"))
                .sorted()
                .collect(Collectors.toList());

        System.out.println("\n\nSorted list of cities starting with 'C' are :");
        cityStartingWithC.forEach(System.out::println);
    }

    /**
     * Solution 3 can be viewed by this method.
     */
    public static void solution3() {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(2, 3, 4, 5, 6);

        List<Integer> list3 = IntStream.range(0, list1.size())
                .map(i -> list1.get(i) * list2.get(i))
                .boxed()
                .collect(Collectors.toList());

        System.out.println("\n\nElements of list 3 are : ");
        list3.forEach(System.out::println);
    }

    /**
     * Solution 4 can be viewed by this method.
     */
    public static void solution4() {
        List<User> allUsers = Arrays.asList(new User(1, "sam", "Delhi", "20"),
                new User(2, "rohan", "Noida", "29"),
                new User(3, "toni", "Delhi", "8"),
                new User(11, "nakul", "Delhi", "18"));

        System.out.println("\n\nAll the users with age above 18 and address Delhi are : ");
        UserOperations.getAllAdultUsersFromDelhi(allUsers).forEach(System.out::println);

        System.out.println("\n\nAll the users with id greater than 10 and age less than 20 are :");
        UserOperations.getAllUsersAfterFilterOnIdAndAge(allUsers).forEach(System.out::println);

        System.out.println("\n\nAll the users with age as even number are :");
        UserOperations.getAllUsersWithEvenAgeNumber(allUsers).forEach(System.out::println);

        System.out.println("\n\nAll the users with age equals to 18 and address Delhi are :");
        UserOperations.getAllUsersAfterFilterOnAgeAndAddress(allUsers).forEach(System.out::println);
    }
}
