import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryReadWrite {

	public static void main(String[] args) 
	{
		
		String input = "C:/Users/Shreya Kate/Desktop/input.txt";
		String output = "C:/Users/Shreya Kate/Desktop/output1.txt";
		
		try
		{
			int total = 0;
            int nRead = 0;
			
            byte[] readBuffer = new byte[1000];
			FileInputStream fis = new FileInputStream(input);
			FileOutputStream fos = new FileOutputStream(output);
			
			
			while((nRead = fis.read(readBuffer)) != -1) 
			{
				byte[] writeBuffer =  new String(readBuffer).getBytes();
				//System.out.println(new String(readBuffer));
				fos.write(writeBuffer);
	            total += nRead;
	            
			}
			
			System.out.println(total);
			 
		}
		catch(IOException ex) 
		{
	            System.out.println("Error writing file '" + output + "'");
	          
	    }
	}

}
