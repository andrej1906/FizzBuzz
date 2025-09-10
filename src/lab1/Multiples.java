package lab1;

public class Multiples {
    public static void main(String[] args) {
        int n = 1000;
        int a = 3;
        int b = 5;

        int count = multiples(n, a, b);
        System.out.println("There are " +count+ " multiples of" +a+ " or " +b+ " below " +n+ ".");
    }

    public static int multiples(int n, int a, int b) {
        return (int) java.util.stream.IntStream.range(1, n)
                .filter(i -> i % a == 0 || i % b == 0)
                .count();
    }
}