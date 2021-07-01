
import java.util.Scanner;

public class ArrayIndex {
	public static void main(String[] args) {
		int array[]= new int[6];
		int variable=0;
		for(int i=0;i<6;i++)
		{
		    variable+=i;
			array[i]=variable;
		}
		try {
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter the index to get the element value:");
			int value=scanner.nextInt();	
			System.out.println(array[value]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("The last index of the array is 5");
		}
		finally {
			System.out.println("Program successful.");
		}
	}

}
