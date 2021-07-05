public enum Skill {
    DIG(0),
    NOT_TO_DIG(1),
    PAINT(2),
    ROOFING(3),
    ELECTRICIAN(4),
    BUILDER(5),
    CONCRETE_LAYER(6),
    WELDER(7),
    WINDOW_MAKER(8),
    PLUMBER(9),
    STREET_DANCER(10),
    MANAGER(11),
    DIRTY_TALKER(12),
    VODKA_DRINKER(13),
    BALALAIKA_PLAYER(14);

    int skillOrdinal;

    Skill(int skillOrdinal) {
        this.skillOrdinal = skillOrdinal;
    }

    Skill() {
    }
}
