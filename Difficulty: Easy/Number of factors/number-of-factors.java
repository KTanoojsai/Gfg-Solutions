class Solution {
    static int countFactors(int n) {
        // code here
        int count=1;
        if(n<1)
            return 0;

        for(int i=2;i<=n;i++)
            {
                if(n>=2 && n%i==0)
                {
                    count++;
                }
            }
        return count;
    }
}