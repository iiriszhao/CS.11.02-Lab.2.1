public class Main {
    public static void main(String[] args) {
        int result = add(3,8);
        System.out.println(result);

        int result2 = addTwo(3,8,4,9);
        System.out.println(result2);

        String line = afternoonGreeting("Mac Miller");
        System.out.println(line);

        String line2 = morningGreeting("Toby Fox");
        System.out.println(line2);

        String line3 = triple("oohbaby");
        System.out.println(line3);

        double equals = half(15);
        System.out.println(equals);

        int pos = roundPositiveValueToNearestInteger(8.49);
        System.out.println(pos);

        int neg = roundNegativeValueToNearestInteger(-8.5);
        System.out.println(neg);

    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int addTwo(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static String afternoonGreeting(String name) {
        return "下午好, " + name + "!";
    }

    public static String morningGreeting (String name) {
        return "早上好, " + name + "!";
    }

    public static String triple(String str) {
        return str + str + str;
    }

    public static double half(double num) {
        return num / 2;
    }

    public static int roundPositiveValueToNearestInteger(double posdbl) {
        return (int) (posdbl + 0.5);
    }

    public static int roundNegativeValueToNearestInteger(double negdbl) {
        return (int) (negdbl - 0.5);
    }
    // 1. add
    
    // 2. add

    // 3. morningGreeting

    // 4. afternoonGreeting

    // 5. triple

    // 6. half

    // 7. roundPositiveValueToNearestInteger

    // 8. roundNegativeValueToNearestInteger

}
