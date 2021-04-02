package Week6.hust.soict.hedspi.aims.media;

public abstract class Media {
    //abstract class to prevent user from creating an INSTANCE of Media.
    protected String title;
    protected String category;
    protected float cost;
    private int id;

    public String getCategory() { return category; }
    public String getTitle() { return title; }
    public float getCost() { return cost; }
    public int getId() {return id;}

    public void setCategory(String category) { this.category = category; }
    public void setTitle(String title) { this.title = title; }
    public void setCost(float cost) { this.cost = cost; }
    public void setId(int id){this.id = id;}

    public Media(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public abstract String printInfo();
    //abstract method CANNOT HAVE A BODY
}
