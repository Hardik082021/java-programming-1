import java.util.Scanner;
class Complex{
    double real,im;
    void add(double a, double c, double b,double d)
    {   real = (a+b);
        im= (c+d);
        System.out.println("Addition is: "+real + " +  ("+ im +"i )");
    }
    void sub(double a, double c, double b,double d)
    {   real = (a-b);
    im= (c-d);
        System.out.println("Subtraction is: "+real + " +  ("+ im +"i )");
    }
    void mul(double a, double c, double b,double d)
    {   real = (a*b-(c*d));
    im= (a*d+(b*c));
        System.out.println("Multiplication is: "+real + " +  ("+ im+"i )");
    }
}
class Q5
{    public static void main(String[] args) {
	// write your code here
        Complex C = new Complex();
        Scanner sc = new Scanner(System.in);
        double a,b,c,d;

        System.out.println("Enter the real and complex for first number: ");
        a=sc.nextDouble();
        c=sc.nextDouble();
        System.out.println("Enter the real and complex for second number: ");
        b=sc.nextDouble();
        d=sc.nextDouble();

        C.add(a,c,b,d);
        C.sub(a,c,b,d);
        C.mul(a,c,b,d);
    }
}