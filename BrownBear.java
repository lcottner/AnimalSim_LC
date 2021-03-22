/**
* The BrownBear program extends Animal and implements both Walkable and Swimmable.
*It represents a bear. 
*
* @author  Lacey Cottner 
* @version 1.0
* @since   2021-03-21
*/
public class BrownBear extends Animal implements Walkable, Swimmable {
	private String subSpecies;
	
	/**
	* Default constructor 
	* @param unused
	*/
	public BrownBear() {
		simID=0;
		location.update(0,0);
		full=false;
		rested=true;
		subSpecies="Alaskan";
	}
	
	/**
	 * Preferred Constructor
	* @param simID
	* @param Location
	* @param subSpecies
	* @exception InvalidSimIDException
	* @exception InvalidSubspeciesException
	*/
	public BrownBear(int simID, Location I, String subSpecies) {
		try {
			if (simID<0)
				throw new InvalidSimIDException("");
			if (subSpecies=="Alaskan"||subSpecies=="Asiatic"||subSpecies=="European"||
					subSpecies=="Grizzly"||subSpecies=="Kodiak"||subSpecies=="Siberian")
				this.subSpecies=subSpecies;
			else
				throw new InvalidSubspeciesException("");
			this.simID=simID;
			location.update(I.getxCoord(),I.getyCoord());
			full=false;
			rested=true;
		}	
			catch(InvalidSimIDException e) {
				System.out.println("Error: Parameters must been greater than 0");
			}	
			catch(InvalidSubspeciesException e) {
			System.out.println("Error: subSpecies must be Alaskan, Asiatic, European, Grizzly, "
					+ "Kodiak or Siberian");
			}	
	}
	
	/**
	   * This is the swim method, which uses an int to determine direction and move
	   * 2 units accordingly.
	   * @param int direction 1=north, 2=east, 3=south, 4=west
	   * @return nothing.
	   */
	public void swim(int a) {
		if (a==1)
			location.setyCoord(location.getyCoord()+2);
		if (a==2)
			location.setxCoord(location.getxCoord()+2);
		if (a==3)
			location.setyCoord(location.getyCoord()-2);
		if (a==4)
			location.setxCoord(location.getxCoord()-2);
	}
	
	/**
	   * This is the walk method, which uses an int to determine direction and move
	   * 3 units accordingly.
	   * @param int direction 1=north, 2=east, 3=south, 4=west
	   * @return nothing.
	   */
	public void walk(int a) {
		if (a==1)
			location.setyCoord(location.getyCoord()+3);
		if (a==2)
			location.setxCoord(location.getxCoord()+3);
		if (a==3)
			location.setyCoord(location.getyCoord()-3);
		if (a==4)
			location.setxCoord(location.getxCoord()-3);
	}

	/**
	 * @return the subSpecies
	 */
	public String getSubSpecies() {
		return subSpecies;
	}

	/**
	 * @param subSpecies the subSpecies to set
	 */
	public void setSubSpecies(String subSpecies) {
		try {
		if (subSpecies=="Alaskan"||subSpecies=="Asiatic"||subSpecies=="European"||
				subSpecies=="Grizzly"||subSpecies=="Kodiak"||subSpecies=="Siberian")
			this.subSpecies=subSpecies;
		
		else
			throw new InvalidSubspeciesException("");
		}
		catch(InvalidSubspeciesException e) {
			System.out.println("Error: subSpecies must be Alaskan, Asiatic, European, Grizzly, "
					+ "Kodiak or Siberian");
			}	
	}
	
	
	
	
}
