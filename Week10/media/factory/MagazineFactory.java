package aims.media.factory;

import aims.media.Magazine;
import aims.media.Media;

import java.util.Scanner;

public class MagazineFactory implements AbstractItemFactory{
    public Media createMediaItemFromConsole(){
        Magazine mgz = new Magazine();
        Scanner scn = new Scanner(System.in);

        System.out.print("Magazine Title: ");
        mgz.setTitle(scn.nextLine());
        System.out.print("Magazine Category: ");
        mgz.setCategory(scn.nextLine());
        System.out.print("Magazine Model: ");
        mgz.setModelName(scn.nextLine());
        System.out.print("Magazine Publisher: ");
        mgz.setPublisher(scn.nextLine());

        System.out.print("Magazine cost: ");
        mgz.setCost(scn.nextFloat());

        return mgz;
    }
}
