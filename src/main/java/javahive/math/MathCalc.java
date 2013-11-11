package javahive.math;

import javax.script.ScriptException;
import java.math.BigDecimal;

/**
 * Created by mgr on 11.11.13.
 */
public interface MathCalc {

    public class WrongTypeException extends Exception {
        public WrongTypeException(String s) {
            super(s);
        }
    }

    BigDecimal calculate(String expression) throws ScriptException, WrongTypeException;
}
