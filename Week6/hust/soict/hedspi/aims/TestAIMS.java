package Week6.hust.soict.hedspi.aims;

import Week6.hust.soict.hedspi.aims.media.Book;
import Week6.hust.soict.hedspi.aims.media.DigitalVideoDisc;
import Week6.hust.soict.hedspi.aims.order.Order;
import java.util.ArrayList;

public class TestAIMS {
    public static void main(String[] args) {
        // create an instance of order. && setDate
        Order od = new Order();
        od.setDateOrdered(31,3,2021);

        // add a disc to order od
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation",
                19.95f,"Roger Aller", 87);
        System.out.println(od.addMedia(dvd1));

        // add another disc to order od
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Aladdin", "Animation", 18.99f);
        System.out.println(od.addMedia(dvd2));
        System.out.println("Total cost: "+String.format("%.4g%n",od.totalCost()));

        // add another disc to order od
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Prometheus", "Science Fiction",
                20.45f, "Ridley Scott", 87);
        System.out.println(od.addMedia(dvd3));
        System.out.println("Total cost: "+String.format("%.4g%n",od.totalCost()));
        //like "%.2f" in C

        // remove a disc from order od
        System.out.println(od.removeMedia(dvd2));
        System.out.println("Total cost: "+String.format("%.4g%n",od.totalCost()));

        // add a book to order od.
        ArrayList<String> authorBook1 = new ArrayList<>();
        authorBook1.add("Albert Nguyen");
        authorBook1.add("Ngoc-Minh Tran");
        Book book1 = new Book("Vietnamese History","Novel",30.56f,authorBook1);
        od.addMedia(book1);

        // add another book to order od
        ArrayList<String> authorBook2 = new ArrayList<>();
        authorBook2.add("Nishiyama Kouta");
        authorBook2.add("Ishikawa Yumi");
        authorBook2.add("Kinoshita Yukiko");
        Book book2 = new Book("N1 Goukaku","Foreign Language",40.95f,authorBook2);
        od.addMedia(book2);

        od.printOrder();

    }
}
