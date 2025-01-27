// Linear Search in String
public class LinearSearch7 {
    static int searchString(String[] arr,String key)
    {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(key))
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String[] arr = {"Deepak","Rohit","Rahul","Deepesh","Chaitanya"};

        System.out.println(searchString(arr,"Chaitanya"));

    }
}
