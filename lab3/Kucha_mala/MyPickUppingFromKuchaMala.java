package lab3.Kucha_mala;

import lab3.Characters.CharacterWithLegs;
import lab3.Characters.CharacterWithLegsAndHands;

public class MyPickUppingFromKuchaMala implements PickUppingInKuchaMala {

    protected CharacterWithLegs pickUpFromKuchaMala(KuchaMala kucha, CharacterWithLegsAndHands... characters) {
        CharacterWithLegs r=kucha.getTop();
        kucha.removeTop();
        characters[0].pickUp(r,characters);
        return r;
    }

    public void happen(KuchaMala kucha, int x, boolean first, CharacterWithLegsAndHands... characters) {
        WriterCharactersEnumeration writer_characters_enumeration =new MyWriterCharactersEnumeration();
        writer_characters_enumeration.write(characters);
        System.out.print("picked up ");
        CharacterWithLegs[] characters2 = new CharacterWithLegs[x];
        for (int i=0; i<x; i++) {
            characters2[i]= pickUpFromKuchaMala(kucha,characters);
        }
        writer_characters_enumeration.write(characters2);
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
