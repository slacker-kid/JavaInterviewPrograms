package ProgramCollections;
import java.util.*;

public class Program1 {

	public Program1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int t=n;
		int b=(n*2)-1;
		int[][] a=new int[b][b];
		int r=0,c=0,r1=b-1,c1=b-1,i=0,z=0;
		while(i<=n)
		{
			for(int j=c;j<c1;j++)
			{
				a[r][j]=t;
			}
			for(int j=c;j<c1;j++)
			{
				a[r1][j]=t;
			}
			for(int j=r;j<r1;j++)
			{
				a[j][c]=t;
			}
			for(int j=r;j<=r1;j++)
			{
				a[j][c1]=t;
			}
			r++;c++;r1--;c1--;t--;i++;
		}
	for(int k=0;k<b;k++)
	{
		for(int j=0;j<b;j++)
		{
			System.out.print(a[k][j]+" ");
		}
		System.out.println();
	}
	}
}
