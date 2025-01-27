public class LinearSearch2 {
    static boolean search(String str,char key)
    {
        if (str.length() == 0)
        {
            return false;
        }
        for (int i = 0; i < str.length(); i++)
        {
            if (key == str.charAt(i))
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        String nm = "Chaitanya";
       boolean ans = search(nm,'a');
       if (ans == true)
       {
           System.out.println("Character is present.");
       }
       else {
           System.out.println("Character is not present.");
       }
    }
}
