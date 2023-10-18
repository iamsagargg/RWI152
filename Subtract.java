public class Subtract { 
	
	public int subtract(int x, int y) 
        {
        return (x - y); 
        } 

	
	public int subtract(int x, int y, int z) 
	{ 
        return (x - y - z); 
	} 

	
	public double subtract(double x, double y) 
	{ 
		return (x - y); 
	} 

	 
	public static void main(String args[]) 
	{ 
		Sum s = new Sum(); 
		System.out.println(s.sum(100, 20)); 
		System.out.println(s.sum(112, 20, 30)); 
		System.out.println(s.sum(90, 20)); 
	} 
}