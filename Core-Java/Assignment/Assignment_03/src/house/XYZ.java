package house;



public class XYZ {
	
	
	public static void main(String[] args) {
		
		 TwoBHK flat1 = new TwoBHK(200, 300, 5000000.23, 250);
	        TwoBHK flat2 = new TwoBHK(220, 320, 5500000.28, 270);
	        TwoBHK flat3 = new TwoBHK(250, 350, 6000000.15, 300);

	        // Displaying the flats information
	        System.out.println("Flat 1 Information:");
	        flat1.Show();
	        System.out.println();

	        System.out.println("Flat 2 Information:");
	        flat2.Show();
	        System.out.println();

	        System.out.println("Flat 3 Information:");
	        flat3.Show();
	        System.out.println();

	        // Calculating total price
	        double totalAmount =flat1.getPrice() + flat2.getPrice() + flat3.getPrice();
	        System.out.println("Total Amount of All Flats: Rs. " +String.format("%.2f", totalAmount));
		
		
	}

}
