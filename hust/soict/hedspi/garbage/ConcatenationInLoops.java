package hust.soict.hedspi.garbage;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class ConcatenationInLoops {
    public static void main(String[] args) {
        Random r = new Random(123); //--> seed: Khởi tạo làm màu ???
        long start = System.currentTimeMillis();
        String s = "";
        for(int i=0;i<6/*5536*/;i++){
            s += r.nextInt(2); //bound = boundary(n) giới hạn
            //--> trả về xâu "0" hoặc "1" (bé hơn hẳn 2)
            System.out.println(s);
        }
        System.out.println(System.currentTimeMillis() - start);

        System.out.println("Next value of StringBuffer: ");
        r = new Random(123); //seed 123 ??
        start = System.currentTimeMillis(); //--> calculate current time (in milli-second)
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<6/*5536*/;i++){
            sb.append(r.nextInt());
        }
        s = sb.toString();
        System.out.println(System.currentTimeMillis() - start);
    }
}
