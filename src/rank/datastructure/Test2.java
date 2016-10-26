package rank.datastructure;

public class Test2 {

	
	public static void main(String[] args) {
		
		int [] arr ={  1, 4,-1, 3, 2};
		
		
		Solution sol = new Solution();
		System.out.println(sol.solution(arr));
		
		
		
	}
}

class Solution {
    public int solution(int[] A) {
    	
    	if(A.length==0){
    		return 0;
    	}
    	int count =0;
    	int i =0;
    	while(A[i] !=-1) {
    		
    		i = A[i];
    		count++;
    		
    	}
    	
    	    	
    	return count+1;
    	
    }
}

