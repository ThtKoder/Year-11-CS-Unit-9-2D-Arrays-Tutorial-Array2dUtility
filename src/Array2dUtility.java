
public class Array2dUtility {

    // Declare all methods as static.


    // 1. print
    // Implement a method called print that prints out the values of a 2D array of integers row by row.
    public static void print(int[][] twoDArray){
        for(int i = 0; i < twoDArray.length; i++){
            for(int j = 0; j < twoDArray[i].length; j++){
                System.out.println(twoDArray[i][j]);
            }
        }
    }

    // 2. sum
    // Implement a method called sum that returns the sum of a 2D array of integers
    public static int sum(int[][] twoDArray){
        int sum = 0;
        for(int i = 0; i < twoDArray.length; i++){
            for(int j = 0; j < twoDArray[i].length; j++){
                sum += twoDArray[i][j];
            }
        }
        return sum;
    }

    // 3. average
    // Implement a method called average that returns the average value of a 2D array of integers.
    // You may assume that the 2D array is a square. That is, it has the same number of rows and columns.
    // Reminder: call your sum method within the average method.
    public static double average(int[][] twoDArray){
        int sum = 0;
        for(int i = 0; i < twoDArray.length; i++){
            for(int j = 0; j < twoDArray[i].length; j++){
                sum += twoDArray[i][j];
            }
        }

        double average = (double) sum /(twoDArray.length * twoDArray[0].length);
        return average;

    }

    // 4. minimum
    // Implement a method called minimum that returns the minimum value of a 2D array of integers.
    public static int minimum(int[][] twoDArray){
        int minimum = twoDArray[0][0];
        for(int i = 0; i < twoDArray.length; i++){
            for(int j = 0; j < twoDArray[i].length; j++){
                if(minimum > twoDArray[i][j]) {
                    minimum = twoDArray[i][j];
                }
            }
        }
        return minimum;
    }

    // 5. maximum
    // Implement a method called maximum that returns the maximum value of a 2D array of integers.
    public static int maximum(int[][] twoDArray){
        int maximum = twoDArray[0][0];
        for(int i = 0; i < twoDArray.length; i++){
            for(int j = 0; j < twoDArray[i].length; j++){
                if(maximum < twoDArray[i][j]) {
                    maximum = twoDArray[i][j];
                }
            }
        }
        return maximum;
    }

    // 6. evenCountStandard
    // Implement a method called evenCountStandard that returns the number of even numbers in a 2D array of integers.
    // Use a standard for loop to implement this method.
    public static int evenCountStandard(int[][] twoDArray){
        int count = 0;
        for(int i = 0; i < twoDArray.length; i++){
            for(int j = 0; j < twoDArray[i].length; j++){
                if(twoDArray[i][j] %2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    // 7. evenCountEnhanced
    // Implement a method called evenCountEnhanced that returns the number of even numbers in a 2D array of integers.
    // Use an enhanced for loop to implement this method.
    public static int evenCountEnhanced(int[][] twoDArray){
        int count = 0;
        for(int[] iteratedElement: twoDArray){
            for(int iteratedValue: iteratedElement){
                if(iteratedValue %2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    // 8. allPositive
    // Implement a method called allPositive that returns true if all the values in a 2D array of integers are positive.
    public static boolean allPositive(int[][] twoDArray){
        boolean value = true;
        for(int[] iteratedElement: twoDArray){
            for(int iteratedValue: iteratedElement){
                if(iteratedValue < 0) {
                    value = false;
                }
            }
        }
        return value;
    }

    // 9. rowSums
    // Implement a method called rowSums that returns a one dimensional array that contains the sum of each row at each index.
    public static int[] rowSums(int[][] twoDArray){
        int[] myArray = new int[twoDArray.length];
        int sum = 0;
        int index = 0;
        for(int[] iteratedElement: twoDArray){
            for(int iteratedValue: iteratedElement){
                sum += iteratedValue;
            }
            myArray[index] = sum;
            sum = 0;
            index++;
        }

        return myArray;
    }

    // 10. colSums
    // Implement a method called colSums that returns a one dimensional array that contains the sum of each col at each index.
    public static int[] colSums(int[][] twoDArray){
        int[] myArray = new int[twoDArray.length];
        int sum = 0;
        for(int i = 0; i < twoDArray[0].length; i++){
            for(int j = 0; j <twoDArray.length; j++){
                sum += twoDArray[j][i];
            }
            myArray[i] = sum;
            sum = 0;
        }

        return myArray;
    }

}
