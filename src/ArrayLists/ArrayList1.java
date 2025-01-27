import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10); // can only pass wrapper classes and no primitives
        list.add(67);
        list.add(78);
        list.add(654);
        list.add(90);
        list.add(89);
        System.out.println(list);
        System.out.println(list.contains(90));
        list.set(0,99);
        System.out.println(list);
        list.remove(3);


    }
}
