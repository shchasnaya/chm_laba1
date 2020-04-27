package sample;

import edu.hws.jcm.data.Expression;
import edu.hws.jcm.data.Parser;
import edu.hws.jcm.data.Variable;
import org.apache.commons.math3.util.Precision;
import org.mariuszgromada.math.mxparser.Argument;

/**
 * This method is used for counting by Newton's method
 */
public class MethodOfNewton {
    /**
     * This method is used for counting by Newton's method
     * @param equation
     * @param border1
     * @param border2
     * @param eps
     * @return
     */
    public static String Newton(String equation, Double border1, Double border2, Double eps) {
        Variable xVar = new Variable("x");
        edu.hws.jcm.data.Parser parser = new edu.hws.jcm.data.Parser(Parser.STANDARD_FUNCTIONS);
        parser.add(xVar);

        Expression derivative1 = parser.parse(equation);
        String derivative1_string = derivative1.derivative(xVar).toString();
        System.out.println(derivative1_string);
        Expression derivative2 = parser.parse(derivative1_string);
        String derivative2_string = derivative2.derivative(xVar).toString();
        System.out.println(derivative2_string);

        double x0 = 0;
        if (f(equation, border1) * f(derivative2_string, border1) > 0)
        {
            x0 = border1;
        } else if (f(equation, border2) * f(derivative2_string, border2) > 0) {
            x0 = border2;
        } else {
            Errors.display("Error", "Solution is impossible");

        }
        int n = 0;
        double x1 = 10000;
        while (n < 20000) {
            x1 = x0 - (f(equation, x0) / f(derivative1_string, x0));
            n = n + 1;
            if (Math.abs(x1 - x0) < eps) {
                break;
            }
            x0 = x1;

        }
        double answer = (x0 + x1) / 2;
        System.out.println(answer);
        System.out.println(n);
        return "Answer: " + Precision.round(answer, 4) + " n = " + n;
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
