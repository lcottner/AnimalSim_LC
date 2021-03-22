/**
* The InvalidSubspeciesException program represents an error when the subspecies does not match
* "Alaskan" "Asiatic" "European" "Grizzly "Kodiak" or "Siberian"
*
* @author  Lacey Cottner 
* @version 1.0
* @since   2021-03-21
*/
public class InvalidSubspeciesException extends RuntimeException {
	InvalidSubspeciesException(String message){
		super(message);
		}
}