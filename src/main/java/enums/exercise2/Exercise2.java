package enums.exercise2;

public class Exercise2 {
    public static void main(String[] args) {
        PackageSize packageSize = PackageSize.getPackageSize(10, 15);
        System.out.println(packageSize.getName());
        PackageSize packageSize1 = PackageSize.getPackageSize(-1, 4);
        System.out.println(packageSize1.getName());
    }
}
