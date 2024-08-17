public class First10Primes {
    public static void main(String[] args) {
        int count = 0;
        int num = 2;
        while (count < 10) {
            boolean isPrime = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
}
