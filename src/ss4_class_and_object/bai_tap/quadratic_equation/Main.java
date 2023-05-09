package ss4_class_and_object.bai_tap.quadratic_equation;

public class Main {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation(1, 2, 3);
        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("The equation has two roots : " + quadraticEquation.getRoot1() + " and " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("The equation has one root: " + quadraticEquation.getRoot1());
        } else {
            System.out.println("The equation has no real roots");
        }
    }
}
