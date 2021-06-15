class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        if (arr[i] > arr[i + 1]) {
            return i;
        }
        if (arr[j] > arr[j - 1]) {
            return j;
        }
        while (i < j) {
            int mid = i + (j - i) / 2;
            if (arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[mid - 1] < arr[mid] && arr[mid] < arr[mid + 1]) {
                i = mid;
            } else {
                j = mid;
            }
        }
        return i;
    }
}
