package lab3.Kucha_mala;

import lab3.Characters.Character_with_legs;
import lab3.Characters.Character_with_legs_and_hands;

public class My_pick_upping_from_kucha_mala implements Pick_upping_in_kucha_mala {

    protected Character_with_legs Pick_up_from_kucha_mala(Kucha_mala kucha, Character_with_legs_and_hands... characters) {
        Character_with_legs r=kucha.Get_top();
        kucha.Remove_top();
        characters[0].Pick_up(r,characters);
        return r;
    }

    public void Happen(Kucha_mala kucha, int x, boolean first, Character_with_legs_and_hands ... characters) {
        Writer_characters_enumeration writer_characters_enumeration =new My_writer_characters_enumeration();
        writer_characters_enumeration.Write(characters);
        System.out.print("picked up ");
        Character_with_legs[] characters2 = new Character_with_legs[x];
        for (int i=0; i<x; i++) {
            characters2[i]=Pick_up_from_kucha_mala(kucha,characters);
        }
        writer_characters_enumeration.Write(characters2);
        if (first) {
            System.out.println("first");
        }
        else {
            System.out.println("");
        }
    }

    @Override
    public String toString() {
        return "my pick upping from kucha mala";
    }

    @Override
    public boolean equals(Object o) {
        return (this == o);
    }

}
