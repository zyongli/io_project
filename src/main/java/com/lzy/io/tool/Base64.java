package com.lzy.io.tool;

import com.lzy.io.Copy_Io.Copy_File;
import sun.misc.BASE64Decoder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created with IntelliJ IDEA.
 *
 * @author User: LiZhiYong
 * Date: 2019/8/16
 * Time: 9:39
 * Description: No Description
 */
public class Base64 {
    public static void main(String[] args) {
        String base64 = "iVBORw0KGgoAAAANSUhEUgAAAAwAAAAYCAYAAADOMhxqAAAAAXNSR0IArs4c6QAAAARnQU1BAACxjwv8YQUAAAAJcEhZcwAADsMAAA7DAcdvqGQAAACpSURBVDhP7Y9ZEoMgEAWB4wiYu2SRLPc/B3nDOIAKZZHvfHQxQDelSk3XKGh726Cme8E+mJ48HBhXyftAY2CRV+OWRCegAwyyUuQCQCBSDcsVdlmDcJRTAGE8kGidSTb+WaRmUMkS0H/saQYkdwP+1h8Dmk8D5REAPUMAsk9nQ0FD/gftAOebFYH276jmNnSXHnGv8tBpQPcUSJSFy4epgswhELkX5SDEL+bKskjDM0slAAAAAElFTkSuQmCC";
        byte [] bytes = decrypt(base64);
        int i = Copy_File.saveFile(bytes, "C:\\123.png");
        System.out.println(bytes);
    }
    private static byte[] decrypt(String base64){
        BASE64Decoder base64Decoder = new BASE64Decoder();
        try {
            return base64Decoder.decodeBuffer(base64);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("解密失败");
        }
        return null;
    }
}
