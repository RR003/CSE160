package hw4;

public class Phone {
    public static String getDigits(String phoneNumber) {
        phoneNumber = phoneNumber.replaceAll("[-]", "");
        phoneNumber = phoneNumber.toLowerCase();
        String result = "";
        for (int i = 0; i < phoneNumber.length(); i++) {
            String s = phoneNumber.substring(i , i + 1);
            if (s.matches("[1234567890]")) result += phoneNumber.substring(i, i + 1);
            else {
                result += getLetters(phoneNumber.charAt(i));
            }
        }
        return result;
    }

    public static int getLetters(int n) {
        if (n <= 99) return 2;
        else if (n <= 102) return 3;
        else if (n <= 105) return 4;
        else if (n <= 108) return 5;
        else if (n <= 111) return 6;
        else if (n <= 115) return 7;
        else if (n <= 118) return 8;
        return 9;
    }

    public static void main(String[] args) {
        System.out.println(getDigits("Seawolf-SBU-1"));
    }
}
