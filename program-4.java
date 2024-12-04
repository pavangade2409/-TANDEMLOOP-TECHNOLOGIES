public class MultiplesCounter {

    public static void main(String[] args) {
        
        int[] numbers = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

        
        int[] divisors = {1, 2, 3, 4, 5, 6, 7, 8, 9};

      
        int[] counts = new int[divisors.length];

     
        for (int number : numbers) {
            for (int i = 0; i < divisors.length; i++) {
                if (number % divisors[i] == 0) {
                    counts[i]++;
                }
            }
        }

        
        System.out.print("Output: {");
        for (int i = 0; i < divisors.length; i++) {
            System.out.print(divisors[i] + ": " + counts[i]);
            if (i < divisors.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}
