package lab3.Sounds;

public class Knock extends LoudSounds {
    public Knock(int loudness) {this.loudness=loudness;}
    @Override
    public void Sound() {
        System.out.println("There was a knock");
    }
    @Override
    public void SetLoudness(int loudness) {
        this.loudness=loudness;
    }
    @Override
    public int GetLoudness() {
        return this.loudness;
    }

    @Override
    public String toString() {
        return "knock with loudness " + loudness.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Knock that = (Knock) o;
        return loudness.equals(that.loudness);
    }

    @Override
    public int hashCode() {
        int result = loudness == null ? 0 : loudness.hashCode();
        return result;
    }

}
