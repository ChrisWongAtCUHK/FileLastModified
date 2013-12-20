package demo.file.attribute;

import file.attribute.ChangeFileLastModified;

public class ChangeFileLastModifiedDemo {
	public static void main(String[] args){
		// example run command:
		// java -cp bin demo.file.attribute.ChangeFileLast "logfile.log" "01/28/2014 09:24:17"
		ChangeFileLastModified.change(args[0], args[1]);
	}

}
