package OOPS;

import java.util.Scanner;
class Student{          // khudka ek data type bana liya hai
    String name;
    int rno;
    double cgpa;

    void print(){
        System.out.println(name+" "+rno+" "+cgpa);
    }
}

public class userDefinedDataType {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int x;   // declaration
//        x=5;  // initialization

        Student s1 = new Student();   // declaration
        s1.name = "khushi";
        s1.rno = 23;
        s1.cgpa = 8.5;

        Student s2 = new Student();
        s2.name = "Manish";
        s2.rno = 24;
        s2.cgpa = 9.5;

        Student s3 = new Student();   // declaration
        s3.name = "Tannu";
        s3.rno = sc.nextInt();
        s3.cgpa = 7.5;

        System.out.println(s1.name+" "+s1.rno+" "+ s1.cgpa);

        s2.cgpa = 10.0;
        System.out.println(s2.cgpa);

        System.out.println(s3.rno);


        s1.print();
        s2.print();
        s3.print();



    }
}
