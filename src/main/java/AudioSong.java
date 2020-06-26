public class AudioSong extends Song{
    float samplingFrequency;

    public AudioSong(String title, int length, float samplingFrequency) {
        super(title, length);
        this.samplingFrequency = samplingFrequency;
    }

    public float getSamplingFrequency() {
        return samplingFrequency;
    }

    public void setSamplingFrequency(float samplingFrequency) {
        this.samplingFrequency = samplingFrequency;
    }
}
