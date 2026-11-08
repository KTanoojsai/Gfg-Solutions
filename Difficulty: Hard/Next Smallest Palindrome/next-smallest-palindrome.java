import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> nextPalindrome(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();

        boolean all9s = true;
        for (int x : arr) {
            if (x != 9) {
                all9s = false;
                break;
            }
        }

        if (all9s) {
            ans.add(1);
            for (int i = 0; i < n - 1; i++) {
                ans.add(0);
            }
            ans.add(1);
            return ans;
        }

        int[] res = arr.clone();
        int mid = n / 2;
        int i = mid - 1;
        int j = (n % 2 == 0) ? mid : mid + 1;

        while (i >= 0 && res[i] == res[j]) {
            i--;
            j++;
        }

        boolean smaller = false;
        if (i < 0 || res[i] < res[j]) {
            smaller = true;
        }

        while (i >= 0) {
            res[j] = res[i];
            i--;
            j++;
        }

        if (smaller) {
            int carry = 1;
            if (n % 2 == 1) {
                res[mid] += carry;
                carry = res[mid] / 10;
                res[mid] %= 10;
                i = mid - 1;
                j = mid + 1;
            } else {
                i = mid - 1;
                j = mid;
            }

            while (i >= 0 && carry > 0) {
                res[i] += carry;
                carry = res[i] / 10;
                res[i] %= 10;
                res[j] = res[i];
                i--;
                j++;
            }
        }

        for (int val : res) {
            ans.add(val);
        }

        return ans;
    }
}