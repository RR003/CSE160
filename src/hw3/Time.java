package hw3;

public class Time {
    private int seconds;
    private int minutes;
    private int hours;

    public Time() {}

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }


    public void tick() {
        if (getSeconds() == 59) {
            setSeconds(0);
            if (getMinutes() == 59) {
                setMinutes(0);
                if (getHours() == 23) setHours(0);
                else setHours(getHours() + 1);
            }
            else setMinutes(getMinutes() + 1);
        }
        else setSeconds(getSeconds() + 1);
    }

    public void add(Time offset) {
        int seconds = offset.getHours() * 3600 + offset.getMinutes()*60 + offset.getSeconds();
        System.out.println(seconds);
        for (int i = 0; i < seconds; i++) this.tick();
    }

    @Override
    public String toString() {
        return "hw3.Time{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                ", seconds=" + seconds +
                '}';
    }

    public static void main(String[] args) {
        Time t1 = new Time(2,45,3);
        // System.out.println(t1);
        t1.add(new Time(2,14,59));
        System.out.println(t1);
    }
}
