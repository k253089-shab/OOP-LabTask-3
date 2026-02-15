import java.util.Scanner;

class Item{
    
    public String itemName;
    public int itemID;
    private double price;
    private int stock;

    public void setPrice(double p) {
        price = p;
    }
    public void setStock(int s) {
        stock = s;
    }

    public double getPrice() {
        return price;
    }
    public int getStock() {
        return stock;
    }
    
    public void updateStock(int quantity){
        stock-=quantity;
    }
}
    
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        Item item1 = new Item();
        Item item2 = new Item();
        
        item1.itemName = "Pen";
        item1.itemID = 1;
        item1.setPrice(20);
        item1.setStock(50);

        item2.itemName = "Notebook";
        item2.itemID = 2;
        item2.setPrice(100);
        item2.setStock(30);
        
        System.out.println("Available Items:");
        System.out.println("1. Pen");
        System.out.println("2. Notebook");
        
        System.out.print("Enter item number to purchase(1-2): ");
        int search = sc.nextInt();
        
        Item selectedItem = null;
        
        if(search==1)
            selectedItem = item1;
        else if(search==2)
            selectedItem = item2;
        else{
            System.out.println("Item not found!");
            return;
        }
        
        System.out.println("Price: Rs " + selectedItem.getPrice());
        System.out.print("Enter quantity: ");   
        int quantity = sc.nextInt();
        
        if(quantity>selectedItem.getStock()){
            System.out.println("Error: Not enough stock available!");}
        else{
            double totalBill = quantity * selectedItem.getPrice();
            selectedItem.updateStock(quantity);
            
            System.out.println("Purchase successful!");
            System.out.println("Total Bill: Rs " + totalBill);
            System.out.println("Remaining Stock: " + selectedItem.getStock());
        }
	}
}
