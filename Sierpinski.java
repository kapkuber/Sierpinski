/*************************************************************************
 *  Compilation:  javac Sierpinski.java
 *  Execution:    java Sierpinski
 *
 *  @author: Kuber Kapuriya
 *
 *************************************************************************/

public class Sierpinski {

    // Height of an equilateral triangle whose sides are of the specified length. 
    public static double height(double length) {

    double height = Math.sqrt((Math.pow(length, 2)) - (Math.pow(length * 0.5, 2)));
    return height;
    }

    // Draws a filled equilateral triangle whose bottom vertex is (x, y) 
    // of the specified side length. 
    public static void filledTriangle(double x, double y, double length) {

    double[] x1 = {x, x + (.5 * length), x - (.5 * length)};
    double[] y1 = {y, y + height(length), y + height(length)};
    StdDraw.filledPolygon(x1, y1);
    
    }

    // Draws a Sierpinski triangle of order n, such that the largest filled 
    // triangle has bottom vertex (x, y) and sides of the specified length. 
    public static void sierpinski(int n, double x, double y, double length) {

	// WRITE YOUR CODE HERE

    filledTriangle(x, y, length);

    if (n == 1) {
        return;
    }
    else {  

        sierpinski(n-1, x, y + height(length), .5*length);  
        sierpinski(n-1, x + (.5*length), y, .5*length);
        sierpinski(n-1, x - (.5*length), y, .5*length);
        
    }
}


    // Takes an integer command-line argument n; 
    // draws the outline of an equilateral triangle (pointed upwards) of length 1; 
    // whose bottom-left vertex is (0, 0) and bottom-right vertex is (1, 0); and 
    // draws a Sierpinski triangle of order n that fits snugly inside the outline. 
    public static void main(String[] args) {

    int n = Integer.parseInt(args[0]);
    double[] x1 = {0, 1, 0.5};
    double[] y1 = {0, 0, height(1)};

    StdDraw.polygon(x1, y1);
    sierpinski(n, 0.5, 0, 0.5);

    }
}
