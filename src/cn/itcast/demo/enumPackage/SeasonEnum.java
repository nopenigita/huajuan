package cn.itcast.demo.enumPackage;

/**
 * @author : Hiccup
 * create at : 2020/4/21 5:26 下午
 * description :
 * remark : 1: 私有最终常量 2:私有有参构架 3:get方法
 **/
public enum SeasonEnum {

    // 注意: 多个常量之间用逗号隔开,分号结束
    SPRING("春天","春暖花开"),
    SUMMER("夏天","夏日炎炎");


    private final String name;

    private final String desc;

    private SeasonEnum(String name, String desc){
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }
}
