package javahive.math;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * Created by mgr on 11.11.13.
 */
public class MathCalcTest {

    private MathCalc mathCalc = new MathCalcImpl();

    @Test
    public void testCalculate2plus2() throws Exception {
        //given
        String expression="2+2";
        //when
        BigDecimal ret = mathCalc.calculate(expression);
        //then
        Assert.assertEquals(BigDecimal.valueOf(4.0), ret);
    }

    @Test
    public void testCalculate2plus2multiply2() throws Exception {
        //given
        String expression = "2+2*2";
        //when
        BigDecimal ret = mathCalc.calculate(expression);
        //then
        Assert.assertEquals(BigDecimal.valueOf(6.0), ret);
    }

    @Test(expected = MathCalc.WrongTypeException.class)
    public void shouldThrowException() throws Exception {
        //given
        String expression = "'a'+'b'";
        //when
        BigDecimal ret = mathCalc.calculate(expression);
        //then
        Assert.assertEquals(BigDecimal.valueOf(6.0), ret);
    }

}
