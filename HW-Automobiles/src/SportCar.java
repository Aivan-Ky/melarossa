public class SportCar extends Car {
    private double maxSportCarSpeed;

    public SportCar(String carMaker, String carClass, double carWeight,
                    Engine engineName, Driver driverName, double maxSportCarSpeed) {
        super(carMaker, carClass, carWeight, engineName, driverName);
        this.maxSportCarSpeed = maxSportCarSpeed;
    }

    public double getMaxSportCarSpeed() { return maxSportCarSpeed; }

    public void setMaxSportCarSpeed(double maxSportCarSpeed) { this.maxSportCarSpeed = maxSportCarSpeed; }
}
