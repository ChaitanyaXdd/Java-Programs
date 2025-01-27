class Item
{
    int item_no, item_price;
    String item_name;
    static int count = 0;
    Item()
    {
        this.item_name = " ";
        this.item_no = 0;
        this.item_price = 0;
    }
    Item(int item_no,String item_name,int item_price)
    {
        this.item_no = item_no;
        this.item_name = item_name;
        this.item_price = item_price;
    }
    public void display()
    {
        System.out.println("Item Number: " + item_no);
        System.out.println("Item Name: " + item_name);
        System.out.println("Item Price: "+ item_price);
        System.out.println("Object Count: " + count);
    }
}
public class Constructor6 {
    public static void main(String[] args) {
    Item i = new Item(1,"Pencil",10);
    i.display();

    Item i2 = new Item(2,"Pen",20);
    i2.display();
    }
}
