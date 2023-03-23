import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello Pranay");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any sentence or String to reverse case");
		String s= sc.nextLine();
		String r="";
		for(int i=0;i<s.length();i++)
		{
		    char c = s.charAt(i);
		    if(Character.isUpperCase(c))
		    {
		        r = r + Character.toLowerCase(c);
		    }
		    else
		    {
		        r = r +  Character.toUpperCase(c);
		    }
		}
		System.out.println(r);
	}
}
