class ArrayDemo {
    public static void main(String[] args) {

        int[] ar1 = { -20, 19, 1, 5, -1, 27, 19, 5 };

        ArrayOps operate = new ArrayOps(); // create an ArrayOps object
        int biggest = operate.FindMax(ar1); // call the findMax () method with the array
        System.out.println("The maximum is: " + biggest);
        int lowest = operate.FindLowest(ar1);
        System.out.println("The lowest is: " + lowest);
    }
}

class ArrayOps {

    int FindMax(int[] x) {
        int max = x[0];

        for (int index = 0; index < x.length; index++) {
            if (x[index] > max) {
                max = x[index];
            }
        }

        return max;
    }

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

    int SumArray(int[] x) {

    }

    void PrintBackwards(int[] x) {

    }

    void PrintOddElements(int[] x) {

    }

    void PrintEvenElements(int[] x) {

    }

    void ZeroOut(int[] x) {
        
    }
}