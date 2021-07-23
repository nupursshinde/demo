package dem;

public class A 
{
	public void m1(String s)
	{
		System.out.println(s);
	System.out.println("m1......string");
	}
	public void m1(Object o)
	{
		System.out.println(o);
		System.out.println("m1.....object");
	}
	
	public static void main(String[] args)
	{
		A a=new A();
		a.m1(null);
	}
}
