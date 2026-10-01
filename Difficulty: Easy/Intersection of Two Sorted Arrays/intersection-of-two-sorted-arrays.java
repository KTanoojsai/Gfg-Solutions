class Solution {
    static ArrayList<Integer> intersection(int arr1[], int arr2[]) {
        // code herea
        ArrayList<Integer> al=new ArrayList<>();
        int l=0,r=0;
        while(l<arr1.length && r<arr2.length)
        {
            if(l>0 && arr1[l]==arr1[l-1])
            {
                l++;
                continue;
            }
            if(r>0 && arr2[r]==arr2[r-1])
            {
                r++;
                continue;
            }
            if(arr1[l] == arr2[r])
            {
                al.add(arr1[l]);
                l++;
                r++;
            }
            else if(arr1[l]<arr2[r])
            {
                l++;
            }
            else
            {
                r++;
            }
        }
        return al;
    }
}
