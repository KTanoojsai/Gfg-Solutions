class Solution {
    public ArrayList<Integer> canMakeTriangle(int[] arr) {
        // code here
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<=arr.length-3;i++)
        {
            int a=arr[i];
            int b=arr[i+1];
            int c=arr[i+2];
            if (a + b > c && a + c > b && b + c > a)
                l.add(1);
            else
                l.add(0);
        }
        return l;
    }
}