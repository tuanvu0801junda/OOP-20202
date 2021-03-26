package hust.soict.hedspi.aims.disc;
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
        if(title.equals(getTitle())) return true;
        title = title.trim();
        String[] rootToken = title.split(" ");

        for(String w : rootToken){
            w = w.trim();
            System.out.println(w);
        }

        //for(String w1: rootToken){
          //  System.out.println(w1);
        //}
        //System.out.println(title);
        return true;

        //return false;
    }

}
