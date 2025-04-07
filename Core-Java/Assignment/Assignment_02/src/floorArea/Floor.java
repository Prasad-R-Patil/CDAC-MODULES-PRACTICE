package floorArea;

public class Floor {
	
	private float len;
	private float wei;
	private float fArea;
	
	
	public Floor(float l, float w)
	{
		len=l;
		wei=w;
	}
	
	public float fArea()
	{
		fArea=len*wei;
		
		return fArea;
	}
	
	public void TotalTiles(Tile tl) {
		System.out.println("Total Tiles is :->"+String.format( "%.2f",(fArea()/tl.tArea())));
		
	}
	
	

}
