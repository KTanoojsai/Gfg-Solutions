class Solution {
    public static int intersectSize(int a[], int b[]) {
        // Your code here
        HashSet<Integer>h1=new HashSet<>();
        for(int i=0;i<a.length;i++)
        {
            h1.add(a[i]);
        }
        int count=0;
        for(int i=0;i<b.length;i++)
        {
            if(h1.contains(b[i]))
            {
                count++;
            }
        }
        return count;
    }
}