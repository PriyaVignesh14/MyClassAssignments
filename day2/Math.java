package week1.day2;

public class Math 
{
	public int add(int x,int y)
	{
  return x + y;
	}
	
	public int sub(int x,int y)
	{
		return x -y;
	}
	
	public int div(int x,int y)
	{
		return x/y;
	}
	
	public static void main(String[] args)
	{
		Math M = new Math();
		int add=M.add(5, 10);
		System.out.println(add);
		int sub=M.sub(20, 10);
		System.out.println(sub);
		int div=M.div(20, 5);
		System.out.println(div);
				
	}
}