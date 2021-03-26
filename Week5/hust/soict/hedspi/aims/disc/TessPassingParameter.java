package hust.soict.hedspi.aims.disc;

//Same name, same number of parameter, same type of variable --> Can be distinguish BY DIFFERENT RETURN!!
//protected: chi cung package moi nhin thay
//none access: class child && cung package moi nhin thay

public class TessPassingParameter {
    public static int[] arr = {1,2};
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        swap(jungleDVD,cinderellaDVD);
        System.out.println("jungle dvd title: "+ jungleDVD.getTitle());
        System.out.println("cinderella dvd title: "+ cinderellaDVD.getTitle());

        NewSwap(jungleDVD,cinderellaDVD);
        System.out.println("jungle dvd title: "+ jungleDVD.getTitle());
        System.out.println("cinderella dvd title: "+ cinderellaDVD.getTitle());

        /*
        changeTitle(jungleDVD,cinderellaDVD.getTitle());
        System.out.println("jungle dvd title: "+ jungleDVD.getTitle());
        System.out.println("cinderella dvd title: "+ cinderellaDVD.getTitle());
        */
        changeArray(arr);

    }

    public static void swap(Object o1, Object o2){
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }

    public static void changeTitle(DigitalVideoDisc dvd, String title){
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle); //--> FORMAL ARGUMENT
        //command to change (reference) of dvd --> didn't work
    }

    //object's method --> REFERENCE
    public static void NewSwap(DigitalVideoDisc d1, DigitalVideoDisc d2){
        String OldTitle1 = d1.getTitle();
        String OldTitle2 = d2.getTitle();
        d1.setTitle(OldTitle2);
        d2.setTitle(OldTitle1);
    }

    //array --> REFERENCE
    public static void changeArray(int[] arra){
        arra[0] = arra[0] + 100;
        System.out.println("Value of arr[0] = "+arra[0]);
    }
    /*final --> K thể override (ghi đè), k thể viết hàm overloading (nạp chồng) (với method) */
}
