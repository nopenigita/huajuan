package cn.itcast.demo.ChangeParameter;

/**
 * @author : Hiccup
 * create at : 2020/1/28 6:57 下午
 * description :
 * remark :
 **/
public class Demo {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5};
        // 写一个方法,完成数组的遍历 求数组中内容之和
        printArr(arr);
    }

    public static void printArr(int... arr){
        int sum = 0;
        for (int a : arr) {
            sum += a;
        }
        System.out.println(sum);
    }
}
