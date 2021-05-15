package hw3;

import java.util.Arrays;

public class HorseBarn{
    private Horse[] spaces;

    public HorseBarn(int size) {
        spaces = new Horse[size];
    }

    public void add(Horse horse) {
        for (int i = 0; i < spaces.length; i++) {
            if (spaces[i] == null) {
                spaces[i] = horse;
                break;
            }
        }
    }

    public void remove(Horse horse) {
        for (int i = 0; i < spaces.length; i++) {
            if (spaces[i] == horse) {
                spaces[i] = null;
                break;
            }
        }
    }
    public int findHorseSpace(String name) {
        for (int i = 0; i < spaces.length; i++) {
            if (spaces[i].getName().equals(name)) return i;
        }
        return -1;
    }

    public void consolidate() {
        Horse[] temp = new Horse[spaces.length];
        int index = 0;
        for (int i = 0; i < spaces.length; i++) {
            if (spaces[i] != null) {
                temp[index] = spaces[i];
                index++;
            }
        }
        spaces = temp;
    }

    @Override
    public String toString() {
        return "hw3.HorseBarn = " +
                Arrays.toString(spaces);
    }

    public static void main(String[] args) {
        Horse horse1 = new Horse("horse1", 200);
        Horse horse2 = new Horse("horse2", 300);
        Horse horse3 = new Horse("horse3", 400);
        Horse horse4 = new Horse("horse4", 500);

        HorseBarn horseBarn = new HorseBarn(10);
        horseBarn.add(horse1);
        horseBarn.add(horse2);
        horseBarn.add(horse3);
        horseBarn.add(horse4);
        horseBarn.remove(horse2);
        horseBarn.consolidate();
        System.out.println(horseBarn);
    }
}
