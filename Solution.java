package javaPractice;

class Solution{
	
	//checking the sum of values in an array element which equals to target value and returns the corresponding index value.  
	public static int[] twoSum(int[] nums,int target){
		int[] index=new int[2];
		for(int i=0;i<nums.length;i++){
			for(int j=0;j<nums.length;j++){
				if(i!=j){
					if(nums[i]+nums[j]==target){
						index[0]=i;
						index[1]=j;
						break;
					}
			}
		}
	}
		return index;
		
}
public static void main(String args[]) {
	int nums[]={3,2,4};
	int target=6;

	int[] result=	twoSum(nums,target);
	for(int result1:result) {
		System.out.print(result1);
		System.out.println();	
	}
	
	}
	}

