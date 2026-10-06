class Solution {
    public static int binarySearchAL(ArrayList<Integer> list, int k) {
        // Your code here
        int n=list.size();
        int l=0,h=n-1;
        while(l<=h)
        {
            int m=l+(h-l)/2;
            if(k==list.get(m))
                return m;
            else if(k<list.get(m))
                h=m-1;
            else 
                l=m+1;
        }
        return -1;

        // If k in arr return 1, else return -1
    }
}