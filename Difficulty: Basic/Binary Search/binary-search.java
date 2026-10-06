class Solution {
    public boolean binarySearch(int[] arr, int k) {
        // code here
        int l=0,h=arr.length-1;
        while(l<=h)
        {
            int m=l+(h-l)/2;
            if(k==arr[m])
                return true;
            else if(k<arr[m])
                h=m-1;
            else
                l=m+1;
        }
        return false;
    }
}