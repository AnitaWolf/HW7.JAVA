import java.util.Random;

public class Square {
            private double a;
            private double b;
            private double c;
            private double d;
            private double r;


    public  double SquareRec (double a, double b) {
                return a*b;
            }
    public  double SquareTri (double c,double d) {
        return (c*d)/2;
    }
    public  double SquareCir (double r) {
        return Math.PI*Math.pow(r,2);
    }



}
