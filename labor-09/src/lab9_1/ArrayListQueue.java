package lab9_1;

import java.util.ArrayList;

public class ArrayListQueue implements IQueue{

    private int CAPACITY;
    private ArrayList<Object> items;
    public ArrayListQueue(int cap)
    {
        items=new ArrayList<>(cap);
        CAPACITY=cap;
    }
    @Override
    public boolean isEmpty() {
        return items.isEmpty();
    }

    @Override
    public boolean isFull() {
        return items.size()+1==CAPACITY;
    }

    @Override
    public void enQueue(Object object) {
        items.add(object);
    }

    @Override
    public Object deQueue() {
        if(isEmpty())
            return null;
        Object o=items.getLast();
        items.removeLast();
        return o;
    }

    @Override
    public void printQueue() {

            System.out.println(items);
    }
    public Object getPoz(int i)
    {
        return items.get(i);
    }
    public boolean equals1(IQueue o)
    {
        boolean asd =true;
        for(int i=0;i<items.size();i++)
        {
            if(items.get(i)!=o.getPoz(i))
                asd=false;
        }
        return asd;
    }
}
