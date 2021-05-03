package Week8.aims.media;

import java.util.ArrayList;
import java.util.Scanner;

public class CDFactory implements AbstractItemFactory {
    @Override
    public Media createMediaItemFromConsole() {
        String spc = "";
        Scanner scnr = new Scanner(System.in);
        CompactDisc cd = new CompactDisc();

        System.out.print("CD Title: ");
        cd.setTitle(scnr.nextLine());
        System.out.print("CD category: ");
        cd.setCategory(scnr.nextLine());
        System.out.print("CD director: ");
        cd.setDirector(scnr.nextLine());
        System.out.print("CD Artist: ");
        cd.setArtist(scnr.nextLine());
        System.out.print("CD cost: ");
        cd.setCost(scnr.nextFloat());
        spc = scnr.nextLine();

        ArrayList<Track> mytrack = new ArrayList<Track>();
        String trkTTL = " ";

        while(!trkTTL.equals("stop!")){
            System.out.print("Enter track title (TTL): ");
            trkTTL = scnr.nextLine();
            if(!trkTTL.equals("stop!")) {
                Track trk = new Track(trkTTL);
                System.out.print("Enter track length: ");
                trk.setLength(scnr.nextInt());
                spc = scnr.nextLine();
                mytrack.add(trk);
            }
        }
        cd.setTracks(mytrack);
        cd.setLength(cd.getCDLength());
        System.out.print("Wanna play ? --> Your answer(\"Yes\" or \"No\"): ");
        if(scnr.nextLine().equals("Yes")){
            cd.play();
        }
        return cd;
    }
}
