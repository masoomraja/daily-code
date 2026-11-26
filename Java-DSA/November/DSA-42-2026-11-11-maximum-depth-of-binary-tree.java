// Practice date: 2026-11-11
// Problem: Maximum Depth of Binary Tree
// Topic: Tree / DFS
// Note: Standalone practice solution. Add test cases or a main method when practising.

class TreeDepth {
    static class Node{int val;Node left,right;Node(int v){val=v;}}
    static int solve(Node n){return n==null?0:1+Math.max(solve(n.left),solve(n.right));}
}
