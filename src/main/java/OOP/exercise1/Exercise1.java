package OOP.exercise1;

public class Exercise1 {
    public static void main(String[] args) {
        Point2D point2D0 = new Point2D(5.5f,10.5f);
        Point2D point2D1 = new Point2D();

        point2D1.setX(15.5f);
        point2D1.setY(20.5f);

        System.out.println(point2D0.getX());
        System.out.println(point2D1.getY());

        point2D1.setXY(30.5f,50.f);

        float[] xy1 = point2D1.getXY();
        for (float variable : xy1) {
            System.out.println(variable);
        }

        System.out.println(point2D0);

        Point3D point3D = new Point3D(1,2,0);
        System.out.println(point3D.getZ());
        point3D.setZ(3);
        System.out.println(point3D.getZ());

        float[] xyz = point3D.getXYZ();
        for (float variable : xyz) {
            System.out.println(variable);
        }

        point3D.setXYZ(4,5,6);
        System.out.println(point3D);
    }
}
