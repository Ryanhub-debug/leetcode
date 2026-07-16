class Solution {
    public int maxArea(int[] height) {
        int left =0;
        int right =height.length-1;
        int w;
        int max=0;
        

        while(left<right)
        {
            if(height[left]>=height[right])
            {
                w= right-left;
               if((height[right])*w > max)
               {
                max = (height[right])*w;
               }
               right--;
            }
            else
            {
                w= right-left;
               if((height[left])*w > max)
               {
                max = (height[left])*w;
               }

            left++;
            }
            
            
        }

        return max;



    }
}