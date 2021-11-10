package lab3.Characters;

public class CharacterWithLegsAndHandsSensitive extends CharacterWithLegsAndHands implements Sensitive {
    public CharacterWithLegsAndHandsSensitive(String name) {
        super(name);
    }

    @Override
    public void feel(Feellings f) {
        System.out.println("Suddenly "+ name +" felt how "+f+" it was.");
    }

    @Override
    public String toString() {
        return ("sensitive " + (this.stand ? "not standing " : "standing ") + name.toString() + " with hands");
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
            result += 211;
        }
        return result;
    }

}
