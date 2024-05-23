package lab9_1;

import java.util.ArrayList;

public interface IQueue {
    boolean isEmpty();
    boolean isFull();
    void enQueue(Object object);
    Object deQueue();
    void printQueue();
    boolean equals1(IQueue o);
    Object getPoz(int i);
}
