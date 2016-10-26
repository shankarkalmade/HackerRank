package rank.bigint;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BigInteger b1 = sc.nextBigInteger();
		
		
		BigInteger b2 = sc.nextBigInteger();
		
		System.out.println(b2.add(b1));
		System.out.println(b2.multiply(b1));
		
	}

}
