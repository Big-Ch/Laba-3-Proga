package lab3.Characters;

public class CharacterWithLegsAndHands extends CharacterWithLegs implements CreatureCanPickUp {
    public CharacterWithLegsAndHands(String name) {
        super(name);
    }
    @Override
    public void pickUp(CharacterWithLegs character, CharacterWithLegsAndHands... characters) {
        if (this.equals(characters[0])) {
            //something
        }
        character.stand=true;
    }

    @Override
    public String toString() {
        return ((this.stand ? "not standing " : "standing ") + name.toString() + " with hands");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CharacterWithLegs that = (CharacterWithLegs) o;
        if (this.stand!=that.getStand()) { return false;}
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        int result = name == null ? 0 : name.hashCode();
        if (getStand()) {
            result += 107;
        }
        return result;
    }

}
