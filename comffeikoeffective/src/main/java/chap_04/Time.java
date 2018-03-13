package chap_04;

/**
 * @author wangjingffei
 * @DESCRIPTION
 * @create 2018/3/13
 */
public class Time {
    private static final int HOURS_PER_DAY = 24;
    private static final int MINUTES_PER_HOUR = 60;

    public final int hour;
    public final int minute;

    public Time(int hour, int minute) {
        if (hour < 0 || hour >= HOURS_PER_DAY){
            throw new IllegalArgumentException();
        }
        if (minute<0|| hour >= MINUTES_PER_HOUR){
            throw new IllegalArgumentException();
        }
        this.hour = hour;
        this.minute = minute;
    }


}
