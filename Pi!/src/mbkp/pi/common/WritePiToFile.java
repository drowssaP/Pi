package mbkp.pi.common;

/**
 * @author Max
 */

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import mbkp.pi.common.PiMeth;

public class WritePiToFile extends PiMeth{
	
	public WritePiToFile(String fileName, boolean append) throws FileNotFoundException {
		super();
	}
	
	public static void recordFilesCreated(){
		try{
			Writer w = new BufferedWriter(new FileWriter("C:\\data\\filesCreated.txt"));
			
			w.write(Obs.txtName + ", ");
			w.close();
			
		}catch(IOException e){
			System.out.println("IOException: " + e);
		}
	}
	
	public static void writePi(){
	try{
	Writer w = new BufferedWriter(new FileWriter(Obs.fileNametxt));
    
	w.write("" + pi(InputFromUser));
	w.close();
	
	recordFilesCreated();
	gzipIt();
    	}catch(IOException e){
        	System.out.println("IOException: "+e);
    	}
	}
}
