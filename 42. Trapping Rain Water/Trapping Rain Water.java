// Best Approach : 2 Pointers (This approach)
class Solution {
    public int trap(int[] height) {
        int n = height.length;
        
        // 2-pointers:
        int s = 0;
        int e = n-1;
        
        int leftMax = 0;
        int rightMax = 0;
        int trapped = 0;
        
        // array traversal
        while(s<e){
            if(height[s] <= height[e]){
                if(height[s] >= leftMax) leftMax = height[s];
                else trapped += leftMax - height[s]; 
                s++;
            }
            else{
                if(height[e] >= rightMax) rightMax = height[e];
                else trapped += rightMax - height[e];
                e--;
            }
        }
        return trapped;
    }
}

// Worst Approach : O(n2) -> Nested Loop (finding leftmax and right max for every index)
// Time Complexity : O(n) 
// Space Complexity : O(1)

// method 02
public int trap(int[] height) {

	int[] left = new int[height.length];
	int[] right = new int[height.length];

	// filling max left for all height
	int currentMax = Integer.MIN_VALUE;

	for (int h = 0; h < height.length; h++) {

		if (height[h] > currentMax) {
			currentMax = height[h];
		}
		left[h] = currentMax;
	}

	currentMax = Integer.MIN_VALUE;
	// right filling
	for (int h = height.length - 1; h >= 0; h--) {

		if (height[h] > currentMax) {
			currentMax = height[h];
		}
		right[h] = currentMax;
	}

	int total = 0;

	// computing total rains
	for (int i = 0; i < height.length; i++) {
		int capacity = Math.min(left[i], right[i]);
		total += capacity - height[i];
	}

	return total;
}
