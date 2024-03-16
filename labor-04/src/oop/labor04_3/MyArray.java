package oop.labor04_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;



public class MyArray {
    private int length;
    private double[] elements;
    public MyArray(int length)
    {
        elements=new double[length];
        this.length=length;
    }
    public MyArray(MyArray source) {
        this(source.elements);

    }

    public MyArray(double[] source)
    {
        elements=new double[source.length];
        System.arraycopy(source,0,elements,0,source.length);
        length=source.length;
    }
    public MyArray(String filename)
    {
        try(Scanner scanner=new Scanner(new File(filename)))
        {
            while(scanner.hasNextLine())
            {
                length= Integer.parseInt(scanner.nextLine());
                String[] line=scanner.nextLine().split(" ");
                elements=new double[length];
                 for(int i=0;i<length;i++)
                {
                    elements[i]=Integer.parseInt(line[i]);
                }
            }
        }catch(FileNotFoundException e){e.printStackTrace();}
    }
    public void fillRandom(double a, double b) {
        Random random = new Random();
        double range = b - a; // Calculate the range
        for (int i = 0; i < length; i++) {
            elements[i] = random.nextDouble() * range + a; // Generate random double within [a, b]
        }
    }

    public double mean()
    {
        double mean = 0;
        for(double item:elements)
        {
            mean+=item;
        }
        return mean/length;
    }
    public double stddev()
    {
        double mean=mean();
        double[] mean2=new double[length];
        for(int i=0;i<length;i++)
        {
            mean2[i]= elements[i]-mean;
            mean2[i]=Math.pow(mean2[i],2);
        }
        double average=0;
        for(double i:mean2)
        {
            average+=i;
        }
        return Math.sqrt(average);
    }
    public void sort()
    {
        Arrays.sort(elements);
    }
    public void print(String label) {
        if (!label.equals("a1")) {
            System.out.print(label + ": ");
            for (double element : elements) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }



}
