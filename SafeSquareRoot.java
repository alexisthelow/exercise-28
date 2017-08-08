import java.util.Scanner;

public class SafeSquareRoot {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double x, y;
		String reply;
		String replyCheck = "YES!";
		
		
		System.out.print("ARE YOU READY?! (please reply 'YES!'): ");
		reply = keyboard.nextLine();
		
		while (! reply.equals(replyCheck)) {
			System.out.print("C'mon.. I asked... ARE YOU READY?! (please reply 'YES!'): ");
			reply = keyboard.nextLine();
		}
		
		System.out.println("Give me a number, and I'll find it's square root. (No negatives please!)");
		System.out.print("Your number: ");
		x = keyboard.nextDouble();
		
		while (x < 0) {
			System.out.println("I won't take the square root of a negative.");
			System.out.print("New number: ");
			x = keyboard.nextDouble();
		}
		
		y = Math.sqrt(x);
		
		System.out.println("The square root of " + x + " is " + y);
	}
}