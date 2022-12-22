package pract8;

public class Main {
    public static void main(String[] args) {
        System.out.println(SumNumeric(23753285));
    }
    public static long SumNumeric(long N) {
        if (N / 10 != 0) {
            return N % 10 + SumNumeric(N / 10);
        } else {
            return N % 10;
        }
    }
}
