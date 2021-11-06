package lab3.Kucha_mala;
import lab3.Characters.Character_with_legs;

import java.util.ArrayList;
public class Kucha_mala extends Event_with_place {
    protected ArrayList <Character_with_legs> kucha;

    public Kucha_mala(String place) {
        this.kucha= new ArrayList <Character_with_legs> ();
        this.place=place;
    }

    public Kucha_mala() {
        this.kucha= new ArrayList <Character_with_legs> ();
        this.place="somewhere";
    }

    public Character_with_legs Get_end()  {
        return this.kucha.get(0);
    }

    public Character_with_legs Get(int x)  {
        return this.kucha.get(x);
    }

    public Character_with_legs Get_top()  {
        return this.kucha.get(this.kucha.size()-1);
    }

    public void Remove_top()  {
        this.kucha.remove(this.kucha.size()-1);
    }

    public void Remove(int x)  {
        this.kucha.remove(x);
    }

    public void Add(Character_with_legs ch)  {
        this.kucha.add(ch);
    }

    public String Get_place()  {
        return this.place;
    }

    @Override
    public String toString() {
        String result="kucha mala of";
        if (kucha.size()==0) {
            result+=" nothing";
        }
        for (Character_with_legs ch : kucha) {
            result = result + " " + ch.toString();
        }
        result+= " in " + Get_place();
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Kucha_mala that = (Kucha_mala) o;
        if (this.place!=that.place) { return false;}
        return kucha.equals(that.kucha);
    }

    @Override
    public int hashCode() {
        int result = place == null ? 0 : place.hashCode();
        for (Character_with_legs ch : kucha) {
            result = 29*result + ch.hashCode();
        }
        return result;
    }

}
