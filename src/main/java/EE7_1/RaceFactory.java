package EE7_1;

public class RaceFactory {
    public static CharacterRace getRace(RaceAbstractFactory factory,String type) {
        return factory.create(type);
    }
}

