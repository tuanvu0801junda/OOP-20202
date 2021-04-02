package Week6.hust.soict.hedspi.aims.media;

import java.util.Locale;

public class DigitalVideoDisc extends Media{
    private String director;
    private int length;

    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost);
    }

    //constructor of only "director"
    public DigitalVideoDisc(String title, String category, float cost, String director) {
        super(title, category, cost);
        this.director = director;
    }

    //constructor of only "length"
    public DigitalVideoDisc(String title, String category, float cost, int length) {
        super(title, category, cost);
        this.length = length;
    }

    //constructor of both "director" & "length"
    public DigitalVideoDisc(String title, String category, float cost, String director, int length) {
        super(title, category, cost);
        this.director = director;
        this.length = length;
    }

    public void setDirector(String director) { this.director = director; }
    public void setLength(int length) { this.length = length; }

    public String getDirector() { return director; }
    public int getLength() { return length; }

    //Alt + insert -->  Hiển thị hộp thoại "Generator" --> getter and setter
    //set & get of title/category/cost already existed in class "Media"

    public boolean search(String title){
        //Không phân biệt chữ hoa chữ thường
        int qty = -1, compare = 0;
        if(title.equals(getTitle())) return true;

        title = title.trim();
        title = title.toLowerCase(Locale.ROOT);
        String rootTitle = this.title.toLowerCase(Locale.ROOT);

        String[] rootToken = title.split(" ");
        String[] compareToken = new String[rootToken.length];
        String[] rootThisTitle = rootTitle.split(" ");

        for(String w : rootToken){
            w = w.trim();
            if(w.equals("")) continue;
            else { compareToken[++qty] = w; }
        }

        for(int i=0;i<rootThisTitle.length;i++){
            for(int j=0;j<compareToken.length;j++){
                if(rootThisTitle[i].equals(compareToken[j])) compare++;
            }
        }

        if(compare == rootThisTitle.length) return true;
        else return false;
    }

    public String printInfo(){
        String DVD = "DVD: ";
        /*
        DVD = this.getTitle()+" - "+this.getCategory()+" - "+this.getDirector()+
                " - "+this.getLength()+": "+this.getCost()+ " $\n";
         */
        DVD += this.title+" - "+this.category+" - "+this.director+
                " - "+this.length+": "+this.cost+" $\n";

        //title & category & cost: private --> class DVD can access directly.
        return DVD;
    }
    //RETURN INFO of 1 DVD

}
