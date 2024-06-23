package com.cses.solutions.Introductory;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RepetitionsTest {
    private void testLongestRepetitionOutput(String input, String expectedOutput) {
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Repetitions.main(new String[0]);

        assertEquals(expectedOutput.trim(), out.toString().trim());
    }

    @Test
    public void testLongestRepetitionForSingleCharacter() {
        String input = "A";
        String expectedOutput = "1";
        testLongestRepetitionOutput(input, expectedOutput);
    }

    @Test
    public void testLongestRepetitionForNoRepetition() {
        String input = "ACGT";
        String expectedOutput = "1";
        testLongestRepetitionOutput(input, expectedOutput);
    }

    @Test
    public void testLongestRepetitionForMultipleRepetitions() {
        String input = "ATTCGGGA";
        String expectedOutput = "3";
        testLongestRepetitionOutput(input, expectedOutput);
    }

    @Test
    public void testLongestRepetitionForAllSameCharacters() {
        String input = "AAAAA";
        String expectedOutput = "5";
        testLongestRepetitionOutput(input, expectedOutput);
    }

    @Test
    public void testLongestRepetitionForMixedCharacters() {
        String input = "AAGGTTTCC";
        String expectedOutput = "3";
        testLongestRepetitionOutput(input, expectedOutput);
    }

    @Test
    public void testLongestRepetitionForBeginningRepetition() {
        String input = "CCCCATTG";
        String expectedOutput = "4";
        testLongestRepetitionOutput(input, expectedOutput);
    }

    @Test
    public void testLongestRepetitionForEndRepetition() {
        String input = "GTTAAA";
        String expectedOutput = "3";
        testLongestRepetitionOutput(input, expectedOutput);
    }
}
