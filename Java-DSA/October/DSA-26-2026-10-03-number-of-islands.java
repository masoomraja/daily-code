// Practice date: 2026-10-03
// Problem: Number of Islands
// Topic: Graph / DFS
// Note: Standalone practice solution. Add test cases or a main method when practising.

class NumberOfIslands {
    static int solve(char[][]g){
        if(g.length==0)return 0;int count=0;
        for(int i=0;i<g.length;i++)for(int j=0;j<g[0].length;j++)
            if(g[i][j]=='1'){count++;dfs(g,i,j);}
        return count;
    }
    static void dfs(char[][]g,int i,int j){
        if(i<0||j<0||i==g.length||j==g[0].length||g[i][j]!='1')return;
        g[i][j]='0';dfs(g,i+1,j);dfs(g,i-1,j);dfs(g,i,j+1);dfs(g,i,j-1);
    }
}
