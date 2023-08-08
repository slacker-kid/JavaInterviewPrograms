package ProgramCollections;

import java.util.Scanner;

public class Program5 {

	public Program5() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=b;j++)
			{
			if(i==1 || j==1 || i==a || j==b)
			{
				System.out.print("X");
			}
			else {
				System.out.print("O");
			}
		}
			System.out.println();
	}

}
}
