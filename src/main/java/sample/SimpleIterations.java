package sample;

import edu.hws.jcm.data.Expression;
import edu.hws.jcm.data.Parser;
import edu.hws.jcm.data.Variable;
import org.apache.commons.math3.util.Precision;
import org.mariuszgromada.math.mxparser.*;

import static java.lang.Math.abs;

/**
 * This class is used for counting by method of simple iterations
 */
public class SimpleIterations {
    /**
     * This method is used for counting phi(x)
     * @param expression
     * @param maximum
     * @param minimum
     * @param variable
     * @return
     */
   public static double fi(String expression, Double maximum, Double minimum, Double variable) {
        Double c = 2 / (maximum + minimum);
        return variable - (c * f(expression, variable));
    }

    /**
     * This method is used to calculate our function
     * @param expression
     * @param variable
     * @return
     */
   public static double f(String expression, Double variable) {
        String line = "x= " + variable.toString();
        Argument var = new Argument(line);
        org.mariuszgromada.math.mxparser.Expression e = new org.mariuszgromada.math.mxparser.Expression(expression, var);
        return e.calculate();
    }

    /**
     * This method is used for counting by method of simple iterations
     * @param firstfunction
     * @param limA
     * @param limB
     * @param eps
     * @return - return out result of counting
     */
    public  static String simpleiterations(String firstfunction, Double limA, Double limB, double eps) {
        Variable xVar = new Variable("x");
        edu.hws.jcm.data.Parser parser = new edu.hws.jcm.data.Parser(Parser.STANDARD_FUNCTIONS);
        parser.add(xVar);

        Expression expr = parser.parse(firstfunction);
        System.out.println(expr.derivative(xVar));
        String test = expr.derivative(xVar).toString();

        Double firstlimit = Double.valueOf(limA);

        Double secondlimit = Double.valueOf(limB);

        Double nullLimit = Double.valueOf(0);

        double Max = 0;
        if (f(test, firstlimit) > f(test, nullLimit) && f(test, firstlimit) > f(test, secondlimit)) {
            Max = f(test, firstlimit);
        }
        if (f(test, firstlimit) < f(test, nullLimit) && f(test, nullLimit) > f(test, secondlimit)) {
            Max = f(test, nullLimit);
        }
        if (f(test, secondlimit) > f(test, firstlimit) && f(test, secondlimit) > f(test, nullLimit)) {
            Max = f(test, secondlimit);
        }
        double min = 0;
        if (f(test, firstlimit) < f(test, nullLimit) && f(test, firstlimit) < f(test, secondlimit)) {
            min = f(test, firstlimit);
        }
        if (f(test, firstlimit) > f(test, nullLimit) && f(test, nullLimit) < f(test, secondlimit)) {
            min = f(test, nullLimit);
        }
        if (f(test, secondlimit) < f(test, firstlimit) && f(test, secondlimit) < f(test, nullLimit)) {
            min = f(test, secondlimit);
        }

        Double x0 = firstlimit;
        int n = 0;
        Double answer = 0.0;
        for (; n < 20000; n++) {
            Double x1 = fi(firstfunction, Max, min, x0);

            if (abs(x1 - x0) < eps) {
                break;
            }
            x0 = x1;
            answer = (x0 + x1) / 2;
        }
       return "Answer: " + Precision.round(answer, 4) + " n = " + n;
    }
}

