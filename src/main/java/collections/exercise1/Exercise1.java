package collections.exercise1;

public class Exercise1 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.remove(0);
        arrayList.remove(3);
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.get(2));
        arrayList.display();
    }
}
