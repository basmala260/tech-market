import java.util.ArrayList;

public class Laptop extends Product implements Discount{
    private String model;
    private static ArrayList<Laptop> laptops=new ArrayList<>();

    public String getModel() {
        return model;
    }

    public void setModel(String type) {
        this.model= type;
    }

    public Laptop(){

    }
    public Laptop(String name,double price,int quantity,String model){
        super(name,price,quantity);
        this.model=model;
    }
    @Override
    public void discount(String name) {
        for (int i=0;i<laptops.size();i++) {
            if (laptops.get(i).getName().equals(name)) {
                this.setPrice(getPrice() * (10.0 / 100));
                System.out.println("the price become:"+laptops.get(i).getPrice());
            }
        }
    }
    public void display_details() {
            super.display();
            System.out.println("model is:" + model);
            System.out.println("////////////////////////");
    }
    public void add_labtop(Laptop lab) {
        for (int i = 0; i <laptops.size(); i++) {
            if (laptops.get(i).getName().equals(lab.getName())) {
                System.out.println("tablet:" + lab.getName() + " is found already");
                return;
            }
        }
                laptops.add(lab);
                System.out.println("added sucessfully");
    }
    public void remove_laptop(String name){
        for(int i=0;i<laptops.size();i++){
            if(laptops.get(i).getName().equals(name)){
                laptops.remove(laptops.get(i));
                System.out.println("removed successfully");
            }else{
                System.out.println("not found");
            }
        }
    }
    public void check_quantity(String name){
        for(int i=0;i<laptops.size();i++){
            if(name.equals(laptops.get(i).getName())){
                if(laptops.get(i).getQuantity()<5){
                    System.out.println("quantity isn't enough");
                    System.out.println("quantity is:"+laptops.get(i).getQuantity());
                }else{
                    System.out.println("quantity is enough");
                    System.out.println("quantity is:"+ laptops.get(i).getQuantity());
                }
            }
        }
    }
    public  void display_product() {
        for (Laptop l: laptops) {
            int i=0;
            if (!laptops.isEmpty()) {
                System.out.println((i + 1) + ")");
                i++;
                l.display_details();
            }
        }
    }
}


