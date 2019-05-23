package cn.itcast.demo;

/**
 * @author : huajuan
 * create at : 2019-05-22 00:20
 * description :
 * remark :
 * @program: basics
 **/
public enum Color {
    RED,GREEN,BLUE;
    private int color;
    Color(){}
    private Color(int color){
        this.color = color;
    }
}
