package rank.datastructure;

import java.util.Scanner;

public class SubArray {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		int numbers=  in.nextInt();
        int [] arr = new int[numbers];
        int count=0;
        for(int i=0; i < numbers; i++){
                arr[i] = in.nextInt();
        }
        
        for(int i=0; i<numbers; i++)
        {
        	for(int j=i; j<numbers;j++) {
        		
        		int sum=0;
        		for(int k =i; k<=j; k++) {
        			
        			sum += arr[k];
        			
        				
        		}
        		if (sum<0) {
    				System.out.println(i + "  "+j);
    				count++;
    			}
        	}
        	
        	
        }
        System.out.println(count);
            
	
	}
        
	
		
}
	
	

