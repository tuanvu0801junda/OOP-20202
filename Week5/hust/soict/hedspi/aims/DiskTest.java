package hust.soict.hedspi.aims;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.order.Order;

public class DiskTest {
    public static void main(String[] args) {
        Order ord0 = new Order();
        DigitalVideoDisc d1 = new DigitalVideoDisc("Doraemon","Animation",80.5f);
        DigitalVideoDisc d2 = new DigitalVideoDisc("Conan","Detective",36.5f);
        DigitalVideoDisc d3 = new DigitalVideoDisc("The Meg","Thrilling",37.5f);
        DigitalVideoDisc d4 = new DigitalVideoDisc("Prometheus","Science Fiction",18.5f);

        ord0.addDigitalVideoDisc(d1,d2);
        ord0.addDigitalVideoDisc(d3,d4);

        //DigitalVideoDisc luck = ord0.getALuckyDVDItem();
        ord0.printOrder();

        d1.search("     Doraemon   and       friend     ");
    }
}
