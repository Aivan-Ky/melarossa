import java.util.HashSet;

public class RandomGenerator {
    public static Worker workerRandomizer() {
        Worker worker = new Worker();
        HashSet<Skill> skillHashSet = new HashSet<>();
        int maxSkillAmount = 3;
        int minSkillAmount = 1;
        int randomSkillAmount = minSkillAmount + (int)(Math.random() * (maxSkillAmount - minSkillAmount));
        for (int i = 0; i <= randomSkillAmount; i++) {
            int randomSkillOrdinal = (int)(Math.random() * Skill.values().length);
            skillHashSet.add(Skill.values()[randomSkillOrdinal]);
        }
        worker.setSkillSet(skillHashSet);
        int maxSalary = 1500;
        int minSalary = 700;
        int randomSalary = minSalary + (int)(Math.random() *(maxSalary - minSalary));
        worker.setSalary(randomSalary);
        return worker;
    }

    public static Crew crewRandomizer() {
        HashSet<Worker> crewHashSet = new HashSet<>();
        int maxCrewMembers = 7;
        int minCrewMembers = 3;
        int randomMembersAmount = minCrewMembers + (int)(Math.random() * (maxCrewMembers - minCrewMembers));
        for (int i = 1; i <= randomMembersAmount; i++) {
            crewHashSet.add(workerRandomizer());
        }
        return new Crew(crewHashSet);
    }

    public static HashSet<Crew> crewListGenerator(int amount) {
        HashSet<Crew> hashSet = new HashSet<>();
        for (int i = 1; i <= amount; i++) {
            Crew crew = RandomGenerator.crewRandomizer();
            hashSet.add(crew);
        }
        return hashSet;
    }
}
