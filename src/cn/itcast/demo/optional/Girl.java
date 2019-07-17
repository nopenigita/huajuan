package cn.itcast.demo.optional;

/**
 * @author : huajuan
 * create at : 2019-07-17 21:36
 * description :
 * remark :
 * @program: basics
 **/
public class Girl {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                '}';
    }
}
