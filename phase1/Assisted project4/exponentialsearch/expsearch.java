package exponentialsearch;
import java.util.Arrays;


public class expsearch {

	public static void main(String[] args) {
		int a[]= {6,12,18,24,32};
		int length=a.length,value=18;
		int result=expsearch(a,length,value);
		if(result<0)
		       System.out.println( "Element is not present in the array");
		else
			System.out.println("Element is present in the array at index:"+result);


			

	}
	public static int expsearch(int a[],int length,int value)
	{
		if(a[0]==value)
				return 0;
		int i=1;
		while(i<length && a[i]<=value)
		{
			i=i*2;
		}
		return Arrays.binarySearch(a,i/2,Math.min(i, length),value );
		
	}
		
		


}
