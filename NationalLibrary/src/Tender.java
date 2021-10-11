import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tender {
    public static void main(String[] args) {
        HashSet<Crew> participantsSet = RandomGenerator.crewListGenerator(25);
        System.out.println("\nКоличество участников тендера: " + participantsSet.size());
        System.out.println(participantsSet);

        HashSet<Crew> passedSelection = complianceChecker(participantsSet);
        System.out.println("\nИз них удовлетворяют условиям тендера: " + participantsSet.size());
        System.out.println(passedSelection);

        System.out.println(tenderResults(passedSelection));
    }

    public static HashMap <Skill, Integer> getTenderConditions() {
        HashMap<Skill, Integer> termsHashMap = new HashMap<>();
        termsHashMap.put(Skill.DIG, 2);
        /*termsHashMap.put(Skill.BUILDER, 3);
        termsHashMap.put(Skill.CONCRETE_LAYER, 2);
        termsHashMap.put(Skill.WELDER, 1);
        termsHashMap.put(Skill.ELECTRICIAN, 1);
        termsHashMap.put(Skill.MANAGER, 1);
        termsHashMap.put(Skill.PAINT, 1);
        termsHashMap.put(Skill.PLUMBER, 1);
        termsHashMap.put(Skill.ROOFING, 2);
        termsHashMap.put(Skill.WINDOW_MAKER, 2);*/
        return termsHashMap;
    }

    public static HashSet<Crew> complianceChecker (HashSet<Crew> hashSet) {
        for (Map.Entry<Skill, Integer> entry : getTenderConditions().entrySet()) {
            Skill key = entry.getKey();
            Integer value = entry.getValue();
            int skillCount = 0;

            // извлекаем по отдельности бригады из списка бригад
            Iterator<Crew> crewIterator = hashSet.iterator();
            while (crewIterator.hasNext()) {
                Crew crew = crewIterator.next();

                // извлекаем по отдельности работников бригады
                Iterator<Worker> workerIterator = crew.getCrewSet().iterator();
                while (workerIterator.hasNext()) {
                    Worker worker = workerIterator.next();

                    // извлекаем по отдельности skill-ы у каждого работника
                    Iterator<Skill> skillIterator = worker.getSkillSet().iterator();
                    while (skillIterator.hasNext()) {
                        if ( key.equals(skillIterator.next()) ) {
                            skillCount++;
                        }
                    }
                }

                if (skillCount < value) {
                    crewIterator.remove();
                }
                skillCount = 0;
            }
        }
        return hashSet;
    }

    public static String tenderResults (HashSet<Crew> hashSet) {
        String result;
        TreeSet<Crew> sortedCrews = new TreeSet<>(new CrewComparator());
        if (hashSet.isEmpty()) {
            result = "Учасники тендера не соответствуют требованиям" + "\nЗакрыть проект строительства";
        } else {
            sortedCrews.addAll(hashSet);
            result = "\nПобедитель тендера: " + sortedCrews.first();
        }
        return result;
    }


}
