package house;

public class OneBHK {
	
	    protected double roomArea;
	    protected double hallArea;
	    protected double price;
	
	 public OneBHK() {
	        this.roomArea = 0;
	        this.hallArea = 0;
	        this.price = 0;
	    }

	   
	    public OneBHK(double roomArea, double hallArea, double price) {
	        this.roomArea = roomArea;
	        this.hallArea = hallArea;
	        this.price = price;
	    }



	public void Show()
	{
		    System.out.println("Room Area: " + roomArea + " sq.ft");
	        System.out.println("Hall Area: " + hallArea + " sq.ft");
	        System.out.println("Price: Rs. " + price);
	}

}

