package generic;
// Generic Method
public class GenericMethodExample {
    public static <T> void printArray(T[] elements) {
        for (T element : elements) {
            System.out.print(element+" ");
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"A", "B", "C"};

        printArray(intArray);
        System.out.println();
        printArray(stringArray);
    }
}
