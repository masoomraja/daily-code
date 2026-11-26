// Practice date: 2026-09-13
// Problem: Rotate Array by K
// Topic: Arrays
// Note: Standalone practice solution. Add test cases or a main method when practising.

class RotateArray {
    static void solve(int[] a,int k) {
        if(a.length==0)return;k%=a.length;
        rev(a,0,a.length-1);rev(a,0,k-1);rev(a,k,a.length-1);
    }
    static void rev(int[]a,int l,int r){while(l<r){int t=a[l];a[l++]=a[r];a[r--]=t;}}
}
