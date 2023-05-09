package ss4_class_and_object.bai_tap.fan;

public class Fan {
    private final int slow = 1;
    private final int medium = 2;
    private final int fast = 3;
    private int speed = slow;
    private boolean on = false;
    private double radius = 5;
    private String color = "Blue";

    public Fan() {

    }

    public int setSpeed(int speed) {
        return this.speed = speed;
    }

    public boolean setOn(boolean on) {
        return this.on = on;
    }

    public double setRadius(double radius) {
        return this.radius = radius;
    }

    public String setColor(String color) {
        return this.color = color;
    }

    public int getSpeed() {
        return this.speed;
    }

    public boolean getOn() {
        return this.on;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public String toString() {
        if (getOn() == true) {
            return "Fan is On, Speed: " + getSpeed() + " , Color: " + getColor() + " , Radius " + getRadius();
        } else {
            return "Fan is Off, Color " + getColor() + " , Radius: " + getRadius();
        }
    }
}
