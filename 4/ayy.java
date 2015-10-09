import java.util.*;

public class ayy
{
	public static int doBinarySearch(int [] arr, int numWeWant)
	{
		return binarySearch(arr, 0, arr.length - 1, numWeWant);
	}

	public static int binarySearch (int [] arr, int startIndex, int endIndex, int numWeWant)
	{
		int midIndex = (endIndex - startIndex) / 2 + startIndex; 

		if (midIndex < startIndex || midIndex > endIndex) return -1;

		int numWeHave = arr[midIndex];

		if (numWeHave == numWeWant)
		{
			return midIndex;
		}

		if (numWeHave < numWeWant)
		{
			return binarySearch(arr, midIndex + 1, endIndex, numWeWant);
		}

		else 
		{
			return binarySearch(arr, startIndex, midIndex - 1, numWeWant);
		}
	}

	public static void main (String [] args)
	{
		int [] arr1 = {1, 2, 3, 4, 5};
		int [] arr2 = {-5, -4, -3, -2, -1, 0, 100, 200};
		int [] arr3 = {0};
		int [] arr4 = {0,0,0,0,0,0,1};

		System.out.println(doBinarySearch(arr1, 5));
		System.out.println(doBinarySearch(arr2, -4));
		System.out.println(doBinarySearch(arr3, 0));
		System.out.println(doBinarySearch(arr4, 1));
		System.out.println(doBinarySearch(arr2, 3));
	}	

}