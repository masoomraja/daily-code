// Practice date: 2026-10-05
// Problem: Fibonacci Number
// Topic: Dynamic Programming
// Note: Standalone practice solution. Add test cases or a main method when practising.

class Fibonacci {
    static long solve(int n){
        if(n<0)throw new IllegalArgumentException();
        long a=0,b=1;for(int i=0;i<n;i++){long c=a+b;a=b;b=c;}return a;
    }
}
