package com.cses.solutions.Introductory;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeirdAlgorithmsTest {
    private void testAlgorithmOutput(int input, String expectedOutput) {
        ByteArrayInputStream in = new ByteArrayInputStream((input + "\n").getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        WeirdAlgorithms.main(new String[0]);

        assertEquals(expectedOutput.trim(), out.toString().trim());
    }

    @Test
    public void testWeirdAlgorithmForInput3() {
        int input = 3;
        String expectedOutput = "3 10 5 16 8 4 2 1";
        testAlgorithmOutput(input, expectedOutput);
    }

    @Test
    public void testWeirdAlgorithmForInput6() {
        int input = 6;
        String expectedOutput = "6 3 10 5 16 8 4 2 1";
        testAlgorithmOutput(input, expectedOutput);
    }

    @Test
    public void testWeirdAlgorithmForInput1() {
        int input = 1;
        String expectedOutput = "1";
        testAlgorithmOutput(input, expectedOutput);
    }

    @Test
    public void testWeirdAlgorithmForInput7() {
        int input = 7;
        String expectedOutput = "7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1";
        testAlgorithmOutput(input, expectedOutput);
    }
}
