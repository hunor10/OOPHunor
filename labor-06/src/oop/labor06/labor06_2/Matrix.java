package oop.labor06.labor06_2;

import java.util.Random;

public class Matrix {
    private double[][] data;
    private int rows;
    private int columns;
    public Matrix(int rows,int columns)
    {
        this.rows=rows;
        this.columns=columns;
        this.data=new double[rows][columns];
    }

    public Matrix(double[][] matrix)
    {
        this.rows=matrix.length;
        this.columns=matrix[0].length;
        this.data=new double[rows][columns];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                this.data[i][j]=matrix[i][j];
            }
        }
    }

    public Matrix(Matrix m) {
        this.data=m.data;
        this.columns=m.columns;
        this.rows=m.rows;
        for(int i=0;i<m.rows;i++)
        {
            for(int j=0;j<m.columns;j++)
            {
                this.data[i][j]=m.data[i][j];
            }
        }
    }

    public void fillRandom(double min,double max)
    {
        Random rand=new Random();
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                this.data[i][j]=rand.nextDouble(max-min)+min;
            }
        }
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    void printMatrix()
    {
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                System.out.printf("%6.2f",data[i][j]);
            }
            System.out.println();
        }
    }
    public static Matrix add(Matrix m1, Matrix m2)
    {
        if(m1.rows!= m2.rows || m2.columns!= m1.columns)
        {
            System.out.println("error, dimensions aren't the same!");
            return null;
        }
        Matrix m3=new Matrix(m1.rows,m2.columns);
        for(int i=0;i<m3.rows;i++)
        {
            for(int j=0;j<m3.columns;j++)
            {
                m3.data[i][j]=m1.data[i][j]+m2.data[i][j];
            }
        }
        return m3;
    }
    public static Matrix multiply(Matrix m1,Matrix m2)
    {
        if(m1.rows!=m2.rows)
        {
            System.out.println("error different dimensions");
        }
        Matrix m3=new Matrix(m1.rows,m2.columns);
        for(int i=0;i<m3.rows;i++)
        {
            for (int j=0;j< m3.rows;j++)
            {
                m3.data[i][j]=m1.data[i][j]*m2.data[i][j];
            }
        }
        return m3;
    }
    public static Matrix transpose(Matrix m)
    {
        Matrix m2=new Matrix(m.columns, m.rows);
        for(int i=0;i<m.rows;i++)
        {
            for(int j=0;j<m.columns;j++)
            {
                m2.data[j][i]=m.data[i][j];
            }
        }
        return m2;
    }
    public static Matrix multiply2(Matrix m1,Matrix m2) {
        if (m1.columns != m2.rows) {
            System.out.println("error different dimensions");
        }
        Matrix m3 = new Matrix(m1.rows, m2.columns);
        int row1=m1.rows;
        int col1=m1.columns;
        int col2=m2.columns;
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < col1; k++) {
                    m3.data[i][j] += m1.data[i][k] * m2.data[k][j];
                }
            }
        }
        return m3;
    }

}
