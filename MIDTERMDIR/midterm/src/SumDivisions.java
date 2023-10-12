public class SumDivisions {
    // Method to calculate the sum of divisions
    public static float calculateSumDivisions(int num) {
        // Check if the input 'num' is valid
        if (num <= 0) {
            throw new IllegalArgumentException("Input 'num' must be greater than zero.");
        }
        // Initialize the sum to zero
        float sum = 0;
        // Calculate the sum of divisions from 1 to 'num'
        for(int i=1;i<=num;i++)
            sum = sum + (float)1/i;
        return sum;
    }
    // Main method to test the calculateSumDivisions method
    public static void main(String[] args) {
        int[] testInputs = {1, 5, 10};

        for (int num : testInputs) {
            try {
                float result = calculateSumDivisions(num);
                System.out.println("For num = " + num + ", the sum is: " + result);
            } catch (IllegalArgumentException e) {
                // Handle exceptions when 'num' is not valid
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
