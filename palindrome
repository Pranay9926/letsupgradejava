import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Enter any number to check  palindrome or not");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int num=0 , temp = N;
		while(N!=0)
		{
		    int r = N%10;
		    num = (num*10)+r;
		    N = N/10;
		}
		System.out.println("the reverse of entered number is "+num);
		if(num==temp)
		{
		    System.out.println("Enter number is palindrome");
		}
		else
		{
		    System.out.println("Enter number is not palindrome");   
		}
	}
}
