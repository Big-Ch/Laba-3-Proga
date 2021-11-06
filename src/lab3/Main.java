package lab3;

import lab3.Characters.*;
import lab3.Kucha_mala.*;
import lab3.Sounds.*;

public class Main {

    public static void main(String[] args) {

        Character_with_legs_and_hands kristofer_robin = new Character_with_legs_and_hands("Christofer Robin");
        Character_with_legs_and_hands vinnie_puh = new Character_with_legs_and_hands("Puh");
        Character_with_legs_and_hands piglet = new Character_with_legs_and_hands("Piglet");
        Character_with_legs_and_hands_sensitive tigra = new Character_with_legs_and_hands_sensitive("Tigra");
        Character_with_legs_and_hands ia_ia = new Character_with_legs_and_hands("Ia Ia");

        tigra.Feel(Feellings.easy);

        Sounds sound1 = new Knock(10);
        Sounds sound2 = new Crackle("torn fabric");
        sound1.Sound();
        sound2.Sound();

        Kucha_mala_maker kucha_mala_maker= new My_kucha_mala_maker();
        Kucha_mala kucha = kucha_mala_maker.Make("ground", ia_ia,tigra,piglet,vinnie_puh,kristofer_robin);

        Stand_upping_from_kucha_mala stand_upping_from_kucha_mala= new My_stand_upping_from_kucha_mala();
        stand_upping_from_kucha_mala.Happen(kucha,3,true);

        Pick_upping_in_kucha_mala pick_upping_in_kucha_mala = new My_pick_upping_from_kucha_mala();
        pick_upping_in_kucha_mala.Happen(kucha,1,false, kristofer_robin,vinnie_puh,piglet);

        Ending_in_kucha_mala ending_in_kucha_mala= new My_ending_in_kucha_mala();
        ending_in_kucha_mala.Happen(kucha);

    }
}
