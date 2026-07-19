package Array.Day_5;
// container with most water(leetcdoe 11) (GFG practice)
public class h {
    public int maxArea(int[] height) {
        if (height.length<=1)return 0;
        int maxArea =Integer.MIN_VALUE;
        int i =0;
        int j =height.length-1;
        while (i<j)
        {
            int area =(j-i)*Math.min(height[i],height[j]);
            if (height[i]<height[j])i++;
            else j--;
            maxArea =Math.max(area,maxArea);
        }
        return maxArea;
    }
    public static void main(String[] args) {

    }

}

