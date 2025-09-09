import java.awt.*;
import java.awt.image.SampleModel;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;
        do {
            System.out.println("1)add an element");
            System.out.println("2)show low stock");
            System.out.println("3)apply discount");
            System.out.println("4)remove an element");
            System.out.println("5)display product");
            System.out.println("6)exit");
            option=input.nextInt();
            if(option==1) {
                System.out.println("1)add a samrtphone");
                System.out.println("2)add a laptop");
                System.out.println("3)add a tablet");
                int choice = input.nextInt();

                if (choice == 1) {
                    Product smart ;
                    System.out.println("enter name");
                    String name = input.next();
                    System.out.println("enter price;");
                    double price = input.nextDouble();
                    System.out.println("enter quantity");
                    int quantity = input.nextInt();
                    System.out.println("enter model");
                    String model = input.next();
                    smart=new SmartPhone(name,price,quantity,model);
                     smart.add_product(smart);
                     SmartPhone smart2=(SmartPhone) smart;
                     smart2.add_smart(smart2);


                } else if (choice == 2) {
                    Product smart ;
                    System.out.println("enter name");
                    String name = input.next();
                    System.out.println("enter price;");
                    double price = input.nextDouble();
                    System.out.println("enter quantity");
                    int quantity = input.nextInt();
                    System.out.println("enter model");
                    String model = input.next();
                    smart=new Laptop(name,price,quantity,model);
                    smart.add_product(smart);
                    Laptop smart2=(Laptop) smart;
                    smart2.add_labtop(smart2);
                } else if (choice == 3) {
                    Product smart ;
                    System.out.println("enter name");
                    String name = input.next();
                    System.out.println("enter price;");
                    double price = input.nextDouble();
                    System.out.println("enter quantity");
                    int quantity = input.nextInt();
                    System.out.println("enter model");
                    String model = input.next();
                    smart=new Tablet(name,price,quantity,model);
                    smart.add_product(smart);
                    Tablet smart2=(Tablet) smart;
                    smart2.add_tablet(smart2);
                } else {
                    System.out.println("number is wrong");
                }
                    /// //////////////////////////////////////////////////
                }else if(option==3){
                System.out.println("1)for a samrtphone");
                System.out.println("2)for a laptop");
                System.out.println("3)for a tablet");
                int choic = input.nextInt();
                if(choic==1){
                    SmartPhone s=new SmartPhone();
                    System.out.println("enter name of product");
                    String name=input.next();
                    s.discount(name);
                }else if(choic==2){
                    Laptop l=new Laptop();
                    System.out.println("enter name of product");
                    String name=input.next();
                    l.discount(name);
                }else if(choic==3){
                   Tablet t=new Tablet();
                    System.out.println("enter name of product");
                    String name=input.next();
                    t.discount(name);
                }else{
                    System.out.println("number is wrong");
                }
            /// ////////////////////////////////////////////////////////
            }else if(option== 2) {
                System.out.println("1)for a samrtphone");
                System.out.println("2)for a laptop");
                System.out.println("3)for a tablet");
                System.out.println("enter your choice");
                int choic = input.nextInt();
                if (choic == 1) {
                    SmartPhone smart = new SmartPhone();
                    System.out.println("enter name");
                    String name = input.next();
                    smart.check_quantity(name);
                } else if (choic == 2) {
                    Laptop lab = new Laptop();
                    System.out.println("enter name");
                    String name = input.next();
                    lab.check_quantity(name);
                } else if (choic == 3) {
                    Tablet tablet = new Tablet();
                    System.out.println("enter name");
                    String name = input.next();
                    tablet.check_quantity(name);
                } else {
                    System.out.println("number is false");
                }
                /// ////////////////////////////////////////////////////
            }else if(option==4) {
                System.out.println("1)remove a samrtphone");
                System.out.println("2)remove a laptop");
                System.out.println("3)remove a tablet");
                int choice2 = input.nextInt();
                if (choice2 == 1) {
                    SmartPhone smart = new SmartPhone();
                    System.out.println("enter name");
                    String name = input.next();
                    smart.remove_smartphone(name);
                } else if (choice2 == 2) {
                    Laptop lab = new Laptop();
                    System.out.println("enter name");
                    String name = input.next();
                    lab.remove_laptop(name);
                } else if (choice2 == 3) {
                    Tablet tablet = new Tablet();
                    System.out.println("enter name");
                    String name = input.next();
                    tablet.remove_tablet(name);
                } else {
                    System.out.println("number is false");
                }

                /// ///////////////////////////////////////////////
            }else if(option==5){
                    Tablet tablet4=new Tablet();
                    System.out.println("tablets:");
                    tablet4.display_tablet();
                    SmartPhone smart4=new SmartPhone();
                    System.out.println("smartphones:");
                    smart4.display_product();
                    System.out.println("laptops");
                    Laptop lap=new Laptop();
                    lap.display_product();
            }
        } while (option !=6);

    }
    }
