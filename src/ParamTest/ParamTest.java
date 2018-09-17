package ParamTest;

public class ParamTest {
    public static void main(String[] args){
        System.out.println("Testing tripieValue:");
        double percent = 10;
        System.out.println("Before: percent = " + percent);
        tripieValue(percent);
        System.out.println("After: percent = " + percent);
    }

    private static void tripieValue(double x) {
        x = 3 * x;
        System.out.println("End of method : x = " + x);
    }
}
