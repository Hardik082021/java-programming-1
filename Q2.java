import java.util.Scanner;

class Rectangle{
    int height,width;

    public void display(){
        System.out.println("Width: " + width +" "+ "Height: " + height);
    }
}
class RectangleArea extends Rectangle{

    public void input() {
        Scanner sc = new Scanner(System.in);
        width = sc.nextInt();
        height = sc.nextInt();
    }
    public void area() {
        super.display();
        System.out.println( "Area: " + width*height);
    }
}

public class Q2{
    public static void main(String[] args) {
        RectangleArea rectangleArea = new RectangleArea();
        rectangleArea.input();
        rectangleArea.area();

    }
}