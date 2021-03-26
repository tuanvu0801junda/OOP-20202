package hust.soict.hedspi.garbage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GarbageCreator {
    public static void main(String[] args) {
        BufferedReader br = null;
        //declare a
        try{
            String s = "";
            br = new BufferedReader(new FileReader("src/garbageString.txt"));
            //System.out.println("Result of text file: \n");
            String contenLine = br.readLine();

            while(contenLine != null){
                s += contenLine;
                contenLine = br.readLine();
            }
        }catch (IOException e){
            e.printStackTrace(); //trace (n) dấu vết
        }finally {
            try{
                br.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    /*
      try {
            int data = 50 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("rest of the code...");
    }
    */
    //đoạn code xảy ra ngoại lệ là try sẽ không được thực thi, nhảy xuống in ra lỗi.

    //Nếu không lỗi, (ở đây là file trả về thành công),
    // --> phần code trong "try" được thực thi, bỏ qua "catch"

}
