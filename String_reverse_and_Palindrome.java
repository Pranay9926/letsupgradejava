//program for string reverse and palindrome 
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String r = "";
		for(int i=0;i<s.length();i++)
		{
		    char c = s.charAt(i);
		    r=c+r;
		}
		System.out.println(r);
		if(s.equalsIgnoreCase(r))
		{
		    System.out.println("yes it is palindrome ");
		}
		else{
		    System.out.println("no it is not palindrome ");
		}
	}
}
