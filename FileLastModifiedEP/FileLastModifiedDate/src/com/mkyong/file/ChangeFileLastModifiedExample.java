package com.mkyong.file;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
 
public class ChangeFileLastModifiedExample{
	// http://www.mkyong.com/java/how-to-change-the-file-last-modified-date-in-java/
    public static void main(String[] args){	 
    	try{
 
    		File file = new File("logfile.log");
 
    		//print the original last modified date
    		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
    		System.out.println("Original Last Modified Date : " 
    				+ sdf.format(file.lastModified()));
 
    		//set this date 
    		String newLastModified = "01/31/1998";
 
    		//need convert the above date to milliseconds in long value 
    		Date newDate = sdf.parse(newLastModified);
    		file.setLastModified(newDate.getTime());
 
    		//print the latest last modified date
    		System.out.println("Lastest Last Modified Date : " + sdf.format(file.lastModified()));
 
    	}catch(ParseException e){
    		e.printStackTrace();
    	}
 
    }
}
