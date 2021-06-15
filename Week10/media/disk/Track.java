package aims.media.disk;

import aims.PlayerException;

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

    public void play() throws PlayerException {
        if (this.length >=0 ) {
            System.out.println("\nPlaying Track: " + this.title);
            System.out.println("Track length: " + this.length);
        }
        else{
            throw new PlayerException("ERROR: Track length is non-positive!");
        }
    }

    public boolean equals(Object obj){
        if(obj instanceof Track) {
            Track new_track = (Track) obj;
            return (this.title.equals(new_track.title) && this.length == new_track.length);
        }
        else return false;
    }


}
