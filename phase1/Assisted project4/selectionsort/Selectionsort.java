package selectionsort;

public class Selectionsort {

	public static void main(String[] args) {
		int a[]= {9,6,3,1,2,4,5};
		int length=a.length;
		selestionsort(a);
		System.out.println("the sorted elements are:");
		for(int i:a) {
			System.out.println(i);
		}

	}
	public static void selestionsort(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			int index=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[index])
				{
					index=j;
				}
			}
			int smallnumber=a[index];
			a[index]=a[i];
			a[i]=smallnumber;
		}
	}

}
