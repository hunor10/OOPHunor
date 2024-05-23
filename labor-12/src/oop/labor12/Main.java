package oop.labor12;


public class Main {
    public static void main(String[] args) {
        String[] subjects = {"magyar", "roman", "matek"};
        Bac bac1=new Bac("nevek1.txt");
        bac1.readSubject("magyar");
//        for (String subject : subjects) {
//            Bac bac = new Bac(subject);
//            bac.readSubject(subject);
//        }
        long a= bac1.getI();
        System.out.println(a);

    }
}
