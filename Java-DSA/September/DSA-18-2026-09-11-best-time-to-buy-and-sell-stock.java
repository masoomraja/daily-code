// Practice date: 2026-09-11
// Problem: Best Time to Buy and Sell Stock
// Topic: Greedy
// Note: Standalone practice solution. Add test cases or a main method when practising.

class BestTimeStock {
    static int solve(int[] prices) {
        int min=Integer.MAX_VALUE,profit=0;
        for(int p:prices){min=Math.min(min,p);profit=Math.max(profit,p-min);}
        return profit;
    }
}
