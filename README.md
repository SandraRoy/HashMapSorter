# Project-3
**MesoAscii**
This class is a derived class for the MesoAsciiAbstract class.

*public MesoAscii*
The constructor takes a MesoStation object as a parameter nd assigns it to global variable *StID* of type MesoStation. 
This will be useful in getting the string value in order to find it's Ascii.

*public int calAverage()*
 Two variables are declared and initialized to store sum and sum and average.
 The getStID method from MesoStation class is used to get the stationID string.
 A for loop is used to iterate through ech character of a string. The charAt method is used to extract each character and it's ASCII value
 is added to the sum.
 The average of this sum is the return value(Math.round automatically rounds the sum to the nearest integer).
 
 **MesoEqual*
 This class is used to print out all the stations with the same ASCII value.
 
 *public MesoEqual*
 The constructor assigns the String parameter to a global variable. It also calls the read method to read in Mesonet.txt
 
 *public void read*
 This method uses BufferedReader to read mesonet.txt into an arrayList called Words. The method skips the first 4 lines and reads in the substring from index 2 to 6.
 
 *public HashMap<String, Integer> calAsciiEqual*
 This method uses an enhanced for loop to iterate through the arrayList *Words* and compares the ascii value of each word to the ascii value of the
 string given in the parameter. If they are equal, the method adds the word to the AsciiVal HashMap which is returned. A MesoAscii method must be created 
 in order to access the calAverage method to calculate ascii average.
 
 **public class StationLexicographical**
 This class extends MesoSortedAbstract class. It is used to arrange the contents of a HashMap in Lexicographical order.
 
*public Map<String, Integer> sortedMap*
Implements the abstract sortedMap method.This method takes an unsorted HashMap as a parameter and put it into a TreeMap which sorts it.
The method returns the sorted TreeMap.

*public StationLexicographical*
Takes a HashMap with stations having the same ascii value and calls sortedMap to put them in order. Then, and enhanced for loop is used to print out the Station 
ID and it's corresponding ASCII.
