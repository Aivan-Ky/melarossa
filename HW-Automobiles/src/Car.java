public abstract class Car {
    private String carMaker;
    private String carClass;
    private double carWeight;

    // "Класс Car содержит .... водитель типа Driver, мотор типа Engine" имелось ввиду отношение наследования???


    public Car(String carMaker, String carClass, double carWeight) {
        this.carMaker = carMaker;
        this.carClass = carClass;
        this.carWeight = carWeight;
    }

    public void start() {
        System.out.println("Поехали");
    }
    public void stop() {
        System.out.println("Останавливаемся");
    }
    public void turnRight() {
        System.out.println("Поворот направо");
    }
    public void turnLeft() {
        System.out.println("Поворот налево");
    }
    public String toString() {
        return "выводит полную информацию об автомобиле, ее водителе и моторе"; // доделать (абстрактный метод???)?????
    }

    public String getCarMaker() { return carMaker; }
    public String getCarClass() { return carClass; }
    public double getCarWeight() { return carWeight; }

    public void setCarMaker(String carMaker) { this.carMaker = carMaker; }
    public void setCarClass(String carClass) { this.carClass = carClass; }
    public void setCarWeight(double carWeight) { this.carWeight = carWeight; }


}
