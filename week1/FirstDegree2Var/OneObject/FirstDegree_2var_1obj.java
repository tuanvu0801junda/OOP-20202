package OOP_week1.FirstDegree2Var.OneObject;
public class FirstDegree_2var_1obj {
    private double a11,a12;
    private double a21,a22;
    private double b1,b2;

    public void setA11(double a11) { this.a11 = a11; }
    public void setA12(double a12) { this.a12 = a12; }
    public void setA21(double a21) { this.a21 = a21; }
    public void setA22(double a22) { this.a22 = a22; }
    public void setB1B2(double b1, double b2) { this.b1 = b1; this.b2 = b2;}

    public void calculate(){
        double D = a11*a22 - a21*a12;
        double D1 = b1*a22 - b2*a12;
        double D2 = a11*b2 - a21*b1;
        if(D != 0){
            System.out.println("x1 = "+D1/D+"; x2 = "+D2/D);
        }
        else {
            if(D1 == 0 && D2 == 0) System.out.println("Countless solutions!\n");
            else System.out.println("No solution!\n");
        }
    }
}

