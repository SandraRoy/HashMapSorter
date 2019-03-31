import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class StationLexicographical extends MesoSortedAbstract
{
	TreeMap <String, Integer> sortedMap=new TreeMap<>();
	public Map<String, Integer> sortedMap(HashMap<String, Integer> unsorted)
	{
		sortedMap.putAll(unsorted);
		return sortedMap;
	}
	 public StationLexicographical(HashMap<String, Integer> ascii)
	 {
		 sortedMap(ascii);
		 for(String station: sortedMap.keySet())
		 {
			 System.out.println(station+" "+sortedMap.get(station));
		 }
	 }
	
}