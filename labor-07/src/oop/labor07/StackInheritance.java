package oop.labor07;

import java.util.ArrayList;
import java.util.Objects;

public class StackInheritance extends ArrayList<Object> {
    private int capacity;

    public StackInheritance(int capacity)
    {
        super(capacity);
        this.capacity=capacity;

    }
    public boolean isFull()
    {
        return this.size()==capacity;
    }
    public boolean isEmpty()
    {
        return this.size()==0;
    }
    public void push(Object item)
    {
        if(this.isFull()){
            System.out.println("Stack is full");
            return;
        }
        this.add(item);
    }
    public void pop(){
        if(this.isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        this.remove(this.get(this.size()-1));
    }
    public Object top()
    {
        if(isEmpty())
        {
            System.out.println("stack is empty");
            return null;
        }
        return this.get(this.size()-1);
    }
    public int getSize()
    {
        return this.size();
    }
}



