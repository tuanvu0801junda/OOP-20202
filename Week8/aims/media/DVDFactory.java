package Week8.aims.media;

import java.util.Scanner;

public class DVDFactory implements AbstractItemFactory {
    @Override
    public Media createMediaItemFromConsole() {
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
}
