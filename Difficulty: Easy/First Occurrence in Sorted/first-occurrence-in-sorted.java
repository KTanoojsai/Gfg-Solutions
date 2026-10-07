class Solution {
    public int firstSearch(int[] arr, int k) {
        // Code Here
        int l=0,h=arr.length-1,res=-1;
        while(l<=h)
        {
            int m=l+(h-l)/2;
            if(k==arr[m])
            {
                res=m;
                h=m-1;
            }
            else if(k<arr[m])
                h=m-1;
            else 
                l=m+1;
        }
        return res;
    }
}