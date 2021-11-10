package lab3;

import lab3.Characters.*;
import lab3.Kucha_mala.*;
import lab3.Sounds.*;

public class Main {

    public static void main(String[] args) {

        CharacterWithLegsAndHands christoferRobin = new CharacterWithLegsAndHands("Christofer Robin");
        CharacterWithLegsAndHands puh = new CharacterWithLegsAndHands("Puh");
        CharacterWithLegsAndHands piglet = new CharacterWithLegsAndHands("Piglet");
        CharacterWithLegsAndHandsSensitive tigra = new CharacterWithLegsAndHandsSensitive("Tigra");
        CharacterWithLegsAndHands iaIa = new CharacterWithLegsAndHands("Ia Ia");

        tigra.feel(Feellings.easy);

        Sounds sound1 = new Knock(10);
        Sounds sound2 = new Crackle("torn fabric");
        sound1.sound();
        sound2.sound();

        KuchaMalaMaker kuchaMalaMaker= new MyKuchaMalaMaker();
        KuchaMala kucha = kuchaMalaMaker.make("ground", iaIa,tigra,piglet,puh,christoferRobin);

        KuchaMalaPositioner kuchaMalaPositioner= new MyKuchaMalaPositioner();
        System.out.println(kuchaMalaPositioner.isAbove(kucha,iaIa,christoferRobin));
        System.out.println(kuchaMalaPositioner.isAbove(kucha,piglet,iaIa));
        System.out.println(kuchaMalaPositioner.isAbove(kucha,puh,tigra));

        StandUppingFromKuchaMala stand_upping_from_kucha_mala= new MyStandUppingFromKuchaMala();
        stand_upping_from_kucha_mala.happen(kucha,3,true);
        System.out.println(kuchaMalaPositioner.isAbove(kucha,piglet,iaIa));


        PickUppingInKuchaMala pick_upping_in_kucha_mala = new MyPickUppingFromKuchaMala();
        pick_upping_in_kucha_mala.happen(kucha,1,false, christoferRobin,puh,piglet);

        EndingInKuchaMala ending_in_kucha_mala= new MyEndingInKuchaMala();
        ending_in_kucha_mala.happen(kucha);

    }
}
