public class MP3Song extends Song {
    int size;

    public MP3Song(String title, int length, int size) {
        super(title, length);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
