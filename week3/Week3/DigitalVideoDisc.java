package Week3;
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
    /*
    public void setTitle(String title) { this.title = title; }
    public void setCategory(String category) { this.category = category; }
    public void setDirector(String director) { this.director = director; }
    public void setLength(int length) { this.length = length; }
    public void setCost(float cost) { this.cost = cost; }
     */

    public String getTitle() { return title; }
    public String getCategory() { return category; }
    public String getDirector() { return director; }
    public int getLength() { return length; }
    public float getCost() { return cost; }

    public int Equals(DigitalVideoDisc disc){
        if(disc.title.equals(this.title)){
            if(this.category.equals(disc.category)) {
                if (this.director.equals(disc.director)) {
                    if (this.length == disc.length && this.cost == disc.cost) { return 1; } } } }
        return 0;
    }

    //Alt + insert -->  Hiển thị hộp thoại "Generator" --> getter and setter

}
