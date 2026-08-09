class Solution {
    public int commonDivisor(int a, int b) {
        // code here
        int count =0;
            for(int i=1;i<=Math.min(a,b);i++)
            {
                if((a%i==0)&&(b%i==0))
                    count++;
            }
            return count;

    }
}