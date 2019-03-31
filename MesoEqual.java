import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class MesoEqual
{	
	String StID;
	
	protected ArrayList<String> Words=new ArrayList<String>();	
	
	public MesoEqual(String id) throws IOException
	{
		this.StID=id;
		read("Mesonet.txt");
	}
	
	
	
	public void read(String fileName) throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		String strg = br.readLine();
		strg = br.readLine();
		strg = br.readLine();// skip three lines
		strg=br.readLine();
		strg = br.readLine();
		
		while(strg!=null)
		{
			Words.add(strg.substring(2,6));// Takes one word at a time and omits spaces
			strg=br.readLine();// Reads mesonet.txt in
		}
		br.close();
	}
	HashMap<String, Integer> AsciiVal = new HashMap<String, Integer>();
	public HashMap<String, Integer> calAsciiEqual()
	{
		for(String station: Words)   {
			MesoAscii obj=new MesoAscii(new MesoStation(StID));
			int baseVal = obj.calAverage();
			MesoAscii obj1=new MesoAscii(new MesoStation(station));
			int avg = obj1.calAverage();

			if (avg == baseVal)   {

				AsciiVal.put(station, avg);

			}

		}
		return AsciiVal;

	}
}