// Practice date: 2026-10-09
// Problem: Fast Power
// Topic: Recursion / Binary Exponentiation
// Note: Standalone practice solution. Add test cases or a main method when practising.

class FastPower {
    static double solve(double x,int n){
        long e=n;if(e<0){x=1/x;e=-e;}double ans=1;
        while(e>0){if((e&1)==1)ans*=x;x*=x;e>>=1;}return ans;
    }
}
