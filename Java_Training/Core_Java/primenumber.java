package Core_Java;

public class primenumber {
    public static void main(String[] args) {
        int i = 0;
        int num = 0;
        // Empty String
        String PrimeNumbers = "";

        for (i = 1; i <= 50; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                // Appended the prime number to the string
                PrimeNumbers = PrimeNumbers + i + "";

            }
        }
        System.out.println("Prime numbers from 2 to 50 are :");
        System.out.println(PrimeNumbers);
    }
}
