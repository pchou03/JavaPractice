package ab45_assignments;

//Assignment 67: WAP which has all the methods of math class.Perform each methods operation using math class

public class Assignment67_MathExample {
   
	public static void main(String[] args) 
	{
		// Values 
        int a = 100, b = 50, c = -100, d = 200;
        long e = 10000000000L, f = 5000000000L;
        float f1 = 12.5f, f2 = 25.5f;
        double d1 = 50.25, d2 = 30.75;

        // addExact(int c, int d)
        System.out.println("addExact(int, int): " + Math.addExact(a, b));

        // addExact(long e, long f)
        System.out.println("addExact(long, long): " + Math.addExact(e, f));

        // subtractExact(int c, int d)
        System.out.println("subtractExact(int, int): " + Math.subtractExact(a, b));

        // subtractExact(long e, long f)
        System.out.println("subtractExact(long, long): " + Math.subtractExact(e, f));

        // multiplyExact(int c, int d)
        System.out.println("multiplyExact(int, int): " + Math.multiplyExact(a, b));

        // multiplyExact(long e, long f)
        try {
            System.out.println("multiplyExact(long, long): " + Math.multiplyExact(e, f));
        } catch (ArithmeticException ex) {
            System.out.println("Overflow in multiplyExact(long, long): " + ex.getMessage());
        }

        // min(int c, int d)
        System.out.println("min(int, int): " + Math.min(a, b));

        // min(long e, long f)
        System.out.println("min(long, long): " + Math.min(e, f));

        // min(float f1, int f2)
        System.out.println("min(float, int): " + Math.min(f1, b));

        // min(double d1, double d2)
        System.out.println("min(double, double): " + Math.min(d1, d2));

        // max(int c, int d)
        System.out.println("max(int, int): " + Math.max(a, b));

        // max(long e, long f)
        System.out.println("max(long, long): " + Math.max(e, f));

        // max(float f1, int f2)
        System.out.println("max(float, int): " + Math.max(f1, b));

        // max(double d1, double d2)
        System.out.println("max(double, double): " + Math.max(d1, d2));

        // absolute(int c)
        System.out.println("absolute(int): " + Math.abs(c));

        // absolute(float f1)
        System.out.println("absolute(float): " + Math.abs(f1));

        // absolute(double d1)
        System.out.println("absolute(double): " + Math.abs(d1));
    }
}
