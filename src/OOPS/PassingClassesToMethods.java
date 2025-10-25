package OOPS;

public class PassingClassesToMethods {
    public static class car{
        int seats;
        String name;
        double length;
        String type;
        int torque;

        void print(){
            System.out.println(seats+" "+name+" "+length+"m "+type+" "+torque+"n/m");
        }
    }
    public static void main(String[] args) {
        car c = new car();
        c.length = 3.99;
        c.name = "Kia Sonet";
        c.seats = 5;
        c.torque = 178;
        c.type = "SUV";

        change(c);

        System.out.println(c.seats);

        c.print();
    }

    private static void change(car x) {
        x.seats = 4;

    }

}
