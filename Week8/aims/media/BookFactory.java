package Week8.aims.media;

import java.util.ArrayList;
import java.util.Scanner;

public class BookFactory implements AbstractItemFactory {
    @Override
    public Media createMediaItemFromConsole() {
        String spc = "";
        Scanner scnr = new Scanner(System.in);
        Book bk = new Book();

        System.out.print("Book Title: ");
        bk.setTitle(scnr.nextLine());
        System.out.print("Book category: ");
        bk.setCategory(scnr.nextLine());
        System.out.print("Item cost: ");
        bk.setCost(scnr.nextFloat());
        spc = scnr.nextLine();
        String aut = "";
        ArrayList<String> MyAuthor = new ArrayList<String>();
        while (!aut.equals("stop!")) {
            System.out.print("With book item, author: ");
            aut = scnr.nextLine();
            if (!aut.equals("stop!")) {MyAuthor.add(aut);}
        }
        return bk;
    }
}
