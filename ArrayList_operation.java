// all ArrayList operation 
import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		ArrayList<String>StudentsName = new ArrayList<>();
		StudentsName.add("Pranay");//add element in array list
		System.out.println(StudentsName);
		StudentsName.add("abhishek");
		StudentsName.add(1,"Ayush");// add element on specific position of ArrayList
		System.out.println(StudentsName);
		ArrayList<String>newlist = new ArrayList();// new list created
		newlist.add("10");
		newlist.add("20");
    	System.out.println(newlist);
    	StudentsName.addAll(newlist);// add newlist into old list
		System.out.println(StudentsName);
		System.out.println(StudentsName.get(2));// to get element from any position
	    StudentsName.remove(3);// remove element from ArrayList by position
		System.out.println(StudentsName);
		for(int i=0;i<StudentsName.size();i++)// to terverse ArrayList
		{
		    System.out.println("element : "+ StudentsName.get(i) +" is here");
		}

	}
}
