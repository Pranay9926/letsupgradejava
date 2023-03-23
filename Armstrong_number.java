import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Enter any no. to check no. is armstrong or not");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count=0,temp=N,p=N;
		int arm=0;
		while(N!=0)
		{
		    N=N/10;
		    count++;
		}
		while(temp!=0)
		{
		    int r = temp % 10;
		    int m=1;
    		for(int i=1;i<=count;i++)
    		{
    		    m = m *r;
    		}
    		arm = arm + m;
    		temp = temp/10;
		}
		if(p==arm)
		System.out.println("is the armstrong number");
		else
		System.out.println("is not a armstrong number");
    }
}
