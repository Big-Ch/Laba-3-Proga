package lab3.Kucha_mala;

public class MyEndingInKuchaMala implements EndingInKuchaMala {
    public void happen(KuchaMala kucha) {
        System.out.println("At the bottom was, of course, " + kucha.getEnd().getName());
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
