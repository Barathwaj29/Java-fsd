package longestsubsequence;

public class LongestIncreasingSubsequent {

	public static int LIS(int[] arr, int i, int n, int prev)
	{
	if (i == n) {
	return 0;
	}
	int excl = LIS(arr, i + 1, n, prev);
	int incl = 0;
	if (arr[i] > prev) {
	incl = 1 + LIS(arr, i + 1, n, arr[i]);
	}
	return Integer.max(incl, excl);
	}
	public static void main(String[] args)
	{
	int[] arr = { 10, 22, 9, 33, 21, 50, 41, 60 };
	System.out.print("The length of the LIS is "
	+ LIS(arr, 0, arr.length, Integer.MIN_VALUE));
	}

}
