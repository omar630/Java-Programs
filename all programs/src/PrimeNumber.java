import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter Number:");
		int n=sc.nextInt();
		int c=0;
		for(int i=1;i<=n;i++)
			if(n%i==0)
				c++;
		if(c==2)
			System.out.println("Prime Number");
		else
			System.out.println("Not A Prime Number");
	}

}
