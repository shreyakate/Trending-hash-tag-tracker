import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class HuffmanCode 
{
	
	public static void main(String[] args)
	{
		String input = "C:/Users/Shreya Kate/Desktop/input.txt";      //Input file name
		String output = "C:/Users/Shreya Kate/Desktop/output.txt";    //Output file name
		String line = null; 										  //This will reference one single line at a time
		int value[] = new int[1000000];
		try
		{
			FileReader fr = new FileReader(input);
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter(output);
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write("File is open");		//DEBUG!!
			
			while((line = br.readLine()) != null|| br.ready())
			{
				int index = Integer.parseInt(line);
				value[index]++;
				bw.newLine();		
			}
			
			bw.newLine();
			bw.write("Closing file");
			bw.close();
			br.close();
		}
		catch(FileNotFoundException ex) 
		{
            System.out.println("Unable to open file '" + output + "'");                
        }
        catch(IOException ex) 
		{
            System.out.println("Error reading file '" + input + "'");                  
        }
	}
}
