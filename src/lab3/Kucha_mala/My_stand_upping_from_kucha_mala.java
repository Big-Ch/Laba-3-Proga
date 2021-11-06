package lab3.Kucha_mala;

import lab3.Characters.Character_with_legs;

public class My_stand_upping_from_kucha_mala implements Stand_upping_from_kucha_mala {

    protected Character_with_legs Stand_up_from_kucha_mala(Kucha_mala kucha) {
        Character_with_legs r=kucha.Get_top();
        kucha.Remove_top();
        r.Stand_up();
        return r;
    }

    public void Happen(Kucha_mala kucha, int x, boolean flag) {
        Writer_characters_enumeration writer_characters_enumeration = new My_writer_characters_enumeration();
        Character_with_legs[] characters = new Character_with_legs[x];
        for (int i=0; i<x; i++) {
            characters[i]=Stand_up_from_kucha_mala(kucha);
        }
        writer_characters_enumeration.Write(characters);
        System.out.print("got up");
        if (flag) {
            System.out.println(" first");
        }
        else {
            System.out.println("");
        }
    }

    @Override
    public String toString() {
        return "my stand upping from kucha mala";
    }

    @Override
    public boolean equals(Object o) {
        return (this == o);
    }

}

