package Week7.hust.soict.hedspi.aims;

import Week7.hust.soict.hedspi.aims.media.DigitalVideoDisc;
import Week7.hust.soict.hedspi.aims.media.Media;
import Week7.hust.soict.hedspi.aims.order.Order;

import java.util.ArrayList;

public class DiskTest {
    public static void main(String[] args) {
        Order ord0 = new Order();
        //ord0.setDateOrdered(2,4,2021);

        DigitalVideoDisc d1 = new DigitalVideoDisc("Doraemon and friends","Animation",80.5f);
        DigitalVideoDisc d2 = new DigitalVideoDisc("Sherlock Holmes in Berlin","Detective",36.5f);
        DigitalVideoDisc d3 = new DigitalVideoDisc("The Meg","Thrilling",37.5f);
        DigitalVideoDisc d4 = new DigitalVideoDisc("Prometheus","Science Fiction",18.5f);

        System.out.println(ord0.addMedia(d1));
        System.out.println(ord0.addMedia(d2));

        ArrayList<Media> mda1 = new ArrayList<Media>();
        mda1.add(d3);
        mda1.add(d4);
        System.out.println(ord0.addMedia(mda1));

        //Media luck = ord0.getALuckyDVDItem();
        ord0.printOrder();

        System.out.println(d1.search("     doraemon   friends       and     "));
        System.out.println(d2.search(" sherlock  holmes   in     berlin "));

        /**** test choose a lucky item ~ After learning "Polymorphism" ****/
        ord0.printOrderLuckyDVD();
        /**** user cannot see deep-down hidden data ****/
    }
}
