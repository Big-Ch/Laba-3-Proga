package lab3.Kucha_mala;

import lab3.Characters.Character;

public class My_writer_characters_enumeration implements Writer_characters_enumeration {
    public void Write(Character ... characters) {
        for (int i=0; i<characters.length; i++) {
            if (i!=characters.length-1) {
                System.out.print(characters[i].Get_name()+", ");
            }
            else {
                System.out.print(characters[i].Get_name()+" ");
            }
        }
    }

    @Override
    public String toString() {
        return "my writer characters enumeration";
    }

    @Override
    public boolean equals(Object o) {
        return (this == o);
    }
}
