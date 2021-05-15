package hw2;// Rahul Raja
// 113126572
// rahul.raja@stonybrook.edu

public class EliminateDuplicates {
    public static String eliminateDuplicates(String string) {
        int[] array = new int[string.length()];
        String result = "";
        int trueSize = 0;
        for (int i = 0; i < string.length(); i++) {
            char letter = string.charAt(i);
            if (!isNumberInArray(array, letter, trueSize)) {
                array[trueSize] = letter;
                trueSize++;
                result += string.substring(i, i + 1);
            }

        }
        // System.out.println(Arrays.toString(array));

        return result;
    }

    public static boolean isNumberInArray(int[] array, int n, int size) {
        boolean result = false;
        for (int i = 0; i < size; i++) {
            if (array[i] == n) result = true;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(eliminateDuplicates("abracadabra"));
        System.out.println(eliminateDuplicates("Stony Brook University"));
        System.out.println(eliminateDuplicates("This is a week14.test sentence."));
        System.out.println(eliminateDuplicates("JuJu Smith-Schuster"));
        System.out.println(eliminateDuplicates("computer science is cool"));
    }
}
