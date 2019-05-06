package cn.itcast.test;
import cn.itcast.junit.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    /**
     * 测试add方法
     */
    @Test
    public void testAdd(){
        Calculator calculator = new Calculator();
        int result = calculator.add(1,2);
        Assert.assertEquals(3,result);
    }
}
