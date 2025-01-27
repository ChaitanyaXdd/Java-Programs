import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);
        System.out.println("Enter the elements:");
        //input
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }

        //output
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
