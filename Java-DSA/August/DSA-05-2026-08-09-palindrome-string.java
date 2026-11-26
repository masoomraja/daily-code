// Practice date: 2026-08-09
// Problem: Palindrome String
// Topic: Strings / Two Pointers
// Note: Standalone practice solution. Add test cases or a main method when practising.

class Palindrome {
    static boolean solve(String s) {
        int l=0,r=s.length()-1;
        while(l<r) if(s.charAt(l++)!=s.charAt(r--)) return false;
        return true;
    }
}
