// Practice date: 2026-09-21
// Problem: Find Middle of Linked List
// Topic: Linked List / Fast-Slow
// Note: Standalone practice solution. Add test cases or a main method when practising.

class MiddleNode {
    static class Node{int val;Node next;Node(int v){val=v;}}
    static Node solve(Node head){
        Node slow=head,fast=head;
        while(fast!=null&&fast.next!=null){slow=slow.next;fast=fast.next.next;}
        return slow;
    }
}
