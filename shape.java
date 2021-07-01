package sneha.target;

import java.util.Scanner;

public class shape {
	int length, width;
	boolean isSquare() throws NotASquareException {
		if(length==width)
		{
			return true;
		}
		else
		{
			throw new NotASquareException();
		}
	}
	
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter length of a Shape: ");
		shape S=new shape();
		S.length=scanner.nextInt();
		System.out.println("Enter width of a Shape: ");
		S.width=scanner.nextInt();
		try{
			if(S.isSquare())
			{
				System.out.println("It is sqaure.");
			}
		}
		catch(NotASquareException e)
		{
		}
	}


}
