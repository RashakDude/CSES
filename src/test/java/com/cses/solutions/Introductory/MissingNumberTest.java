package com.cses.solutions.Introductory;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissingNumberTest {
    private void testMissingNumberOutput(String input, String expectedOutput) {
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        MissingNumber.main(new String[0]);

        assertEquals(expectedOutput.trim(), out.toString().trim());
    }

    @Test
    public void testMissingNumberForInput1() {
        String input = "5\n2\n3\n1\n5";
        String expectedOutput = "4";
        testMissingNumberOutput(input, expectedOutput);
    }

    @Test
    public void testMissingNumberForInput2() {
        String input = "4\n2\n4\n1";
        String expectedOutput = "3";
        testMissingNumberOutput(input, expectedOutput);
    }

    @Test
    public void testMissingNumberForInput3() {
        String input = "10\n1\n2\n3\n4\n5\n6\n7\n8\n9";
        String expectedOutput = "10";
        testMissingNumberOutput(input, expectedOutput);
    }

    @Test
    public void testMissingNumberForInput4() {
        String input = "3\n1\n3";
        String expectedOutput = "2";
        testMissingNumberOutput(input, expectedOutput);
    }

    @Test
    public void testMissingNumberForInput5() {
        String input = "2\n1";
        String expectedOutput = "2";
        testMissingNumberOutput(input, expectedOutput);
    }
}
