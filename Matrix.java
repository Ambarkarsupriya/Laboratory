import java.util.Scanner;

class Matrix{
	public static void main(String[] args) {
		int p,q,m,n,c,d,k,sum=0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of rows nd columns in first matrix: ");
		m = sc.nextInt();
		n = sc.nextInt();

		int first[][] = new int[m][n];

		System.out.println("Enter the elements into the matrix 1 : ");

		for(c=0;c<m;c++){
			for(d=0;d<n;d++){
				first[c][d] = sc.nextInt();
			}
		}

		System.out.println("Enter the no.of rows nd columns in second matrix: ");
		p = sc.nextInt();
		q = sc.nextInt();


		if(n != p){
			System.out.print("Matrixes cant be multiplied each other.");
		}
		else{
			int second[][] = new int[p][q];
			int multiply[][] = new int[m][q];
			System.out.println("Enter the elements into matrix 2 : ");
			for(c=0;c<p;c++){
				for(d=0;d<q;d++){
				second[c][d] = sc.nextInt();
}
}
				for(c = 0;c<m;c++){
					for(d=0;d<q;d++){
						for(k=0;k<p;k++){
							sum = sum+first[c][k]*second[k][d];
						}
						multiply[c][d] = sum;
						sum =0;
					}
				  }
				  System.out.println("Product of matrixes : \n ");

				  for(c=0;c<m;c++){
				  	for (d=0;d<q ;d++ ) {
				  		System.out.print(multiply[c][d] + "\t");

				  	}
				  	System.out.print("\n");
				  }
				

		}
	}
}