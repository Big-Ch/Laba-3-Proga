package lab3.Kucha_mala;

import lab3.Characters.Character_with_legs;
import lab3.Kucha_mala.Kucha_mala;
import lab3.Kucha_mala.Kucha_mala_maker;

public class My_kucha_mala_maker implements Kucha_mala_maker {
    public Kucha_mala Make(String place, Character_with_legs... characters) {
        Kucha_mala kucha = new Kucha_mala(place);
        for (Character_with_legs ch: characters) {
            ch.Fall();
            kucha.Add(ch);
        }
        System.out.println("Kucha-mala was formed in the place: "+kucha.Get_place());
        return kucha;
    }

    @Override
    public String toString() {
        return "my kucha mala maker";
    }

    @Override
    public boolean equals(Object o) {
        return (this == o);
    }

}
