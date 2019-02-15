/**
*@author AEK
*@version 1.0
*/
import java.lang.Math;
public class Formulas {
  /**
  *Returns the distance between two points who are passed in as their individual x and y components
  *@param x1 The x component of the first point
  *@param x2 The y component of the first point
  *@param y1 The x component of the second point
  *@param y2 The y component of the second point
  *@return The distance between the two points
  */
  double distance(double x1, double x2, double y1, double y2) {
    return Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1), 2));
  }
  
  
}
