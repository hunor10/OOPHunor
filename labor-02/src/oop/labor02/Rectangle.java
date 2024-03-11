package oop.labor02;

public class Rectangle {
     private double length;
     private double width;
     public Rectangle(double width,double length)
     {
         this.length=length;
         this.width=width;
     }
     public double area()
     {
         return length*width;
     }
    public double perimeter()
    {
        return (length+width)*2;
    }
    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }
}
