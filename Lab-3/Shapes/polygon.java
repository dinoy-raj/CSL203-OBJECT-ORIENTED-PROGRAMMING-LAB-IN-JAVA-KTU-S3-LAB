
abstract class Shape {

    abstract void numberOfSides();
}

class Triangle extends Shape {

    void numberOfSides() {

        System.out.println("Triangle : 3");
    }
}

class Rectangle extends Shape {

    void numberOfSides() {

        System.out.println("Rectangle : 4");
    }
}

class Hexagon extends Shape {

    void numberOfSides() {

        System.out.println("Hexagon : 6");
    }
}

public class polygon {

    public static void main(String args[]) {
        Triangle T1 = new Triangle();
        Rectangle R1 = new Rectangle();
        Hexagon H1 = new Hexagon();

        T1.numberOfSides();
        R1.numberOfSides();
        H1.numberOfSides();

    }

}
