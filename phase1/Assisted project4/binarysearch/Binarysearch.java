package binarysearch;

import java.util.Arrays;
import java.util.Scanner;

public class Binarysearch {

	public static void main(String[] args) {
		int a[]= {2,4,7,19,13,5,1};
		System.out.println("Enter the element to be searched:");
		Scanner sc=new Scanner(System.in);
		int ele=sc.nextInt();
		int i=0,flag=0,mid=0,l=0,h=a.length-1;
		Arrays.sort(a);
		
		for(i=0;i<a.length;i++)
		{
			mid=(l+h)/2;
			if(a[mid]==ele) {
				flag=1;
				break;
			}
			else if(a[mid]>ele)
			{
				l=0;
				h=mid-1;
			}
			else {
				l=mid+1;
				h=a.length-1;
			}
			
		}
		if(flag==1)
			System.out.println("elenent found at the index "+mid+" and the search key is "+ele);
		else
			System.out.println("element not found");

	}
}

