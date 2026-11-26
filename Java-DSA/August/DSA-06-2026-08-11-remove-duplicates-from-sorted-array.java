// Practice date: 2026-08-11
// Problem: Remove Duplicates from Sorted Array
// Topic: Two Pointers
// Note: Standalone practice solution. Add test cases or a main method when practising.

class RemoveDuplicates {
    static int solve(int[] a) {
        if(a.length==0)return 0;
        int w=1;
        for(int r=1;r<a.length;r++) if(a[r]!=a[w-1]) a[w++]=a[r];
        return w;
    }
}
