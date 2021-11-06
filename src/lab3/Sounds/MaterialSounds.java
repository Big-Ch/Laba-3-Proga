package lab3.Sounds;

public abstract class MaterialSounds implements Sounds {
    protected String material;
    public abstract void SetMaterial(String material);
    public abstract String GetMaterial();
}
