package ProgramCollections;

import java.util.Scanner;

public class Program13 {

	public Program13() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1=sc.nextLine();
		String sum=s+" "+s1;
		String[] st=sum.split(" ");
		int[] a=new int[st.length];
		for(int k=0;k<st.length;k++)
		{
			a[k]=Integer.parseInt(st[k]);
		}
		for(int k=0;k<a.length;k++)
		{
			for(int g=k+1;g<a.length;g++)
			{
				if(a[k]>a[g])
				{
					int t=a[k];
					a[k]=a[g];
					a[g]=t;
				}
			}
		}
		for(int k=0;k<st.length;k++)
		{
			System.out.print(a[k]+" ");
		}
	}

}
