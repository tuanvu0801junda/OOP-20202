package Week7.hust.soict.hedspi.aims.media;

public class Track implements Playable {
    private String title;
    private int length;

    public Track(String title, int length){
        this.title = title;
        this.length = length;
    }
    public Track(String title){
        this.title = title;
    }

    public String getTitle() { return title; }
    public int getLength() { return length; }
    public void setLength(int length) {
        this.length = length;
    }

    public void play() {
        System.out.println("\nPlaying Track: " + this.title);
        System.out.println("Track length: " + this.length);
    }

}
