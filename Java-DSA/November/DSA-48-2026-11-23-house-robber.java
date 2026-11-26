// Practice date: 2026-11-23
// Problem: House Robber
// Topic: Dynamic Programming
// Note: Standalone practice solution. Add test cases or a main method when practising.

class HouseRobber {
    static int solve(int[]a){
        int prev2=0,prev1=0;
        for(int x:a){int cur=Math.max(prev1,prev2+x);prev2=prev1;prev1=cur;}
        return prev1;
    }
}
