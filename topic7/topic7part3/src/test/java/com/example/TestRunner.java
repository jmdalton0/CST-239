package com.example;

import org.junit.runner.*;
import org.junit.runner.notification.Failure;

public class TestRunner {

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestAssertions.class);

        for (Failure failure : result.getFailures()) {
            System.out.println("A test failed: " + failure.toString());
        }

        System.out.println("Tests " + (result.wasSuccessful() ? "Passed" : "Failed"));
    }
    
}
