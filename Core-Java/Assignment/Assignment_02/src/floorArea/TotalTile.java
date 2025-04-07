package floorArea;

import java.util.Scanner;

public class TotalTile {

	
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Length Tile => ");
		float l = s.nextFloat();
		
		Tile t = new Tile(l);
		
		System.out.println("Enter Length Floor => ");
		float len = s.nextFloat();
		
		System.out.println("Enter Weidth Floor => ");
		float wei = s.nextFloat();
		
		Floor fr = new Floor(len,wei);
		
		
		fr.TotalTiles(t);
		
		
		
	}

}
