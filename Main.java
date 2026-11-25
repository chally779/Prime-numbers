public class Main {
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int count = 0;

        System.out.println("Prime numbers between 0 and 500:");
        System.out.println(" ");

        for (int i = 0; i <= 500; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }

        System.out.println(" ");
        System.out.println("Total prime numbers found: " + count);
    }
}