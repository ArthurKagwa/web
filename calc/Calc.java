package calc;
import java.util.*;
public class Calc {
    public static Scanner scanner=new Scanner(System.in);
    double x1,x2,x0;
    double f1(double a)
    {

        double fx =(a*a*a)-(5*a)+1;
        return fx;
    }
   
    
    double x2()
    {

        double x22=x0-(f1(x0)*(x1-x0))/(f1(x1)-f1(x0));
        
        return x22;
    }
public static void main(String args[])
{
    Calc calc=new Calc();
    System.out.println("Enter x0:");
     calc.x0=scanner.nextDouble();
    System.out.println("Enter x1:");
    calc.x1=scanner.nextDouble();
    System.out.println("x2="+calc.x2());
    System.out.println();
    System.out.println(calc.f1(calc.x2()));

}
    
}