// Practice date: 2026-10-13
// Problem: Top K Frequent Elements
// Topic: HashMap / Heap
// Note: Standalone practice solution. Add test cases or a main method when practising.

import java.util.*;
class TopKFrequent {
    static int[] solve(int[]a,int k){
        Map<Integer,Integer>f=new HashMap<>();for(int x:a)f.put(x,f.getOrDefault(x,0)+1);
        PriorityQueue<Integer>q=new PriorityQueue<>((x,y)->Integer.compare(f.get(x),f.get(y)));
        for(int x:f.keySet()){q.offer(x);if(q.size()>k)q.poll();}
        int[]o=new int[q.size()];for(int i=o.length-1;i>=0;i--)o[i]=q.poll();return o;
    }
}
