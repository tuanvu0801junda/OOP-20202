package aims.media;

import java.util.*;

public class Book extends Media {
    private List<String> author = new ArrayList<>();
    private String content;
    private List<String> contentTokens = new ArrayList<>();
    private Map<String,Integer> wordFrequency = new TreeMap<>();

    //--> benefit of Wrapper (int --> Integer, char --> Character)

    public Book(String title, String category, float cost) {
        super(title, category, cost);
        //constructor of class "Media"
    }

    public Book(String title, String category, float cost, List<String> author) {
        super(title, category, cost);
        //constructor of class "Media"
        this.author = author;
    }
    //alt + insert --> construct --> auto-generated "Book" - method constructor.

    public Book(){
        super();
    }

    public void setAuthor(List<String> author) {
        this.author = author;
    }

    public void setContent(String content) {
        this.content = content;
        processContent();
    }

    public void processContent(){
        String[] temp = content.split(" ");
        Collections.addAll(contentTokens, temp);
        Collections.sort(contentTokens); //a->z ordered
        // equivalent to for(t : temp) {contentTokens.add(t);}

        for (String t: temp){
            if (wordFrequency.containsKey(t)){
                int value_temp = wordFrequency.get(t);
                //return value of key "t"
                wordFrequency.put(t,value_temp+1);
            }
            else wordFrequency.put(t,1);
        }
        //put token in TreeMap with
    }

    @Override
    public String toString() {
        String tempBk = "Title: "+this.title+"\nCategory: "
                +this.category+ "\nAuthor(s): ";
        StringBuilder builderBook = new StringBuilder(tempBk);
        for(int i=0;i<author.size();i++){
            builderBook.append(author.get(i));
            if(i != author.size() - 1) {builderBook.append(" & ");}
        }
        tempBk = "\nContent Length: "+this.contentTokens.size();
        builderBook.append(tempBk);
        builderBook.append("\nContent Frequency: \n");

        //bk += "\nContent Frequency"+this.wordFrequency;
        for(Map.Entry<String, Integer> entry: wordFrequency.entrySet()) {
            tempBk = entry.getKey() + " - "+ entry.getValue() + "\n";
            builderBook.append(tempBk);
        }
        return builderBook.toString();
    }

    public String printInfo(){
        StringBuilder builderBook = new StringBuilder("Book: ");
        String tempBk = this.title+" - "+this.category+" - Author(s): ";
        builderBook.append(tempBk);

        for(int i=0;i<author.size();i++){
            builderBook.append(author.get(i));
            if(i != author.size() - 1) {builderBook.append(" & ");}
        }
        tempBk = ": "+this.cost+ " $\n";
        builderBook.append(tempBk);
        return builderBook.toString();
    }

    public String addAuthor(String authorName){
        //ensure authorName NOT IN List of author
        boolean belong = author.contains(authorName);
        if(belong) return "Author name EXISTED already.";
        else{
            author.add(authorName);
            //add --> method of class "ArrayList"
            return "Added "+authorName+" successfully!";
        }
    }

    public String removeAuthor(String authorName){
        //ensure authorName IN List of author
        boolean belong = author.contains(authorName);
        if(!belong) return "Author name DOESN'T EXIST in LIST of author";
        else{
            author.remove(authorName);
            //remove --> method of class "ArrayList"
            return "Removed "+authorName+" successfully!";
        }
    }

}
