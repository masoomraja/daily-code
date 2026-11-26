// Practice date: 2026-11-19
// Problem: Find Peak Element
// Topic: Binary Search
// Note: Standalone practice solution. Add test cases or a main method when practising.

class PeakElement {
    static int solve(int[]a){
        int l=0,r=a.length-1;
        while(l<r){int m=l+(r-l)/2;if(a[m]<a[m+1])l=m+1;else r=m;}
        return l;
    }
}
