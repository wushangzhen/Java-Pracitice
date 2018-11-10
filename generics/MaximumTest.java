class MaximumTest {
    public static <T extends Comparable<T>> T 
        maximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }
    public static void main(String args[]) {
        System.out.printf("%d, %d, %d max is %d \n\n", 3, 4, 5, maximum(3, 4, 5));
        System.out.printf("%.1f, %.1f, %.1f max is %.1f \n\n", 3.3, 4.3, 5.3, maximum(3.3, 4.3, 5.3));
        System.out.printf("%s, %s, %s max is %s \n\n", "apple", "applea", "applee",
        maximum("apple", "applea", "applee"));
        System.out.println("apple".compareTo("applea"));
    }
    
}
