class SumSquaresInRange {

    static int squareSum(int N) {
       //makes it repeat until it is one ye!
        if (N == 1)
            return 1;
        else
            return N * N + squareSum(N-1);
    }
//prints out the square sum
    public static void main(String[] args) {
        System.out.println(squareSum(4));
    }
}