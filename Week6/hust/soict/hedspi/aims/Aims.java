package Week6.hust.soict.hedspi.aims;

import Week6.hust.soict.hedspi.aims.media.Book;
import Week6.hust.soict.hedspi.aims.media.DigitalVideoDisc;
import Week6.hust.soict.hedspi.aims.order.Order;
import static Week6.hust.soict.hedspi.aims.order.Order.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Aims {
    public static void main(String[] args) {
        int choice, id;
        Scanner scn = new Scanner(System.in);
        Order myorder = createNewOrder();
        String space = "";

        while(true) {
            showMenu();
            choice = scn.nextInt();
            space = scn.nextLine();
            if(getNbOrder() > MAX_LIMITED_ORDERED) break;

            switch (choice) {
                case 1:
                    System.out.println("1. Create new order");
                    myorder = createNewOrder();
                    if(myorder == null) System.out.println("Cannot create another order");
                    else {
                        myorder.setDateOrdered(3,4,2021);
                        System.out.println("Created order successfully!");
                    }
                    break;

                case 2:
                    System.out.println("2. Add item to the order");
                    String cusChoice = "";
                    System.out.print("Book or DVD: ");
                    cusChoice = scn.nextLine();
                    addItemOrder(myorder,cusChoice);
                    break;

                case 3:
                    System.out.println("3. Delete item by id");
                    System.out.print("Input id of item you wanna delete: ");
                    id = scn.nextInt();
                    space = scn.nextLine();
                    System.out.println(myorder.removeMedia(id));

                    break;

                case 4:
                    System.out.println("4. Display item list of order");
                    myorder.printOrder();
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

    public static void showMenu(){
        System.out.println("Order Management Application ");
        System.out.println("_____________________________");
        System.out.println("1. Create new order");
        System.out.println("2. Add item to the order");
        System.out.println("3. Delete item by id");
        System.out.println("4. Display item list of order");
        System.out.println("0. Exit");
        System.out.println("_____________________________");
        System.out.println("Choose a number: 0-1-2-3-4");
        System.out.print("Your choice: ");
    }

    public static Order createNewOrder(){
        if(getNbOrder() > MAX_LIMITED_ORDERED){
            System.out.println("Number of Order surpassed MAXIMUM");
            return null;
        }
        else {
            Order oror = new Order();
            return oror;
        }
    }

    public static void addItemOrder(Order myodr, String cusChoice){
        String spc = "";
        Scanner scnr = new Scanner(System.in);
        System.out.print("Item name: ");
        String title = scnr.nextLine();
        System.out.print("Item category: ");
        String cate = scnr.nextLine();
        System.out.print("Item cost: ");
        Float cost = scnr.nextFloat();
        spc = scnr.nextLine();

        if(cusChoice.equals("DVD")) {
            System.out.print("Item director: ");
            String drt = scnr.nextLine();
            System.out.print("Length: ");
            int len = scnr.nextInt();
            spc = scnr.nextLine();
            DigitalVideoDisc dvd = new DigitalVideoDisc(title, cate, cost, drt, len);
            myodr.addMedia(dvd);
        }
        else if (cusChoice.equals("Book")) {
            String aut = "";
            ArrayList<String> Myauth = new ArrayList<String>();
            while (!aut.equals("stop!")) {
                System.out.print("With book item, author: ");
                aut = scnr.nextLine();
                if (!aut.equals("stop!")) {Myauth.add(aut);}
            }
            Book bk = new Book(title, cate, cost, Myauth);
            myodr.addMedia(bk);
        }
    }

}
