package sample;

import edu.hws.jcm.data.Expression;
import edu.hws.jcm.data.Parser;
import edu.hws.jcm.data.Variable;
import org.apache.commons.math3.util.Precision;
import org.mariuszgromada.math.mxparser.Argument;

import static java.lang.Math.abs;

/**
 * This method is used for counting by chord method
 */
public class MethodChord {
    /**
     * This method is used for counting by chord method
     * @param firstfunction
     * @param limitA
     * @param limitB
     * @param e
     * @return
     */
    public static String method_chord(String firstfunction, Double limitA, Double limitB, Double e) {
        Variable xVar = new Variable("x");
        edu.hws.jcm.data.Parser parser = new edu.hws.jcm.data.Parser(Parser.STANDARD_FUNCTIONS);
        parser.add(xVar);

        double x_next = 0;
        int n = 0;
        double tmp;
        double x_curr = limitA;
        double x_prev;
        x_prev = limitB;
        do {
            tmp = x_next;
            x_next = x_curr - f(firstfunction, x_curr) * (x_prev - x_curr) / (f(firstfunction, x_prev) - f(firstfunction, x_curr));
            x_prev = x_curr;
            x_curr = tmp;
            n++;
        } while (abs(x_next - x_prev) > e && n < 20000);
        return "Answer: " + Precision.round(x_next, 4) + " n = " + n;
    }

    /**
     * This method is used to calculate our function
     * @param expression
     * @param variable
     * @return
     */
    static double f(String expression, Double variable) {
        String line = "x= " + variable.toString();
        Argument var = new Argument(line);
        org.mariuszgromada.math.mxparser.Expression e = new org.mariuszgromada.math.mxparser.Expression(expression, var);
        return e.calculate();
    }
}
