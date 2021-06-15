package aims.media.disk;

import aims.PlayerException;
import aims.media.Media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private List<Track> tracks = new ArrayList<>();

    public CompactDisc(String title, String category, float cost, int length, String director, String artist, List<Track> tracks) {
        super(title, category, cost, length, director);
        this.artist = artist;
        this.tracks = tracks;
    }

    public CompactDisc(){
        super();
    }

    public String getArtist() { return artist; }

    public List<Track> getTracks() {
        return tracks;
    }

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
        StringBuilder builderCD = new StringBuilder("CD: "+ this.title+" - "
                +this.category+" - Track(s): ");
        for(int i=0;i<tracks.size();i++){
            builderCD.append(tracks.get(i).getTitle());
            if(i != tracks.size() - 1) {builderCD.append(" & ");}
        }
        String tempCD = " - "+this.getCDLength()+ " min "+": "+this.cost+ " $\n";
        builderCD.append(tempCD);
        return builderCD.toString();
    }

    public void play() throws PlayerException {
        if (this.length > 0) {
            for (Track trk : tracks) {
                try {
                    trk.play();
                }catch (PlayerException ple){
                    System.out.println(ple.getMessage());
                }
            }
            System.out.print("\n");
        }
        else{
            throw new PlayerException("Cannot play a CD which length <= 0 ");
        }
    }

    @Override
    public int compareTo(Media media) {
        //return super.compareTo(obj);
        CompactDisc cd = (CompactDisc) media;
        if (cd.getTracks().size() < this.getTracks().size()) return 1;
        else if (cd.getTracks().size() > this.getTracks().size()) return -1;
        else{
            return Integer.compare(this.getCDLength(),cd.getCDLength());
        }
    }
}
