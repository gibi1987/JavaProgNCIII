public class Task2 {
    public static void main(String[] args) {
        char H = 'H';
        byte three = 3;
        short one1 = 1;
        int zero = 0;
        char space = ' ';
        char w = 'w';
        char o = '0';
        char r = 'r';
        char d = 'd';
        float twoDot = 2.0f;
        char dot = '.';
        boolean truth = true;

        String result = "" + H + three + one1 + one1 + zero + space +
                        w + o + r + one1 + d + space +
                        (int)twoDot + dot + dot + zero + space +
                        truth;

        System.out.println(result);
    }
}
