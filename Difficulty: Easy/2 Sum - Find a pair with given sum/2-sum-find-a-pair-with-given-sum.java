class Solution {
    public List<Integer> twoSum(int arr[], int target) {
        // code here
        Arrays.sort(arr);
        ArrayList<Integer> al=new ArrayList<>();
        int l=0,r=arr.length-1;
        while(l<r)
        {
            int sum=arr[l]+arr[r];
            if(sum==target)
            {
                
                al.add(arr[l]);
                al.add(arr[r]);
                break;
            }
            if(sum>target)
                r--;
            if(sum<target)
                l++;
        }
        return al;
    }
}