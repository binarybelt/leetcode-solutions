class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) 
    {
        int L = 0;
        int R = arr.length - k;
        while (L < R)
        {
            int m = (int)Math.floor((R+L)/2);
            if (x-arr[m] > arr[m+k] - x)
                L = m + 1;
            else
                R = m;
        }

        List<Integer> result = new ArrayList<>(k);
        for (int i = L; i < L + k; i++)
            result.add(arr[i]);
        
        return result;
        
    }
}