package Week4;
import Week3.DigitalVideoDisc;

import static Week4.Order.MAX_LIMITED_ORDERED;
import static Week4.Order.getNbOrder;

public class TestAIMS {
    public static void main(String[] args) {
        Order odr = new Order();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation",
                "Roger Aller",87, 19.95f);
        odr.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Stars War", "Science Fiction",
                "George Lucas",87, 24.95f);
        odr.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 30.5f);
        odr.addDigitalVideoDisc(dvd3);

        System.out.println("\nTotal cost of list (1st time): "+odr.totalCost());
        DigitalVideoDisc[] Lists = new DigitalVideoDisc[2];
        DigitalVideoDisc new_dvd1 = new DigitalVideoDisc("Doraemon", "Animation",20.50f);
        DigitalVideoDisc new_dvd2 = new DigitalVideoDisc("Prometheus", "Science Fiction",23.50f);
        Lists[0] = new_dvd1;
        Lists[1] = new_dvd2;

        odr.addDigitalVideoDisc(Lists);
        System.out.println("\nTotal cost of list (2nd time): "+odr.totalCost());

        DigitalVideoDisc[] new_list = new DigitalVideoDisc[6];
        new_list[0] = new DigitalVideoDisc("Terminator", "Science Fiction",20.5f);
        new_list[1] = new DigitalVideoDisc("Terminator 1", "Science Fiction",20.5f);
        new_list[2] = new DigitalVideoDisc("Terminator 2", "Science Fiction",20.5f);
        new_list[3] = new DigitalVideoDisc("Terminator 3", "Science Fiction",20.5f);
        new_list[4] = new DigitalVideoDisc("Terminator 4", "Science Fiction",20.5f);
        new_list[5] = new DigitalVideoDisc("Terminator 5", "Science Fiction",20.5f);

        odr.addDigitalVideoDisc(new_list);
        System.out.println("\nTotal cost of list (3rd time): "+odr.totalCost());

        DigitalVideoDisc my_disc1 = new DigitalVideoDisc("Sherlock Holmes", "Detective", 50.5f);
        DigitalVideoDisc my_disc2 = new DigitalVideoDisc("Sherlock Holmes 2", "Detective", 50.5f);

        odr.addDigitalVideoDisc(my_disc1,my_disc2);
        System.out.println("\nTotal cost of list (4th time): "+odr.totalCost());

        odr.removeDigitalVideoDisc(my_disc1);
        System.out.println("\nTotal cost of list (5th time): "+odr.totalCost());

        odr.setDateOrdered(20,11,2022);
        odr.printOrder();

        if(getNbOrder() >= MAX_LIMITED_ORDERED){
            System.out.println("Cannot create another order!");
        }
        else{
            Order odr1 = new Order();
            Order odr2 = new Order();
            Order odr3 = new Order();
            Order odr4 = new Order();

            odr1.setDateOrdered(7,5,2020);
            odr1.addDigitalVideoDisc(dvd1);
            odr1.addDigitalVideoDisc(dvd2);

            odr2.setDateOrdered(9,10,2020);
            odr2.addDigitalVideoDisc(new_dvd1);
            odr2.addDigitalVideoDisc(dvd2);

            odr3.setDateOrdered(1,3,2021);
            odr3.addDigitalVideoDisc(new_dvd2);
            odr3.addDigitalVideoDisc(dvd3);

            odr1.printOrder();
            odr2.printOrder();
            odr3.printOrder();
        }

        if(getNbOrder() >= MAX_LIMITED_ORDERED){
            System.out.println("Cannot create another order!");
        }
        else{
            Order odr5 = new Order();
            odr5.addDigitalVideoDisc(new_dvd2);
            odr5.printOrder();
        }




    }
}
