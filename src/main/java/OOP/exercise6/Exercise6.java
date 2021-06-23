package OOP.exercise6;

public class Exercise6 {
    public static void main(String[] args) {
        Movable movablePoint = new MovablePoint();
        ((MovablePoint) movablePoint).setX(10);
        ((MovablePoint) movablePoint).setY(10);
        ((MovablePoint) movablePoint).setXSpeed(2);
        ((MovablePoint) movablePoint).setYSpeed(5);

        System.out.println(movablePoint);
        movablePoint.moveRight();
        movablePoint.moveUp();
        System.out.println(movablePoint);

        Movable movableCircle = new MovableCircle(5, 20, 30, 4, 4);
        System.out.println(((MovableCircle) movableCircle).getRadius());;

        System.out.println(movableCircle);
        movableCircle.moveRight();
        movableCircle.moveUp();
        System.out.println(movableCircle);
    }
}
