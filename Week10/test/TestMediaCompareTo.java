package aims.test;

import aims.media.disk.CompactDisc;
import aims.media.disk.DigitalVideoDisc;
import aims.media.Media;
import aims.media.disk.Track;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestMediaCompareTo {
    public static void main(String[] args) {
        // always instance of Media (inheritance)

        List<Media> collection = new ArrayList<>();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation",19.95f,87,"Ridley Scott");
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction",24.95f,124,"George Lucas");
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin","Animation",18.99f,99,"John Musker");

        collection.add(dvd1);
        collection.add(dvd2);
        collection.add(dvd3);

        // before sorting: ITERATE and PRINT TITLE
        Iterator<Media> iter = collection.iterator();
        // an iterator COME ALONG WITH <List>
        System.out.println("#####################\nElements in list now (not sorted)");
        while(iter.hasNext()){
            System.out.println(((DigitalVideoDisc) iter.next()).getTitle());
        }

        Collections.sort(collection);
        // sort here using "overridden" compareTo in Media.java --> "title" is standard to compare

        iter = collection.iterator();
        // re-assign (move pointer from array-end to array-begin position)

        System.out.println("#####################\nAfter being sorted\n");
        while (iter.hasNext()){
            System.out.println(((DigitalVideoDisc)iter.next()).getTitle());
        }


        CompactDisc cd1 = new CompactDisc();
        CompactDisc cd2 = new CompactDisc();
        CompactDisc cd3 = new CompactDisc();
        cd1.setTitle("Mini-Album vol1");
        cd2.setTitle("Welcome back vol2");
        cd3.setTitle("Here we are vol3");

        ArrayList<Track> cd_tracks = new ArrayList<>();
        ArrayList<Track> cd_tracks2 = new ArrayList<>();
        ArrayList<Track> cd_tracks3 = new ArrayList<>();
        cd_tracks.add(new Track("Just forget me", 3));
        cd_tracks.add(new Track("Pretend we had no start",5));
        cd1.setTracks(cd_tracks);

        cd_tracks2.add(new Track("Here come the sun",5));
        cd_tracks2.add(new Track("Just forget me", 3));
        cd_tracks2.add(new Track("Pretend we had no start",4));
        cd3.setTracks(cd_tracks2);

        cd_tracks3.add(new Track("I wish",3));
        cd_tracks3.add(new Track("You of yesterday",4));
        cd2.setTracks(cd_tracks3);

        List<Media> cd_clt = new ArrayList<>();
        cd_clt.add(cd1);
        cd_clt.add(cd2);
        cd_clt.add(cd3);

        Iterator<Media> iter2 = cd_clt.iterator();
        System.out.println("##########################\nCD list BEFORE sorting");
        while(iter2.hasNext()){
            CompactDisc mid = (CompactDisc)iter2.next();
            // if "List<CompactDisc>" && "Iterator<CompactDisc>"
            // --> (CompactDisc) in "(CompactDisc)iter2.next()" is UNnecessary.
            System.out.println(mid.getTitle());
            System.out.println(mid.getCDLength());

            /*
            System.out.println(((CompactDisc)iter2.next()).getTitle());
            System.out.println(((CompactDisc)iter2.next()).getCDLength());
            --> 2 next() like this will double pointer's position --> FATAL WRONG !!!
            */
        }

        Collections.sort(cd_clt);
        iter2 = cd_clt.iterator(); //re-assign
        System.out.println("##########################\nCD list AFTER sorting");
        while(iter2.hasNext()){
            CompactDisc mid = (CompactDisc)iter2.next();
            System.out.println(mid.getTitle());
            System.out.println(mid.getCDLength());
        }


    }
}
