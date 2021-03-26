package hust.soict.hedspi.aims;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.order.Order;

public class Aims {
    public static void main(String[] args) {
        Order od = new Order();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation",
                "Roger Aller",87, 19.95f);
        od.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Stars War", "Science Fiction",
                "George Lucas",87, 24.95f);
        od.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 18.99f);
        od.addDigitalVideoDisc(dvd3);

        System.out.println("Total cost: "+String.format("%.4g%n",od.totalCost()));

        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Prometheus", "Science Fiction",
                "Ridley Scott", 20.5f);
        od.addDigitalVideoDisc(dvd4);

        System.out.println("Total cost: "+String.format("%.4g%n",od.totalCost()));
        //like "%.2f" in C

        od.removeDigitalVideoDisc(dvd2);
        System.out.println("Total cost: "+String.format("%.4g%n",od.totalCost()));
    }
}
