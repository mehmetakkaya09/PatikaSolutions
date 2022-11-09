package patika;

public class Match {
    Fighter f1;
    Fighter f2;
    int minweight;
    int maxweight;

    Match (Fighter f1, Fighter f2, int minweight, int maxweight){
        this.f1 = f1;
        this.f2 = f2;
        this.minweight = minweight;
        this.maxweight = maxweight;
    }

    public void run() {
        if (ischeck()) {
            int i = 0;
            while (f1.health > 0 && f2.health > 0) {
                System.out.println("\n==== ROUND " + (i + 1) + " ====");
                int chance = Math.round((float) Math.random());

                if (chance == 0) {
                    this.f2.health = this.f1.hit(f2);
                    if (iswin()) {
                        break;
                    }

                    this.f1.health = this.f2.hit(f1);
                    if (iswin()) {
                        break;
                    }
                } else if (chance == 1) {
                    this.f1.health = this.f2.hit(f1);
                    if (iswin()) {
                        break;
                    }

                    this.f2.health = this.f1.hit(f2);
                    if (iswin()) {
                        break;
                    }
                }
                printScore();
                i++;
            }
        } else {
            System.out.println("The weights of the athletes do not match.");
        }
    }
    public boolean ischeck() {
        return ((this.f1.weight >= minweight) && (this.f1.weight <= maxweight)) && ((this.f2.weight >= minweight) && (this.f2.weight <= maxweight));
    }

    public boolean iswin() {
        if (this.f1.health == 0) {
            printScore();
            System.out.println();
            System.out.println(this.f2.name + " WON THE MATCH !");
            return true;
        }

        if (this.f2.health == 0) {
            printScore();
            System.out.println();
            System.out.println(this.f1.name + " WON THE MATCH !");
            return true;
        }

        return false;
    }

    public void printScore(){
        System.out.println(this.f1.name + " Health: " + this.f1.health);
        System.out.println(this.f2.name + " Health: " + this.f2.health);
    }
}