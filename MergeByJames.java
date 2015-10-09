import java.util.Arrays;

public class MergeByJames
{
	public static int [] doMergeSort(int [] arr)
	{
		if (arr.length == 1) return arr;
		if (arr.length == 0) return null;
		if (arr == null) return null;


		int [] arr1 = Arrays.copyOfRange(arr, 0, arr.length/2);
		int [] arr2 = Arrays.copyOfRange(arr, arr.length/2, arr.length);

		doMergeSort(arr1);
		doMergeSort(arr2);

		// recursively call doMergeSort and assume that you will get a 
		// sorted list in return
		
		// Put Two Sorted Sides Together
		int [] comboArr = merge(arr1, arr2);
		System.out.println(Arrays.toString(comboArr));
		// Return Sorted Array of Two Halves
		return comboArr;

	}

	private static int [] merge (int [] arr1, int [] arr2)
	{	
		int [] combo = new int [arr1.length + arr2.length];
		System.out.println(combo.length);
		int counter1 = 0, counter2 = 0;
		
		//counters go until they become maxIndex + 1;

		while (counter1 <= arr1.length || counter2 <= arr2.length)
		{	
			System.out.printf("(%d, %d)", counter1, counter2);
			if (counter2 == arr2.length && counter1 == arr1.length)
			{
				return combo;
			}
			
			if (counter1 == arr1.length) 
			{
				combo [counter1 + counter2] = arr2[counter2];
				System.out.println("num " + arr2[counter2]);
				System.out.println("counter "+ counter2);
				counter2++;
				continue;
			}

			if (counter2 == arr2.length)
			{
				combo [counter1 + counter2] = arr1[counter1];
				System.out.println("num " + arr1[counter1]);
				System.out.println("counter "+counter1);
				counter1++;
				continue;
			}
			
			if (arr1[counter1] < arr2[counter2])
			{
				combo [counter1 + counter2] = arr1[counter1];
				System.out.println("num " + arr1[counter1]);
				System.out.println("counter "+counter1);
				counter1++;
			}
			else
			{
				combo [counter1 + counter2] = arr2[counter2];
				System.out.println("num " + arr2[counter2]);
				System.out.println("counter "+ counter2);
				counter2++;
			}
		}
		return null;
	}

	public static void main (String [] args)
	{
		int [] arr1 = {2, 1, 3, 0};
		int [] arr2 = {100, -1, -2, 200};// -5, -4, -3};
		int [] arr3 = {0};
		int [] arr4 = {100, -1, -2, 200, 100, -1, -2, 200, 100, -1, -2, 200};

		System.out.println(Arrays.toString(doMergeSort(arr1)));
		System.out.println(Arrays.toString(doMergeSort(arr2)));
	    // System.out.println(Arrays.toString(doMergeSort(arr3)));
	    // System.out.println(Arrays.toString(doMergeSort(arr4)));
	}
}