// Practice date: 2026-08-03
// Problem: Reverse a String
// Topic: Strings / Two Pointers
// Note: Standalone practice solution. Add test cases or a main method when practising.

class ReverseString {
    static String solve(String s) {
        char[] a=s.toCharArray();
        for(int l=0,r=a.length-1;l<r;l++,r--){char t=a[l];a[l]=a[r];a[r]=t;}
        return new String(a);
    }
}
