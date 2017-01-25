import java.util.*;

public class A2{
	public static void main(String[] args) {
		int a,n;
		int[] arr = new int[5];
	do{
		Scanner input = new Scanner( System.in);
		System.out.println("Enter the number:" );
		a = input.nextInt();
		n=0;
		
		for(int i=1;a>=i; i=i*10){
			n+=1;
		}
		if(n!=5){
			System.out.println("you entered a "+ n +"digit number.Pls type 5 digit number:");
		}
	}while(n!=5);		
		for(int j=0;j<n;j++){
			arr[j]=a%10;
			a=a/10;
		}
		for(int k=0;k<n;k++){
			System.out.print( arr[n-k-1]+" " );
		}
		
	}
}