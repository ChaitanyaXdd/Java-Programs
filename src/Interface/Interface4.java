interface Product1
{

}
 class Product implements Product1 {
    int id,cost,quantity;
    String name;
    static int count = 0;
    Product()
    {
        id = 1;
        name = "Book";
        cost = 100;
        quantity = 3;
        count++;
    }
    Product(int id,String name,int cost,int quantity)
    {
        this.id  = id;
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
        count++;
    }
    void display()
    {
        System.out.println("Id: " + id + "\nName: " + name + "\nCost: " + cost + "\nQuantity: "  + quantity);
    }
}

public class Interface4
{
    public static void main(String[] args) {
        Product p = new Product(1,"Pencil",10,3);
        System.out.println("Object count: " + Product.count);
        p.display();
    }
}
