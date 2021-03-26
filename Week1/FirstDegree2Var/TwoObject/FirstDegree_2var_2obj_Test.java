package Week1.FirstDegree2Var.TwoObject;
public class FirstDegree_2var_2obj_Test {
    public static void calculate(FirstDegree_2var_2obj eq1, FirstDegree_2var_2obj eq2){
        /*bắt buộc phải static void mới cho dùng hàm ở void main ???*/
        /*không thể gọi hàm main trong class ra ???*/
        double D = eq1.a * eq2.b - eq1.b * eq2.a;
        double D1 = eq1.c * eq2.b - eq2.c * eq1.b;
        double D2 = eq1.a * eq2.c - eq1.c * eq2.a;
        if(D != 0){
            System.out.println("x1 = "+D1/D+"; x2 = "+D2/D);
        }
        else {
            if(D1 == 0 && D2 == 0) System.out.println("Countless solutions!\n");
            else System.out.println("No solution!\n");
        }
    }

    public static void main(String[] args) {
        FirstDegree_2var_2obj eq1 = new FirstDegree_2var_2obj();
        FirstDegree_2var_2obj eq2 = new FirstDegree_2var_2obj();
        eq1.setAB(4,3);
        eq1.setC(7);
        eq2.setAB(5,9);
        eq2.setC(14);
        FirstDegree_2var_2obj_Test.calculate(eq1,eq2);


    }
}
