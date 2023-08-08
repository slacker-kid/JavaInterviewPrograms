package ProgramCollections;
import java.util.*;
public class Program6 {

	public Program6() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s="1 11 21 1211 111221";
		String[] st=s.split(" ");
		int n=sc.nextInt();
		if(n>st.length)
		{
			System.out.print("Invalid");
		}
		else
		{
		for(int i=0;i<st.length;i++)
		{
			if(i==n-1)
			{
				System.out.print(st[i]);
			}
		}
		}

}
}