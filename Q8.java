import java.util.*;
class Area{
	double x;
	double y;
	double z;
	Area(double x,double y,double z)
	{
		this.x=x;
		this.y=y;
		this.z=z;
	}
	double CalArea()
	{
		double A = (x+y+z)/2;
        double area = Math.sqrt((A*(A-x)*(A-y)*(A-z)));
        return area;
	}
}
public class Q8 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double x=sc.nextDouble();
		double y=sc.nextDouble();
		double z=sc.nextDouble();
		Area a=new Area(x,y,z);
		System.out.println(a.CalArea());
	}
}
