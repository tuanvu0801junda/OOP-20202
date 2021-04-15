package Week7.hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private List<Track> tracks = new ArrayList<Track>();

    public CompactDisc(String title, String category, float cost, int length, String director, String artist, List<Track> tracks) {
        super(title, category, cost, length, director);
        this.artist = artist;
        this.tracks = tracks;
    }

    public CompactDisc(){
        super();
    }

    public String getArtist() { return artist; }
    public void setArtist(String artist) { this.artist = artist; }
    public void setTracks(List<Track> tracks) { this.tracks = tracks; }

    public String addTrack(Track trk){
        boolean belong = tracks.contains(trk);
        if(belong) {
            return "Existed already. Can't add!";
        }
        else {
           tracks.add(trk);
           return "Add track "+trk.getTitle()+" successfully!";
        }
    }

    public String removeTrack(Track trk){
        boolean belong = tracks.contains(trk);
        if(!belong) {
            return "Not existed! Can't remove!";
        }
        else {
            tracks.remove(trk);
            return "Remove track "+trk.getTitle()+" successfully!";
        }
    }

    public int getCDLength(){
        int sumLength = 0;
        for(Track trk : tracks){
            sumLength += trk.getLength();
        }
        return sumLength;
    }

    public String printInfo(){
        String Cd = "CD: ";
        Cd += this.title+" - "+this.category+" - Track(s): ";
        for(int i=0;i<tracks.size();i++){
            Cd += tracks.get(i).getTitle();
            if(i != tracks.size() - 1) {Cd +=" & ";}
        }
        Cd += " - "+this.getCDLength()+ " min ";
        Cd += ": "+this.cost+ " $\n";
        return Cd;
    }

    public void play() {
        for (Track trk: tracks){
            trk.play();
        }
        System.out.print("\n");
    }
}
