package Week7.hust.soict.hedspi.aims;

import Week7.hust.soict.hedspi.aims.media.Media;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import static Week7.hust.soict.hedspi.aims.Aims.showMenuCreation;

public class TestAIMS {
    public static void main(String[] args) {
        int choice, id;
        Scanner scn = new Scanner(System.in);
        ArrayList<Media> AdminItems = new ArrayList<Media>();
        String space = "";
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        while(true) {
            showAdminMenu();
            choice = scn.nextInt();
            space = scn.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("1. Create new item");
                    Media new_mdf = showMenuCreation();
                    AdminItems.add(new_mdf);
                    System.out.println("Created & added new item successfully!");
                    break;

                case 2:
                    System.out.println("2. Delete item by id");
                    System.out.print("Input id of item you wanna delete: ");
                    id = scn.nextInt();
                    space = scn.nextLine();
                    AdminItems.remove(id);
                    break;

                case 3:
                    System.out.println("3. Display the items list");
                    printAvailableItems(sdf,AdminItems);
                    break;

                case 0:
                    System.out.println("0. Exit");
                    break;

                default:
                    System.out.println("Entered number doesn't exit.");
                    break;
            }
            if(choice == 0) break;

        }
    }

    public static void showAdminMenu(){
        System.out.println("\nProduct Management Application: ");
        System.out.println("--------------------------------");
        System.out.println("1. Create new item");
        System.out.println("2. Delete item by id");
        System.out.println("3. Display the items list");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
        System.out.print("Your choice: ");
    }

    public static String MediaItemString(ArrayList<Media> itemsOrdered){
        String MediaFinal = "";
        for(Media mda: itemsOrdered){
            MediaFinal += mda.printInfo();
        }
        return MediaFinal;
    }
    // Return String better than S.OUT ! (for print FILE/BUFFER/USER INTERFACE) --> more OOP styled !

    public static void printAvailableItems(SimpleDateFormat sdf, ArrayList item){
        System.out.println("\n***********************Order***********************");
        Date dt = new Date();
        System.out.println("Date: "+sdf.format(dt));
        System.out.println("Admin items: \n\n"+MediaItemString(item));
        System.out.println("***************************************************\n");
    }

    /*
    public static Media createBook(){
        String spc = "";
        Scanner scnr = new Scanner(System.in);
        Book bk = new Book();

        System.out.print("Book Title: ");
        bk.setTitle(scnr.nextLine());
        System.out.print("Book category: ");
        bk.setCategory(scnr.nextLine());
        System.out.print("Item cost: ");
        bk.setCost(scnr.nextFloat());
        spc = scnr.nextLine();
        String aut = "";
        ArrayList<String> MyAuthor = new ArrayList<String>();
        while (!aut.equals("stop!")) {
            System.out.print("With book item, author: ");
            aut = scnr.nextLine();
            if (!aut.equals("stop!")) {MyAuthor.add(aut);}
        }
        return bk;
    }

    public static Media createDVD(){
        String spc = "";
        Scanner scnr = new Scanner(System.in);
        DigitalVideoDisc dvd = new DigitalVideoDisc();

        System.out.print("DVD Title: ");
        dvd.setTitle(scnr.nextLine());
        System.out.print("DVD category: ");
        dvd.setCategory(scnr.nextLine());
        System.out.print("DVD cost: ");
        dvd.setCost(scnr.nextFloat());
        spc = scnr.nextLine();

        System.out.print("DVD director: ");
        dvd.setDirector(scnr.nextLine());
        System.out.print("DVD Length: ");
        dvd.setLength(scnr.nextInt());
        spc = scnr.nextLine();

        System.out.print("Wanna play ? --> Your answer(\"Yes\" or \"No\"): ");
        if(scnr.nextLine().equals("Yes")){
            dvd.play();
        }
        return dvd;
    }

    public static Media createCD(){
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
     */

}
