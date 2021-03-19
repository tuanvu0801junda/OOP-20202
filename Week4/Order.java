package Week4;
import Week3.DigitalVideoDisc;
import java.util.Scanner;

public class Order {
    Scanner scan = new Scanner(System.in);
    //***** COPY FROM WEEK 3 *****
    public static final int MAX_ORDERED_NUMBER = 10; //final --> CONSTANT
    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_ORDERED_NUMBER];
    private int qtyOrdered = 0;

    public int getQtyOrdered() { return qtyOrdered; }

    public void setQtyOrdered(int qtyOrdered) { this.qtyOrdered = qtyOrdered; }

    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if(qtyOrdered > MAX_ORDERED_NUMBER) {
            System.out.println("List of Digital Disk is ALREADY FULL!");
        }
        else{
            itemsOrdered[qtyOrdered++] = disc;
            System.out.println("Disc " + "\""+disc.getTitle()+"\"" + " has been added ^^");
            if(qtyOrdered == MAX_ORDERED_NUMBER -1) System.out.println("Your Digital List is ALMOST FULL. Only 1 more to add.");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        if(qtyOrdered == 0){
            System.out.println("List of Digital Disk is empty. Cannot remove!");
        }
        else{
            int control = 0;
            for(int i=0;i<qtyOrdered;i++){ if(disc.Equals(itemsOrdered[i]) == 1) control = i; }
            if(control != 0){
                for(int i=control;i<qtyOrdered;i++){
                    itemsOrdered[i] = itemsOrdered[i+1];
                }
                qtyOrdered -=1;
                System.out.println("Disc "+ "\""+disc.getTitle()+"\"" + " has been deleted from the list!");
            }
            else System.out.println("Inputted element: Not found!");
        }
    }

    public float totalCost(){
        float sum = 0;
        for(int i=0;i<qtyOrdered;i++){
            sum += itemsOrdered[i].getCost();
        }
        return sum;
    }

    //***** START WEEK 4 *****

    //add an array to DVD LIST
    public void addDigitalVideoDisc(DigitalVideoDisc[] discList){
        if(qtyOrdered > MAX_ORDERED_NUMBER ) {
            System.out.println("List of Digital Disk is ALREADY FULL!");
        }
        else if ((qtyOrdered + discList.length) > MAX_ORDERED_NUMBER){
            System.out.println("OVERLOAD because adding THE NEW LIST. Items that can't be added: ");
            for(int i=0;i<qtyOrdered + discList.length - MAX_ORDERED_NUMBER;i++){
                System.out.println("\t+"+ discList[discList.length-i-1].getTitle());
            }
        }
        else {
            for (int i = 0; i < discList.length; i++) {
                itemsOrdered[qtyOrdered++] = discList[i];
                System.out.println("Disc " + "\"" + discList[i].getTitle() + "\"" + " has been added ^^");
            }
            if (qtyOrdered == MAX_ORDERED_NUMBER - 1) {
                System.out.println("Your Digital List is ALMOST FULL. Only 1 more to add.");
            }
        }
    }

    //add an arbitrary number of elements
    public void addDigitalVideoDisc(int num){
        if(qtyOrdered > MAX_ORDERED_NUMBER){
            System.out.println("List of Digital Disk is ALREADY FULL!");
        }
        else if (qtyOrdered + num > MAX_ORDERED_NUMBER){
            System.out.println("OVERLOAD because adding THE NEW LIST. ");
        }
        else{
            for(int i=0;i<num;i++){
                System.out.println("Title: ");
                String title = scan.nextLine();
                System.out.println("Category: ");
                String cate = scan.nextLine();
                System.out.println("Cost: ");
                float cost = scan.nextFloat();
                String gab = scan.nextLine();
                // --> Khử buffer (scan nextLine() giữa (int, float, double) và String
                itemsOrdered[qtyOrdered++] = new DigitalVideoDisc(title,cate,cost);
            }
        }
    }

    //add 2 element to DVD LIST
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
        if(qtyOrdered > MAX_ORDERED_NUMBER ) {
            System.out.println("List of Digital Disk is ALREADY FULL!");
        }
        else if (qtyOrdered + 2 > MAX_ORDERED_NUMBER ){
            System.out.println("OVERLOAD because adding THE NEW LIST. Items that can't be added: ");
            if(qtyOrdered+2-MAX_ORDERED_NUMBER == 1){
                System.out.println("\t+"+dvd2.getTitle());
            }
            else if(qtyOrdered+2-MAX_ORDERED_NUMBER >= 2){
                System.out.println("\t+"+dvd2.getTitle());
                System.out.println("\t+"+dvd1.getTitle());
            }
        }
        else{
            itemsOrdered[qtyOrdered++] = dvd1;
            System.out.println("Disc " + "\""+dvd1.getTitle()+"\"" + " has been added ^^");
            itemsOrdered[qtyOrdered++] = dvd2;
            System.out.println("Disc " + "\""+dvd2.getTitle()+"\"" + " has been added ^^");
            if(qtyOrdered == MAX_ORDERED_NUMBER -2) System.out.println("Your Digital List is ALMOST FULL. Only 1 more to add.");
        }
    }

}
