public class Player {
    Writer writer;
    CD cd;
    enum playerMode{
        Spotify,
        Default
    }
    playerMode mode;

    public void next(){

    }

    public void prev(){

    }

    public void show(){

    }

    public void stop(){

    }

    public void start(){

    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }

    public void setCd(CD cd) {
        this.cd = cd;
    }

    public void setMode(playerMode mode){
        this.mode = mode;
    }
}
