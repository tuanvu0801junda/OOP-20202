package OOP_week1.FirstDegree1Var;

public class FirstDegree1Var {
    private double a;
    private double b;

    public void setA(double a) { this.a = a; }

    public void setB(double b) { this.b = b; }

    public void calculate(){
        if(a == 0) {
            if(b == 0){ System.out.println("Countless solution\n"); }
            else System.out.println("No solution\n");
        }
        else System.out.println("Unique solution: x = " +(-b/a));
    }
}
