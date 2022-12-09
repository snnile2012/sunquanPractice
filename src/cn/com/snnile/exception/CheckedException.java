package cn.com.snnile.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

// 受检异常 编译时异常
public class CheckedException {

    public static void main(String[] args) {
        // ClassNotFoundException
        try {
            Class.forName("123");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        // FileNotFoundException
        try {
            FileReader fileReader = new FileReader("/private/tmp/autosignin.log");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


}
