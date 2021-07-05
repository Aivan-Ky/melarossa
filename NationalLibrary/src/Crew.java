import java.util.HashSet;
import java.util.Iterator;

public class Crew extends Worker {
    private HashSet<Worker> crewSet;
    private double financialProposal;

    public Crew crewRandomizer() {
        Crew crew = new Crew();
        HashSet<Worker> workerHashSet = new HashSet<>();
        int maxCrewMembers = 20;
        int minCrewMembers = 10;
        int randomMembersAmount = minCrewMembers + (int)(Math.random() * (maxCrewMembers - minCrewMembers));
        for (int i = 0; i <= randomMembersAmount; i++) {
            workerHashSet.add(new Worker().workerRandomizer());
        }
    }

    public double proposalCalculator(Crew crew) {
        Iterator crewIterator = crewSet.iterator();
        while (crewIterator.hasNext()) {
        }
    }


}
