import java.util.List;

public abstract class CD {
    int limit;
    List<Song> songs;

    public CD(int limit, List<Song> songs) {
        this.limit = limit;
        this.songs = songs;
    }

    public int getLimit() {
        return limit;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public void addTrack(Song song){
        this.songs.add(song);
    }
}
