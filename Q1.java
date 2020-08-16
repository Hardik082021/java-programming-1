import java.util.*;
import java.lang.*;
interface Add
{
	public int add(int a,int b);

}
interface Diff
{
	public int difference(int a,int b);
}
interface MUL
{
	public int product(int a,int b);
}
interface DIV
{
	public int safeDivision(int a,int b);
}


public class Q1
{
public static void main(String arg[])
{
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	int y=sc.nextInt();
Add val1 =(a,b)->(a+b);
System.out.println("add: "+val1.add(x,y));

Diff val2 =(a,b)->(a-b);
System.out.println("diff: "+val2.difference(x,y));

MUL val3 =(a,b)->(a*b);
System.out.println("mul: "+val3.product(x,y));
try {
DIV val4 =(a,b)->(a/b);
System.out.println("Div: "+val4.safeDivision(x,y));
}catch(ArithmeticException e)
{
	System.out.println("cannnot divide by 0");
}
}
}