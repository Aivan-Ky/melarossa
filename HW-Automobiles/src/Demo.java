public class Demo {
    public static void main(String[] args) {

        SportCar firstCar = new SportCar("Zaporozhec 9000", "Batmobile",
                1500, 300);
        Driver firstDriver = new Driver("Petka", 15);
        firstCar.setDriver(firstDriver);
        Engine firstEngine = new Engine(999, "Belaz");
        firstCar.setEngine(firstEngine);

        System.out.println(firstCar.toString());
        firstCar.start();
        System.out.println();

        Lorry secondCar = new Lorry("Volvo", "Lorry",
                7000, 3000);
        Driver secondDriver = new Driver("Vasili Ivanovich", 7);
        secondCar.setDriver(secondDriver);
        Engine secondEngine = new Engine(7777, "Volvo");
        secondCar.setEngine(secondEngine);

        System.out.println(secondCar.toString());
        secondCar.start();
        secondCar.turnLeft();
        secondCar.turnRight();
        secondCar.stop();
    }
}
