class Solution {
    public String findDifferentBinaryString(String[] nums) 
    {
        String n = "";
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i].charAt(i)=='0')
                n+='1';
            else
                n+='0';
        }

        return n;
        
    }
}