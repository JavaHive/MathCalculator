package javahive.math;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * Created by mgr on 11.11.13.
 */
public class MathCalcTest {
    @Test
    public void testCalculate() throws Exception {
        //given
        String expression="2+2";
        //when
        BigDecimal ret=new MathCalc().calculate(expression);
        //then
        Assert.assertEquals(4d, ret);
    }
}
