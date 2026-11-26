// Practice date: 2026-08-19
// Problem: Binary Search
// Topic: Searching
// Note: Standalone practice solution. Add test cases or a main method when practising.

class BinarySearch {
    static int solve(int[] a,int target) {
        int l=0,r=a.length-1;
        while(l<=r){int m=l+(r-l)/2;
            if(a[m]==target)return m;
            if(a[m]<target)l=m+1;else r=m-1;
        } return -1;
    }
}
