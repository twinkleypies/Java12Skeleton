class ArrayDemo {
    public static void main(String[] args) {
//sets the values in the array spots
        int[] ar1 = { -20, 19, 1, 5, -1, 27, 19, 5 };
//prints out all the functions bellow
        ArrayOps operate = new ArrayOps(); // create an ArrayOps object
        int biggest = operate.FindMax(ar1); // call the findMax () method with the array
        System.out.println("The maximum is: " + biggest);
        int lowest = operate.FindLowest(ar1);
        System.out.println("The lowest is: " + lowest);
        System.out.print("array in order: ");
        operate.Print(ar1);
        System.out.print("array brackwards: ");
        operate.PrintBackwards(ar1);
        System.out.print("Odd elements: ");
        operate.PrintOddElements(ar1);
        System.out.print("Even elements: ");
        operate.PrintEvenElements(ar1);
       
        operate.ZeroOut(ar1);
        operate.Print(ar1);
        
    }
}

class ArrayOps {
    /**
 * finds the largest value in the array
 * @param x array, finds the largest value
 * @return prints the max value in the array
 */

    int FindMax(int[] x) {
        int max = x[0];

        for (int index = 0; index < x.length; index++) {
            if (x[index] > max) {
                max = x[index];
            }
        }

        return max;
    }
/**
 * finds the smallest value in the array
 * @param x Array, finds the smallest number value
 * @return the lowest value of the array
 */
    int FindLowest(int[] x) {
        int low = x[0];// you can do the rest from here just < instead of > from findMax comparisons.

        for (int index = 0; index < x.length; index++)
            if (x[index] < low)
                low = x[index];

        return low;
    }

    void Print(int[] x) {

        for (int j = 0; j < x.length; j++) {
            System.out.print(x[j] + " ");
        }

        System.out.println();
    }
/**
 * function is to Add the array of numbers
 * @param x Array to find the sum
 * @return the sum of all the values
 */
    int SumArray(int[] x) {
        

        int sum = 0;

        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        return sum;

    }
/**
 * function is to print the array in the opposite way as it was
 * @param x switches the numbers to thier opposite spot
 * @return the list of values backwards
 */
    void PrintBackwards(int[] x) {
        

        for (int i = x.length - 1; i >= 0; i--) {
            System.out.print(x[i] + " ");
        }
        System.out.println();

    }
/**
 * function is to print the values in the odd space arrays
 * @param x registers all the odd array spot values
 * @return prints all odd array spot values
 */
    void PrintOddElements(int[] x) {
        for (int i = 1; i < x.length; i +=2){
            System.out.print(x[i] + " ");
        }
        System.out.println();

    }
    /**
 * function is to print the values in the even space arrays
 * @param x registers all the even array spot values
 * @return prints all even array spot values
 */

    void PrintEvenElements(int[] x) {

        for (int i = 0; i < x.length; i +=2){
            System.out.print(x[i] + " ");
        }
        System.out.println();

    }
/**
 * function sets all the values in the array to 0
 * @param x sets all the values to zero
 * @return zeros
 */
    void ZeroOut(int[] x) {
for (int i = 0; i<x.length; i++){
    x[i] = 0;
}
        
    }
}