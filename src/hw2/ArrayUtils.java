package hw2;// Rahul Raja
// 113126572
// rahul.raja@stonybrook.edu

public class ArrayUtils {
    public static int[] randomArray(int size, int max ) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int)(Math.random() * max);
        }
        return array;
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        int size = array.length;
        for (int i = 0; i < size; i++) {
            if (i == size - 1)System.out.println(array[i] + "]");
            else System.out.print(array[i] + ", ");
        }
    }

    public static int arraySum(int[] array) {
        int sum = 0;
        for (int element : array){
            sum += element;
        }
        return sum;
    }

    public static int containsInt(int[] array, int n) {
        int result = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                result = i;
                break;
            }
        }
        return result;
    }

    public static int countMultiplesOf(int[] array, int n) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % n == 0 || array[i] == 0) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] array = randomArray(100, 21); // initialize the array
        printArray(array);

        double averageOfArray = arraySum(array) / 100.0;  // average of all elements in the array
        System.out.println("Average: " + averageOfArray);

        int indexOfElement = containsInt(array, 12);  // number of 12's in the array
        System.out.println("Number of 12's in array: " + indexOfElement);

        int numOfMultiples = countMultiplesOf(array, 7);  //
        System.out.println("Number of multiple of 7's in array: " + numOfMultiples);
    }
}
