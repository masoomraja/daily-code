// Practice date: 2026-10-07
// Problem: Factorial Using Recursion
// Topic: Recursion
// Note: Standalone practice solution. Add test cases or a main method when practising.

class Factorial {
    static long solve(int n){
        if(n<0)throw new IllegalArgumentException();
        return n<=1?1:n*solve(n-1);
    }
}
