import java.util.ArrayList;

public class Tablet extends Product implements Discount{
    private String model;
    private static ArrayList<Tablet>tablets=new ArrayList<>();

    public String getModel() {
        return model;
    }

    public void setModel(String type) {
        this.model= type;
    }

    public Tablet(){

    }
    public Tablet(String name,double price,int quantity,String model){
        super(name,price,quantity);
        this.model=model;
    }
    @Override
    public void discount(String name) {
        for (int i=0;i<tablets.size();i++) {
            if (tablets.get(i).getName().equals(name)){
                double newPrice = tablets.get(i).getPrice() * 0.93;
                tablets.get(i).setPrice(newPrice);
                System.out.println("price become" + newPrice);
                return;
            }
        }
        System.out.println("not found");
    }
    public void display_details() {
            System.out.println("model is:" +model);
            System.out.println("////////////////////////");
    }
    public void add_tablet(Tablet tablet) {
        for (int i = 0; i < tablets.size(); i++) {
            if (tablets.get(i).getName().equals(tablet.getName())) {
                System.out.println("tablet:" + tablet.getName() + " is found already");
                return;
            }
        }
                tablets.add(tablet);
                System.out.println("added sucessfully");
            }
    public void remove_tablet(String name){
         for(int i=0;i<tablets.size();i++){
             if(tablets.get(i).getName().equals(name)) {
                 tablets.remove(tablets.get(i));
                 System.out.println("removed successfully");
                 return;
             }
         }
                 System.out.println("not found");
    }
    public void check_quantity(String name){
         for(int i=0;i<tablets.size();i++){
             if(name.equals(tablets.get(i).getName())){
                 if(tablets.get(i).getQuantity()<5){
                     System.out.println("quantity isn't enough");
                     System.out.println("quantity is:"+tablets.get(i).getQuantity());
                 }else{
                     System.out.println("quantity is enough");
                     System.out.println("quantity is:"+ tablets.get(i).getQuantity());
                 }
             }
         }
    }
    public  void display_tablet() {
        for (Tablet t: tablets) {
            int i=0;
            if (!tablets.isEmpty()) {
                System.out.println((i + 1) + ") ");
                i++;
               t.display_details();
            }
        }
    }
}
