package rank.bigint;

import java.math.BigInteger;
import java.util.Scanner;

public class Prime {
	
public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
    BigInteger n = in.nextBigInteger();
    in.close();
    
    boolean  b1 = n.isProbablePrime(1);
    
    if(b1)
    	System.out.println("prime");
    else
    	System.out.println("not prime");
    
    System.out.println();
    
    
    
}

}
