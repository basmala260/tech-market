import java.util.ArrayList;

public class SmartPhone extends Product implements Discount {
    private String model;
    private static ArrayList<SmartPhone> smartphones=new ArrayList<>();

    public String getModel() {
        return model;
    }

    public void setModel(String type) {
        this.model= type;
    }

    public SmartPhone(){

    }
    public SmartPhone(String name,double price,int quantity,String model){
        super(name,price,quantity);
        this.model=model;
    }

    public void discount(String name) {
        for (int i=0;i<smartphones.size();i++) {
            if (smartphones.get(i).getName().equals(name)) {
                this.setPrice(getPrice() * (5.0 / 100));
                System.out.println("the price become:"+smartphones.get(i).getPrice());
            }
        }
    }
    public void display_details() {
            super.display();
            System.out.println("model is:" + model);
            System.out.println("////////////////////////");
    }


    public void remove_smartphone(String name){
        for(int i=0;i< smartphones.size();i++){
            if(smartphones.get(i).getName().equals(name)){
                smartphones.remove(smartphones.get(i));
                System.out.println("removed successfully");
            }else{
                System.out.println("not found");
            }
        }
    }
    public void check_quantity(String name){
        for(int i=0;i<smartphones.size();i++){
            if(name.equals(smartphones.get(i).getName())){
                if(smartphones.get(i).getQuantity()<5){
                    System.out.println("quantity isn't enough");
                    System.out.println("quantity is:"+smartphones.get(i).getQuantity());
                }else{
                    System.out.println("quantity is enough");
                    System.out.println("quantity is:"+ smartphones.get(i).getQuantity());
                }
            }
        }
    }
    public  void display_product() {
        for (SmartPhone s: smartphones) {
            int i=0;
            if (!smartphones.isEmpty()) {
                System.out.println((i + 1) + ")");
                i++;
                s.display_details();
            }
        }
    }
    public void add_smart(SmartPhone smart) {
        for (int i = 0; i < smartphones.size(); i++) {
            if (smartphones.get(i).getName().equals(smart.getName())) {
                System.out.println("tablet:" + smart.getName() + " is found already");
                return;
            }
        }
                smartphones.add(smart);
                System.out.println("added sucessfully");
            }

    }

