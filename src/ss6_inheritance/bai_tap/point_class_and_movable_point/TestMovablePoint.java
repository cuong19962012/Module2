package ss6_inheritance.bai_tap.point_class_and_movable_point;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class TestMovablePoint {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);
        movablePoint = new MovablePoint(2.5f, 3.2f);
        System.out.println(movablePoint);
        movablePoint = new MovablePoint(2f, 3f, 3.2f, 2.3f);
        System.out.println(movablePoint);
        movablePoint.move();
        System.out.println(movablePoint);
    }
}
