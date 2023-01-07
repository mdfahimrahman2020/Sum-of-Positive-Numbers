import java.util.Scanner;
public class program
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner (System.in);
		int sum,r,num,temp;
		sum = 0;
		System.out.print("\n\n\nEnter any number : ");
		num = input.nextInt();

		temp = num;
		while (temp != 0 )
		{
			r = temp % 10;
	        sum = sum + r;
	        temp = temp / 10; 
		}
		System.out.print("\n\nSum of the numbers : "+sum);
	}
}