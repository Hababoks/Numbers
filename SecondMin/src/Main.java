import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        while (console.hasNextInt()) {
            int x = console.nextInt();
            if (x < min1){
                min2 = min1;
                min1 = x;}
            if (x < min2 && x > min1)
                min2 = x;             }
        System.out.println(min2);
    }
}