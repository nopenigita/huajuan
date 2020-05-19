package cn.itcast.demo.interview;

/**
 * @author : Hiccup
 * create at : 2020/4/24 12:26 上午
 * description : 使用枚举实现单例
 * remark :
 **/
public enum SingleEnum {
    instance
}

class SingleEnumDemo{
    public static void main(String[] args) {
        SingleEnum s1 = SingleEnum.instance;
        SingleEnum s2 = SingleEnum.instance;
        System.out.println(s1 == s2);
    }
}
