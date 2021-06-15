package aims.media.disk;

import aims.media.Media;

public class Disc extends Media {
    protected int length;
    protected String director;

    public Disc(String title, String category, float cost, int length, String director) {
        super(title, category, cost);
        this.length = length;
        this.director = director;
    }

    public Disc(){}

    public Disc(String title, String category, float cost){
        super(title,category,cost);
    }

    public String getDirector() { return director; }
    public int getLength() { return length; }
    public void setDirector(String director) { this.director = director; }
    public void setLength(int length) { this.length = length; }

    public String printInfo(){
        return this.title +" "+ this.category +" "+ this.director +" "+ this.length + " "+this.cost;
    }
}
