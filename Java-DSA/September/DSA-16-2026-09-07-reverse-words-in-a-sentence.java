// Practice date: 2026-09-07
// Problem: Reverse Words in a Sentence
// Topic: Strings
// Note: Standalone practice solution. Add test cases or a main method when practising.

import java.util.*;
class ReverseWords {
    static String solve(String s) {
        if(s.trim().isEmpty())return "";
        String[] w=s.trim().split("\\s+");
        Collections.reverse(Arrays.asList(w));
        return String.join(" ",w);
    }
}
