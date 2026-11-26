// Practice date: 2026-11-09
// Problem: Binary Tree Level Order Traversal
// Topic: Tree / BFS
// Note: Standalone practice solution. Add test cases or a main method when practising.

import java.util.*;
class LevelOrder {
    static class Node{int val;Node left,right;Node(int v){val=v;}}
    static List<List<Integer>> solve(Node root){
        List<List<Integer>>out=new ArrayList<>();if(root==null)return out;
        Queue<Node>q=new ArrayDeque<>();q.offer(root);
        while(!q.isEmpty()){int n=q.size();List<Integer>level=new ArrayList<>();
            for(int i=0;i<n;i++){Node x=q.poll();level.add(x.val);if(x.left!=null)q.offer(x.left);if(x.right!=null)q.offer(x.right);}
            out.add(level);
        }return out;
    }
}
