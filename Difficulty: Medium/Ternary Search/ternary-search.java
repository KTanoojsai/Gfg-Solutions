class Solution {
    public boolean ternarySearch(int[] arr, int x) {
        // code here
        int n=arr.length;
        int l=0,h=n-1;
        while(l<=h)
        {
            int m1=l+(h-l)/3;
            int m2=h-(h-l)/3;
            if(x==arr[m1])
                return true;
            else if(x==arr[m2])
                return true;
            else if(x<arr[m1])
                h=m1-1;
            else if(x>arr[m2])
                l=m2+1;
            else
            {
                l=m1+1;
                h=m2-1;
            }
        }
        return false;
    }
}