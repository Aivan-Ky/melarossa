public abstract class Car {
    private String carMaker;
    private String carClass;
    private double carWeight;

    private Engine engine;
    private Driver driver;



    public Car(String carMaker, String carClass, double carWeight) {
        this.carMaker = carMaker;
        this.carClass = carClass;
        this.carWeight = carWeight;
    }

    public Car(String carMaker, String carClass, double carWeight, Engine engineName, Driver driverName) {
        this.carMaker = carMaker;
        this.carClass = carClass;
        this.carWeight = carWeight;
        this.engine = engineName;
        this.driver = driverName;
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

    @Override
    public String toString() {
        return "Car{" +
                "carMaker='" + carMaker + '\'' +
                ", carClass='" + carClass + '\'' +
                ", carWeight=" + carWeight +
                ", engine=" + engine +
                ", driver=" + driver +
                '}';
    }

    public String getCarMaker() { return carMaker; }
    public String getCarClass() { return carClass; }
    public double getCarWeight() { return carWeight; }
    public Engine getEngine() { return engine; }
    public Driver getDriver() { return driver; }

    public void setCarMaker(String carMaker) { this.carMaker = carMaker; }
    public void setCarClass(String carClass) { this.carClass = carClass; }
    public void setCarWeight(double carWeight) { this.carWeight = carWeight; }
    public void setEngine(Engine engine) { this.engine = engine; }
    public void setDriver(Driver driver) { this.driver = driver; }

}
