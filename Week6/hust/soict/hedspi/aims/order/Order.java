package Week6.hust.soict.hedspi.aims.order;

import Week6.hust.soict.hedspi.aims.media.DigitalVideoDisc;
import Week6.hust.soict.hedspi.aims.media.Media;
import Week6.hust.soict.hedspi.aims.utils.MyDate;

import java.util.ArrayList;

public class Order {
    private static ArrayList<Media> itemsOrdered = new ArrayList<Media>();
    private static int nbOrder = 0;
    public static final int MAX_LIMITED_ORDERED = 2;
    private MyDate dateOrdered = new MyDate(1,1,2000);
    private int id;

    public Order(){
        nbOrder++;
    }

    public static int getNbOrder() {
        return nbOrder;
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public void setDateOrdered(int day, int month, int year){
        dateOrdered.setDay(day);
        dateOrdered.setMonth(month);
        dateOrdered.setYear(year);
    }

    public float totalCost(){
        float sum = 0;
        for(Media mda: itemsOrdered){
            sum+= mda.getCost();
        }
        return sum;
    }

    public String addMedia(Media mda){
        itemsOrdered.add(mda);
        return "Added "+mda.getTitle()+" successfully!";
    }

    public String addMedia(ArrayList mediaList){
        itemsOrdered.addAll(mediaList);
        return "Added list of Media Items successfully!";
    }

    public String removeMedia(int id){
        //check mda contained in itemOrdered or not
        if(id > itemsOrdered.size() || id < 0) return "id out of range [0,list_size]!";
        else {
            String temp = itemsOrdered.get(id).getTitle();
            itemsOrdered.remove(itemsOrdered.get(id));
            return "Removed " + temp + " successfully";
        }
    }

    public String removeMedia(Media mda){
        //check mda contained in itemOrdered or not
        boolean belong = itemsOrdered.contains(mda);
        if(!belong) return mda.getTitle()+" doesn't exist in list. Can't remove";
        else {
            itemsOrdered.remove(mda);
            return "Removed "+mda.getTitle()+" successfully";
        }
    }

    public String MediaOrderedString(){
        String MediaFinal = "";
        for(Media mda: itemsOrdered){
            MediaFinal += mda.printInfo();
        }
        //printInfo in Media (abstract class) call printInfo in Book & DVD, print the corresponding object.
        return MediaFinal;
    }
    // Return String better than S.OUT ! (for print FILE/BUFFER/USER INTERFACE) --> more OOP styled !

    public void printOrder(){
        System.out.println("\n***********************Order***********************");
        System.out.print("Date: "+dateOrdered.OrderDateToString());
        System.out.println("Ordered items: \n\n"+MediaOrderedString());
        System.out.println("Total cost: "+totalCost()+" $");
        System.out.println("***************************************************\n");
    }

    public Media getALuckyDVDItem(){
        int rand = (int)(Math.random() * (itemsOrdered.size()-1)) + 1;
        //int rand = (int)(Math.random() * (max-min)) + min;
        itemsOrdered.get(rand).setCost(0.0f);
        return itemsOrdered.get(rand);
    }

    public String DVDLuckyDetails(DigitalVideoDisc di){
        String DVDLucky = di.getTitle()+" - "+di.getCategory()+" - "+di.getDirector()+
                " - "+di.getLength()+": "+di.getCost()+ " $\n";
        return DVDLucky;
    }

    public void printOrder(DigitalVideoDisc di){
        System.out.println("\n***********************Order***********************");
        System.out.print("Date: "+dateOrdered.OrderDateToString());
        System.out.println("Ordered DVD item: \n"+MediaOrderedString());
        System.out.println("*$*\nLucky Free DVD item: "+DVDLuckyDetails(di)+"*$*\n");
        System.out.println("Total cost: "+totalCost()+" $");
        System.out.println("***************************************************\n");
    }

    /*
    public static Media findItemWithID(int id){
        for(int i=0;i<itemsOrdered.size();i++){
            if(i == id) return itemsOrdered.get(i);
        }
        return null;
    }
     */

}
