// Practice date: 2026-10-23
// Problem: Kth Largest Element
// Topic: Heap / Quickselect
// Note: Standalone practice solution. Add test cases or a main method when practising.

import java.util.*;
class KthLargest {
    static int solve(int[]a,int k){
        PriorityQueue<Integer>q=new PriorityQueue<>();
        for(int x:a){q.offer(x);if(q.size()>k)q.poll();}
        return q.element();
    }
}
