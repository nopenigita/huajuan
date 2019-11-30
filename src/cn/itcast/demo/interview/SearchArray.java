package cn.itcast.demo.interview;

import java.util.Arrays;

/**
 * @author huajuan
 * 二分法
 */
public class SearchArray {
    public static void main(String[] args) {
        int[] ints = new int[]{1,2,3,4,5,6,7,8,9,10};
        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));
        System.out.println(search(ints, 3));

    }

    @SuppressWarnings("all")
    public static int search(int[] source, int value){
        int low = 0;
        int high = source.length - 1;
        while (low <= high){
            int mid = (low + high)/2;
            if (value == source[mid]){
                return mid;
            }
            if (value > source[mid]){
               low = mid + 1;
            }
            if (value < source[mid]){
                high = mid - 1;
            }
        }
        return -1;
    }
}
