class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        Arrays.sort(arr);
        int l=0,r=arr.length-1;
        while(l<r)
        {
            int sum=arr[l]+arr[r];
            if(sum==target)
                return true;
            if(sum>target)
                r--;
            if(sum<target)
                l++;
        }
        return false;
    }
}