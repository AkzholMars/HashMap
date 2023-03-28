import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите первое число: ");
            int a = scanner.nextInt();
            System.out.println("Введите второе число: ");
            int b = scanner.nextInt();
            System.out.println("Введите арифмитеческий оператор: ");
            String o = scanner.next();


            String c = a + " " + o + " " + b;
            System.out.println(c);

            if (hashMap.containsKey(c)) {
                System.out.println(c + " = " + hashMap.get(c) + " Взято из HashMap");

            }
            else {
                if (o.equals("+")) {
                    hashMap.put(c, a + b);
                    System.out.println(c + " = " + hashMap.get(c));
                }
                else if (o.equals("-")) {hashMap.put(c, a - b);
                    System.out.println(c + " = " + hashMap.get(c));

                }
                else if (o.equals("*")) {
                    hashMap.put(c, a * b);
                    System.out.println(c + " = " + hashMap.get(c));
                }
                else if (o.equals("/")) {
                    hashMap.put(c, a / b);
                    System.out.println(c + " = " + hashMap.get(c));
                }

            }
        }
        System.out.println(hashMap.toString());

    }
}