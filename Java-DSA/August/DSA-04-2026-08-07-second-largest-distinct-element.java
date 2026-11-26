// Practice date: 2026-08-07
// Problem: Second Largest Distinct Element
// Topic: Arrays
// Note: Standalone practice solution. Add test cases or a main method when practising.

class SecondLargest {
    static Integer solve(int[] a) {
        Integer first=null, second=null;
        for(int x:a) {
            if(first==null || x>first){second=first;first=x;}
            else if(x!=first && (second==null || x>second)) second=x;
        }
        return second;
    }
}
