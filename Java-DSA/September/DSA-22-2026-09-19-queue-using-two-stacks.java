// Practice date: 2026-09-19
// Problem: Queue Using Two Stacks
// Topic: Stack / Queue
// Note: Standalone practice solution. Add test cases or a main method when practising.

import java.util.*;
class QueueUsingStacks {
    Deque<Integer> in=new ArrayDeque<>(),out=new ArrayDeque<>();
    void offer(int x){in.push(x);}
    void shift(){if(out.isEmpty())while(!in.isEmpty())out.push(in.pop());}
    int poll(){shift();return out.pop();}
    int peek(){shift();return out.element();}
}
