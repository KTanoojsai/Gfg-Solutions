class Solution {
    static class Element {
        int val;
        int originalIndex;

        Element(int val, int originalIndex) {
            this.val = val;
            this.originalIndex = originalIndex;
        }
    }

    public int[] lowerArray(int[] arr) {
        int n = arr.length;
        int[] count = new int[n];
        Element[] elements = new Element[n];

        for (int i = 0; i < n; i++) {
            elements[i] = new Element(arr[i], i);
        }

        Element[] temp = new Element[n];
        mergeSort(elements, temp, 0, n - 1, count);

        return count;
    }

    private void mergeSort(Element[] arr, Element[] temp, int left, int right, int[] count) {
        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;
        mergeSort(arr, temp, left, mid, count);
        mergeSort(arr, temp, mid + 1, right, count);

        merge(arr, temp, left, mid, right, count);
    }

    private void merge(Element[] arr, Element[] temp, int left, int mid, int right, int[] count) {
        int i = left;
        int j = mid + 1;
        int k = left;
        int rightCounter = 0;

        while (i <= mid && j <= right) {
            if (arr[j].val < arr[i].val) {
                rightCounter++;
                temp[k++] = arr[j++];
            } else {
                count[arr[i].originalIndex] += rightCounter;
                temp[k++] = arr[i++];
            }
        }

        while (i <= mid) {
            count[arr[i].originalIndex] += rightCounter;
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        for (int p = left; p <= right; p++) {
            arr[p] = temp[p];
        }
    }
}