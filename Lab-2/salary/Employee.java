
public class Employee {

    String name;
    int age;
    int phno;
    Double salary;
    String address;

    public void printSalary() {
        System.out.println("Salary: " + salary);
    }

    public void printInfo() {
        System.out.println("Name: " + name + "\nage: " + age + "\nphone number: " + phno + "\nSalary: " + salary
                + "\nAddress: " + address);
    }

    public static void main(String args[]) {

        System.out.println("::Dino Company Employee LIst ::\n");
        Officer officer1 = new Officer("Amal nath", 18, 852634464, 200003.1, "Mangootil House Kannur", "HR");
        officer1.printSalary();
        officer1.printSpec();
        Manager manager1 = new Manager("Dinoy Raj ", 19, 730618539, 100011.1, "Rennugeetham House Pokkunnu", "Design");
        manager1.printSalary();
        manager1.printdep();

    }
}

class Officer extends Employee {

    String spec;

    Officer(String name, int age, int phno, Double salary, String address) {

        this.name = name;
        this.age = age;
        this.phno = phno;
        this.salary = salary;
        this.address = address;

        this.printInfo();

    }

    Officer(String name, int age, int phno, Double salary, String address, String spec) {

        this.name = name;
        this.age = age;
        this.phno = phno;
        this.salary = salary;
        this.address = address;
        this.spec = spec;

        this.printInfo();
        this.printSpec();

    }

    public void printSpec() {
        System.out.println("Specialization: " + spec);
    }
}

class Manager extends Employee {

    String dep;

    Manager(String name, int age, int phno, Double salary, String address) {

        this.name = name;
        this.age = age;
        this.phno = phno;
        this.salary = salary;
        this.address = address;

        this.printInfo();

    }

    Manager(String name, int age, int phno, Double salary, String address, String dep) {

        this.name = name;
        this.age = age;
        this.phno = phno;
        this.salary = salary;
        this.address = address;
        this.dep = dep;

        this.printInfo();
        this.printdep();

    }

    public void printdep() {
        System.out.println("Specialization: " + dep);
    }
}
