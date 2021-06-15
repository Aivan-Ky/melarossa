public class SportCar extends Car {
    private double maxSportCarSpeed;

    public SportCar(String carMaker, String carClass, double carWeight, double maxSportCarSpeed) {
        super(carMaker, carClass, carWeight);
        this.maxSportCarSpeed = maxSportCarSpeed;
    }


    public double getMaxSportCarSpeed() { return maxSportCarSpeed; }

    public void setMaxSportCarSpeed(double maxSportCarSpeed) { this.maxSportCarSpeed = maxSportCarSpeed; }
}
