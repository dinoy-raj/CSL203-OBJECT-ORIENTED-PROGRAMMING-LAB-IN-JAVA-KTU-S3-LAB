
class Employee {

    String Classname;
    Double Salary = 1000.0;

    void calcSalary(Double Salary) {

        System.out.println("Salary Of The Employee Is: " + Salary);

    }

    void display(String Classname) {
        System.out.println("Name Of The Class Is: " + Classname);
    }
}

public class Engineer extends Employee {

    void calcSalary(Double Salary) {

        System.out.println("Salary Of The Employee Is: " + Salary);

    }

    void calcSalary() {

        super.calcSalary(Salary);
        ;

    }

    public static void main(String args[]) {

        Engineer eg = new Engineer();
        eg.display("Employee");
        eg.calcSalary();
        eg.calcSalary(2000.0);

    }

}
