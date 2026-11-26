// Practice date: 2026-09-05
// Problem: Valid Parentheses
// Topic: Stack
// Note: Standalone practice solution. Add test cases or a main method when practising.

import java.util.*;
class ValidParentheses {
    static boolean solve(String s) {
        Deque<Character> st=new ArrayDeque<>();
        for(char c:s.toCharArray()){
            if(c=='('||c=='['||c=='{')st.push(c);
            else{
                if(st.isEmpty())return false;
                char o=st.pop();
                if((c==')'&&o!='(')||(c==']'&&o!='[')||(c=='}'&&o!='{'))return false;
            }
        }return st.isEmpty();
    }
}
