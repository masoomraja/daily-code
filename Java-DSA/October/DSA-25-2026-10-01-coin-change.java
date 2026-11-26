// Practice date: 2026-10-01
// Problem: Coin Change
// Topic: Dynamic Programming
// Note: Standalone practice solution. Add test cases or a main method when practising.

import java.util.*;
class CoinChange {
    static int solve(int[] coins,int amount){
        int[] dp=new int[amount+1];Arrays.fill(dp,amount+1);dp[0]=0;
        for(int x=1;x<=amount;x++)for(int c:coins)if(c<=x)dp[x]=Math.min(dp[x],dp[x-c]+1);
        return dp[amount]>amount?-1:dp[amount];
    }
}
