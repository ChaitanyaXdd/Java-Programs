// Default Constructor

class Player_Info
{
    int player_number ;
    String player_name ;

    Player_Info()
    {
        player_number = 7;
        player_name = "ABC";
    }

    public void display()
    {
        System.out.println("Player Number: " + player_number);
        System.out.println("Player Name: " + player_name);
    }
}

 public class Constructor2 {
    public static void main(String[] args) {

        Player_Info p = new Player_Info();
        p.display();

    }
}
