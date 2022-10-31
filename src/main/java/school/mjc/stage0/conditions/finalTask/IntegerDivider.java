package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        if (dividend == 0 || divider == 0) {
            System.out.println("division by zero");
        } else {
            int afterDivide = 0;
            int result = 0;
            afterDivide = dividend / divider;
            result = afterDivide * divider;
            if (result == dividend) {
                System.out.println("can be divided completely");
            } else
                System.out.println("cannot be divided completely");
        }
    }

}
