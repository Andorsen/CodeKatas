package graze.katas;

import java.util.List;
import java.util.stream.Collectors;

public abstract class CommaSeparated
{
    private static StringBuilder s;

    public static String commaSeparatedString(List<Integer> integerList)
    {
        s = new StringBuilder();
        if(integerList.size()>0)
            s.append(intToStringWithPrefix(integerList.get(0)));


        for (int i = 1; i < integerList.size(); i++)
            s.append(intToStringWithPrefixAndComma(integerList.get(i)));
        return s.toString();
    }

    private static String intToStringWithPrefixAndComma(int i)
    {
        return "," + intToStringWithPrefix(i);
    }

    private static String intToStringWithPrefix(int i)
    {
        char prefix = i % 2 == 0 ? 'e' : 'o';
        return ""+ prefix + i;
    }

    public static String commaSeparatedStringUsingStream(List<Integer> integerList)
    {
        return integerList
                .stream()
                .map(CommaSeparated::intToStringWithPrefix)
                .collect(Collectors.joining(","));
    }
}
