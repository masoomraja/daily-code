// Practice date: 2026-11-03
// Problem: Container With Most Water
// Topic: Two Pointers
// Note: Standalone practice solution. Add test cases or a main method when practising.

class ContainerWater {
    static int solve(int[]h){
        int l=0,r=h.length-1,best=0;
        while(l<r){best=Math.max(best,Math.min(h[l],h[r])*(r-l));if(h[l]<h[r])l++;else r--;}
        return best;
    }
}
