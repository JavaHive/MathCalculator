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
public class MathCalc {
    BigDecimal calculate(String expression) {
        ScriptEngineManager factory = new ScriptEngineManager();
        // create a JavaScript engine
        ScriptEngine engine = factory.getEngineByName("JavaScript");
        try {
            // evaluate JavaScript code from String
            Object  o = engine.eval(expression);
        } catch (ScriptException ex) {
            //log.t
        }
        return null;
    }
}
