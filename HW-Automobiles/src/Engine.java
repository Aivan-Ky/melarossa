public class Engine {
    private int enginePower;
    private String engineCompany;

    public Engine(int enginePower, String engineCompany) {
        this.enginePower = enginePower;
        this.engineCompany = engineCompany;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "enginePower=" + enginePower +
                ", engineCompany='" + engineCompany + '\'' +
                '}';
    }
}
