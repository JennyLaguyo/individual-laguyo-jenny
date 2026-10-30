package com.joysistvi.day13.stringclass;

/*
 * Activity 10 - Java String Method: contains()
 * Student: Laguyo, Jenny
 *
 * Explanation:
 * The contains() method searches a string to check if a specific sequence
 * of characters exists inside it. It returns a boolean value: true or false.
 */
public class Activity10_LaguyoJen {

    public static void main(String[] args) {
        // Sample original string used for demonstration
        String originalText = "Hello, welcome to Java class!";

        // -----------------------------------------------------------------
        // 1. MATCHING AN EXISTING SUBSTRING
        // -----------------------------------------------------------------
        // contains() checks if "Java" is present inside originalText.
        // Returns true because "Java" is in the sentence.
        boolean hasJava = originalText.contains("Java");
        System.out.println("Does text contain 'Java'? -> " + hasJava);
        // Output: true

        // -----------------------------------------------------------------
        // 2. CHECKING FOR NON-EXISTENT SUBSTRING
        // -----------------------------------------------------------------
        // Returns false because "Python" is not inside originalText.
        boolean hasPython = originalText.contains("Python");
        System.out.println("Does text contain 'Python'? -> " + hasPython);
        // Output: false

        // -----------------------------------------------------------------
        // 3. CASE SENSITIVITY CHECK
        // -----------------------------------------------------------------
        // contains() is strict about letter cases (case-sensitive).
        // "java" with a lowercase 'j' returns false because the string has "Java".
        boolean hasLowercaseJava = originalText.contains("java");
        System.out.println("Does text contain lowercase 'java'? -> " + hasLowercaseJava);
        // Output: false

        // -----------------------------------------------------------------
        // 4. COMMON USE CASE: IF-ELSE CONDITION
        // -----------------------------------------------------------------
        // Frequently used in conditions to filter input or validate text.
        if (originalText.contains("welcome")) {
            System.out.println("Greeting detected in the text!");
        } else {
            System.out.println("No greeting found.");
        }
    }
}