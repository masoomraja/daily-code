// Practice date: 2026-10-17
// Problem: Minimum Stack
// Topic: Stack / Design
// Note: Standalone practice solution. Add test cases or a main method when practising.

import java.util.*;
class MinStack {
    Deque<Integer>v=new ArrayDeque<>(),m=new ArrayDeque<>();
    void push(int x){v.push(x);if(m.isEmpty()||x<=m.peek())m.push(x);}
    int pop(){int x=v.pop();if(x==m.peek())m.pop();return x;}
    int top(){return v.element();}
    int getMin(){return m.element();}
}
