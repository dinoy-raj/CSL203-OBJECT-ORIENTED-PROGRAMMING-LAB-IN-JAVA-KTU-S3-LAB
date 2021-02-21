package Studpack;

interface Sports {
    int grade = 100;

    void display_grade();

}

class Student {

    String name;
    int rollno;
    Double mark1, mark2, mark3;

    Student() {

        name = "Not Assigned";
        rollno = 0;
        mark1 = mark2 = mark3 = 0.0;

    }

    Student(String name, int rollno, Double mark1, Double mark2, Double mark3) {

        this.name = name;
        this.rollno = rollno;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;

    }

}

class Result extends Student implements Sports {

    Double total;

    public void display_grade() {

        System.out.println("Grade: " + grade);

    }

    public void display() {
        System.out.println("Roll No: " + rollno + "\nName: " + name);
        display_grade();
        System.out.println("Total: " + total);
    }

    Result() {

        super();
        total = 0.0;
    }

    Result(String name, int rollno, Double mark1, Double mark2, Double mark3) {
        super(name, rollno, mark1, mark2, mark3);
        total = mark1 + mark2 + mark3 + grade;
    }

}

public class Hybrid {

    public static void main(String args[]) {

        Result stud1 = new Result("Dinoy", 21, 30.0, 30.0, 30.0);
        Result stud2 = new Result("Dhanya", 22, 40.0, 45.0, 30.0);
        Result stud3 = new Result("Don", 23, 50.0, 50.0, 50.0);
        Result stud4 = new Result("Divya", 24, 34.0, 23.0, 3.0);
        Result stud5 = new Result("Diya", 25, 32.0, 50.0, 50.0);

        stud1.display();
        stud2.display();
        stud3.display();
        stud4.display();
        stud5.display();

    }

}
