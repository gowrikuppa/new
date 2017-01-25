import java.util.*;

public class A1{
	public static void main(String[] args) {
		Scanner input = new Scanner( System.in);
		System.out.println("Enter first number:" );
		int a = input.nextInt();
		System.out.println("Enter Second number:" );
		int b = input.nextInt();
		if(a>b){
			System.out.println("First number is bigger" );
		}
		else if(b>a){
			System.out.println("Second  number is bigger" );
		}
		else{
			System.out.println("Both numbers are equal" );
		}
		return "gowrikuppa";
	}
}