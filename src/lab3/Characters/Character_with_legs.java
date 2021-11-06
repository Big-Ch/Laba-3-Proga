package lab3.Characters;

public class Character_with_legs extends Character implements Can_Stand {
    protected static boolean stand;
    public Character_with_legs(String name) {
        super(name);
        this.stand=true;
    }
    @Override
    public void Stand_up() {
        this.stand=true;
    }
    @Override
    public boolean Get_stand() {
        return this.stand;
    }
    @Override
    public void Fall() {
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

        Character_with_legs that = (Character_with_legs) o;
        if (this.stand!=that.Get_stand()) { return false;}
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        int result = name == null ? 0 : name.hashCode();
        if (Get_stand()) {
            result += 109;
        }
        return result;
    }

}
