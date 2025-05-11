class Solution {
    public int maxArea(int[] height) {
        // have a left and right pointer
        // Calculate the area, the current area for entry left to entry right > maxarea, update max area
        // if height[left]>height[right] right--
        // other wise left++

        int maxArea=0 ;
        int left=0 ;
        int right =height.length-1 ;

        while(right>left){
            int area =calculateArea(height[left],height[right], left, right) ;
            if(area>maxArea){
                maxArea=area ;
            }
            if(height[left]>height[right]){
                right-- ;
                
            }
            else if(height[left]<height[right]){
                left++ ;
            
            }else{
                right-- ;
            }
            

        }
        return maxArea ;
    }

    public int calculateArea(int height1, int height2, int indexOne, int indexTwo){
        int area ;

        int height= Math.min(height1,height2) ;
        area=height*(indexTwo-indexOne) ;

        return area ;
    }
}
