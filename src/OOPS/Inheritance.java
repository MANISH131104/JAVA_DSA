package OOPS;

class Pokemon{
    int power;
    String type;
    Pokemon(String type,int power){            // setter
        this.power = power;
        this.type = type;
    }
    Pokemon(){

    }
    void print(){
        System.out.println(this.power+" "+this.type);
    }
}
class StrongPokemon extends Pokemon{
    int speed;
}
class LegendaryPokemon extends Pokemon{     // child class
    String ability;
}
class GodPokemon extends LegendaryPokemon{
    char tag;
}

public class Inheritance {
    public static void main(String[] args) {
        LegendaryPokemon mewtwo = new LegendaryPokemon();
        mewtwo.ability = "Pressure";
        Pokemon pikachu = new Pokemon();
        GodPokemon dialga = new GodPokemon();



    }
}
