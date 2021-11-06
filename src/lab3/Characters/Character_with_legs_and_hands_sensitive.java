package lab3.Characters;

public class Character_with_legs_and_hands_sensitive extends Character_with_legs_and_hands implements Sensitive {
    public Character_with_legs_and_hands_sensitive(String name) {
        super(name);
    }

    @Override
    public void Feel(Feellings f) {
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

        Character_with_legs that = (Character_with_legs) o;
        if (this.stand!=that.Get_stand()) { return false;}
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        int result = name == null ? 0 : name.hashCode();
        if (Get_stand()) {
            result += 211;
        }
        return result;
    }

}
