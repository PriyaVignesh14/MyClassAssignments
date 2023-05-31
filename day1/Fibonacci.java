package week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int range=8;
		int FirstNum = 0;
		int SecNum = 1;
        int sum=0;
	
		System.out.println(FirstNum);
		System.out.println(SecNum);
	
		
		for(int i=1;i<=range;++i)
		{
		
			
			
	  sum=  FirstNum +   SecNum;
	  FirstNum = SecNum;
	  SecNum = sum; 
	  
	  System.out.println(sum);
		
		}

}  
	
}