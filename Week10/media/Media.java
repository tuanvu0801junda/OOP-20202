package aims.media;

public abstract class Media implements Comparable<Media>{
    //abstract class to prevent user from creating an INSTANCE of Media.
    protected String title;
    protected String category;
    protected float cost;
    protected int id;

    public String getCategory() { return category; }
    public String getTitle() { return title; }
    public float getCost() { return cost; }
    public int getId() {return id;}


    public void setCategory(String category) { this.category = category; }
    public void setTitle(String title) { this.title = title; }
    public void setId(int id){this.id = id;}
    public void setCost(float cost) { this.cost = cost; }

    public Media(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public Media(){}
    public abstract String printInfo();
    //abstract method CANNOT HAVE A BODY

    public boolean equals(Object obj){
        if(obj instanceof Media) {
            Media new_mda = (Media)obj;
            return this.id == new_mda.id;
        }
        else return false;
        //passing object is not "Media" --> compile Error | return false at once
    }

    /*
    public int compareTo(Object obj){
        Media cmp = (Media) obj;
        return this.title.compareTo(cmp.title);
            // b.compareTo('c') --> -1 (c after b)
    }*/

    @Override
    public int compareTo(Media media) {
        return this.title.compareTo(media.title);
    }

    // necessary to "Comparable<Media>" instead of "Comparable" ?
}
