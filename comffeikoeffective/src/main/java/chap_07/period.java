package chap_07;

import java.util.Date;

/**
 * @author wangjingffei
 * @DESCRIPTION
 * @create 2018/3/13
 */
public class period {
    private final Date start;
    private  final Date end;

    public period(Date start, Date end) {
        if (start.compareTo(end) >0)
        {
            throw  new IllegalArgumentException(start +"after" + end);
        }
        this.start = start;
        this.end = end;
    }

    public Date getStart() {
        return start;
    }

    public Date getEnd() {
        return end;
    }
}
