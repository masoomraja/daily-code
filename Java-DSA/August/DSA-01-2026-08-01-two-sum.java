// Practice date: 2026-08-01
// Problem: Two Sum
// Topic: Arrays / HashMap
// Note: Standalone practice solution. Add test cases or a main method when practising.

import java.util.*;
class TwoSum {
    static int[] solve(int[] a, int target) {
        Map<Integer,Integer> seen = new HashMap<>();
        for (int i=0;i<a.length;i++) {
            int need=target-a[i];
            if (seen.containsKey(need)) return new int[]{seen.get(need),i};
            seen.put(a[i],i);
        }
        return new int[0];
    }
}
