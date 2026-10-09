package oops_concept;

class Employee{
    private int id;
    private String name;
    private double salary;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
       if(salary >= 0){
           this.salary = salary;
       }else{
           System.out.println("INVALID SALARY INPUT.");
       }
    }

    Employee(int id, String name, double salary){
        this.name = name;
        this.id = id;
        if(salary >=0.0){
               this.salary =salary;
        }else{
            this.salary = 0.0;
        }

    }

    void display(){
        System.out.println("Employee Name :" + " "+ name );
        System.out.println("Employee Id :" + " "+ id);
        System.out.println("Employee Salary :"+ " " + salary);
    }

    void giveRaise(double percent){
        double raiseSalary = salary*percent/100;
        double newSalary = salary+ raiseSalary;
        System.out.println("The raise in your salary is :"+" "+ newSalary);
    }



}
public class employeeManagement {
    public static void main(String[] args) {
               Employee e1 = new Employee(101,"Alice",50000.0);
               e1.display();
               e1.giveRaise(8);
    }
}