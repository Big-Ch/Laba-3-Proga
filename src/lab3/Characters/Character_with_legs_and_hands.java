package lab3.Characters;

public class Character_with_legs_and_hands extends Character_with_legs implements Can_Pick_up {
    public Character_with_legs_and_hands(String name) {
        super(name);
    }
    @Override
    public void Pick_up(Character_with_legs character, Character_with_legs_and_hands ... characters) {
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

        Character_with_legs that = (Character_with_legs) o;
        if (this.stand!=that.Get_stand()) { return false;}
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        int result = name == null ? 0 : name.hashCode();
        if (Get_stand()) {
            result += 107;
        }
        return result;
    }

}
