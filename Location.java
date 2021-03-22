/**
* The Location program represents where an object is in a 2d plane.
*
* @author  Lacey Cottner 
* @version 1.0
* @since   2021-03-21
*/
public class Location {
	private int xCoord;
	private int yCoord;
	
	/**
	 * Default constructor
	 * @param unused
	 */
	public Location() {
		xCoord=0;
		yCoord=0;
	}
	
	/**
	 * Preferred Constructor
	* @param x
	* @param y
	* @exception InvalidCoordinateException
	*/
	public Location(int x, int y) {
		try {
		if (x<0||y<0)
			throw new InvalidCoordinateException("");
		xCoord=x;
		yCoord=y;
		}
		catch (InvalidCoordinateException e) {
			System.out.println("Error: Coordinates must be greater than 0");
		}
	}
	
	/**
	 * This is the update method, which takes the passed parameters and 
	 * sets xCoord and yCoord to them
	 * @param x
	 * @param y
	 * @return nothing
	 */
	public void update(int x, int y) {
		try {
			if (x<0||y<0)
				throw new InvalidCoordinateException("");
			xCoord=x;
			yCoord=y;
			}
			catch (InvalidCoordinateException e) {
				System.out.println("Error: Coordinates must be greater than 0");
			}
	}
	
	/**
	 * This is the getCoordinates method, which returns xCoord and yCoord in an array
	 * @param unused
	 * @return int[]
	 */
	public int[] getCoordinates() {
		int[] a= {xCoord,yCoord};
		return a;
	}

	/**
	 * @return the xCoord
	 */
	public int getxCoord() {
		return xCoord;
	}

	/**
	 * @param xCoord the xCoord to set
	 * @exception InvalidCoordinateException
	 */
	public void setxCoord(int xCoord) {
		try {
			if (xCoord<0)
				throw new InvalidCoordinateException("");
			this.xCoord = xCoord;
		}
		catch (InvalidCoordinateException e) {
			System.out.println("Error: Coordinate must be greater than 0");
		}
	}

	/**
	 * @return the yCoord
	 */
	public int getyCoord() {
		return yCoord;
	}

	/**
	 * @param yCoord the yCoord to set
	 * @exception InvalidCoordinateException
	 */
	public void setyCoord(int yCoord) {
		try {
			if (yCoord<0)
				throw new InvalidCoordinateException("");
			this.yCoord = yCoord;
		}
		catch (InvalidCoordinateException e) {
			System.out.println("Error: Coordinate must be greater than 0");
		}
	}
	
	
}
