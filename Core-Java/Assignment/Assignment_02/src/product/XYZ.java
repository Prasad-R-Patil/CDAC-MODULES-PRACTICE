package product;

import java.util.Scanner;

public class XYZ {

    public static int findHighestPricePid(Product[] products) {
        

        int highestPricePid = products[0].getPid();
        double highestPrice = products[0].getPrice();

        for (int i = 1; i < products.length; i++) {
            if (products[i].getPrice() > highestPrice) {
                highestPrice = products[i].getPrice();
                highestPricePid = products[i].getPid();
            }
        }
        return highestPricePid;
    }

    public static double calculateTotalAmount(Product[] pr) {
       

        double totalAmount = 0.0;
        for (Product i : pr) {
            totalAmount += i.getPrice() * i.getQuantity();
        }
        return totalAmount;
    }

    
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter No of Products => ");
        int p = s.nextInt();

        Product[] pr = new Product[p];

        for (int i = 0; i < p; i++) {
            System.out.println("Enter details for product " + (i + 1) + ":");
            System.out.print("PID: ");
            int pid = s.nextInt();
            System.out.print("Price: ");
            double price = s.nextDouble();
            System.out.print("Quantity: ");
            int quantity = s.nextInt();
            pr[i] = new Product(pid, price, quantity);
        }

        int highestPricePid = findHighestPricePid(pr);
        System.out.println("PID of product with highest price: " + highestPricePid);

        double totalAmount = calculateTotalAmount(pr);
        System.out.println("Total amount spent on all products: " + totalAmount);

        s.close();
    }
}
