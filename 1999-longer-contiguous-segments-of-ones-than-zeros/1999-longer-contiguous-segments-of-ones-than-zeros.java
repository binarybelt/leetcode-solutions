class Solution {
    public boolean checkZeroOnes(String s) {
        int maxZ = 0;
        int currZ = 0;
        int maxO = 0;
        int currO = 0;

        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == '1')
            {
                currZ = 0;
                currO++;
                maxO = Math.max(maxO, currO);
            }

            else
            {
                currZ++;
                currO = 0;
                maxZ = Math.max(maxZ, currZ);
            }

        }

        return maxO > maxZ;
        
    }
}