import java.util.ArrayList;

public class Generic2 {
    public static void main(String[] args) {
        int[] arr = new int[5];
//        ArrayList list = new ArrayList();
//        list.add("Hello");
//        list.add(123);
//        list.add(3.142);
//
//        Object o = list.get(0);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
//        arrayList.add(1); --> error
        arrayList.get(0);
    }
}
