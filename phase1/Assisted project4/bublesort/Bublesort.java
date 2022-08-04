package bublesort;

public class Bublesort {

	public static void main(String[] args) {
		int a[]= {25,20,15,5,10};
		bubblesort(a);
		System.out.println("the sorted elements are");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}
	public static void bubblesort(int a[])
	{
		int len=a.length,temp=0;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
				
			}
		}
		
	}

}
