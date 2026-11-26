// Practice date: 2026-09-09
// Problem: Majority Element
// Topic: Boyer-Moore Voting
// Note: Standalone practice solution. Add test cases or a main method when practising.

class MajorityElement {
    static Integer solve(int[] a) {
        int candidate=0,count=0;
        for(int x:a){if(count==0)candidate=x;count+=(x==candidate)?1:-1;}
        int freq=0;for(int x:a)if(x==candidate)freq++;
        return freq>a.length/2?candidate:null;
    }
}
