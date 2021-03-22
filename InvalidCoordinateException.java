/**
* The InvalidCoordinateException program represents a Coordinate error when 
*either coordinate is less than zero
*
* @author  Lacey Cottner 
* @version 1.0
* @since   2021-03-21
*/
public class InvalidCoordinateException extends RuntimeException {
	InvalidCoordinateException(String message){
		super(message);
		}
}
