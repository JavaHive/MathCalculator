package javahive.math;

import lombok.extern.slf4j.Slf4j;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.math.BigDecimal;

/**
 * Created by mgr on 11.11.13.
 */

@Slf4j
public class MathCalcImpl implements MathCalc {

    @Override
    public BigDecimal calculate(String expression) throws ScriptException, WrongTypeException {
        ScriptEngineManager factory = new ScriptEngineManager();
        // create a JavaScript engine
        ScriptEngine engine = factory.getEngineByName("JavaScript");
        try {
            // evaluate JavaScript code from String
            Object result = engine.eval(expression);
            if (result instanceof Number) {
                Number n = (Number) result;
                return new BigDecimal(n.toString());
            } else {
                throw new WrongTypeException("script should return Bigdecimal, but it didn't");
            }
        } catch (ScriptException ex) {
            throw (ex);
        }
    }
}
