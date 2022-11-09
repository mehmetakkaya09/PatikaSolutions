package patika;

public class Car {
    // nitelikler
    String type;
    String model;
    String color;
    int speed;
    int speedlimit;

    Car(String model, int speed, String color) {
        this.model = model;
        this.speed = speed;
        this.color = color;
        this.type = "sedan";
        this.speedlimit = 180;
        System.out.println("parametreli kurucu metodu oluştu");

    }
    Car(){
        System.out.println("bos kurucu metodu olustu");
    }

    void increaseSpeed(int increment) {
        if ((this.speed + increment) < speedlimit) {
            this.speed += increment;
        }
    }

    void decreaseSpeed(int decrease) {
        if (this.speed > 0) {
            this.speed -= decrease;

        }
    }

    void printSpeed() {
        System.out.println(this.model + "Hiziniz : " + this.speed);

    }
    void printInfo(){
        String model = "abc";
        System.out.println("model :\t" + this.model);
        System.out.println("color :\t" + this.color);
        System.out.println("type :\t" + this.type);
        System.out.println("speed :\t" + this.speed);

    }
}
