package OOPS;
class Pokemon{
    private int power;
    String type;
    Pokemon(String type,int power){            // setter
        this.power = power;
        this.type = type;
    }
    Pokemon(int power,String type){
        this.power = power;
        this.type = type;
    }
    Pokemon(){

    }
    int getPower(){
        return power;
    }
    void print(){
        System.out.println(this.power+" "+this.type);
    }
}

public class RevisionOOPS {

    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("Electric",70);
        pikachu.type = "Fire";
      //  pikachu.power = 34;  ERROR
        Pokemon jigglyPuff = new Pokemon(50,"Fairy");
        System.out.println(pikachu.getPower());

        pikachu.print(); jigglyPuff.print();

        Pokemon gengac = new Pokemon();

        final int x = 89;  // x can't be changed





    }
}
