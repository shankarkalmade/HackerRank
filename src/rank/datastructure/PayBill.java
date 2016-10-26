package rank.datastructure;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;


class Test {
	
	public int solution(String S) {
		
		String lines[] = S.split("\\r?\\n");
		
		Map<String, Long> callMap= new HashMap<>();
		long maxDuration= 0;
		String maxCallUser = "";
		Map<String, Long> costMap= new HashMap<>();
		
		String line ="";
		
		for(String content : lines) {
			
			if(!content.isEmpty()) {
	    		StringTokenizer tokens=  new StringTokenizer(content, ",");
	    		
	    		String callDUration= tokens.nextToken().trim();
		    	String number = tokens.nextToken().trim();
	    		
		    	StringTokenizer callTokens=  new StringTokenizer(callDUration, ":");
		    	int hours= Integer.parseInt(callTokens.nextToken().trim());
		    	int min= Integer.parseInt(callTokens.nextToken().trim());
		    	int sec= Integer.parseInt(callTokens.nextToken().trim());
		    		    	
		    	long totalDuration = hours*60*60 + min * 60 + sec;
		    	
		    	long cost = getCallCost(totalDuration);
		    	if(!callMap.containsKey(number)) {
		    		
		    		callMap.put(number, totalDuration);
		    		costMap.put(number, cost);
		    		
		    	} else {
		    		
		    		long total = callMap.get(number) + totalDuration;
		    		callMap.put(number, total);
		    	}
		    	if(callMap.get(number) > maxDuration) {
		    		
		    		maxDuration = callMap.get(number);
		    		maxCallUser = number;
		    	}
		    	
	    	} else {
	    		break;
	    	}
			
			
			
			
		}
		
		long cost = getTotalCost(maxCallUser, costMap);
		
		return (int) (long) cost;
			
        
    }
	
	
	
	private static long getTotalCost(String maxCallUser, Map<String, Long> costMap) {
		long cost = 0;
		
		for (Map.Entry<String, Long> entry : costMap.entrySet())
		{
		    //System.out.println(entry.getKey() + "/" + entry.getValue());
		    if(! entry.getKey().equals(maxCallUser)) {
		    	cost+=entry.getValue();
		    }
		}
		
		
		
		return cost;
	}

	private static long getCallCost(long totalDuration) {
		
		long cost= 0l;
		
		if(totalDuration<300) {
			cost = totalDuration * 3;
		} else {
			
			long minutes = totalDuration / 60;
			long seconds = totalDuration % 60;
			
			if(seconds > 0) {
				minutes++;
				
			}
			
			cost = minutes * 150;
		}
		
		
		
		return cost;
	}

}

public class PayBill {
	
	
public static void main(String[] args) {
		
		
		
    	
    	
		
	}



}
