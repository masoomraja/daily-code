// Practice date: 2026-09-03
// Problem: Merge Two Sorted Arrays
// Topic: Two Pointers
// Note: Standalone practice solution. Add test cases or a main method when practising.

class MergeSorted {
    static int[] solve(int[] a,int[] b) {
        int[] out=new int[a.length+b.length];int i=0,j=0,k=0;
        while(i<a.length&&j<b.length)out[k++]=a[i]<=b[j]?a[i++]:b[j++];
        while(i<a.length)out[k++]=a[i++];
        while(j<b.length)out[k++]=b[j++];
        return out;
    }
}
