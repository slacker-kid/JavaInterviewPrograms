package ProgramCollections;
import java.util.*;
public class Program8 {

	public Program8() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int l=0,h=0;
		for(int i=2;i<=a && i<=b;i++)
		{
			if(a%i==0 && b%i==0)
			{
				l=i;
				break;
			}
		}
		for(int i=1;i<(a*b);i++)
		{
			if(i%a==0 && i%b==0)
			{
				h=i;
				break;
			}
		}
		System.out.print(l+" "+h);
	}

}
