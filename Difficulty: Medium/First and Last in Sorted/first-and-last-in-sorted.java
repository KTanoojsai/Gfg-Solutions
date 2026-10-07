class Solution {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        int firstpos=first(arr,x);
        if(firstpos==-1) return new ArrayList<>(Arrays.asList(-1,-1));
        int lastpos=last(arr,x);
        return new ArrayList<>(Arrays.asList(firstpos,lastpos));
    }
    public static int first(int arr[],int x)
    {
        int l=0,r=arr.length-1,res=-1;
        while(l<=r)
        {
            int m=l+(r-l)/2;
            if(x==arr[m])
            {
                res=m;
                r=m-1;
            }
            else if(x<arr[m])
                r=m-1;
            else 
                l=m+1;
        }
        return res;
    }
    public static int last(int arr[],int x)
    {
        int l=0,r=arr.length-1,res=-1;
        while(l<=r)
        {
            int m=l+(r-l)/2;
            if(x==arr[m])
            {
                res=m;
                l=m+1;
            }
            else if(x<arr[m])
                r=m-1;
            else 
                l=m+1;
        }
        return res;
    }
}
