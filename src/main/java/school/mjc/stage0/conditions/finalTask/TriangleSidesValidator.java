package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        double maxSide = 0;
        if (firstSide > secondSide && firstSide > thirdSide) {
            maxSide = firstSide;
        } else if (secondSide > firstSide && secondSide > thirdSide) {
            maxSide = secondSide;
        } else maxSide = thirdSide;

        if (firstSide <= 0 || secondSide <= 0 || thirdSide <= 0) {
            System.out.println("it's not a triangle");
        } else if (maxSide == thirdSide && (firstSide + secondSide) > maxSide) {
            System.out.println("this is a valid triangle");
        } else if (maxSide == secondSide && (firstSide + thirdSide) > maxSide) {
            System.out.println("this is a valid triangle");
        } else if (maxSide == firstSide && (secondSide + thirdSide) > maxSide) {
            System.out.println("this is a valid triangle");
        } else System.out.println("it's not a triangle");
    }
}

