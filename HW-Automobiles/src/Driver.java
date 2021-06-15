public class Driver extends Person {
    private int drivingExperienceYears;

    public Driver(String fullName, int drivingExperienceYears) {
        super(fullName);
        this.drivingExperienceYears = drivingExperienceYears;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "drivingExperienceYears=" + drivingExperienceYears +
                '}';
    }
}
