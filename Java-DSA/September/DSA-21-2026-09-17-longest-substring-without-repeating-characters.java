// Practice date: 2026-09-17
// Problem: Longest Substring Without Repeating Characters
// Topic: Sliding Window
// Note: Standalone practice solution. Add test cases or a main method when practising.

import java.util.*;
class LongestUniqueSubstring {
    static int solve(String s) {
        Map<Character,Integer> last=new HashMap<>();int left=0,best=0;
        for(int r=0;r<s.length();r++){
            char c=s.charAt(r);
            if(last.containsKey(c))left=Math.max(left,last.get(c)+1);
            last.put(c,r);best=Math.max(best,r-left+1);
        }return best;
    }
}
