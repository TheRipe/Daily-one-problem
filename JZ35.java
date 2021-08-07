public class Solution {
    public int res;
    public int InversePairs(int[] array) {
        MergeSort(array, 0, array.length - 1);
        return res;
        
    }
    public void MergeSort(int[] array, int start, int end) {
        if (start >= end) return;
        int mid = (start + end) / 2;
        MergeSort(array, start, mid);
        MergeSort(array, mid + 1, end);
        Merge(array, start, mid, end);
    }
    public void Merge(int[] array, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int k = 0;
        int i = start;
        int j = mid + 1;
        while (i <= mid && j <= end) {
            if (array[i] < array[j]) {
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
                res = (res + (mid - i + 1)) % 1000000007;
            }
        }
        
             while (i <= mid) {
                 temp[k++] = array[i++];
             }
             while (j <= end) {
                 temp[k++] = array[j++];
             }
            int l = 0;
                while (l < k) {
                    array[start++] = temp[l++];
                }
               }
          
    
}
