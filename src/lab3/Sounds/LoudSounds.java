package lab3.Sounds;

public abstract class LoudSounds implements Sounds {
    protected Integer loudness;
    public abstract void SetLoudness(int loudness);
    public abstract int GetLoudness();
}
