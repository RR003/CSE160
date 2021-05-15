package hw3;

import java.util.ArrayList;

public class StepTracker {

    private int minSteps = 0;


    ArrayList<Integer> dailySteps = new ArrayList<>();

    public StepTracker(int minSteps) {
        this.minSteps = minSteps;
    }

    public int getMinSteps() {
        return this.minSteps;
    }

    public int activeDays(){
        int result = 0;
        for (int steps : dailySteps) {
            if (steps > getMinSteps()) result++;
        }
        return result;
    }

    public double averageSteps() {
        int totalSteps = 0;
        int totalDays = dailySteps.size();
        for (int steps : dailySteps) {
            totalSteps += steps;
        }

        return (totalSteps * 1.0 / totalDays);
    }


    public String addDailySteps(int steps) {
        dailySteps.add(steps);
        String result = "";
        if (steps >= getMinSteps()) {
            result = "This represents an active day";
        }else {
            result = "This is too few steps for the day to be considered active.";
        }

        return result;
    }

    public static void main(String[] args) {
        /* hw3.StepTracker tr = new hw3.StepTracker(10000);
        System.out.println(tr.addDailySteps(9000));
        System.out.println(tr.addDailySteps(5000));
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
        System.out.println(tr.addDailySteps(13000));
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
        System.out.println(tr.addDailySteps(23000));
        System.out.println(tr.addDailySteps(1111));
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());


        hw3.StepTracker tr2 = new hw3.StepTracker(5000);
        System.out.println(tr2.activeDays()); */
    }
}
