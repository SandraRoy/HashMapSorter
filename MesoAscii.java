public class MesoAscii extends MesoAsciiAbstract 
{
	MesoStation StID;
	String s="";
	public MesoAscii (MesoStation id)
	{
		this.StID=	id;
		 s=StID.getStID();
	}
	
	public int calAverage()
	{
		double sum=0, average=0;
		
		for (int i=0;i<4;i++)
		{
			 char ch = s.charAt(i);
			 double d = (int)ch;
			 sum += d;
			 
		}
		return (int)(Math.round(sum/4.0));
		
	}
}