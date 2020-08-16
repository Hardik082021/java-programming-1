import java.util.*;
class circle{

	private double radius;
	private String color;
	double area;
	circle()
	{
		radius = 50.0;
        color = "black";
	}
	circle(double radius)
	{
		this.radius=radius;
	}
	
	public void getRadius()
	{
		System.out.println(radius);
	}
	public void getArea()
	{
		area=3.14*radius*radius;
		System.out.println(area);
	}
}

class  Q4{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		circle c1=new circle(r);
		c1.getRadius();
		c1.getArea();
	}
}