package lab3.Kucha_mala;

import lab3.Characters.CharacterWithLegs;

public class MyStandUppingFromKuchaMala implements StandUppingFromKuchaMala {

    protected CharacterWithLegs standUpFromKuchaMala(KuchaMala kucha) {
        CharacterWithLegs r=kucha.getTop();
        kucha.removeTop();
        r.standUp();
        return r;
    }

    public void happen(KuchaMala kucha, int x, boolean flag) {
        WriterCharactersEnumeration writer_characters_enumeration = new MyWriterCharactersEnumeration();
        CharacterWithLegs[] characters = new CharacterWithLegs[x];
        for (int i=0; i<x; i++) {
            characters[i]= standUpFromKuchaMala(kucha);
        }
        writer_characters_enumeration.write(characters);
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

