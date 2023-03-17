import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Enter range of Prime no. series upto where u want :=> ");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int n;
		String s = "";
		for(int i=1;i<N;i++)
		{   
		    int c=0;
		    for(n=i;n>=1;n--)
		    {
		        if(i%n==0)
		        {
		            c++;
		        }
		    }
		    if(c==2)
		    {
		        s=s+i+' ';
		    }
		}
        System.out.println("the Prime series up to range is => ");
        System.out.println(s);
	}
}
