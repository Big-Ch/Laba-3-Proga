package lab3.Kucha_mala;

import lab3.Characters.Character_with_legs;
import lab3.Kucha_mala.Kucha_mala;

public interface Kucha_mala_maker {
    public Kucha_mala Make(String place, Character_with_legs... characters);
}
