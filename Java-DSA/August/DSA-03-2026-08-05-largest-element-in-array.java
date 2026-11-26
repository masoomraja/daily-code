// Practice date: 2026-08-05
// Problem: Largest Element in Array
// Topic: Arrays
// Note: Standalone practice solution. Add test cases or a main method when practising.

class LargestElement {
    static int solve(int[] a) {
        if(a.length==0) throw new IllegalArgumentException("Empty array");
        int max=a[0]; for(int x:a) max=Math.max(max,x); return max;
    }
}
