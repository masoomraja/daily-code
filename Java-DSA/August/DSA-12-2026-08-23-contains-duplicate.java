// Practice date: 2026-08-23
// Problem: Contains Duplicate
// Topic: HashSet
// Note: Standalone practice solution. Add test cases or a main method when practising.

import java.util.*;
class ContainsDuplicate {
    static boolean solve(int[] a) {
        Set<Integer>s=new HashSet<>();
        for(int x:a)if(!s.add(x))return true;
        return false;
    }
}
