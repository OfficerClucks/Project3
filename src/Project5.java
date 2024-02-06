import java.util.Scanner;
public class Project5 {

		public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
		
		int first = keyboard.nextInt();
		int second = keyboard.nextInt();
		int third = keyboard.nextInt();
		
		System.out.println(sevenAndNotLeft(first, second, third));
		keyboard.close();
	}

	public static int sevenAndNotLeft(int first, int second, int third)
	{
		int zero = 0;
		if(first == 7){
		   return second + third;
		}
	   if ( second == 7){
	      return third;
	   }
	   if(third == 7){
	      return zero;
	}
}
}