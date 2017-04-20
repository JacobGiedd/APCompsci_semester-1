public class Lab_13
{
	private String name;
	private double value;
	private String face; 
	Toy mine = new LightSaber();
	LightSaber yours = new LightSaber();
	String w = mine.getName();
	String x = yours.getName();
	
	String m = mine.batteries();
	String  y = yours.batteries();
	public Lab_13()
	{
		super();
		this.face = "";
	}
	
	public Lab_13(String n, String f, double v)
	{
		super(n, v);
		this.face = f;
	}
	
	public String scan()
	{
		return face;
	}
	
	public String toString()
	{
		return "Face: " + face + "\n" + super.toString();
	}
}
	public class LightSaber extends Toy 
	{
   public LightSaber()
	{
       super();
	}


   public LightSaber(String n)
	{
       super(n);
	}


   public String batteries()
	{
       return "4 AAA";
	}


   public String getType()
	{
       return "Lightsaber";
	}
	
	public int countBatteries()
	{
   return super.getCount() * 4;
	}
	
}