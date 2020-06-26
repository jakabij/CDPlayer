public class Player {
    Writer writer;
    CD cd;
    enum playerMode{
        PLAY,
        STOP,
        NEXT,
        PREV,
        SHOW
    }
    String mode;

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

    public void setMode(String playerMode){
        this.mode = playerMode;
    }
}
