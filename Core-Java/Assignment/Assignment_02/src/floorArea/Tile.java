package floorArea;

public class Tile {
	
	private float lw;
	private float tArea;
	
	public Tile(float lw)
	{
		this.lw=lw;
	}
	
	public  float tArea()
	{
		tArea=lw*lw;
		
		return tArea;
	}
	
	
}
