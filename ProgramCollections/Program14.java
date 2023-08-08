package ProgramCollections;
import java.util.*;
import java.util.Scanner;

public class Program14 {

	public Program14() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] st=s.split(" ");
		int[] a=new int[st.length];
		int[][] b=new int[st.length][2];
		for(int k=0;k<st.length;k++)
		{
			a[k]=Integer.parseInt(st[k]);
		}
		for(int k=0;k<st.length;k++)
		{
			int c=0;
			for(int j=1;j<=a[k];j++)
			{
				if(a[k]%j==0)
				{
					c++;
				}
			}
			b[k][0]=a[k];
			b[k][1]=c;	
		}
		for(int k=0;k<a.length;k++)
		{
			for(int g=k+1;g<a.length;g++)
			{
				if(b[k][1]<b[g][1])
				{
					int t=b[k][0];
					b[k][0]=b[g][0];
					b[g][0]=t;
					int h=b[k][1];
					b[k][1]=b[g][1];
					b[g][1]=h;
					
				}
			}
		}
		for(int k=0;k<st.length;k++)
		{
			System.out.print(b[k][0]+" ");
		}
		
	}

}
