// Practice date: 2026-09-23
// Problem: Detect Cycle in Linked List
// Topic: Floyd's Cycle Detection
// Note: Standalone practice solution. Add test cases or a main method when practising.

class LinkedListCycle {
    static class Node{int val;Node next;Node(int v){val=v;}}
    static boolean solve(Node h){
        Node s=h,f=h;
        while(f!=null&&f.next!=null){s=s.next;f=f.next.next;if(s==f)return true;}
        return false;
    }
}
