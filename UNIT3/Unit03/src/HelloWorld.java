import java.util.Scanner;
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is the base?");
		int base = scanner.nextInt();
		System.out.println("What is the exponent?");
		int exp = scanner.nextInt();
		System.out.println("The answer is " + powerOf(base,exp));
	}

	private static int powerOf(int a,int b) {
		int A = a;
		if (b==0) {
			return 1;
		}
		for (int i=2; i<=b; i++) {
			a*=A;
		}
		return a;
	}
	
}
