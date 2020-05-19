package cn.itcast.demo.demo;

/**
 * @author : huajuan
 * create at : 2019-10-09 22:35
 * description :
 * remark : 练习数组元素反转 掌握定义两个索引
 * @program: basics
 **/
public class ArrayDemo{
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        for (int min = 0, max = array.length - 1; min < max ; min++, max--){
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    public static Object method(double d){
        return null;
    }
}
