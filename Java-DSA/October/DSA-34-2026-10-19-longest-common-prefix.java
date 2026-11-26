// Practice date: 2026-10-19
// Problem: Longest Common Prefix
// Topic: Strings
// Note: Standalone practice solution. Add test cases or a main method when practising.

class LongestCommonPrefix {
    static String solve(String[]a){
        if(a.length==0)return "";String p=a[0];
        for(int i=1;i<a.length;i++)while(!a[i].startsWith(p))p=p.substring(0,p.length()-1);
        return p;
    }
}
