// String performance
public class Strings5 {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            // System.out.println(ch);
            series = series + ch;
        }
        System.out.println(series);
    }
}
