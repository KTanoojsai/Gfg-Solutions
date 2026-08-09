class Solution {
    public int numOfDiv(int l, int r, int a, int b) {
        // code here
        int count=0;
        for(int i=l;i<=r;i++)
        {
            if(i%a==0||i%b==0)
                count++;
        }
        return count;
    }
}