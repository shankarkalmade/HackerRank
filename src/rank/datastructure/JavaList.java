package rank.datastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class JavaList {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int numbers=  in.nextInt();
		
		List<Integer> list = new ArrayList<>();
		in.nextLine();
		    String content1 = in.nextLine();
	    	StringTokenizer tokens1=  new StringTokenizer(content1, " ");
	    		    	
	    	while(tokens1.hasMoreTokens()) {
	    		list.add(Integer.parseInt(tokens1.nextToken()));
	    		
	    	}
	    	    	
	            
	    
		
		int queries=  in.nextInt();
		in.nextLine();
		for(int i=0; i < queries; i++){
    		
	    	String content = in.nextLine();
	    	if(content.trim().equals("Insert")) {
	    		
	    		String operation = in.nextLine();
		    	StringTokenizer tokens=  new StringTokenizer(operation, " ");
		    		    	
		    	int index =Integer.parseInt(tokens.nextToken());
		    	int data =Integer.parseInt(tokens.nextToken());	
		    	list.add(index, data);
	    	    	
	    	} else {
	    		
	    		int index = Integer.parseInt(in.nextLine().trim());
	    		
	    		list.remove(index);
	    	}    
	    }
		
		for(Integer i: list) {
			System.out.print(i+" ");
		}
		
		
		
		
		
		
	}

}
