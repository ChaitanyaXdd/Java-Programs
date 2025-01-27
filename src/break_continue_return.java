public class break_continue_return {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        for (int i = 0; i < arr.length; i++){
            if (i != 20){
                return;

            }
            else {
                System.out.println(arr[i]);
            }
        }
    }
}
