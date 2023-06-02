package string;

public class Heart {
    public static void main(String[] args) {
        int x, y;
        double hearEquation;
        for (y = 30; y >= -30; y--) {
            for (x = -30; x <= 30; x++) {
                hearEquation = Math.pow(Math.pow(x * 0.025, 2) + Math.pow(y * 0.04, 2) - 1, 3) - Math.pow(x * 0.025, 2) * Math.pow(y * 0.04, 3);
                if (hearEquation <= 0.0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
