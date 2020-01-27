/**
*@author AEK
*@version 1.1.0
*/

public class Formulas {
  /**
  *Returns the distance between two points who are passed in as their individual x and y components
  *@param x1 The x component of the first point
  *@param x2 The y component of the first point
  *@param y1 The x component of the second point
  *@param y2 The y component of the second point
  *@return The distance between the two points
  */
  public static double DistanceLnr(double x1, double x2, double y1, double y2) {
    return Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1), 2));
  }

  /**
   *
   * @param A Coefficient behind factor of second degree
   * @param B Coefficient behind factor of first degree
   * @param C Coefficient behind factor of no degree
   * @return the solution(s) of the quadratic equation
   * @throws ArithmeticException if there are no solutions or if A was 0 (non-quadratic)
   *tHE qUadrAtiC fORMula is NEgATIvE A, PluS oR miNUs The squaRe ROOT Of B sQuARed mINUs FouR a c. ALl OvER TWO a
   */
  public static double[] QuadraticFormula(double A, double B, double C) throws ArithmeticException{
    double[] Solutions = new double[2];
    Solutions[0] = (-B+Math.sqrt(Math.pow(B,2)-4*A*C))/(2*A);
    Solutions[1] = (-B-Math.sqrt(Math.pow(B,2)-4*A*C))/(2*A);
    return Solutions;
  }

  /**
  * Calculates the factorial of the passed in number using recursion
  * @param i Number to find the factorial of
  * @return The factorial of the number passed in
  */
  public static int fact(int i) {
   if (i == 1)
    return 1;
   else
    return fact(i-1)*i;
  }



}
