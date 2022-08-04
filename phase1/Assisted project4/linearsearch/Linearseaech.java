package linearsearch;

import java.util.Scanner;

public class Linearseaech {

	public static void main(String[] args) {
		int a[]= {2,3,8,9,10,12,13};
		System.out.println("Enter the element to be searched");
		Scanner sc=new Scanner(System.in);
		int ele=sc.nextInt();
		int i=0,flag=0;
		for(i=0;i<a.length;i++)
		{
			if(a[i]==ele) {
				flag=1;
				break;
			}
		}
		if(flag==1)
			System.out.println("element found at the index "+i + " and the search key is "+ele);
		else
			System.out.println("element not found");
	}

}
