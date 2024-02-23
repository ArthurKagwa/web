
import java.util.*;
public class Calc {
    public static Scanner scanner=new Scanner(System.in);
   
    double f1(double a)
    {

        double fx =(a*a*a)-(5*a)+1;
        return fx;
    }
    double x2(double x1,double x0)
    {
        double xx=0;
        for (int i=0;i<10;i++){
            xx=x0-(f1(x0)*(x1-x0))/(f1(x1)-f1(x0));
            x0=x1;
            x1=xx;

            System.out.println("Iteration number "+(i+1)+"  X"+i+" = "+xx);

        }
        return xx;
     }
public static void main(String args[])
{
    double x1,x0;
    Calc calc=new Calc();
    System.out.println("Enter x0:");
     x0=scanner.nextDouble();
    System.out.println("Enter x1:");
    x1=scanner.nextDouble();
    System.out.println("x2="+calc.x2(x1,x0));

}
    
}