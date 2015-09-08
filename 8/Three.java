public class Three
{
	public static int magicIndex (int [] arr, int begin, int end)
	{
		int mid = (end - begin)/2 + begin;
		System.out.println(mid);
		System.out.printf("%d, %d\n", begin, end);
		if (mid == arr[mid]) return mid;

		if (mid > end || mid < begin) return -1;

		return (mid > arr[mid]) ? magicIndex(arr, mid + 1, end)
			: magicIndex(arr, begin, mid - 1);
	}

	public static void main(String [] args)
	{
		int [] arr = {-1, 0, 1, 3, 5, 7, 100, 200, 201, 201};
		System.out.println(magicIndex(arr, 0, arr.length));
		int [] arr2 = {4, 4, 4, 4, 4};
		System.out.println(magicIndex(arr2, 0, arr2.length));
		int [] arr3 = {0, 0, 0, 0, 4, 10, 10};
		System.out.println(magicIndex(arr3, 0, arr3.length));
		int [] arr4 = {10, 10, 10, 10, 10, 10};
		System.out.println(magicIndex(arr4, 0, arr4.length));
		
	}
}