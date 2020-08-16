import java.util.*;

class Employee{
    private int empId;
    private String empName;
    private String empDesignation;
    private int empSalary;
    private String empLocation;

    public Employee(int empId, String empName, String empDesignation, int empSalary, String empLocation) {
        this.empId = empId;
        this.empName = empName;
        this.empDesignation = empDesignation;
        this.empSalary = empSalary;
        this.empLocation = empLocation;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }

    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }

    public int getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }

    public String getEmpLocation() {
        return empLocation;
    }

    public void setEmpLocation(String empLocation) {
        this.empLocation = empLocation;
    }
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empDesignation='" + empDesignation + '\'' +
                ", empSalary=" + empSalary +
                ", empLocation='" + empLocation + '\'' +
                '}';
    }
}

public class Q3{
    public static void main(String[] args) {

        ArrayList<Employee> employee = new ArrayList<>();
        employee.add(new Employee(1,"Hardik","CEO",100000,"India"));
        employee.add(new Employee(2,"obert","VP Executive",575454,"America"));
        employee.add(new Employee(3,"Jeorge","Manager",484848,"UK"));
        employee.add(new Employee(4,"Himafefaiil","CTO",1515151,"Narnia"));
        employee.add(new Employee(5,"adnjfna","COO",88945,"Asgard"));
        employee.add(new Employee(6,"thor","Assistant Manager",4545454,"Hogwards"));
        employee.add(new Employee(7,"tony","Engineer",8785412,"Mars"));
        employee.add(new Employee(8,"spsiiderman","VPP",122554,"Jupyter"));
        employee.add(new Employee(9,"spafrrow","Project Manager",452145,"Mercury"));
        employee.add(new Employee(10,"Ronaldo","Peon",4566565,"Sun"));

        System.out.println("names of the employees: \n");
        employee.stream().forEach(e->System.out.println(e.getEmpName()));

        System.out.println("\nsalaries greater than 50,000: \n");
        employee.stream().filter(e->e.getEmpSalary()>50000).forEach(e->System.out.println("Name : " + e.getEmpName() + " , Salary : " + e.getEmpSalary()));

        System.out.println("\nlocations starting with letter \'M\' : \n");
        employee.stream().filter(e->e.getEmpLocation().startsWith("M")).forEach(e->System.out.println("Name : " + e.getEmpName() + " , Location : " + e.getEmpLocation()));

        System.out.println("\ndesignations ending with \'E\'");
        employee.stream().filter(e->e.getEmpDesignation().endsWith("e")).forEach(e-> System.out.println("Name : " + e.getEmpName() + " , Designation : " + e.getEmpDesignation()));

    }
}