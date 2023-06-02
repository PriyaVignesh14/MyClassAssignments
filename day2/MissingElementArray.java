package week1.day2;


import java.util.Arrays;

public class MissingElementArray {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,7,6,8};
		int length = arr.length;
		
		
		for(int i=0;i<arr.length;i++)
		{
			Arrays.sort(arr);
	
		
	
		       
		if(arr[i]!=(i+1))
		{
	
				System.out.println("Missing Element in Array:"+(i+1));

				break;
		}
		            
		}
}
}
