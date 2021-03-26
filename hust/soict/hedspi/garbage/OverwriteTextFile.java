package hust.soict.hedspi.garbage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class OverwriteTextFile {
    public static void main(String[] args) {

        //***** create a new file *****
        try{
            File myfile = new File("src/garbageString.txt");
            if(myfile.createNewFile()){
                System.out.println("file created: "+myfile.getName());
                //same as FOPEN return "NULL" or "pointer to file"
            }else{
                System.out.println("CreateFileAnnounce: \"file already exists.\"");
            }
        }catch (IOException e){
            System.out.println("An error occured.");
            e.printStackTrace();
        }
        //***** create a new file *****/

        try{
            FileWriter myWriter = new FileWriter("src/garbageString.txt");
            //myWriter.write("What the hell try and catch and finally are! ");
            for(int i=0;i<100000;i++){
                myWriter.write("making garbage\n");
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file");
        }catch (IOException e){
            System.out.println("Something went wrong! ");
            e.printStackTrace();
        }
    }
}
