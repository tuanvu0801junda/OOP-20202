package hust.soict.hedspi.garbage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.StringBuffer;

public class NoGarbage {
    public static void main(String[] args) {
            BufferedReader br = null;
            //declare a
            try{
                StringBuffer s = new StringBuffer();
                br = new BufferedReader(new FileReader("src/garbageString.txt"));
                //System.out.println("Result of text file: \n");
                String contenLine = br.readLine();

                while(contenLine != null){
                    s.append(contenLine);
                    //Method "append" in class "StringBuffer", instead of operator "+" String
                    contenLine = br.readLine();
                }
            }catch (IOException e){
                e.printStackTrace();
            }finally {
                try{
                    br.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
    }
}
