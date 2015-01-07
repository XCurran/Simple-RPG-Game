import hsa.*;
import java.io.*;
import java.io.File;
import java.io.IOException;
import java.awt.image.*;
import javax.imageio.*;

public class CurranX{
	//Loading map into array
	public static String[][] loadmap(String strFileName){
		String strTheMap[][];
		strTheMap = new String[20][20];
		int intRow;
		int intCol;
		String strLine;
		String strLineSplit[];
		
		try{
			FileReader reader = new FileReader(strFileName);
			BufferedReader filein = new BufferedReader(reader);
			for (intRow = 0; intRow < 20; intRow++){
				strLine = filein.readLine();
				strLineSplit = strLine.split(",");
				for (intCol = 0; intCol < 20; intCol++){
					strTheMap[intRow][intCol] = strLineSplit[intCol];	
				}
			}
		}catch(IOException e){
		}
		return strTheMap;
	}
	//The pause system
	public static void pause(int intMS){
			try{
				Thread.sleep(intMS);
			}catch(InterruptedException e){
			}
	}
}