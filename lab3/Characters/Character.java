package lab3.Characters;

import java.lang.Object;
public class Character extends CreatureWithName {
    public Character(String name) {
        this.name=name;
    }
    @Override
    public String getName() {return this.name;}
    @Override
    public String toString() {
        return name.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Character that = (Character) o;

        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        int result = name == null ? 0 : name.hashCode();
        return result;
    }
}
