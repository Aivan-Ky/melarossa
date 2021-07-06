import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Tender {
    public static void main(String[] args) {
    }

    public void complianceChecker (Crew crew) {
        HashMap<Skill, Integer> termsHashMap = new HashMap<>();
        termsHashMap.put(Skill.DIG, 2);
        termsHashMap.put(Skill.BUILDER, 3);
        termsHashMap.put(Skill.CONCRETE_LAYER, 2);
        termsHashMap.put(Skill.WELDER, 1);
        termsHashMap.put(Skill.ELECTRICIAN, 1);
        termsHashMap.put(Skill.MANAGER, 1);
        termsHashMap.put(Skill.PAINT, 1);
        termsHashMap.put(Skill.PLUMBER, 1);
        termsHashMap.put(Skill.ROOFING, 2);
        termsHashMap.put(Skill.WINDOW_MAKER, 2);

        for (Map.Entry<Skill, Integer> entry : termsHashMap.entrySet()) {
            Skill key = entry.getKey();
            Integer value = entry.getValue();

            Iterator<Worker> iterator = crew.getCrewSet().iterator();
            int counter = 0;
            while (iterator.hasNext()) {
                if (key.equals(iterator.next().getSkillSet())) {
                    counter++;
                }
            }
        }




    }
}
