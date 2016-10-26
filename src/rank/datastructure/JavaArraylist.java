package rank.datastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class JavaArraylist {
	
	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		int numbers=  in.nextInt();
		
		ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
		in.nextLine();
	    for(int i=0; i < numbers; i++){
	    		
	    	String content = in.nextLine();
	    	StringTokenizer tokens=  new StringTokenizer(content, " ");
	    	ArrayList<Integer> data= new ArrayList<>();
	    	
	    	while(tokens.hasMoreTokens()) {
	    		data.add(Integer.parseInt(tokens.nextToken()));
	    		
	    	}
	    	lists.add(i, data);
	    	
	            
	    }
	    
	    int queries=  in.nextInt();
	    int [] inputArrays = new int[numbers];
	    in.nextLine();
	    for(int i=0; i < queries; i++){
	    	String content = in.nextLine();
	    	StringTokenizer tokens=  new StringTokenizer(content, " ");
	    	
	    	int listNumber= Integer.parseInt(tokens.nextToken());
	    	int elementNumber= Integer.parseInt(tokens.nextToken());
	    	
	    	
	    	if(lists.size()>listNumber) {
	    		
	    		List<Integer> test = lists.get(listNumber-1);
	    		if(test.size()>elementNumber) {
	    			
	    			System.out.println(test.get(elementNumber));
	    		} else {
	    			System.out.println("ERROR");
	    		}
	    		
	    	} else {
	    		System.out.println("ERROR");
	    	}
	    	
	    
	    }
	    
	    
	    

	}
    
    
	
	

}
