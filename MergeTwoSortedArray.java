//009.MergeTwoSortedArray.java
class Solution {
    public void merge(int[] arr1, int m, int[] arr2, int n) {
        int l=m+n-1;
        while(m > 0 && n > 0)
        {
            if(arr1[m-1] > arr2[n-1])
            {
                arr1[l] = arr1[m-1];
                m--;
                l--;
            }
            else
            {
                arr1[l] = arr2[n-1];
                l--;
                n--;
            }
        }
        while(n-1>= 0)
        {
            arr1[l] = arr2[n-1];
            l--;
            n--;
        }

    }
}
