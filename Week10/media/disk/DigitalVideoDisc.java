package aims.media.disk;

import aims.PlayerException;
import aims.media.Media;

import java.util.Locale;

public class DigitalVideoDisc extends Disc implements Playable {

    public DigitalVideoDisc(String title, String category, float cost, int length, String director) {
        super(title, category, cost, length, director);
    }

    public DigitalVideoDisc(String title, String category, float cost){
        super(title,category,cost);
    }


    public void setDirector(String director) { this.director = director; }
    public void setLength(int length) { this.length = length; }

    public String getDirector() { return director; }
    public int getLength() { return length; }


    public DigitalVideoDisc(){
        super();
    }

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

        for (String s : rootThisTitle) {
            for (String value : compareToken) {
                if (s.equals(value)) compare++;
            }
        }

        return compare == rootThisTitle.length;
    }

    public String printInfo(){
        String DVD = "DVD: ";
        /*
        DVD = this.getTitle()+" - "+this.getCategory()+" - "+this.getDirector()+
                " - "+this.getLength()+": "+this.getCost()+ " $\n";
         */
        DVD += this.title+" - "+this.category+" - "+this.director+
                " - "+this.length+" min:  "+ +this.cost+" $\n";

        //title & category & cost: private --> class DVD can access directly.
        return DVD;
    }
    //RETURN INFO of 1 DVD

    public void play() throws PlayerException {
        if (this.length >=0) {
            System.out.println("Playing DVD: " + this.title);
            System.out.println("DVD length: " + this.length);
        }
        else{
            throw new PlayerException("ERROR: DVD length is non-positive!");
        }
    }

    //Comparable is a "template"?
    @Override
    public int compareTo(Media media) {
        DigitalVideoDisc d = (DigitalVideoDisc) media;
        /*
        if (this.cost > d.cost) return -1;
        else if (this.cost == d.cost) return 0;
        else return 1;
        */
        return Float.compare(this.cost,d.cost);
    }
}