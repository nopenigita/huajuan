package cn.itcast.demo;

import org.junit.Test;

/**
 * @author : huajuan
 * create at : 2019-05-22 00:17
 * description :
 * remark :
 * @program: basics
 **/
public class EnumDemo {

    public static final int RED = 0x1;
    public static final int GREEN = 0x2;
    public static final int BLUE = 0x3;
//    public int color;

    @Test
    public void test(){
//        color = RED;
//        color = 4; //让color的值必须是三种颜色的其中一种

    }

    public Color colorEnum;
    @Test
    public void test2(){
        colorEnum = Color.RED;
        colorEnum = Color.BLUE;
        colorEnum = Color.GREEN;
        System.out.println(colorEnum.name());
        System.out.println(colorEnum.ordinal());
        System.out.println(colorEnum.toString());
    }
}
