import java.util.Scanner;

class data{
    String Name;
    int year;
    String Address;

    void print() {
        //System.out.print(Name +"           " + year + "                " + Address);
    	System.out.println(Name +"\t\t\t" + year + "\t\t\t" + Address);
        System.out.println();
    }
}
class Q6{
    public static void main(String[] args) {
        // first object
        data emp1 = new data();
        data emp2 = new data();
      data emp3 = new data();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the details of 1st employee: ");
        System.out.println("enter Name: ");
        emp1.Name = sc.nextLine();
        System.out.println(" Enter Address: ");
        emp1.Address = sc.nextLine();
        System.out.println("Enter Year of Joining: ");
        emp1.year = Integer.parseInt(sc.nextLine());

        System.out.println("Enter the details of 2nd employee: ");
        System.out.println("enter Name: ");
        emp2.Name = sc.nextLine();
        System.out.println("ente Address: ");
        emp2.Address = sc.nextLine();
        System.out.println("Enter Year of Joining: ");
        emp2.year = Integer.parseInt(sc.nextLine());


        System.out.println("Enter the details of 3nd employee: ");
        System.out.println("Enter Name: ");
        emp3.Name = sc.nextLine();
        System.out.println("Enter Address: ");
        emp3.Address = sc.nextLine();
        System.out.println("Enter Year of Joining: ");
        emp3.year = Integer.parseInt(sc.nextLine());

        System.out.println("Name:    " + "\tYear of Joining:  " + "\t        Address          ");
        emp1.print();
        emp2.print();
        emp3.print();
    }

}