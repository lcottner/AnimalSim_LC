/**
* The InvalidCoordinateException program represents an error when the wingspan
* is not between 5.0 to 11.0 cm
* 
* @author  Lacey Cottner 
* @version 1.0
* @since   2021-03-21
*/
public class InvalidWingspanException extends RuntimeException {
	InvalidWingspanException(String message){
		super(message);
		}
}