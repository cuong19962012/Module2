package ss7_adstract_class_and_interface.bai_tap.colorable;

public class Main {
    public static void main(String[] args) {
        Shape[] arr = new Shape[3];
        arr[0] = new Circle(3.5);
        arr[1] = new Circle(5.0);
        arr[2] = new Square(4.0);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Area of Shape " + i + ": " + arr[i].getArea());
            if (arr[i] instanceof Square) {
                System.out.println("Element in "+i+" Array: "+((Square) arr[i]).howToColor());
            }
        }
    }
}
