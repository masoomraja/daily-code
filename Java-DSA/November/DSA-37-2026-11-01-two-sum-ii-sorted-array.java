// Practice date: 2026-11-01
// Problem: Two Sum II - Sorted Array
// Topic: Two Pointers
// Note: Standalone practice solution. Add test cases or a main method when practising.

class TwoSumSorted {
    static int[] solve(int[]a,int target){
        int l=0,r=a.length-1;
        while(l<r){int s=a[l]+a[r];if(s==target)return new int[]{l+1,r+1};if(s<target)l++;else r--;}
        return new int[0];
    }
}
