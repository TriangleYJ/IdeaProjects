import java.util.Scanner;


public class Function {

    public static void main(String[] args) {
        Double a;
        Double b;
        Double c;

        Double p;
        Double q;

        label:
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nStandard or General?");

            String input = scanner.nextLine();

            switch (input) {
                case "s": {
                    System.out.println("Input A");
                    a = scanner.nextDouble();

                    System.out.println("Input B");
                    b = scanner.nextDouble();

                    System.out.println("Input C");
                    c = scanner.nextDouble();


                    p = -b / (2 * a);
                    q = -(b * b - 4 * a * c) / (4 * a);

                    String A = (isInt(a) ? ((a == 1 || a == -1) ? String.valueOf(a.intValue()).replace("1", "") : a.intValue()) + "" : a + "");
                    String B = (isInt(b) ? ((b == 1 || b == -1) ? String.valueOf(b.intValue()).replace("1", "") : b.intValue()) + "" : b + "");
                    String C = (isInt(c) ? c.intValue() + "" : c + "");

                    String P = (isInt(p) ? p.intValue() + "" : p + "");
                    String Q = (isInt(q) ? q.intValue() + "" : q + "");

                    String result1 = A + "x² + " + B + "x + " + C;
                    result1 = result1.replace(" ", "");
                    result1 = result1.replaceAll("\\+\\-", "\\-");
                    result1 = result1.replaceAll("\\-\\-", "\\+");

                    String result2 = A + "(x - " + P + ")² + " + Q;
                    result2 = result2.replace(" ", "");
                    result2 = result2.replaceAll("\\+\\-", "\\-");
                    result2 = result2.replaceAll("\\-\\-", "\\+");

                    System.out.println("==== Result ====");
                    System.out.println("Input : " + result1);
                    System.out.println("Output : " + result2);

                    break;
                }
                case "g": {
                    System.out.println("Input A");
                    a = scanner.nextDouble();

                    System.out.println("Input P");
                    p = scanner.nextDouble();

                    System.out.println("Input Q");
                    q = scanner.nextDouble();


                    b = -2 * a * p;
                    c = a * p * p + q;

                    String A = (isInt(a) ? ((a == 1 || a == -1) ? String.valueOf(a.intValue()).replace("1", "") : a.intValue()) + "" : a + "");
                    String B = (isInt(b) ? ((b == 1 || b == -1) ? String.valueOf(b.intValue()).replace("1", "") : b.intValue()) + "" : b + "");
                    String C = (isInt(c) ? c.intValue() + "" : c + "");

                    String P = (isInt(p) ? p.intValue() + "" : p + "");
                    String Q = (isInt(q) ? q.intValue() + "" : q + "");

                    String result1 = A + "x² + " + B + "x + " + C;
                    result1 = result1.replace(" ", "");
                    result1 = result1.replaceAll("\\+\\-", "\\-");
                    result1 = result1.replaceAll("\\-\\-", "\\+");

                    String result2 = A + "(x - " + P + ")² + " + Q;
                    result2 = result2.replace(" ", "");
                    result2 = result2.replaceAll("\\+\\-", "\\-");
                    result2 = result2.replaceAll("\\-\\-", "\\+");

                    System.out.println("==== Result ====");
                    System.out.println("Input : " + result2);
                    System.out.println("Output : " + result1);

                    break;
                }
                default:
                    break label;
            }
        }

    }

    public static boolean isInt(double d)
    {
        return d == (int) d;
    }

}
