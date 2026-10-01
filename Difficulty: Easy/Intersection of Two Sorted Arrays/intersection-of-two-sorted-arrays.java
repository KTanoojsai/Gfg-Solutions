class Solution {
    ArrayList<Integer> intersection(int[] a, int[] b) {
        // code here
        Arrays.sort(a);
        Arrays.sort(a);
        int l=0,r=0;
        ArrayList<Integer> al=new ArrayList<>();
        while(l<a.length && r<b.length)
        {
            if(l>0 && a[l]==a[l-1])
            {
                l++;
                continue;
            }
            if(r>0 && b[r]==b[r-1])
            {
                r++;
                continue;
            }
            if(a[l]==b[r])
            {
                al.add(a[l]);
                l++;
                r++;
            }
                    else if(a[l]<b[r])
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