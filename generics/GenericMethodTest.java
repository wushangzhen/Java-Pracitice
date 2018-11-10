public class GenericMethodTest {
    public static <E> void printArray(E[] a) {
        for (E elem : a) {
            System.out.printf("%-3s", elem);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer[] intArray =  {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2};
        Character[] charArray = {'H', 'E'};
        printArray(intArray);
        printArray(doubleArray);
        printArray(charArray);
    }
}
