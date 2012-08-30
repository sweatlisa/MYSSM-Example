package com.thomsontang.ssm.action.serialize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Thomson Tang
 * @since 12-8-24
 */
public class FlattenTime {
    public static void main(String[] args) {
        String fileName = "time.ser";
        if(args.length > 0) {
            fileName = args[0];
        }
        PersistentTime time = new PersistentTime();
        FileOutputStream fos = null;
        ObjectOutputStream out = null;
        try{
            fos = new FileOutputStream(fileName);
            out = new ObjectOutputStream(fos);
            out.writeObject(time);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
