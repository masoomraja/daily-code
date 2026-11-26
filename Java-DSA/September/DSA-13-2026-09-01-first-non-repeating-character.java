// Practice date: 2026-09-01
// Problem: First Non-Repeating Character
// Topic: HashMap / Strings
// Note: Standalone practice solution. Add test cases or a main method when practising.

import java.util.*;
class FirstUnique {
    static int solve(String s) {
        Map<Character,Integer> f=new HashMap<>();
        for(char c:s.toCharArray())f.put(c,f.getOrDefault(c,0)+1);
        for(int i=0;i<s.length();i++)if(f.get(s.charAt(i))==1)return i;
        return -1;
    }
}
