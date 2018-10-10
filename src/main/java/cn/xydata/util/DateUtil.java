package cn.xydata.util;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {

    /**
     * 获取当前日期是星期几
     * @param dt
     * @return 当前日期是星期几 1代表星期1
     */
    public static int getWeekOfDate(Date dt){
        Date today = new Date();
        Calendar c=Calendar.getInstance();
        c.setTime(today);
        int weekday=c.get(Calendar.DAY_OF_WEEK);
        if(weekday>1){
            weekday-=1;
        }
        if(weekday==1){
            weekday=7;
        }
        return weekday;
    }
}
