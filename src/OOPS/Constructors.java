package OOPS;

public class Constructors {
    public static class car{
        int price;
        String name;
        car(){          // default Constructors

        }
        car(int price,String name){
            this.price = price;
            this.name = name;
        }
        car(String s,int x){
            price = x;
            name = s;
        }
        void print(){
            int price = 100;
            System.out.println(this.price+" "+name);
        }
    }
    public static void main(String[] args) {
        car c1 = new car(1250000,"Kia Sonet");
        c1.print();
        car c2 = new car("BMW",1500000);
        c2.print();
        car c3 = new car();
        c3.name = "Audi";
    }
}
