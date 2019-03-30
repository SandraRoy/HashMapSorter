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
	protected ArrayList<String> Words=new ArrayList<String>();	
	public void read(String fileName)throws IOException
	{
		BufferedReader br=new BufferedReader(new FileReader("Mesonet.txt"));
		String strg;
		br.readLine();
		br.readLine();
		br.readLine();
		strg=br.readLine();
	}
}