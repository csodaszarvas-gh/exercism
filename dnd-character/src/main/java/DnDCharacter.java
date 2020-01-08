import java.util.Collections;
import java.util.ArrayList;

class DnDCharacter {

    private int strength,
                dexterity,
                consitution,
                intelligence,
                wisdom,
                charisma,
                hitPoints;

    DnDCharacter (){
        this.strength     = ability();
        this.dexterity    = ability();
        this.consitution  = ability();
        this.intelligence = ability();
        this.wisdom       = ability();
        this.charisma     = ability();
        this.hitPoints    = 10 + this.modifier(this.getConstitution());
    }

    int ability() {
        final int MIN   = 1;
        final int MAX   = 6;
        final int RANGE = MAX - MIN + 1;

        ArrayList<Integer> scores = new ArrayList(4);
        for (int i = 0; i < 4; i++)
             scores.add((int) (Math.random() * RANGE) + MIN);
        scores.remove(scores.indexOf(Collections.min(scores)));

        int result = 0;
        for (int score : scores)
            result += score;

        return result;
    }

    int modifier(int input) {
        return (int) Math.floorDiv((input - 10), 2);
    }

    int getHitpoints() {
        return this.hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getConstitution() {
        return consitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getCharisma() {
        return charisma;
    }
}
