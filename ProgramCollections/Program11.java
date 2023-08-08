package ProgramCollections;
import java.util.*;
public class Program11 {

	public Program11() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] st=s.split(" ");
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
		int i=0,j=st.length-1;
		if(st.length%2==0)
		{
		i=1;
		while(i!=j)
		{
			System.out.print(a[j]+" ");
			System.out.print(a[i-1]+" ");
			i++;
			j--;
			if(i==j) {
				System.out.print(a[i]+" "+a[j-1]);
				break;
			}
		}
		}
		else
		{
		while(i!=j)
		{
			System.out.print(a[j]+" ");
			System.out.print(a[i]+" ");
			i++;
			j--;
			if(i==j) {
				System.out.print(a[i]);
				break;
			}
		}
		}
		
	}

}
