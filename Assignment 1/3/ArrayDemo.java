class ArrayOps {
    // other methods

    // print elements start through end
    public static void printRange(int[] x, int start, int end) {
        for (int index = start; index <= end; index++)
            System.out.print(x[index] + " ");
        System.out.println();
    }
}

public class ArrayDemo {
    public static void main(String[] args) {
        int[] ar1 = { -20, 19, 1, 5, -1, 27, 19, 5 };

        // print elements at indexes 1, 2, 3, 4, 5
        ArrayOps.printRange(ar1, 1, 5);
    } 
}

