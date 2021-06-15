public class Lorry extends Car{
    private int lorryCarryingMass;

    public Lorry(String carMaker, String carClass, double carWeight, int lorryCarryingMass) {
        super(carMaker, carClass, carWeight);
        this.lorryCarryingMass = lorryCarryingMass;
    }


    public int getLorryCarryingMass() { return lorryCarryingMass; }

    public void setLorryCarryingMass(int lorryCarryingMass) { this.lorryCarryingMass = lorryCarryingMass; }



}
