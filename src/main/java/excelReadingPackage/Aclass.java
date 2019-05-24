package excelReadingPackage;

public class Aclass  {
	
	static {
	int i;
	}
	static int i=10;
	public static void main(String[] args) {
		
		
		System.out.println(i);
		int i=20;
		
		System.out.println(i);
		
		Bclass b = new Cclass();
		
		b.m1();
		
		int j =++ i;
		
		System.out.println(j);
		
		
		
		
	}

}

class Bclass
{
	public void m1()
	{
		int j = Aclass.i;
		System.out.println("Method 1" +" "+ "is" +" "+ j);
	}
	
}

class Cclass extends Bclass
{
	public void m2()
	{
		System.out.println("Method 2");
	}
}
