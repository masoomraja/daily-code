// Practice date: 2026-10-15
// Problem: Subarray Sum Equals K
// Topic: Prefix Sum / HashMap
// Note: Standalone practice solution. Add test cases or a main method when practising.

import java.util.*;
class SubarraySumK {
    static int solve(int[]a,int k){
        Map<Integer,Integer>f=new HashMap<>();f.put(0,1);int sum=0,count=0;
        for(int x:a){sum+=x;count+=f.getOrDefault(sum-k,0);f.put(sum,f.getOrDefault(sum,0)+1);}
        return count;
    }
}
