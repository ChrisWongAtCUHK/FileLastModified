package file.attribute;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
 
/**
 * <p>
 *  ChangeFileLastModifiedExample
 * </p>
 * 
 */
public class ChangeFileLastModified {

	private final static String SIMPLEDATEFORMAT_STRING = "MM/dd/yyyy HH:mm:ss";
    /**
     * 
     * @param filename the file whose last modified to be changed
     * @param newLastModified the last modified date after change
     */
    public static void change(String filename, String newLastModified){
    	try{
    		 
    		File file = new File(filename);
 
    		if(!file.exists()) {
    			System.out.println(filename + " does not exist.");
    			return;
    		}
    		
    		//print the original last modified date
    		SimpleDateFormat sdf = new SimpleDateFormat(SIMPLEDATEFORMAT_STRING);

 
    		// need convert the input date to milliseconds in long value 
    		Date newDate = sdf.parse(newLastModified);

    		file.setLastModified(newDate.getTime());
 
    	} catch(ParseException e){
    		System.out.println("The date format should be: " + SIMPLEDATEFORMAT_STRING);
    	}
    }
}