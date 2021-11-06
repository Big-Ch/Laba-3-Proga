package lab3.Kucha_mala;

import lab3.Kucha_mala.Kucha_mala;

public class My_ending_in_kucha_mala implements Ending_in_kucha_mala {
    public void Happen(Kucha_mala kucha) {
        System.out.println("At the bottom was, of course, " + kucha.Get_end().Get_name());
    }

    @Override
    public String toString() {
        return "my ending in kucha mala";
    }

    @Override
    public boolean equals(Object o) {
        return (this == o);
    }

}
