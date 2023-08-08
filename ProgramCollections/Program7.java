package ProgramCollections;
import java.util.*;
public class Program7 {

	public Program7() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n>26)
		{
			int t=n-26;
			System.out.printf("A%c",64+t);
		}
		else
		{
			System.out.printf("%c",64+n);
		}
	}

}
