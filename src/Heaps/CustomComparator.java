package Heaps;
import java.util.Arrays;

class Student implements Comparable<Student>{
    String name;
    int rno;
    double cgpa;
    Student(String name, int rno, double cgpa){
        this.name = name;
        this.rno = rno;
        this.cgpa = cgpa;
    }

    public int compareTo(Student s){
        return Double.compare(s.cgpa,this.cgpa);
    }
}

public class CustomComparator {
    public static void main(String[] args) {
        Student s1 = new Student("Manish",243053,8.58);
        Student s2 = new Student("Tannu",243052,8.25);
        Student s3 = new Student("Khushi",243049,8.8);
        Student s4 = new Student("Puja",243054,8.3);
        Student s5 = new Student("Manas",243057,8.2);
        Student[] arr = {s1,s2,s3,s4,s5};
        Arrays.sort(arr);
        for(Student s: arr){
            System.out.println(s.name+" "+s.rno+" "+s.cgpa);
        }
    }
}
