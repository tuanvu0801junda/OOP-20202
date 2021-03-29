package hust.soict.hedspi.aims.order;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.utils.MyDate;

public class Order {
    public static final int MAX_ORDERED_NUMBER = 10; //final --> CONSTANT
    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_ORDERED_NUMBER];
    private int qtyOrdered = 0;
    public static final int MAX_LIMITED_ORDERED = 5;
    private static int nbOrder = 0; // --> lấy giá trị DUY NHẤT 1 lần --> tăng dần được.
    //private int nbOrder = 0; --> Lần nào cũng được khởi tạo là 0 trong constructor --> KHÔNG THỂ TĂNG.
    private MyDate dateOrdered = new MyDate(1,1,2000);
    //private MyDate dateOrdered; --> NOT INITIALIZED.
    //--> đưa vào method setDateOrdered sẽ báo lỗi (NullException)

    public Order(){
        //check if nbOrder <= MAX_LIMITED_ORDERED
        nbOrder++;
    }

    public static int getNbOrder() {
        return nbOrder;
    }

    public int getQtyOrdered() { return qtyOrdered; }

    public void setDateOrdered(int day, int month, int year){
        dateOrdered.setDay(day);
        dateOrdered.setMonth(month);
        dateOrdered.setYear(year);
    }

    //public void setQtyOrdered(int qtyOrdered) { this.qtyOrdered = qtyOrdered; }

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
            for(int i=0;i<qtyOrdered;i++){ if(disc == itemsOrdered[i]) control = i; }
            //can compare directly 2 object DigitalVideoDisc ?? --> TRUE in this CASE
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

    //add an arbitrary number of elements --> SAME AS AN ARRAY ---> OVERLOADING.
    //Need to comment

    /*
    public void addDigitalVideoDisc(DigitalVideoDisc... diList){
        if(qtyOrdered > MAX_ORDERED_NUMBER){
            System.out.println("List of Digital Disk is ALREADY FULL!");
        }
        else if (qtyOrdered + diList.length > MAX_ORDERED_NUMBER){
            System.out.println("OVERLOAD because adding THE NEW LIST. Items that can't be added: ");
            for(int i=0;i<qtyOrdered + diList.length - MAX_ORDERED_NUMBER;i++){
                System.out.println("\t+"+ diList[diList.length-i-1].getTitle());
            }
        }
        else{
            for(int i=0;i<diList.length;i++){
                itemsOrdered[qtyOrdered++] = diList[i];
            }
        }
    }
    */

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

    public String DVDOrderedString(){
        String DVDFinal = "";
        for(int i=0;i<qtyOrdered;i++){
            DVDFinal += (i+1)+". DVD - "+itemsOrdered[i].getTitle()+" - "+itemsOrdered[i].getCategory()+" - "+itemsOrdered[i].getDirector()+
                    " - "+itemsOrdered[i].getLength()+": "+itemsOrdered[i].getCost()+ " $\n";
        }
        return DVDFinal;
    }
    // Return String better than S.OUT ! (for print FILE/BUFFER/USER INTERFACE) --> more OOP styled !

    public void printOrder(){
        System.out.println("\n***********************Order***********************");
        System.out.print("Date: "+dateOrdered.OrderDateToString());
        System.out.println("Ordered DVD item: \n"+DVDOrderedString());
        System.out.println("Total cost: "+totalCost()+" $");
        System.out.println("***************************************************\n");
    }

    public DigitalVideoDisc getALuckyDVDItem(){
        int rand = (int)(Math.random() * (getQtyOrdered()-1)) + 1;
        //int rand = (int)(Math.random() * (max-min)) + min;
        itemsOrdered[rand].setCost(0.0f);
        return itemsOrdered[rand];
    }

    public String DVDLuckyDetails(DigitalVideoDisc di){
        String DVDLucky = di.getTitle()+" - "+di.getCategory()+" - "+di.getDirector()+
                " - "+di.getLength()+": "+di.getCost()+ " $\n";
        return DVDLucky;
    }

    public void printOrder(DigitalVideoDisc di){
        System.out.println("\n***********************Order***********************");
        System.out.print("Date: "+dateOrdered.OrderDateToString());
        System.out.println("Ordered DVD item: \n"+DVDOrderedString());
        System.out.println("*$*\nLucky Free DVD item: "+DVDLuckyDetails(di)+"*$*\n");
        System.out.println("Total cost: "+totalCost()+" $");
        System.out.println("***************************************************\n");
    }



}
