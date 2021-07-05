import java.util.HashSet;
import java.util.Iterator;

public class Crew extends Worker {
    private HashSet<Worker> crewSet;
    private double financialProposal;

    public Crew() {
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

    public Crew crewRandomizer() {
        Crew crew = new Crew();
        HashSet<Worker> crewHashSet = new HashSet<>();
        int maxCrewMembers = 20;
        int minCrewMembers = 10;
        int randomMembersAmount = minCrewMembers + (int)(Math.random() * (maxCrewMembers - minCrewMembers));
        for (int i = 0; i <= randomMembersAmount; i++) {
            crewHashSet.add(new Worker().workerRandomizer());
        }
        crew.crewSet = crewHashSet;
        crew.financialProposal = proposalCalculator(crew);
        return crew;
    }

    public double proposalCalculator(Crew crew) {
        double sumCrewSalary = 0;
        Iterator<Worker> crewIterator = crewSet.iterator();
        while (crewIterator.hasNext()) {
            sumCrewSalary += crewIterator.next().getSalary();
        }
        double taxRate = 0.4;
        double interest = Math.random() * 0.3;
        financialProposal = sumCrewSalary + (sumCrewSalary * interest) + (sumCrewSalary * taxRate);
        return financialProposal;
    }


}
