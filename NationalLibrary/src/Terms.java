import java.util.HashMap;

public class Terms {
    private HashMap<Skill, Integer> termsHashMap;


    public HashMap<Skill, Integer> termsSetting(HashMap<Skill, Integer> hashMap) {
        hashMap.put(Skill.DIG, 2);
        hashMap.put(Skill.BUILDER, 3);
        hashMap.put(Skill.CONCRETE_LAYER, 2);
        hashMap.put(Skill.WELDER, 1);
        hashMap.put(Skill.ELECTRICIAN, 1);
        hashMap.put(Skill.MANAGER, 1);
        hashMap.put(Skill.PAINT, 1);
        hashMap.put(Skill.PLUMBER, 1);
        hashMap.put(Skill.ROOFING, 2);
        hashMap.put(Skill.WINDOW_MAKER, 2);
        return hashMap;
    }

    public HashMap<Skill, Integer> getTermsHashMap() {
        return termsHashMap;
    }
}
