package oop.labor07;

import java.util.ArrayList;

public class StackAggregation {
    private int capacity;
    private ArrayList<Object> items;
    public StackAggregation(int capacity)
    {
        this.capacity=capacity;
        items=new ArrayList<>(capacity);
    }
    public boolean isFull()
    {
        return items.size()==capacity;
    }
    public boolean isEmpty()
    {
        return items.size()==0;
    }
    public void push(Object item)
    {
        if(this.isFull()){
            System.out.println("Stack is full");
            return;
        }
        items.add(item);
    }
    public void pop(){
        if(this.isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        items.remove(items.get(items.size()-1));
    }
    public Object top()
    {
        if(isEmpty())
        {
            System.out.println("stack is empty");
            return null;
        }
        return items.get(items.size()-1);
    }
    public int getSize()
    {
        return items.size();
    }
}

