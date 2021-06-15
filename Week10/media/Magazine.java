package aims.media;

public class Magazine extends Media{
    private String modelName;
    private String publisher;

    public Magazine(){}

    public Magazine(String title, String category, float cost, String modelName, String publisher) {
        super(title, category, cost);
        this.modelName = modelName;
        this.publisher = publisher;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String printInfo(){
        String magazine = "Magazine: ";

        magazine += this.title+" - "+this.category+" - "+this.modelName+
                " - "+this.publisher+ " - " +this.cost+" $\n";
        return magazine;
    }

}
