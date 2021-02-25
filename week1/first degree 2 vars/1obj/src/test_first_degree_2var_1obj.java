public class test_first_degree_2var_1obj {
    public static void main(String[] args) {
        first_degree_2var_1obj eq2var = new first_degree_2var_1obj();
        eq2var.setA11(2);
        eq2var.setA12(5);
        eq2var.setA21(7);
        eq2var.setA22(8);
        eq2var.setB1B2(7,15);
        eq2var.calculate();
    }
}
