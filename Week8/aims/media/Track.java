package Week8.aims.media;

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

    public boolean equals(Object obj){
        if(obj instanceof Track) {
            Track new_track = (Track) obj;
            return (this.title.equals(new_track.title) && this.length == new_track.length);
        }
        else return false;
    }


}
