package list_two_sum;


public class Sum {
	 public int[] twoSum(int[] nums, int target) {
		 	int[] dizi = new int[2];
	        for(int i = 0; i<nums.length; i++){
	            for(int j = i+1 ; j<nums.length;j++){
	                if((nums[i]+nums[j]) == target){
	                    
	                	dizi[0]=i;
	                	dizi[1]=j;
	                }
	            }
	        }
	        
			return dizi;
	    }
	 
	 public static void main(String[] args) {
		Sum mySum= new Sum();
		int[] dizi = {1,4,6,3,2,1};
		int[] res =mySum.twoSum(dizi, 2);
		
		for(int i = 0; i<res.length;i++) {
			System.out.println(res[i]);
		}
		
	}
}
