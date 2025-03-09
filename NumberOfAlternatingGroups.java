class NumberOfAlternatingGroups {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int concatinatedSize = colors.length + k - 1 ;//circular array sizee till which last element of circular array comes
        int []concatinatedArray = new int[concatinatedSize];//array for storing concatinated array such as if array is 0 1,2,3 and k is 3 then the last subarray with k length is 3 0 1 henceforth we can make the array like as 0 1 2 3 0 1 

        System.arraycopy(colors,0,concatinatedArray,0,colors.length); // here we are copying the whole colors array into concatinatedArray from 0 index to colors.length exclusive
        System.arraycopy(colors,0,concatinatedArray,colors.length,k-1);//here we are copying colors from colors.length to k-1 exclusive into concatinatedArray

        int count = 0 ; //count the subarrays which are satisying the given conditions
        int left = 0 ; //starting point for subarray

        for(int right = 0 ; right < concatinatedArray.length ; right++ ){
            if(right > 0  && concatinatedArray[right] == concatinatedArray[right-1])//here if we encounter the same color then we move the starting point to current point that is right 
                left = right;
            if(right - left + 1 >= k )//if we encounter the size of subarray greater than or equal to k then we increase the subarray counter
                count++;
        }

        return count; // return the total number of subarrays
    }
}
