    public class Main {

        // Method to find the maximum value in an array without using built-in methods
        public static int findMax(int[] arr) {
            if (arr == null || arr.length == 0)
                throw new IllegalArgumentException("Array must not be empty or null.");

            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max)
                    max = arr[i];
            }
            return max;
        }

        // Method to generate the nth Fibonacci number
        public static int fibonacci(int n) {
            if (n <= 0)
                throw new IllegalArgumentException("n must be a positive integer.");

            if (n == 1 || n == 2)
                return 1;

            int a = 1, b = 1;
            for (int i = 3; i <= n; i++) {
                int temp = a + b;
                a = b;
                b = temp;
            }
            return b;
        }

        // Method to check if an array contains only non-zero and non-negative one integers
        public static boolean containsOnlyNonZeroAndNegativeOne(int[] arr) {
            for (int num : arr) {
                if (num == 0 || num == -1)
                    return false;
            }
            return true;
        }

        public static void main(String [] args ) {
            // Testing findMax method
            int[] arr = {100, 521, -76, -12, 174};
            System.out.println("Maximum value in the array: " + findMax(arr));

            // Testing fibonacci method
            int n = 6;
            System.out.println("The " + n + "th Fibonacci number is: " + fibonacci(n));

            // Testing containsOnlyNonZeroAndNegativeOne method
            int[] arr2 = {100, 521, -76, -12, 174};
            System.out.println("Array contains only non-zero and non-negative one integers: " + containsOnlyNonZeroAndNegativeOne(arr2));
        }
    }
