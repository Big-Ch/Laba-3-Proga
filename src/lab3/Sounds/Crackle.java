package lab3.Sounds;

public class Crackle extends MaterialSounds {
    public Crackle( String material) {
        this.material=material;
    }
    @Override
    public void Sound() {
        System.out.println("There was a crack of "+this.material);
    }
    @Override
    public void SetMaterial(String material) {
        this.material=material;
    }
    @Override
    public String GetMaterial() {
        return this.material;
    }

    @Override
    public String toString() {
        return "crack of "+this.material.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Crackle that = (Crackle) o;
        return material.equals(that.material);
    }

    @Override
    public int hashCode() {
        int result = material == null ? 0 : material.hashCode();
        return result;
    }


}
