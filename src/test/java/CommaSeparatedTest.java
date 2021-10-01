/*
  Comma Separated (Java 8 Lambdas and Streams)
  Write a method that returns a comma-separated string based on a given list of integers.
  Each element should be preceded by the letter 'e' if the number is even,
  and preceded by the letter 'o' if the number is odd.
  For example, if the input list is (3,44), the output should be 'o3,e44'.
 */

import graze.katas.CommaSeparated;
import static graze.katas.CommaSeparated.commaSeparatedString;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CommaSeparatedTest
{
    List<Integer> integerList;

    private void addToList(int... ints)
    {
        for(int i : ints)
            integerList.add(i);
    }
    @BeforeEach
    void setUp()
    {
        integerList = new ArrayList<>();
    }

    @Test
    void emptyList_returnsEmptyString()
    {
        assertEquals("", commaSeparatedString(integerList));
    }

    @Test
    void listOf1_returnsNonEmptyString()
    {
        integerList.add(1);
        assertNotEquals("", commaSeparatedString(integerList));
    }

    @Test
    void listOf1_returns_o1()
    {
        integerList.add(1);
        assertEquals("o1", commaSeparatedString(integerList));
    }

    @Test
    void listOfTwoInts_returnsWithOneComma()
    {
        integerList.add(1);
        integerList.add(1);
        assertEquals("o1,o1", commaSeparatedString(integerList));
    }

    @Test
    void listOf2_returns_e2()
    {
        integerList.add(2);
        assertEquals("e2", commaSeparatedString(integerList));
    }

    @Test
    void listOf135()
    {
        addToList(1, 3, 5);
        assertEquals("o1,o3,o5", commaSeparatedString(integerList));
    }

    @Test
    void listOf246()
    {
        addToList(2, 4, 6);
        assertEquals("e2,e4,e6", commaSeparatedString(integerList));
    }

    @Test
    void listOf1234567890()
    {
        addToList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        assertEquals("o1,e2,o3,e4,o5,e6,o7,e8,o9,e0",
                commaSeparatedString(integerList));
    }

    @Test
    void listOf1234567890_usingStream()
    {
        addToList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        assertEquals("o1,e2,o3,e4,o5,e6,o7,e8,o9,e0",
                CommaSeparated.commaSeparatedStringUsingStream(integerList));
    }
}
