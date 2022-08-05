//method :01
class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        while(left < right-1){
            int mid = left + (right-left)/2;
            if(nums[mid] == target){
                return mid;
            } 
            if(nums[left] < nums[mid]){
                if(nums[left] <= target && nums[mid] > target){
                    right = mid-1;
                } else {
                    left = mid+1;
                }
                
            } else {
                if(nums[mid] < target && nums[right] >= target){
                    left = mid+1;
                } else {
                right = mid-1;
                }
            } 
        }
        if(nums[left] == target){
            return left;
        } else if(nums[right] == target){
            return right;
        }
        return -1;
    }
}



//method 02

class Solution {
    public int search(int[] nums, int target) {
          int pivot = findPivot(nums);
        
        if (pivot == -1) { // means array is sorted so apply binary search
            return binarySearch(nums, target, 0 , nums.length - 1);
        }

        if (nums[pivot] == target) {  // if pivot index is target
            return pivot;
        }

        if (target >= nums[0]) { 
            return binarySearch(nums, target, 0, pivot - 1);
        }

        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while(start<= end){
            int mid=(start+ end)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]>target){
                 end=mid-1;
            }else{
                start=mid+1;
            }

        }
        return -1;
    }


    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
        
      
    }
