/**
* The InvalidSimIDException program represents a SimID error when the SimID
* is negative
*
* @author  Lacey Cottner 
* @version 1.0
* @since   2021-03-21
*/
public class InvalidSimIDException extends RuntimeException{
	InvalidSimIDException(String message){
	super(message);
	}
}
