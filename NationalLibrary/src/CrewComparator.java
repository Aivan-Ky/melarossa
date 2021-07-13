import java.util.Comparator;

public class CrewComparator implements Comparator<Crew> {
    @Override
    public int compare (Crew crew1, Crew crew2) {
        return (int)(crew1.getFinancialProposal() - crew2.getFinancialProposal());
    }
}
