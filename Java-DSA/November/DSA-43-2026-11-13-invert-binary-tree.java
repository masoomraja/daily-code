// Practice date: 2026-11-13
// Problem: Invert Binary Tree
// Topic: Tree / Recursion
// Note: Standalone practice solution. Add test cases or a main method when practising.

class InvertTree {
    static class Node{int val;Node left,right;Node(int v){val=v;}}
    static Node solve(Node n){if(n==null)return null;Node t=n.left;n.left=solve(n.right);n.right=solve(t);return n;}
}
