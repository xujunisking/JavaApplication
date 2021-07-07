package com.cme.common;

import org.apache.log4j.Logger;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 序列化
 * create by dracula on 2020-12-09
 */
public class SerializeUtils {
    private static Logger logger = Logger.getLogger(SerializeUtils.class);

    /**
     * 序列化反序列化类
     *
     * @param object
     * @return
     */
    public static byte[] serialize(Object object)
    {
        ObjectOutputStream objectOutputStream = null;
        ByteArrayOutputStream byteArrayOutputStream = null;
        try
        {
            // 序列化
            byteArrayOutputStream = new ByteArrayOutputStream();
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(object);
            byte[] bytes = byteArrayOutputStream.toByteArray();
            return bytes;
        }
        catch (Exception e)
        {
            logger.error("对象序列化失败！！！");
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 反序列化
     *
     * @param bytes
     * @return
     */
    public static Object unserialize(byte[] bytes)
    {
        ByteArrayInputStream byteArrayInputStream = null;
        try
        {
            // 反序列化
            byteArrayInputStream = new ByteArrayInputStream(bytes);
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            return objectInputStream.readObject();
        }
        catch (Exception e)
        {
            logger.error("对象反序列化失败！！！");
            e.printStackTrace();
        }
        return null;
    }
}
