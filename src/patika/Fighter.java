package patika;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    Fighter (String name, int damage, int health, int weight, int dodge){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if (dodge >= 0 && dodge <= 100){
            this.dodge = dodge;
        }else {
            this.dodge = 0;
        }

    }

    int hit(Fighter foe){
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vurdu");
        if (foe.isdodge()){
            System.out.println(foe.name + " gelen hasarı blokladi");
            System.out.println("------------");
            return foe.health;
        }
        if (foe.health - this.damage < 0){
            return 0;
        }
        return foe.health - this.damage;
    }
    boolean isdodge(){
        double randomnumber = Math.random() * 100;
        return randomnumber <= this.dodge;
    }
}
