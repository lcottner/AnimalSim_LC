/**
* The AnimalApplication program instantiates Location, Goldfinch, and BrownBear objects. 
*It prints data showing that all methods in the other are working correctly.  
* @author  Lacey Cottner 
* @version 1.0
* @since   2021-03-21
*/
public class AnimalApplication {
	
	/**
	   * This is the main method which makes use of all the methods in other classes.
	   * @param args Unused
	   * @return Nothing
	   */
	public static void main (String[]args) {
		Location loc = new Location();
		Location loca =new Location(20,20);
		
		System.out.println("Wasnt too sure about int for direction, so 1 is north, 2 is east, "
				+ "3 is south, and 4 is west");
		System.out.println("North being +y, south being -y, east being +x, west being -x");
		
		System.out.println("-------------------");
		System.out.println("Location Tests");
		System.out.println("-------------------");
		
		loca.setxCoord(10);
		loca.setyCoord(10);
		System.out.println(loca.getxCoord());
		System.out.println(loca.getyCoord());
		loca.update(30, 30);
		int[] a=loca.getCoordinates();
		for (int i=0; i<a.length; i++)
			System.out.print(a[i]+" ");
		System.out.println();
		loca.update(1, -73);
		
		System.out.println("-------------------");
		System.out.println("Goldfinch Tests");
		System.out.println("-------------------");
		Animal gol=new Goldfinch();
		Goldfinch gold=new Goldfinch(2,loca,10.0);
	
		gold.setWingSpan(8.0);
		System.out.println(gold.getWingSpan());
		
		System.out.println("2 passed into walk(), so it will move east by 1 unit");
		gold.walk(2);
		int[] z=gold.getLocation();
		for (int i=0; i<a.length; i++)
			System.out.print(z[i]+" ");
		System.out.println();
		
		Location here=new Location(64,64);
		gold.fly(here);
		z=gold.getLocation();
		for (int i=0; i<a.length; i++)
			System.out.print(z[i]+" ");
		System.out.println();
		
		gold.setSimID(-1);
		gold.setWingSpan(4.0);
		
		System.out.println("-------------------");
		System.out.println("Animal Tests");
		System.out.println("Using the Goldfinch Object gold since Animal is abstract");
		System.out.println("-------------------");
		//Abstract ab=new Abstract(); does not work
		gold.setSimID(5);
		gold.setRested(false);
		gold.setFull(true);
		gold.setLocation(100,100);
		System.out.println(gold.getSimID());
		System.out.println(gold.isRested());
		System.out.println(gold.isFull());
		int[] b=gold.getLocation();
		for (int i=0; i<a.length; i++)
			System.out.print(b[i]+" ");
		System.out.println();
		System.out.println("Eat: "+ gold.eat());
		System.out.println("Sleep: "+gold.sleep());
		
		gold.setSimID(-1);
		
		System.out.println("-------------------");
		System.out.println("BrownBear Tests");
		System.out.println("-------------------");
		
		Animal bro=new BrownBear();
		BrownBear brow=new BrownBear(6,loca,"Asiatic");
		
		brow.setSubSpecies("Kodiak");
		System.out.println(brow.getSubSpecies());
		
		System.out.println("3 passed into walk(), so it will move south by 3 units");
		brow.walk(3);
		int[] c=brow.getLocation();
		for (int i=0; i<a.length; i++)
			System.out.print(c[i]+" ");
		System.out.println();
		
		System.out.println("4 passed into swim(), so it will move west by 2 units");
		brow.swim(4);
		int[] d=brow.getLocation();
		for (int i=0; i<a.length; i++)
			System.out.print(d[i]+" ");
		System.out.println();
		
		brow.setSimID(-1);
		brow.setSubSpecies("Panda");
	
	}
}

