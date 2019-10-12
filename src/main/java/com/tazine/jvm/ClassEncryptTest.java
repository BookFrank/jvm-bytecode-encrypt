package com.tazine.jvm;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author frank
 * @date 2019/10/12
 */
public class ClassEncryptTest {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("/Users/jiaer.ly/codeplay/github/jvm-bytecode-encrypt/target/classes/App.class");

        byte[] bs = Files.readAllBytes(path);
        System.out.println(bs);
        for (int i = 0; i < bs.length; i++) {
            // 减1后，用 idea 查看 class 文件，发现无法反编译，因为解析不了
            bs[i] = (byte)(bs[i] - 1);
            //bs[i] = (byte)(bs[i] + 1);
        }

        Files.delete(path);
        Files.write(path, bs);
    }
}
