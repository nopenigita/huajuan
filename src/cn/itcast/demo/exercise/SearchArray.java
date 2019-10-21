package cn.itcast.demo.exercise;

/**
 * 二分法
 */
public class SearchArray {
    public static void main(String[] args) {
        int[] ints = new int[]{};
        search(ints,1,10,5);

    }

    @SuppressWarnings("all")
    public static int search(int[] source,int start,int end,int key){
        //取中间值
        int mid = (end - start)/2 + start; //int mid = 5  //(10-1)/2 + 1;
        //如果中间值刚好是要查找的值
        //if(source[5] == 4){}
        if(source[mid] == key){
            return mid;
        }
        if(start >= end){
            return -1;
        }else if(key > source[mid]){ //如果4大于数组下标5的值
            return search(source,mid+1,end,key); //（source,6,10,4）
        }else if(key < source[mid]){
            return search(source,start,mid-1,key);
        }
        return -1;
    }
}
