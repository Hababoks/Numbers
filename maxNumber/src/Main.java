import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        while (key.hasNextInt()) {
            int x = key.nextInt();
            if (x%2==0 && x>max)
            {
                max = x;
            }
        }
        System.out.println(max);

    }
}