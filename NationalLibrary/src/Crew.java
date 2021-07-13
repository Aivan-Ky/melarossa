import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Crew extends Worker  { //implements Comparator<Crew> !!!!!!!!!
    private HashSet<Worker> crewSet;
    private double financialProposal;

    public Crew(HashSet<Worker> workers) {
        this.crewSet = workers;
        this.financialProposal = proposalCalculator();
    }

    public HashSet<Worker> getCrewSet() {
        return crewSet;
    }
    public double getFinancialProposal() {
        return financialProposal;
    }
    public void setCrewSet(HashSet<Worker> crewSet) {
        this.crewSet = crewSet;
    }
    public void setFinancialProposal(double financialProposal) {
        this.financialProposal = financialProposal;
    }

    public double proposalCalculator() {
        double sumCrewSalary = 0.0;
        Iterator<Worker> crewIterator = crewSet.iterator();
        while (crewIterator.hasNext()) {
            sumCrewSalary += crewIterator.next().getSalary();
        }
        double taxRate = 0.4;
        double interest = Math.random() * 0.3;
        return sumCrewSalary + (sumCrewSalary * interest) + (sumCrewSalary * taxRate);
    }

    @Override
    public String toString() {
        return "\n\tCrew {" +
                "crewSet = " + crewSet +
                "\nfinancialProposal = " + financialProposal +
                "}";
    }

    /*@Override
    public int compare(Crew crew1, Crew crew2) {
        return (int)(crew1.getFinancialProposal() - crew2.getFinancialProposal());
    }*/

}
