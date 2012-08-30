package com.thomsontang.ssm.action.serialize;

import java.io.*;
import java.util.Calendar;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Thomson Tang
 * @since 12-8-24
 */
public class InflateTime {
    public static void main(String[] args) {
        String fileName = System.getProperty("user.dir") + File.separator + "time.ser";

        PersistentTime time = null;
        FileInputStream fis = null;
        ObjectInputStream in = null;

        try {
            fis = new FileInputStream(fileName);
            in = new ObjectInputStream(fis);
            time = (PersistentTime) in.readObject();
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Flatted time: " + time.getTime());
        System.out.println("Current time:" + Calendar.getInstance().getTime());

    }
}
