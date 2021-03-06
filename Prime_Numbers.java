//program to find primenumbers from 1 to n
import java.util.Scanner;

class Prime_Numbers{
	public static void main(String[] args) {
		int i,j,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		n = sc.nextInt();
		System.out.println("Prime Numbers: ");
		for(i = 2;i<=n;i++){
			for(j = 2;j<=i;j++){
				if(j==i){
					System.out.print(i+ " ");
				}
				if(i%j==0){
					break;
				}
			}
		}
	}
}