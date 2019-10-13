package cn.itcast.demo.exercise;

/**
 * @author : huajuan
 * create at : 2019-05-12 16:07
 * description :
 * remark :
 * @program: basics
 **/
public class Person {
    private String name;
    private int age;
    private String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /**
     * 先比较地址,再判断是否是空,再判断类型..
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        // 先判断两个对象是否是同一个地址
        if (this == o) {
            return true;
        }
        // 判断传入的对象是否是空,如果是空,肯定不一样.
        if (null == o) {
            return false;
        }
        // 如果不是同一个类型
        if (this.getClass() != o.getClass()) {
            return false;
        }
        // 如果不是同一个类型
        if (!(o instanceof Person)) {
            return false;
        }
        // 继续判断 向下转型
        Person person = (Person) o;
        if (this.name.equals(person.name) && this.sex.equals(person.sex)) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + sex.hashCode();
    }
}
