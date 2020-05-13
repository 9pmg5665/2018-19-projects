

/**
 *
 * @author conno
 */
public class Week_3 {
    public static void main(String[] args){
    testMethod((x,y)->System.out.println("The sum is "+(x.floatValue() + y.floatValue())));
    }
    private static void testMethod(Lab_3 testObject){
    testObject.compute(10,5);
    }
}
