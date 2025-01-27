class Player2
{
    static  int player_count = 0;
    private String name;

    Player2(String n)
    {
        name = n;
        player_count++;
    }

}
public class StaticVariable {
    public static void main(String[] args) {

        System.out.println("Before object creation: " + Player2.player_count);
        Player2 p = new Player2("Abc");
        System.out.println("After object creation: " + Player2.player_count);
        Player2 p1 = new Player2("PQR");
        System.out.println("Total number of objects created till now: " + Player2.player_count);
    }
}
