package com.thomsontang.ssm.action.serialize;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Thomson Tang
 * @since 12-8-24
 */
public class PersistentTime implements Serializable {
    private Date time;

    public PersistentTime() {
        time = Calendar.getInstance().getTime();
    }

    public Date getTime() {
        return time;
    }

}
