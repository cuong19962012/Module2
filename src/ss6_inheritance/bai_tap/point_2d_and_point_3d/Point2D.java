package ss6_inheritance.bai_tap.point_2d_and_point_3d;

import java.lang.reflect.Array;

public class Point2D {
    private float x;
    private float y;

    public Point2D() {

    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] arr = {x, y};
        return arr;
    }

    @Override
    public String toString() {
        return " (X: " + x + ",Y: " + y + ")";
    }
}
