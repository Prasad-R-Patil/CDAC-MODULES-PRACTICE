package house;

public class TwoBHK extends OneBHK{
	
	private double room2Area;
	
	public TwoBHK() {
        super();
        this.room2Area = 0;
    }
	
	public TwoBHK(double roomArea, double hallArea, double price, double room2Area) {
        super(roomArea, hallArea, price);
        this.room2Area = room2Area;
    }



	@Override
	public void Show() {
		
		super.Show();
        System.out.println("Second Room Area: " + room2Area + " sq.ft");
	}
	
	 public double getPrice() {
	        return price;
	    }
	

}
