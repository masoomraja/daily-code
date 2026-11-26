// Practice date: 2026-08-13
// Problem: Missing Number
// Topic: Arrays / Math
// Note: Standalone practice solution. Add test cases or a main method when practising.

class MissingNumber {
    static int solve(int[] a) {
        long n=a.length, sum=n*(n+1)/2;
        for(int x:a) sum-=x;
        return (int)sum;
    }
}
