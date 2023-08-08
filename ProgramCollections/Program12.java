package ProgramCollections;
import java.util.Scanner;

public class Program12 {

	public Program12() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] st=s.split(" ");
		int[] a=new int[st.length];
		int c=0,c1=0,c2=0;
		for(int k=0;k<st.length;k++)
		{
			a[k]=Integer.parseInt(st[k]);
		}
		double l=a.length;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				c2++;
			}
			else if(a[i]>0)
			{
				c++;
			}
			else if(a[i]<0)
			{
				c1++;
			}
		}
		System.out.printf("%.1f %.1f %.1f",c2/l,c1/l,c/l);
		
	}

}
