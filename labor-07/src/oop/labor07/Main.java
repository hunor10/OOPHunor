package oop.labor07;

public class Main {
    public static void main(String[] args) {
        StackAggregation stack=new StackAggregation(5);
        for(int i=0;i<10;i++)
        {
            stack.push(i);
        }
        while(!stack.isEmpty())
        {
            System.out.print(stack.top()+" ");
            stack.pop();
        }
        System.out.println();
        StackInheritance stack2=new StackInheritance(5);
        for(int i=0;i<10;i++)
        {
            stack2.push(i);
        }
        stack2.removeFirst();
        stack2.removeFirst();
        while(!stack2.isEmpty())
        {
            System.out.print(stack2.top()+" ");
            stack2.pop();
        }

    }
}
