package hw5;

public class ParseHex {
    public static int parseHex(String string) throws NumberFormatException {
        string = string.toLowerCase();
        int result = 0;
        int index = 0;
        for (int i = string.length() - 1; i >= 0; i--) {
            String s = string.substring(i, i + 1);
            if (s.matches("[\\d]") || s.equals("0")) result += Integer.parseInt(s) * Math.pow(16, index);
            else if (s.matches("[a-f]")) {
                result += (s.charAt(0) - 87) * Math.pow(16, index);
            }else throw new NumberFormatException();
            index++;
        }
        return result;
    }

    public static void main(String[] args) {
        String string = "9f32";
        try {
            System.out.println(parseHex(string));
        }catch (NumberFormatException e){
            System.out.println("Invalid hex number");
        }
    }
}

class HexFormatException extends Throwable{

}
