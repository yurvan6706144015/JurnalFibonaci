
package rplcodingfibonaci;
import java.util.Scanner;



/**
 *
 * @author Praktikan
 */
public class RPLcodingFibonaci {


	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Masukkanpa deret fibonacci ? ");
		int n = s.nextInt();
		for(int i=n;i>=1;i--)
			System.out.print(fibo(i) + " ");
		System.out.println();
	}

	private static int fibo(int n)
	{
		int f;
		if(n==1 || n==2)
			f=1;
		else
			f = fibo(n-1) + fibo(n-2);
		return f;
	}
}

