// Practice date: 2026-11-17
// Problem: Graph DFS Traversal
// Topic: Graph / DFS
// Note: Standalone practice solution. Add test cases or a main method when practising.

import java.util.*;
class GraphDFS {
    static List<Integer> solve(List<List<Integer>>g,int start){
        List<Integer>out=new ArrayList<>();boolean[]seen=new boolean[g.size()];dfs(g,start,seen,out);return out;
    }
    static void dfs(List<List<Integer>>g,int u,boolean[]seen,List<Integer>out){
        seen[u]=true;out.add(u);for(int v:g.get(u))if(!seen[v])dfs(g,v,seen,out);
    }
}
