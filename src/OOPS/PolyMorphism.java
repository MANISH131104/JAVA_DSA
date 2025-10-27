package OOPS;

public class PolyMorphism {
    public static class dog{
        void speak(){
            System.out.println("Bhau Bhau");
        }
    }
    public static class cat{
        void speak(){
            System.out.println("Meow Meow");
        }
    }
    public static class Lion{
        void speak(){
            System.out.println("Grrrr");
        }
    }
    public static class Pikachu{
        void speak(){
            System.out.println("Pika Pika");
        }
    }
    public static class Human{
        void speak(){
            System.out.println("Hello");
        }
    }
    public static void main(String[] args) {
        dog Tommy = new dog();
        cat c = new cat();
        Human rahul = new Human();
        Pikachu p = new Pikachu();

        Tommy.speak();
        c.speak();
        p.speak();
        rahul.speak();
    }
}
