package ProgramCollections;
import java.util.*;
public class Program3 {

	public Program3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char[] st=s.toCharArray();
		int l=st.length;
//		System.out.print(l);
		for(int i=0;i<l;i++)
		{
			for(int j=0;j<l;j++)
			{
				if(i==j || (i+j)==l-1)
				{
					System.out.print(st[i]);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
