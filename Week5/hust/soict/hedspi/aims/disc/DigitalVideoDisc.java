package hust.soict.hedspi.aims.disc;

import java.util.Locale;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    public DigitalVideoDisc(String title){  super();  this.title=title;}

    public DigitalVideoDisc(String title, String category, float cost ) {
        super();    this.title = title;
        this.category = category;   this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String director, float cost ) {
        super();    this.title = title;     this.category = category;
        this.director = director;   this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;     this.category = category;
        this.director = director;   this.length = length;
        this.cost = cost;
    }

    public void setTitle(String title) { this.title = title; }
    public void setCategory(String category) { this.category = category; }
    public void setDirector(String director) { this.director = director; }
    public void setLength(int length) { this.length = length; }
    public void setCost(float cost) { this.cost = cost; }

    public String getTitle() { return title; }
    public String getCategory() { return category; }
    public String getDirector() { return director; }
    public int getLength() { return length; }
    public float getCost() { return cost; }

    //Alt + insert -->  Hiển thị hộp thoại "Generator" --> getter and setter

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

}
