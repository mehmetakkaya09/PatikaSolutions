package patika;

class Nesne {
    public static void main(String[] args) {
        Car audi = new Car("audi", 10,"blue");
        //audi.printInfo();


        audi.increaseSpeed(20);
        audi.decreaseSpeed(10);
        audi.printSpeed();

        Car bmw = new Car();
        bmw.model = "BMW";
        bmw.speed = 20;
        bmw.increaseSpeed(30);
        bmw.increaseSpeed(50);
        bmw.increaseSpeed(35);
        bmw.increaseSpeed(20);
        bmw.increaseSpeed(100);
        bmw.printSpeed();


        Car mercedes = new Car();
        mercedes.model = "MERCEDES";
        mercedes.speed = 30;
        mercedes.printSpeed();

    }
}
