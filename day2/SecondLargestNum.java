package week1.day2;

import java.util.Arrays;

public class SecondLargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int data[] = {3,2,11,4,6,7};
	      int size = data.length;
	      Arrays.sort(data);
	     
	      int result = data[size-2];
	      System.out.println("2nd largest element is ::"+result);

	}

}
