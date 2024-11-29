package Solved;

public class ContainersWithMostWater {
    //solved
    public static void main(String []args)
    {
        System.out.println(maxArea(new int[]{4,2,5,8,9,6,3,2,1,4,2}));
    }

    public static int maxArea(int []containers)
    {
        int left = 0 ;
        int right = containers.length - 1;

        int maxWater = 0;

        while(left < right)
        {
            int width = right - left;
            int height = Math.min(containers[left],containers[right]);
            int currentWater = width * height;

            maxWater = Math.max(currentWater , maxWater);

            if ((containers[left] < containers[right])) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;

    }
}
