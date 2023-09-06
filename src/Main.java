public class Main {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c, int d) {
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
