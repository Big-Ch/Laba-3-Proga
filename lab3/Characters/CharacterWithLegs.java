package lab3.Characters;

public class CharacterWithLegs extends Character implements CreatureCanStand {
    protected static boolean stand;
    public CharacterWithLegs(String name) {
        super(name);
        this.stand=true;
    }
    @Override
    public void standUp() {
        this.stand=true;
    }
    @Override
    public boolean getStand() {
        return this.stand;
    }
    @Override
    public void fall() {
        this.stand=false;
    }

    @Override
    public String toString() {
        return ((this.stand ? "not standing" : "standing") + name.toString());
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
            result += 109;
        }
        return result;
    }

}
