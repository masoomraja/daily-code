// Practice date: 2026-08-21
// Problem: Maximum Subarray Sum
// Topic: Kadane's Algorithm
// Note: Standalone practice solution. Add test cases or a main method when practising.

class MaximumSubarray {
    static int solve(int[] a) {
        int cur=a[0],best=a[0];
        for(int i=1;i<a.length;i++){cur=Math.max(a[i],cur+a[i]);best=Math.max(best,cur);}
        return best;
    }
}
