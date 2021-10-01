/*
  Comma Separated (Java 8 Lambdas and Streams)
  Write a method that returns a comma-separated string based on a given list of integers.
  Each element should be preceded by the letter 'e' if the number is even,
  and preceded by the letter 'o' if the number is odd.
  For example, if the input list is (3,44), the output should be 'o3,e44'.
 */

import graze.katas.CommaSeparated;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CommaSeparatedTest
{
    @Test
    void canCreateInstance()
    {
        CommaSeparated commaSeparated = new CommaSeparated();
        assertNotNull(commaSeparated);
    }

    @Test
    void name()
    {
    }
}
