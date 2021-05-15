package hw2;// Rahul Raja
// 113126572
// rahul.raja@stonybrook.edu


import java.util.Arrays;

public class InterleaveArrays {
    public static int[] interleaveArrays(int[] array1, int[] array2) {
        int size = array1.length;
        int[] result = new int[size * 2];

        int index = 0;
        for (int i = 0; i < size; i++) {
            result[index] = array1[i];
            result[index + 1] = array2[i];
            index += 2;
        }
        return result;
    }

    public static void printArray(int[] array) {
        if (array == null) System.out.println("null");
        else {
            System.out.print("[");
            int size = array.length;
            for (int i = 0; i < size; i++) {
                if (i == size - 1)System.out.println(array[i] + "]");
                else System.out.print(array[i] + ", ");
            }
        }
    }

    public static int[] interleaveArrays(int[] array1, int[] array2, int stride, int maxElements) {
        int iteration1 = 0;
        int iteration2 = 0;
        int element = 0;

        if (stride < 1 || maxElements < 1) return null;
        if (array1.length + array2.length < maxElements) maxElements = array1.length + array2.length;
        int[] newArray = new int[maxElements];
        while (element < maxElements) {
            for (int i = 0; i < stride && iteration1 < array1.length && element < maxElements; i++) {
                newArray[element] = array1[iteration1];
                element++;
                iteration1++;
            }
            for (int i = 0; i < stride && iteration2 < array2.length && element < maxElements; i++) {
                newArray[element] = array2[iteration2];
                element++;
                iteration2++;
            }
        }
        return newArray;
    }


    public static void main(String[] args) {
        int[] arr8 = interleaveArrays(new int[] {1,2,3,4}, new int[] {6,7,8,9,10,11,12}, 5,11);
        System.out.println(Arrays.toString(arr8));
    }
}
