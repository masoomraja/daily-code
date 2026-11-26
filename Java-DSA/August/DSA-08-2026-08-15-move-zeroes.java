// Practice date: 2026-08-15
// Problem: Move Zeroes
// Topic: Arrays / Two Pointers
// Note: Standalone practice solution. Add test cases or a main method when practising.

class MoveZeroes {
    static void solve(int[] a) {
        int w=0; for(int x:a) if(x!=0)a[w++]=x;
        while(w<a.length)a[w++]=0;
    }
}
