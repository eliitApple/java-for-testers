package com.serenitydojo;

import org.junit.Test;

public class HelloWorldWriterTest {
    @Test
    public void shouldWriteHelloWorldToTheConsole() {
        HelloWorldWriter writer = new HelloWorldWriter();
        writer.writeHelloWorld();
    }

    @Test
    public void declaringNumericalVariables() {
        final int ageThisYear = 42;

        int ageNextYear = ageThisYear + 1;

        long starsInGalaxy = 10000000000L;

        double weight = 15.5;

        System.out.println("age is " + ageNextYear);

    }

    @Test
    public void workingWithStrings() {
        String firstName = "Sarah-Jane  ";
        String upperCaseFirstName = firstName.replace("Sarah", "Mary");
        firstName.
        System.out.println(upperCaseFirstName.trim());
    }
}
