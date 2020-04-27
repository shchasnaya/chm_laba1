package sample;

import edu.hws.jcm.data.Expression;
import edu.hws.jcm.data.Parser;
import edu.hws.jcm.data.Variable;
import org.apache.commons.math3.util.Precision;
import org.mariuszgromada.math.mxparser.Argument;

import static java.lang.Math.abs;

/**
 * This method is used for counting by dichotomy method
 */
public class Dichotomy {
    /**
     * This method is used to calculate our function
     * @param expression
     * @param variable
     * @return
     */
    static double f(String expression, Double variable) {
        String line = "x = " + variable.toString();
        Argument var = new Argument(line);
        org.mariuszgromada.math.mxparser.Expression e = new org.mariuszgromada.math.mxparser.Expression(expression, var);
        return e.calculate();
    }

    /**
     * This method is used for counting by dichotomy method
     * @param ff
     * @param limA
     * @param limB
     * @param precision
     * @return
     */
    public static String dichotomy(String ff, Double limA, Double limB, double precision) {
        Variable xVar = new Variable("x");
        edu.hws.jcm.data.Parser parser = new edu.hws.jcm.data.Parser(Parser.STANDARD_FUNCTIONS);
        parser.add(xVar);
        Expression expr = parser.parse(ff);
        Double xx = (double) 0, c;
        Double a = limA;
        Double b = limB;
        int n = 0;
        while (abs(a - b) > precision) {
            n += 1;
            c = (a + b) / 2;
            if (f(ff, a) * f(ff, c) <= 0) b = c;
            else {
                a = c;
                xx = (a + b) / 2;
            }
        }
        return "Answer: " + Precision.round(xx, 4) + " n = " + n;
    }
}

