package Week8.aims;

import Week8.aims.media.Book;
import java.util.ArrayList;

public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setTitle("Gone with the wind");
        book1.setCost(34.5f);
        book1.setCategory("Love & War");

        ArrayList<String> authors = new ArrayList<>();
        authors.add("Margaret Mitchell");
        authors.add("William Dunbar");
        book1.setAuthor(authors);

        book1.setContent("Gone with the Wind is a novel by American writer Margaret Mitchell, first published in 1936 " +
                "The story is set in Clayton County and Atlanta, both in Georgia, during the American Civil War and Reconstruction Era " +
                "It depicts the struggles of young Scarlett O'Hara, the spoiled daughter of a well-to-do plantation owner, " +
                "who must use every means at her disposal to claw her way out of poverty following Sherman's destructive");
        System.out.println(book1);
        //print book1 (EQUIVALENT TO) print(book1.toString())
    }
}
