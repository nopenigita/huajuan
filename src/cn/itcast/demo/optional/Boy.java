package cn.itcast.demo.optional;

/**
 * @author : huajuan
 * create at : 2019-07-17 21:36
 * description :
 * remark :
 * @program: basics
 **/
public class Boy {

    private Girl girl;

    public Boy(Girl girl) {
        this.girl = girl;
    }

    public Boy() {
    }

    public Girl getGirl() {
        return girl;
    }

    @Override
    public String toString() {
        return "Boy{" +
                "girl=" + girl +
                '}';
    }

    public void setGirl(Girl girl) {
        this.girl = girl;
    }
}
