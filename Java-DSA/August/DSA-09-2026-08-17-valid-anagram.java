// Practice date: 2026-08-17
// Problem: Valid Anagram
// Topic: Strings / Frequency Array
// Note: Standalone practice solution. Add test cases or a main method when practising.

class ValidAnagram {
    static boolean solve(String a,String b) {
        if(a.length()!=b.length())return false;
        int[] f=new int[Character.MAX_VALUE+1];
        for(int i=0;i<a.length();i++){f[a.charAt(i)]++;f[b.charAt(i)]--;}
        for(int x:f)if(x!=0)return false;
        return true;
    }
}
