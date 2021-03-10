package Week3;

public class Order {
    public static final int MAX_ORDERED_NUMBER = 10; //final --> CONSTANT
    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_ORDERED_NUMBER];
    private int qtyOrdered = 0;

    public int getQtyOrdered() { return qtyOrdered; }

    public void setQtyOrdered(int qtyOrdered) { this.qtyOrdered = qtyOrdered; }

    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if(qtyOrdered >= MAX_ORDERED_NUMBER - 1) {
            System.out.println("List of Digital Disk is ALREADY FULL!");
        }
        else{
            itemsOrdered[qtyOrdered++] = disc;
            System.out.println("Disc " + "\""+disc.getTitle()+"\"" + " has been added ^^");
            if(qtyOrdered == MAX_ORDERED_NUMBER -2) System.out.println("Your Digital List is ALMOST FULL. Only 1 more to add.");
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

}
