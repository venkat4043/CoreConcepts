package com.ram.core;

class Solution {
	
    public int maxArea(int[] height) {
        
        int result = 0;
        
        for(int i=0; i<height.length; i++) {
        	for(int j=i+1; j<height.length; j++) {
        		result = Math.max(result, Math.min(height[i], height[j]) * (j - i));
        		//System.out.println(result);
        	}
        }
        		return result;  
        
    }
	
//	public int maxArea(int[] height) {
//        int maxarea = 0;
//        for (int i = 0; i < height.length; i++)
//            for (int j = i + 1; j < height.length; j++)
//                maxarea = Math.max(maxarea, Math.min(height[i], height[j]) * (j - i));
//        return maxarea;
//    }
    
    public static void main(String[] args) {

    	Solution solution = new Solution();
    	System.out.println(solution.maxArea(new int[] {1,8,6,2,5,4,8,3,7}));

    }
}
