// Practice date: 2026-11-07
// Problem: Daily Temperatures
// Topic: Monotonic Stack
// Note: Standalone practice solution. Add test cases or a main method when practising.

import java.util.*;
class DailyTemperatures {
    static int[] solve(int[]t){
        int[]out=new int[t.length];Deque<Integer>st=new ArrayDeque<>();
        for(int i=0;i<t.length;i++){while(!st.isEmpty()&&t[i]>t[st.peek()]){int j=st.pop();out[j]=i-j;}st.push(i);}
        return out;
    }
}
