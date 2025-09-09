import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class Product {
    private int quantity;
    private double price;
    private String name;
    private ArrayList<Product>products=new ArrayList<>();

    public Product(){

    }
    public Product(String name,double price,int quantity){
        this.name=name;
        this.quantity=quantity;
        this.price=price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void display() {
            System.out.println("name of product is:" +getName());
            System.out.println("price of product is:" + getPrice());
            System.out.println("quantity of product is:" + getQuantity());
    }
    public void add_product(Product product) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equals(product.getName()) ){
                System.out.println("tablet:" + product.getName() + " is found already");
            } else {
                products.add(product);
                System.out.println("added sucessfully for product list");
            }
        }
    }
    public void remove_product(String name){
        for(int i=0;i< products.size();i++){
            if(products.get(i).getName()==name){
                products.remove(products.get(i));
                System.out.println("removed successfully");
            }else{
                System.out.println("not found");
            }
        }
    }

}
