package com.lzy.io.Copy_Io;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @author User: LiZhiYong
 * Date: 2019/8/15
 * Time: 19:14
 * Description: No Description
 */
public class Copy_File {
    public static void main(String[] args) {
        //需要复制的文本地址
        String fileUrl = "D:\\20190718\\WinRAR\\Rar.txt";
        //复制的目标地址
        String targetUrl = "D:\\IO_Test"+System.currentTimeMillis()+".txt";
        //调用复制地址
        int whether = copyFile(fileUrl,targetUrl);
        System.out.println(whether==1?"复制成功":"复制失败");
    }

    /**
     * 复制本地文件
     */
    private static int copyFile(String fileUrl,String targetUrl){
        try {
            //创建读取流
            InputStream inputStream = new FileInputStream(fileUrl);
            //将IO流转字节
            byte[] bytes = new byte[200];
            //创建输入流
            FileOutputStream fileOutputStream = new FileOutputStream(targetUrl);
            //如果读取流读取字节时返回的不是-1则继续读取
            while (inputStream.read(bytes) != -1){
                //输入流程写入字节
                fileOutputStream.write(bytes);
            }
            return 1;
        } catch (IOException e) {
            System.out.println("文件复制失败");
            e.printStackTrace();
            return 0;
        }
    }
    /**
     * 将字节转文本保存到本地
     */
    public static int saveFile(byte[] bytes,String targetUrl){
        //创建输入流
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream(targetUrl);
            fileOutputStream.write(bytes);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
        return 1;
    }
}
