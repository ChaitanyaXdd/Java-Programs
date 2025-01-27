//Parameterized Constructor

class Player_Information
{
    int player_no;
    String player_name;

    public Player_Information()
    {
       this(7,"Abc");
//        player_no = 7;
//        player_name = "ABC";
        System.out.println("hi");
    }

    public Player_Information(int player_no,String player_name)
    {
       // this();
        this.player_no = player_no;
        this.player_name = player_name;
    }
    public Player_Information(String player_name,int player_no)
    {

    }
    public void display()
    {
        System.out.println("Player Number: " + player_no);
        System.out.println("Player Name: " + player_name);
    }
}
public class Constructor3 {
    public static void main(String[] args) {

        Player_Information p = new Player_Information(7,"ABC");
        p.display();

//        Player_Information p1 = new Player_Information();
//        p1.display();

    }
}
