public class MesoAscii extends MesoAsciiAbstract 
{
	MesoStation StID;
	public MesoAscii (MesoStation id)
	{
		StID=	id;
	}
	public int calAverage()
	{
		double sum=0, average=0;
		for (int i=0;i<4;i++)
		{
			char ch=StID.getStID().charAt(i); 
			sum=sum+(int)(ch);
		}
		return (int)(Math.round(sum/4.0));
		
	}
}