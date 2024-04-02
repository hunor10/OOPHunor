package oop.labor06.labor06_2;

public class Main {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(2, 3);
        System.out.println("matrix1:");
        matrix1.printMatrix();
        double[][] t = {{1, 2,3}, {3, 4,5}};
        Matrix m = new Matrix(t);
        System.out.println();
        System.out.println("matrix2:");
        m.printMatrix();
        Matrix m3=Matrix.add(matrix1,m);
        System.out.println();
        System.out.println("matrix1+matirx2:");
        m3.printMatrix();
        Matrix m4=Matrix.multiply(m3,m);
        System.out.println();
        System.out.println("matrix3*matirx2:");
        m4.printMatrix();
        m4.fillRandom(0, 10);
        System.out.println();
        System.out.println("randomMatrix:");
        m4.printMatrix();
        m4=Matrix.transpose(m4);
        System.out.println();
        System.out.println("transposeMatrix:");
        m4.printMatrix();
        Matrix m5=Matrix.multiply2(m4,m);
        System.out.println();
        System.out.println("Multiply2Matrix:");
        m5.printMatrix();
    }
}
