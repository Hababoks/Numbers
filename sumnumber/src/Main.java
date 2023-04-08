public class Main {
    public static void main(String[] args) {
        int sum = 0, i = 0;
        while (i++ < 100)
        {
            if(i % 2 == 0)
            {
                sum += i;
            }
        }

        System.out.println(sum);
    }
}