public class Main {
    public static < E > void printArray( E[] inputArray ) {
        for(E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Integer[] intArray = { 1, 2, 3, 4 };
        Character[] charArray = { 'J', 'A', 'V', 'A' };

        System.out.println("Array integerArray:");
        printArray(intArray);
        System.out.println("\nArray characterArray:");
        printArray(charArray);
    }
}