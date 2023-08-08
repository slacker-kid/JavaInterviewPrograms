package ProgramCollections;
import java.util.*;
public class Program2 {

	public Program2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] a=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		int it=0;
		int r=0,c=0,c1=n-1,r1=n-1,t=0;
		int[] an=new int[n*n];
		while(it<n)
		{
			for(int j=c;j<=c1;j++)
			{
				an[t++]=a[r][j];
			}
			for(int j=r+1;j<=r1;j++)
			{
				an[t++]=a[j][c1];
			}
			for(int j=c1-1;j>=c;j--)
			{
				an[t++]=a[r1][j];
			}
			for(int j=r1-1;j>=r+1;j--)
			{
				an[t++]=a[j][c];
			}
			r++;c++;r1--;c1--;it++;
		}
		for(int k=n*n-1;k>=0;k--)
		{
			System.out.print(an[k]+" ");
		}
	}

}
