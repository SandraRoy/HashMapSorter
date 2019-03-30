import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MesoEqual
{
	String StID;
	public MesoEqual(String id)
	{
		StID=id;
	}
	MesoAscii obj=new MesoAscii(new MesoStation(StID));
	protected ArrayList<String> Words=new ArrayList<String>();	
	public void read(String fileName)throws IOException
	{
		BufferedReader br=new BufferedReader(new FileReader("Mesonet.txt"));
		String strg;
		br.readLine();
		br.readLine();
		br.readLine();// skip three lines
		strg=br.readLine();
		while(strg!=null)
		{
			Words.add(strg.substring(1,5));// Takes one word at a time and omits spaces
			strg=br.readLine();// Reads mesonet.txt in
		}
	}
}