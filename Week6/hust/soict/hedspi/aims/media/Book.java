package Week6.hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
    private List<String> author = new ArrayList<String>();
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

    public String printInfo(){
        String Bk = "Book: ";
        Bk += this.title+" - "+this.category+" - Author(s): ";
        for(int i=0;i<author.size();i++){
            Bk += author.get(i);
            if(i != author.size() - 1) {Bk +=" & ";}
        }
        Bk += ": "+this.cost+ " $\n";
        return Bk;
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
