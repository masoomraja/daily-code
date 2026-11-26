// Practice date: 2026-11-15
// Problem: Graph BFS Traversal
// Topic: Graph / BFS
// Note: Standalone practice solution. Add test cases or a main method when practising.

import java.util.*;
class GraphBFS {
    static List<Integer> solve(List<List<Integer>>g,int start){
        List<Integer>out=new ArrayList<>();boolean[]seen=new boolean[g.size()];
        Queue<Integer>q=new ArrayDeque<>();q.offer(start);seen[start]=true;
        while(!q.isEmpty()){int u=q.poll();out.add(u);for(int v:g.get(u))if(!seen[v]){seen[v]=true;q.offer(v);}}
        return out;
    }
}
